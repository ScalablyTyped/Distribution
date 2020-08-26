package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Feature
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.Vector
import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageVectorOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var logo: js.UndefOr[String | LogoOptions] = js.native
  var projection: ProjectionLike = js.native
  var ratio: js.UndefOr[Double] = js.native
  var renderBuffer: js.UndefOr[Double] = js.native
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  var source: Vector = js.native
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
}

object ImageVectorOptions {
  @scala.inline
  def apply(source: Vector): ImageVectorOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVectorOptions]
  }
  @scala.inline
  implicit class ImageVectorOptionsOps[Self <: ImageVectorOptions] (val x: Self) extends AnyVal {
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
    def setSource(value: Vector): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = this.set("attributions", js.Array(value :_*))
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    @scala.inline
    def setRenderBuffer(value: Double): Self = this.set("renderBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderBuffer: Self = this.set("renderBuffer", js.undefined)
    @scala.inline
    def setResolutionsVarargs(value: Double*): Self = this.set("resolutions", js.Array(value :_*))
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutions: Self = this.set("resolutions", js.undefined)
    @scala.inline
    def setStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = this.set("style", js.Any.fromFunction2(value))
    @scala.inline
    def setStyleVarargs(value: Style*): Self = this.set("style", js.Array(value :_*))
    @scala.inline
    def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

