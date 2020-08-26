package typings.nwJs.mod.global.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object that contains options to use while creation of nw.Menu. example: new nw.Menu(MenuOption)
  */
@js.native
trait MenuOption extends js.Object {
  /**
    * {string} (Optional) two types are accepted by this method: "menubar" or "contextmenu". The value is set to "contextmenu" by default.
    */
  var `type`: String = js.native
}

object MenuOption {
  @scala.inline
  def apply(`type`: String): MenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOption]
  }
  @scala.inline
  implicit class MenuOptionOps[Self <: MenuOption] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

