package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbnailSetResponse extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.undefined
  
  /** A list of thumbnails. */
  var items: js.UndefOr[js.Array[ThumbnailDetails]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#thumbnailSetResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.undefined
}
object ThumbnailSetResponse {
  
  inline def apply(): ThumbnailSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailSetResponse]
  }
  
  extension [Self <: ThumbnailSetResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setItems(value: js.Array[ThumbnailDetails]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ThumbnailDetails*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
