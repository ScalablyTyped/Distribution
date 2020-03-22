package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.rgb2hex")
@js.native
object rgb2hex extends js.Object {
  /**
    * Converts a color as an [R, G, B] array of normalized floats to a hexadecimal number.
    *
    * @example
    * PIXI.utils.rgb2hex([1, 1, 1]); // returns 0xffffff
    * @memberof PIXI.utils
    * @function rgb2hex
    * @param {number[]} rgb - Array of numbers where all values are normalized floats from 0.0 to 1.0.
    * @return {number} Number in hexadecimal.
    */
  def apply(rgb: js.Array[Double]): Double = js.native
}

