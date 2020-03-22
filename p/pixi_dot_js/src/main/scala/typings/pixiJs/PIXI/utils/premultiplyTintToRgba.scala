package typings.pixiJs.PIXI.utils

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.premultiplyTintToRgba")
@js.native
object premultiplyTintToRgba extends js.Object {
  /**
    * converts integer tint and float alpha to vec4 form, premultiplies by default
    *
    * @memberof PIXI.utils
    * @function premultiplyTintToRgba
    * @param {number} tint input tint
    * @param {number} alpha alpha param
    * @param {Float32Array} [out] output
    * @param {boolean} [premultiply=true] do premultiply it
    * @returns {Float32Array} vec4 rgba
    */
  def apply(tint: Double, alpha: Double): Float32Array = js.native
  def apply(tint: Double, alpha: Double, out: Float32Array): Float32Array = js.native
  def apply(tint: Double, alpha: Double, out: Float32Array, premultiply: Boolean): Float32Array = js.native
}

