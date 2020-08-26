package typings.officeJs.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the document that raised the DataRefreshComplete event.
  *
  * [Api set:  1.1]
  */
@js.native
trait DataRefreshCompleteEventArgs extends js.Object {
  /**
    *
    * Gets the document object that raised the DataRefreshComplete event.
    *
    * [Api set:  1.1]
    */
  var document: Document = js.native
  /**
    *
    * Gets the success or failure of the DataRefreshComplete event.
    *
    * [Api set:  1.1]
    */
  var success: Boolean = js.native
}

object DataRefreshCompleteEventArgs {
  @scala.inline
  def apply(document: Document, success: Boolean): DataRefreshCompleteEventArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRefreshCompleteEventArgs]
  }
  @scala.inline
  implicit class DataRefreshCompleteEventArgsOps[Self <: DataRefreshCompleteEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

