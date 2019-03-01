package typings
package pixiDotJsLib.PIXINs.filtersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorMatrixFilterUniforms extends js.Object {
  var m: pixiDotJsLib.PIXINs.Matrix
  var uAlpha: scala.Double
}

object ColorMatrixFilterUniforms {
  @scala.inline
  def apply(m: pixiDotJsLib.PIXINs.Matrix, uAlpha: scala.Double): ColorMatrixFilterUniforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("m")(m)
    __obj.updateDynamic("uAlpha")(uAlpha)
    __obj.asInstanceOf[ColorMatrixFilterUniforms]
  }
}

