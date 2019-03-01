package typings
package pixiDotJsLib.PIXINs.filtersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplacementFilterUniforms extends js.Object {
  var filterMatrix: pixiDotJsLib.PIXINs.Matrix
  var mapSampler: pixiDotJsLib.PIXINs.Texture
  var scale: pixiDotJsLib.PIXINs.Point
}

object DisplacementFilterUniforms {
  @scala.inline
  def apply(
    filterMatrix: pixiDotJsLib.PIXINs.Matrix,
    mapSampler: pixiDotJsLib.PIXINs.Texture,
    scale: pixiDotJsLib.PIXINs.Point
  ): DisplacementFilterUniforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filterMatrix")(filterMatrix)
    __obj.updateDynamic("mapSampler")(mapSampler)
    __obj.updateDynamic("scale")(scale)
    __obj.asInstanceOf[DisplacementFilterUniforms]
  }
}

