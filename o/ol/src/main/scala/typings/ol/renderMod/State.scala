package typings.ol.renderMod

import typings.ol.featureMod.FeatureLike
import typings.ol.geomSimpleGeometryMod.default
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var context: CanvasRenderingContext2D
  var feature: FeatureLike
  var geometry: default
  var pixelRatio: Double
  var resolution: Double
  var rotation: Double
}

object State {
  @scala.inline
  def apply(
    context: CanvasRenderingContext2D,
    feature: FeatureLike,
    geometry: default,
    pixelRatio: Double,
    resolution: Double,
    rotation: Double
  ): State = {
    val __obj = js.Dynamic.literal(context = context, feature = feature, geometry = geometry, pixelRatio = pixelRatio, resolution = resolution, rotation = rotation)
  
    __obj.asInstanceOf[State]
  }
}

