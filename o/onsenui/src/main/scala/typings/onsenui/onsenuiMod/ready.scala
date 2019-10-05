package typings.onsenui.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("onsenui", "ready")
@js.native
object ready extends js.Object {
  /**
    * @description Method used to wait for app initialization. The callback will not be executed until Onsen UI has been completely initialized
    * @param {Function} callback Function that executes after Onsen UI has been initialized
    */
  def apply(callback: js.Function): Unit = js.native
}

