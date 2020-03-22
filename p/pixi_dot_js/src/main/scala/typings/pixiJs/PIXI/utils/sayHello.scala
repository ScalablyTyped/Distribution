package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.sayHello")
@js.native
object sayHello extends js.Object {
  /**
    * Logs out the version and renderer information for this running instance of PIXI.
    * If you don't want to see this message you can run `PIXI.utils.skipHello()` before
    * creating your renderer. Keep in mind that doing that will forever make you a jerk face.
    *
    * @static
    * @function sayHello
    * @memberof PIXI.utils
    * @param {string} type - The string renderer type to log.
    */
  def apply(`type`: String): Unit = js.native
}

