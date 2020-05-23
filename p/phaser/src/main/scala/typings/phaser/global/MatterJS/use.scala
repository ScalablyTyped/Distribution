package typings.phaser.global.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MatterJS.use")
@js.native
object use extends js.Object {
  //  --------------------------------------------------------------
  //  Modules
  //  --------------------------------------------------------------
  /**
    * Installs the given plugins on the `Matter` namespace.
    * This is a short-hand for `Plugin.use`, see it for more information.
    * Call this function once at the start of your code, with all of the plugins you wish to install as arguments.
    * Avoid calling this function multiple times unless you intend to manually control installation order.
    * @method use
    * @param ...plugin {Function} The plugin(s) to install on `base` (multi-argument).
    */
  def apply(plugins: (typings.phaser.MatterJS.Plugin | String)*): Unit = js.native
}

