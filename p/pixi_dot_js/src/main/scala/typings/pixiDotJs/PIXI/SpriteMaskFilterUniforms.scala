package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteMaskFilterUniforms extends js.Object {
  var alpha: Double
  var mask: Texture
  var otherMatrix: Matrix
}

object SpriteMaskFilterUniforms {
  @scala.inline
  def apply(alpha: Double, mask: Texture, otherMatrix: Matrix): SpriteMaskFilterUniforms = {
    val __obj = js.Dynamic.literal(alpha = alpha, mask = mask, otherMatrix = otherMatrix)
  
    __obj.asInstanceOf[SpriteMaskFilterUniforms]
  }
}

