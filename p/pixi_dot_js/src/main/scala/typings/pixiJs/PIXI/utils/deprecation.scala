package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.deprecation")
@js.native
object deprecation extends js.Object {
  /**
    * Helper for warning developers about deprecated features & settings.
    * A stack track for warnings is given; useful for tracking-down where
    * deprecated methods/properties/classes are being used within the code.
    *
    * @memberof PIXI.utils
    * @function deprecation
    * @param {string} version - The version where the feature became deprecated
    * @param {string} message - Message should include what is deprecated, where, and the new solution
    * @param {number} [ignoreDepth=3] - The number of steps to ignore at the top of the error stack
    *        this is mostly to ignore internal deprecation calls.
    */
  def apply(version: String, message: String): Unit = js.native
  def apply(version: String, message: String, ignoreDepth: Double): Unit = js.native
}

