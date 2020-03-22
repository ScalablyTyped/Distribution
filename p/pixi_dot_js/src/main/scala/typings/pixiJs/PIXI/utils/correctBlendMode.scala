package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.correctBlendMode")
@js.native
object correctBlendMode extends js.Object {
  /**
    * changes blendMode according to texture format
    *
    * @memberof PIXI.utils
    * @function correctBlendMode
    * @param {number} blendMode supposed blend mode
    * @param {boolean} premultiplied  whether source is premultiplied
    * @returns {number} true blend mode for this texture
    */
  def apply(blendMode: Double, premultiplied: Boolean): Double = js.native
}

