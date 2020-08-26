package typings.ol.renderMod

import typings.ol.olFeatureMod.FeatureLike
import typings.ol.simpleGeometryMod.default
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var context: CanvasRenderingContext2D = js.native
  var feature: FeatureLike = js.native
  var geometry: default = js.native
  var pixelRatio: Double = js.native
  var resolution: Double = js.native
  var rotation: Double = js.native
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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: CanvasRenderingContext2D): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeature(value: FeatureLike): Self = this.set("feature", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometry(value: default): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
  }
  
}

