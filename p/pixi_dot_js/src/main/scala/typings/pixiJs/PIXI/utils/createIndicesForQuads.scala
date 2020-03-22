package typings.pixiJs.PIXI.utils

import typings.std.Uint16Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.createIndicesForQuads")
@js.native
object createIndicesForQuads extends js.Object {
  /**
    * Generic Mask Stack data structure
    *
    * @memberof PIXI.utils
    * @function createIndicesForQuads
    * @param {number} size - Number of quads
    * @param {Uint16Array|Uint32Array} [outBuffer] - Buffer for output, length has to be `6 * size`
    * @return {Uint16Array|Uint32Array} - Resulting index buffer
    */
  def apply(size: Double): Uint16Array | Uint32Array = js.native
  def apply(size: Double, outBuffer: Uint16Array): Uint16Array | Uint32Array = js.native
  def apply(size: Double, outBuffer: Uint32Array): Uint16Array | Uint32Array = js.native
}

