package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotCoverImageResource extends StObject {
  
  /**
    * Output only. Hash-like weak identifier of the uploaded image bytes, consistent per player per application. Within the context of a single player/application, it's guaranteed that
    * two identical blobs coming from two different uploads will have the same content hash. It's extremely likely, though not guaranteed, that if two content hashes are equal, the images
    * are identical.
    */
  var contentHash: js.UndefOr[String] = js.native
  
  /** Output only. A URL the client can use to download the image. May vary across requests, and only guaranteed to be valid for a short time after it is returned. */
  var downloadUrl: js.UndefOr[String] = js.native
  
  /** Output only. The height of the image in pixels. */
  var height: js.UndefOr[Double] = js.native
  
  /** Output only. The MIME type of the image. */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * The ID of the image resource. It's guaranteed that if two IDs are equal then the contents are equal as well. It's not guaranteed that two identical blobs coming from separate
    * uploads have the same ID. The resource ID can only be used within the application, user and resource type it was originally returned for. For example, it's not possible to use
    * SnapshotDataResource's resource ID as the resource_id of a SnapshotCoverImageResource, even if the blob is a valid image file.
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /** Output only. The width of the image in pixels. */
  var width: js.UndefOr[Double] = js.native
}
object SnapshotCoverImageResource {
  
  @scala.inline
  def apply(): SnapshotCoverImageResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotCoverImageResource]
  }
  
  @scala.inline
  implicit class SnapshotCoverImageResourceMutableBuilder[Self <: SnapshotCoverImageResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
    
    @scala.inline
    def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
