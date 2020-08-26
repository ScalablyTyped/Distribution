package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an individual tab and the state it should have.
  */
@js.native
trait Tab extends js.Object {
  /**
    * Specifies the controls in the tab, such as menu items, buttons, etc.
    */
  var controls: js.UndefOr[js.Array[Control]] = js.native
  /**
    * Identifier of the tab as specified in the manifest.
    */
  var id: String = js.native
}

object Tab {
  @scala.inline
  def apply(id: String): Tab = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  @scala.inline
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setControlsVarargs(value: Control*): Self = this.set("controls", js.Array(value :_*))
    @scala.inline
    def setControls(value: js.Array[Control]): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
  }
  
}

