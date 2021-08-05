package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceImageRequest extends StObject {
  
  /** The ID of the existing image that will be replaced. */
  var imageObjectId: js.UndefOr[String] = js.undefined
  
  /** The replacement method. */
  var imageReplaceMethod: js.UndefOr[String] = js.undefined
  
  /**
    * The URI of the new image. The image is fetched once at insertion time and a copy is stored for display inside the document. Images must be less than 50MB in size, cannot exceed 25
    * megapixels, and must be in one of PNG, JPEG, or GIF format. The provided URI can be at most 2 kB in length. The URI itself is saved with the image, and exposed via the
    * ImageProperties.source_uri field.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object ReplaceImageRequest {
  
  inline def apply(): ReplaceImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceImageRequest]
  }
  
  extension [Self <: ReplaceImageRequest](x: Self) {
    
    inline def setImageObjectId(value: String): Self = StObject.set(x, "imageObjectId", value.asInstanceOf[js.Any])
    
    inline def setImageObjectIdUndefined: Self = StObject.set(x, "imageObjectId", js.undefined)
    
    inline def setImageReplaceMethod(value: String): Self = StObject.set(x, "imageReplaceMethod", value.asInstanceOf[js.Any])
    
    inline def setImageReplaceMethodUndefined: Self = StObject.set(x, "imageReplaceMethod", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
