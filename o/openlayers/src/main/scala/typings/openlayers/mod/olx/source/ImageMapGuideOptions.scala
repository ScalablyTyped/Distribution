package typings.openlayers.mod.olx.source

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.Image
import typings.openlayers.mod.ImageLoadFunctionType
import typings.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageMapGuideOptions extends js.Object {
  
  var displayDpi: js.UndefOr[Double] = js.native
  
  var hidpi: js.UndefOr[Boolean] = js.native
  
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.native
  
  var metersPerUnit: js.UndefOr[Double] = js.native
  
  var params: js.UndefOr[GlobalObject] = js.native
  
  var projection: ProjectionLike = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var useOverlay: js.UndefOr[Boolean] = js.native
}
object ImageMapGuideOptions {
  
  @scala.inline
  def apply(): ImageMapGuideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageMapGuideOptions]
  }
  
  @scala.inline
  implicit class ImageMapGuideOptionsOps[Self <: ImageMapGuideOptions] (val x: Self) extends AnyVal {
    
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
    def setDisplayDpi(value: Double): Self = this.set("displayDpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayDpi: Self = this.set("displayDpi", js.undefined)
    
    @scala.inline
    def setHidpi(value: Boolean): Self = this.set("hidpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidpi: Self = this.set("hidpi", js.undefined)
    
    @scala.inline
    def setImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = this.set("imageLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteImageLoadFunction: Self = this.set("imageLoadFunction", js.undefined)
    
    @scala.inline
    def setMetersPerUnit(value: Double): Self = this.set("metersPerUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetersPerUnit: Self = this.set("metersPerUnit", js.undefined)
    
    @scala.inline
    def setParams(value: GlobalObject): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseOverlay(value: Boolean): Self = this.set("useOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOverlay: Self = this.set("useOverlay", js.undefined)
  }
}
