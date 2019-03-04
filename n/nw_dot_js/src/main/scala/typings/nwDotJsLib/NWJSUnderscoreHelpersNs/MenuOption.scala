package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object that contains options to use while creation of nw.Menu. example: new nw.Menu(MenuOption)
  */
trait MenuOption extends js.Object {
  /**
    * {string} (Optional) two types are accepted by this method: "menubar" or "contextmenu". The value is set to "contextmenu" by default.
    */
  var `type`: java.lang.String
}

object MenuOption {
  @scala.inline
  def apply(`type`: java.lang.String): MenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MenuOption]
  }
}

