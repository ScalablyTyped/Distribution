package typings
package minilogLib.minilogMod.MinilogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinilogBackends extends js.Object {
  var array: js.Any
  var browser: js.Any
  var console: Console
  var jQuery: js.Any
  var localstorage: js.Any
}

object MinilogBackends {
  @scala.inline
  def apply(array: js.Any, browser: js.Any, console: Console, jQuery: js.Any, localstorage: js.Any): MinilogBackends = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(array)
    __obj.updateDynamic("browser")(browser)
    __obj.updateDynamic("console")(console)
    __obj.updateDynamic("jQuery")(jQuery)
    __obj.updateDynamic("localstorage")(localstorage)
    __obj.asInstanceOf[MinilogBackends]
  }
}

