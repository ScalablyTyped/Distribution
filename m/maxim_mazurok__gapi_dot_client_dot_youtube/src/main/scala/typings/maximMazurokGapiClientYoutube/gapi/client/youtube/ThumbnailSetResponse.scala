package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThumbnailSetResponse extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.native
  
  /** A list of thumbnails. */
  var items: js.UndefOr[js.Array[ThumbnailDetails]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#thumbnailSetResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.native
}
object ThumbnailSetResponse {
  
  @scala.inline
  def apply(): ThumbnailSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailSetResponse]
  }
  
  @scala.inline
  implicit class ThumbnailSetResponseMutableBuilder[Self <: ThumbnailSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ThumbnailDetails]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ThumbnailDetails*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
