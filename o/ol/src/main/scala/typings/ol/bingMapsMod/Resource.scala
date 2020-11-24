package typings.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends js.Object {
  
  var imageHeight: Double = js.native
  
  var imageUrl: String = js.native
  
  var imageUrlSubdomains: js.Array[String] = js.native
  
  var imageWidth: Double = js.native
  
  var imageryProviders: js.UndefOr[js.Array[ImageryProvider]] = js.native
  
  var zoomMax: Double = js.native
  
  var zoomMin: Double = js.native
}
object Resource {
  
  @scala.inline
  def apply(
    imageHeight: Double,
    imageUrl: String,
    imageUrlSubdomains: js.Array[String],
    imageWidth: Double,
    zoomMax: Double,
    zoomMin: Double
  ): Resource = {
    val __obj = js.Dynamic.literal(imageHeight = imageHeight.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], imageUrlSubdomains = imageUrlSubdomains.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], zoomMax = zoomMax.asInstanceOf[js.Any], zoomMin = zoomMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    
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
    def setImageHeight(value: Double): Self = this.set("imageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlSubdomainsVarargs(value: String*): Self = this.set("imageUrlSubdomains", js.Array(value :_*))
    
    @scala.inline
    def setImageUrlSubdomains(value: js.Array[String]): Self = this.set("imageUrlSubdomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageWidth(value: Double): Self = this.set("imageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMax(value: Double): Self = this.set("zoomMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMin(value: Double): Self = this.set("zoomMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageryProvidersVarargs(value: ImageryProvider*): Self = this.set("imageryProviders", js.Array(value :_*))
    
    @scala.inline
    def setImageryProviders(value: js.Array[ImageryProvider]): Self = this.set("imageryProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageryProviders: Self = this.set("imageryProviders", js.undefined)
  }
}
