package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Photo extends js.Object {
  
  /** Absolute time when the photo was captured. When the photo has no exif timestamp, this is used to set a timestamp in the photo metadata. */
  var captureTime: js.UndefOr[String] = js.native
  
  /** Connections to other photos. A connection represents the link from this photo to another photo. */
  var connections: js.UndefOr[js.Array[Connection]] = js.native
  
  /** Output only. The download URL for the photo bytes. This field is set only when GetPhotoRequest.view is set to PhotoView.INCLUDE_DOWNLOAD_URL. */
  var downloadUrl: js.UndefOr[String] = js.native
  
  /** Output only. Status in Google Maps, whether this photo was published or rejected. Not currently populated. */
  var mapsPublishStatus: js.UndefOr[String] = js.native
  
  /** Required when updating a photo. Output only when creating a photo. Identifier for the photo, which is unique among all photos in Google. */
  var photoId: js.UndefOr[PhotoId] = js.native
  
  /** Places where this photo belongs. */
  var places: js.UndefOr[js.Array[Place]] = js.native
  
  /** Pose of the photo. */
  var pose: js.UndefOr[Pose] = js.native
  
  /** Output only. The share link for the photo. */
  var shareLink: js.UndefOr[String] = js.native
  
  /** Output only. The thumbnail URL for showing a preview of the given photo. */
  var thumbnailUrl: js.UndefOr[String] = js.native
  
  /** Output only. Status of rights transfer on this photo. */
  var transferStatus: js.UndefOr[String] = js.native
  
  /** Required when creating a photo. Input only. The resource URL where the photo bytes are uploaded to. */
  var uploadReference: js.UndefOr[UploadRef] = js.native
  
  /** Output only. View count of the photo. */
  var viewCount: js.UndefOr[String] = js.native
}
object Photo {
  
  @scala.inline
  def apply(): Photo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Photo]
  }
  
  @scala.inline
  implicit class PhotoOps[Self <: Photo] (val x: Self) extends AnyVal {
    
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
    def setCaptureTime(value: String): Self = this.set("captureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureTime: Self = this.set("captureTime", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = this.set("connections", js.Array(value :_*))
    
    @scala.inline
    def setConnections(value: js.Array[Connection]): Self = this.set("connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    
    @scala.inline
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
    
    @scala.inline
    def setMapsPublishStatus(value: String): Self = this.set("mapsPublishStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapsPublishStatus: Self = this.set("mapsPublishStatus", js.undefined)
    
    @scala.inline
    def setPhotoId(value: PhotoId): Self = this.set("photoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoId: Self = this.set("photoId", js.undefined)
    
    @scala.inline
    def setPlacesVarargs(value: Place*): Self = this.set("places", js.Array(value :_*))
    
    @scala.inline
    def setPlaces(value: js.Array[Place]): Self = this.set("places", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaces: Self = this.set("places", js.undefined)
    
    @scala.inline
    def setPose(value: Pose): Self = this.set("pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePose: Self = this.set("pose", js.undefined)
    
    @scala.inline
    def setShareLink(value: String): Self = this.set("shareLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareLink: Self = this.set("shareLink", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailUrl: Self = this.set("thumbnailUrl", js.undefined)
    
    @scala.inline
    def setTransferStatus(value: String): Self = this.set("transferStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferStatus: Self = this.set("transferStatus", js.undefined)
    
    @scala.inline
    def setUploadReference(value: UploadRef): Self = this.set("uploadReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadReference: Self = this.set("uploadReference", js.undefined)
    
    @scala.inline
    def setViewCount(value: String): Self = this.set("viewCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewCount: Self = this.set("viewCount", js.undefined)
  }
}
