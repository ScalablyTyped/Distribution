package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageProperties extends js.Object {
  
  /** The clockwise rotation angle of the image, in radians. */
  var angle: js.UndefOr[Double] = js.native
  
  /** The brightness effect of the image. The value should be in the interval [-1.0, 1.0], where 0 means no effect. */
  var brightness: js.UndefOr[Double] = js.native
  
  /**
    * A URI to the image with a default lifetime of 30 minutes. This URI is tagged with the account of the requester. Anyone with the URI effectively accesses the image as the original
    * requester. Access to the image may be lost if the document's sharing settings change.
    */
  var contentUri: js.UndefOr[String] = js.native
  
  /** The contrast effect of the image. The value should be in the interval [-1.0, 1.0], where 0 means no effect. */
  var contrast: js.UndefOr[Double] = js.native
  
  /** The crop properties of the image. */
  var cropProperties: js.UndefOr[CropProperties] = js.native
  
  /** The source URI is the URI used to insert the image. The source URI can be empty. */
  var sourceUri: js.UndefOr[String] = js.native
  
  /** The transparency effect of the image. The value should be in the interval [0.0, 1.0], where 0 means no effect and 1 means completely transparent. */
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setBrightness(value: Double): Self = this.set("brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightness: Self = this.set("brightness", js.undefined)
    
    @scala.inline
    def setContentUri(value: String): Self = this.set("contentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUri: Self = this.set("contentUri", js.undefined)
    
    @scala.inline
    def setContrast(value: Double): Self = this.set("contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContrast: Self = this.set("contrast", js.undefined)
    
    @scala.inline
    def setCropProperties(value: CropProperties): Self = this.set("cropProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropProperties: Self = this.set("cropProperties", js.undefined)
    
    @scala.inline
    def setSourceUri(value: String): Self = this.set("sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUri: Self = this.set("sourceUri", js.undefined)
    
    @scala.inline
    def setTransparency(value: Double): Self = this.set("transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
  }
}
