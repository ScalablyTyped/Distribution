package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Image
import typings.openlayers.mod.ImageLoadFunctionType
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.Size
import typings.openlayers.mod.olx.LogoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageStaticOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var imageExtent: Extent_ = js.native
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.native
  var imageSize: js.UndefOr[Size] = js.native
  var logo: js.UndefOr[String | LogoOptions] = js.native
  var projection: ProjectionLike = js.native
  var url: String = js.native
}

object ImageStaticOptions {
  @scala.inline
  def apply(imageExtent: Extent_, url: String): ImageStaticOptions = {
    val __obj = js.Dynamic.literal(imageExtent = imageExtent.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageStaticOptions]
  }
  @scala.inline
  implicit class ImageStaticOptionsOps[Self <: ImageStaticOptions] (val x: Self) extends AnyVal {
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
    def setImageExtent(value: Extent_): Self = this.set("imageExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = this.set("attributions", js.Array(value :_*))
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = this.set("imageLoadFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteImageLoadFunction: Self = this.set("imageLoadFunction", js.undefined)
    @scala.inline
    def setImageSize(value: Size): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSize: Self = this.set("imageSize", js.undefined)
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
  }
  
}

