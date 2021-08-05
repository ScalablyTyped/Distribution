package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotDataResource extends StObject {
  
  /**
    * Output only. Hash-like weak identifier of the uploaded blob, consistent per player per application. Within the context of a single player/application, it's guaranteed that two
    * identical blobs coming from two different uploads will have the same content hash. It's extremely likely, though not guaranteed, that if two content hashes are equal, the blobs are
    * identical.
    */
  var contentHash: js.UndefOr[String] = js.undefined
  
  /** Output only. A URL that the client can use to download the blob. May vary across requests, and only guaranteed to be valid for a short time after it is returned. */
  var downloadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the blob resource. It's guaranteed that if two IDs are equal then the contents are equal as well. It's not guaranteed that two identical blobs coming from separate uploads
    * have the same resource ID. The resource ID can only be used within the application, user and resource type it was originally returned for. For example, it's not possible to use
    * SnapshotDataResource's resource ID as the resource_id of a SnapshotCoverImageResource, even if the blob is a valid image file.
    */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /** Size of the saved game blob in bytes. */
  var size: js.UndefOr[String] = js.undefined
}
object SnapshotDataResource {
  
  inline def apply(): SnapshotDataResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotDataResource]
  }
  
  extension [Self <: SnapshotDataResource](x: Self) {
    
    inline def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    inline def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
