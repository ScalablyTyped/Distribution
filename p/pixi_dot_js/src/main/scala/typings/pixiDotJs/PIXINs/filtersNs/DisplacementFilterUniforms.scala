package typings.pixiDotJs.PIXINs.filtersNs

import typings.pixiDotJs.PIXINs.Matrix
import typings.pixiDotJs.PIXINs.Point
import typings.pixiDotJs.PIXINs.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplacementFilterUniforms extends js.Object {
  var filterMatrix: Matrix
  var mapSampler: Texture
  var scale: Point
}

object DisplacementFilterUniforms {
  @scala.inline
  def apply(filterMatrix: Matrix, mapSampler: Texture, scale: Point): DisplacementFilterUniforms = {
    val __obj = js.Dynamic.literal(filterMatrix = filterMatrix, mapSampler = mapSampler, scale = scale)
  
    __obj.asInstanceOf[DisplacementFilterUniforms]
  }
}

