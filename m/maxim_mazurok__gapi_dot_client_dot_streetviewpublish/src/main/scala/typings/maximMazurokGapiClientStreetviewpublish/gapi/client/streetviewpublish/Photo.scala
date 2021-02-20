package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Photo extends StObject {
  
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
  implicit class PhotoMutableBuilder[Self <: Photo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureTime(value: String): Self = StObject.set(x, "captureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureTimeUndefined: Self = StObject.set(x, "captureTime", js.undefined)
    
    @scala.inline
    def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
    @scala.inline
    def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    @scala.inline
    def setMapsPublishStatus(value: String): Self = StObject.set(x, "mapsPublishStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapsPublishStatusUndefined: Self = StObject.set(x, "mapsPublishStatus", js.undefined)
    
    @scala.inline
    def setPhotoId(value: PhotoId): Self = StObject.set(x, "photoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoIdUndefined: Self = StObject.set(x, "photoId", js.undefined)
    
    @scala.inline
    def setPlaces(value: js.Array[Place]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
    
    @scala.inline
    def setPlacesVarargs(value: Place*): Self = StObject.set(x, "places", js.Array(value :_*))
    
    @scala.inline
    def setPose(value: Pose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoseUndefined: Self = StObject.set(x, "pose", js.undefined)
    
    @scala.inline
    def setShareLink(value: String): Self = StObject.set(x, "shareLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareLinkUndefined: Self = StObject.set(x, "shareLink", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    @scala.inline
    def setTransferStatus(value: String): Self = StObject.set(x, "transferStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferStatusUndefined: Self = StObject.set(x, "transferStatus", js.undefined)
    
    @scala.inline
    def setUploadReference(value: UploadRef): Self = StObject.set(x, "uploadReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadReferenceUndefined: Self = StObject.set(x, "uploadReference", js.undefined)
    
    @scala.inline
    def setViewCount(value: String): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewCountUndefined: Self = StObject.set(x, "viewCount", js.undefined)
  }
}
