package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertInlineImageRequest extends StObject {
  
  /** Inserts the text at the end of a header, footer or the document body. Inline images cannot be inserted inside a footnote. */
  var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
  
  /**
    * Inserts the image at a specific index in the document. The image must be inserted inside the bounds of an existing Paragraph. For instance, it cannot be inserted at a table's start
    * index (i.e. between the table and its preceding paragraph). Inline images cannot be inserted inside a footnote or equation.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * The size that the image should appear as in the document. This property is optional and the final size of the image in the document is determined by the following rules: * If
    * neither width nor height is specified, then a default size of the image is calculated based on its resolution. * If one dimension is specified then the other dimension is calculated
    * to preserve the aspect ratio of the image. * If both width and height are specified, the image is scaled to fit within the provided dimensions while maintaining its aspect ratio.
    */
  var objectSize: js.UndefOr[Size] = js.undefined
  
  /**
    * The image URI. The image is fetched once at insertion time and a copy is stored for display inside the document. Images must be less than 50MB in size, cannot exceed 25 megapixels,
    * and must be in one of PNG, JPEG, or GIF format. The provided URI can be at most 2 kB in length. The URI itself is saved with the image, and exposed via the
    * ImageProperties.content_uri field.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object InsertInlineImageRequest {
  
  inline def apply(): InsertInlineImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertInlineImageRequest]
  }
  
  extension [Self <: InsertInlineImageRequest](x: Self) {
    
    inline def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
    
    inline def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setObjectSize(value: Size): Self = StObject.set(x, "objectSize", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeUndefined: Self = StObject.set(x, "objectSize", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
