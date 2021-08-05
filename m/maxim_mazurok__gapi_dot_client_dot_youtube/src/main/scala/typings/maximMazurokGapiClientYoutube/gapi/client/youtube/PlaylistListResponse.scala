package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistListResponse extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.undefined
  
  /** A list of playlists that match the request criteria */
  var items: js.UndefOr[js.Array[Playlist]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#playlistListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** General pagination information. */
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  
  /** The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set. */
  var prevPageToken: js.UndefOr[String] = js.undefined
  
  var tokenPagination: js.UndefOr[js.Any] = js.undefined
  
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.undefined
}
object PlaylistListResponse {
  
  inline def apply(): PlaylistListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistListResponse]
  }
  
  extension [Self <: PlaylistListResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setItems(value: js.Array[Playlist]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Playlist*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
    
    inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
    
    inline def setTokenPagination(value: js.Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
    
    inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
