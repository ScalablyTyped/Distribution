package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoStatus extends StObject {
  
  /** This value indicates if the video can be embedded on another website. @mutable youtube.videos.insert youtube.videos.update */
  var embeddable: js.UndefOr[Boolean] = js.undefined
  
  /** This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed. */
  var failureReason: js.UndefOr[String] = js.undefined
  
  /** The video's license. @mutable youtube.videos.insert youtube.videos.update */
  var license: js.UndefOr[String] = js.undefined
  
  var madeForKids: js.UndefOr[Boolean] = js.undefined
  
  /** The video's privacy status. */
  var privacyStatus: js.UndefOr[String] = js.undefined
  
  /**
    * This value indicates if the extended video statistics on the watch page can be viewed by everyone. Note that the view count, likes, etc will still be visible if this is disabled.
    * @mutable youtube.videos.insert youtube.videos.update
    */
  var publicStatsViewable: js.UndefOr[Boolean] = js.undefined
  
  /** The date and time when the video is scheduled to publish. It can be set only if the privacy status of the video is private.. */
  var publishAt: js.UndefOr[String] = js.undefined
  
  /** This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected. */
  var rejectionReason: js.UndefOr[String] = js.undefined
  
  var selfDeclaredMadeForKids: js.UndefOr[Boolean] = js.undefined
  
  /** The status of the uploaded video. */
  var uploadStatus: js.UndefOr[String] = js.undefined
}
object VideoStatus {
  
  inline def apply(): VideoStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoStatus]
  }
  
  extension [Self <: VideoStatus](x: Self) {
    
    inline def setEmbeddable(value: Boolean): Self = StObject.set(x, "embeddable", value.asInstanceOf[js.Any])
    
    inline def setEmbeddableUndefined: Self = StObject.set(x, "embeddable", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMadeForKids(value: Boolean): Self = StObject.set(x, "madeForKids", value.asInstanceOf[js.Any])
    
    inline def setMadeForKidsUndefined: Self = StObject.set(x, "madeForKids", js.undefined)
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
    
    inline def setPublicStatsViewable(value: Boolean): Self = StObject.set(x, "publicStatsViewable", value.asInstanceOf[js.Any])
    
    inline def setPublicStatsViewableUndefined: Self = StObject.set(x, "publicStatsViewable", js.undefined)
    
    inline def setPublishAt(value: String): Self = StObject.set(x, "publishAt", value.asInstanceOf[js.Any])
    
    inline def setPublishAtUndefined: Self = StObject.set(x, "publishAt", js.undefined)
    
    inline def setRejectionReason(value: String): Self = StObject.set(x, "rejectionReason", value.asInstanceOf[js.Any])
    
    inline def setRejectionReasonUndefined: Self = StObject.set(x, "rejectionReason", js.undefined)
    
    inline def setSelfDeclaredMadeForKids(value: Boolean): Self = StObject.set(x, "selfDeclaredMadeForKids", value.asInstanceOf[js.Any])
    
    inline def setSelfDeclaredMadeForKidsUndefined: Self = StObject.set(x, "selfDeclaredMadeForKids", js.undefined)
    
    inline def setUploadStatus(value: String): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
    
    inline def setUploadStatusUndefined: Self = StObject.set(x, "uploadStatus", js.undefined)
  }
}
