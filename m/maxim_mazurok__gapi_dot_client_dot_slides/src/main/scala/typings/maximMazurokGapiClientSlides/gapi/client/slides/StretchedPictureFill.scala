package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StretchedPictureFill extends StObject {
  
  /**
    * Reading the content_url: An URL to a picture with a default lifetime of 30 minutes. This URL is tagged with the account of the requester. Anyone with the URL effectively accesses
    * the picture as the original requester. Access to the picture may be lost if the presentation's sharing settings change. Writing the content_url: The picture is fetched once at
    * insertion time and a copy is stored for display inside the presentation. Pictures must be less than 50MB in size, cannot exceed 25 megapixels, and must be in one of PNG, JPEG, or
    * GIF format. The provided URL can be at most 2 kB in length.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  
  /** The original size of the picture fill. This field is read-only. */
  var size: js.UndefOr[Size] = js.undefined
}
object StretchedPictureFill {
  
  inline def apply(): StretchedPictureFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StretchedPictureFill]
  }
  
  extension [Self <: StretchedPictureFill](x: Self) {
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
