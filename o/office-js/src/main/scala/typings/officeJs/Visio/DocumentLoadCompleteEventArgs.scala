package typings.officeJs.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the success or failure of the DocumentLoadComplete event.
  *
  * [Api set:  1.1]
  */
@js.native
trait DocumentLoadCompleteEventArgs extends js.Object {
  /**
    *
    * Gets the success or failure of the DocumentLoadComplete event.
    *
    * [Api set:  1.1]
    */
  var success: Boolean = js.native
}

object DocumentLoadCompleteEventArgs {
  @scala.inline
  def apply(success: Boolean): DocumentLoadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLoadCompleteEventArgs]
  }
  @scala.inline
  implicit class DocumentLoadCompleteEventArgsOps[Self <: DocumentLoadCompleteEventArgs] (val x: Self) extends AnyVal {
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
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

