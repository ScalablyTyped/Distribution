package typings.photoshop.domImagingModuleMod.imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @optionobject
  * @targetfolder objects/options
  * @minVersion 24.4
  */
trait EncodeImageDataOptions extends StObject {
  
  /**
    * If provided, then the returned value will be a string that is base64 encoded.
    * @minVersion 24.4
    */
  var base64: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A `PhotoshopImageData` instance describing the pixel data.
    * @minVersion 24.4
    */
  var imageData: PhotoshopImageData
}
object EncodeImageDataOptions {
  
  inline def apply(imageData: PhotoshopImageData): EncodeImageDataOptions = {
    val __obj = js.Dynamic.literal(imageData = imageData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeImageDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodeImageDataOptions] (val x: Self) extends AnyVal {
    
    inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
    
    inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
    
    inline def setImageData(value: PhotoshopImageData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
  }
}
