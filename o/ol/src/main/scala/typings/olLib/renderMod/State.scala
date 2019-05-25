package typings
package olLib.renderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var context: stdLib.CanvasRenderingContext2D
  var feature: olLib.featureMod.FeatureLike
  var geometry: olLib.geomSimpleGeometryMod.default
  var pixelRatio: scala.Double
  var resolution: scala.Double
  var rotation: scala.Double
}

object State {
  @scala.inline
  def apply(
    context: stdLib.CanvasRenderingContext2D,
    feature: olLib.featureMod.FeatureLike,
    geometry: olLib.geomSimpleGeometryMod.default,
    pixelRatio: scala.Double,
    resolution: scala.Double,
    rotation: scala.Double
  ): State = {
    val __obj = js.Dynamic.literal(context = context, feature = feature, geometry = geometry, pixelRatio = pixelRatio, resolution = resolution, rotation = rotation)
  
    __obj.asInstanceOf[State]
  }
}

