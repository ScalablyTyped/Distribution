package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageProperties extends js.Object {
  
  /** The brightness effect of the image. The value should be in the interval [-1.0, 1.0], where 0 means no effect. This property is read-only. */
  var brightness: js.UndefOr[Double] = js.native
  
  /** The contrast effect of the image. The value should be in the interval [-1.0, 1.0], where 0 means no effect. This property is read-only. */
  var contrast: js.UndefOr[Double] = js.native
  
  /** The crop properties of the image. If not set, the image is not cropped. This property is read-only. */
  var cropProperties: js.UndefOr[CropProperties] = js.native
  
  /** The hyperlink destination of the image. If unset, there is no link. */
  var link: js.UndefOr[Link] = js.native
  
  /** The outline of the image. If not set, the image has no outline. */
  var outline: js.UndefOr[Outline] = js.native
  
  /** The recolor effect of the image. If not set, the image is not recolored. This property is read-only. */
  var recolor: js.UndefOr[Recolor] = js.native
  
  /** The shadow of the image. If not set, the image has no shadow. This property is read-only. */
  var shadow: js.UndefOr[Shadow] = js.native
  
  /** The transparency effect of the image. The value should be in the interval [0.0, 1.0], where 0 means no effect and 1 means completely transparent. This property is read-only. */
  var transparency: js.UndefOr[Double] = js.native
}
object ImageProperties {
  
  @scala.inline
  def apply(): ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageProperties]
  }
  
  @scala.inline
  implicit class ImagePropertiesOps[Self <: ImageProperties] (val x: Self) extends AnyVal {
    
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
    def setBrightness(value: Double): Self = this.set("brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightness: Self = this.set("brightness", js.undefined)
    
    @scala.inline
    def setContrast(value: Double): Self = this.set("contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContrast: Self = this.set("contrast", js.undefined)
    
    @scala.inline
    def setCropProperties(value: CropProperties): Self = this.set("cropProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropProperties: Self = this.set("cropProperties", js.undefined)
    
    @scala.inline
    def setLink(value: Link): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setOutline(value: Outline): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setRecolor(value: Recolor): Self = this.set("recolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecolor: Self = this.set("recolor", js.undefined)
    
    @scala.inline
    def setShadow(value: Shadow): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setTransparency(value: Double): Self = this.set("transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
  }
}
