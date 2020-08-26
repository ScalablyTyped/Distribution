package typings.officeJs.Office.AddinCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates source data for add-in events.
  */
@js.native
trait Source extends js.Object {
  /**
    * The ID of the control that triggered calling this function. The ID comes from the manifest and is the unique ID of your Office Add-in 
    * as a GUID.
    */
  var id: String = js.native
}

object Source {
  @scala.inline
  def apply(id: String): Source = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

