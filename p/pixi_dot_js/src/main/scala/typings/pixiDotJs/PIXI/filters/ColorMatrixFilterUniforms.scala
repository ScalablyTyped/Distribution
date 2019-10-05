package typings.pixiDotJs.PIXI.filters

import typings.pixiDotJs.PIXI.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorMatrixFilterUniforms extends js.Object {
  var m: Matrix
  var uAlpha: Double
}

object ColorMatrixFilterUniforms {
  @scala.inline
  def apply(m: Matrix, uAlpha: Double): ColorMatrixFilterUniforms = {
    val __obj = js.Dynamic.literal(m = m, uAlpha = uAlpha)
  
    __obj.asInstanceOf[ColorMatrixFilterUniforms]
  }
}

