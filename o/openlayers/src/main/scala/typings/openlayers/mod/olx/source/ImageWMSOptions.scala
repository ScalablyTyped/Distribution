package typings.openlayers.mod.olx.source

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Image
import typings.openlayers.mod.ImageLoadFunctionType
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.wms.ServerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageWMSOptions extends js.Object {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var hidpi: js.UndefOr[Boolean] = js.native
  
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var params: StringDictionary[js.Any] = js.native
  
  var projection: ProjectionLike = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  
  var serverType: js.UndefOr[ServerType | String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object ImageWMSOptions {
  
  @scala.inline
  def apply(params: StringDictionary[js.Any]): ImageWMSOptions = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageWMSOptions]
  }
  
  @scala.inline
  implicit class ImageWMSOptionsOps[Self <: ImageWMSOptions] (val x: Self) extends AnyVal {
    
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
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    
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
    def setHidpi(value: Boolean): Self = this.set("hidpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidpi: Self = this.set("hidpi", js.undefined)
    
    @scala.inline
    def setImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = this.set("imageLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteImageLoadFunction: Self = this.set("imageLoadFunction", js.undefined)
    
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
    def setResolutionsVarargs(value: Double*): Self = this.set("resolutions", js.Array(value :_*))
    
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutions: Self = this.set("resolutions", js.undefined)
    
    @scala.inline
    def setServerType(value: ServerType | String): Self = this.set("serverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerType: Self = this.set("serverType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
