package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotCoverImageResource extends js.Object {
  
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
  implicit class SnapshotCoverImageResourceOps[Self <: SnapshotCoverImageResource] (val x: Self) extends AnyVal {
    
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
    def setContentHash(value: String): Self = this.set("contentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHash: Self = this.set("contentHash", js.undefined)
    
    @scala.inline
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
