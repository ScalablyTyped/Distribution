package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.hex2rgb")
@js.native
object hex2rgb extends js.Object {
  /**
    * Converts a hexadecimal color number to an [R, G, B] array of normalized floats (numbers from 0.0 to 1.0).
    *
    * @example
    * PIXI.utils.hex2rgb(0xffffff); // returns [1, 1, 1]
    * @memberof PIXI.utils
    * @function hex2rgb
    * @param {number} hex - The hexadecimal number to convert
    * @param  {number[]} [out=[]] If supplied, this array will be used rather than returning a new one
    * @return {number[]} An array representing the [R, G, B] of the color where all values are floats.
    */
  def apply(hex: Double): js.Array[Double] = js.native
  def apply(hex: Double, out: js.Array[Double]): js.Array[Double] = js.native
}

