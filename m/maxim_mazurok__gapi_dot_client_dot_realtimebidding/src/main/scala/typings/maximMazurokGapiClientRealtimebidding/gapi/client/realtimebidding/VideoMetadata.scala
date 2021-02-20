package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoMetadata extends StObject {
  
  /** The duration of the ad. Can be used to filter the response of the creatives.list method. */
  var duration: js.UndefOr[String] = js.native
  
  /** Is this a valid VAST ad? Can be used to filter the response of the creatives.list method. */
  var isValidVast: js.UndefOr[Boolean] = js.native
  
  /** Is this a VPAID ad? Can be used to filter the response of the creatives.list method. */
  var isVpaid: js.UndefOr[Boolean] = js.native
  
  /** The list of all media files declared in the VAST. If there are multiple VASTs in a wrapper chain, this includes the media files from the deepest one in the chain. */
  var mediaFiles: js.UndefOr[js.Array[MediaFile]] = js.native
  
  /**
    * The minimum duration that the user has to watch before being able to skip this ad. If the field is not set, the ad is not skippable. If the field is set, the ad is skippable. Can be
    * used to filter the response of the creatives.list method.
    */
  var skipOffset: js.UndefOr[String] = js.native
  
  /** The maximum VAST version across all wrapped VAST documents. Can be used to filter the response of the creatives.list method. */
  var vastVersion: js.UndefOr[String] = js.native
}
object VideoMetadata {
  
  @scala.inline
  def apply(): VideoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoMetadata]
  }
  
  @scala.inline
  implicit class VideoMetadataMutableBuilder[Self <: VideoMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setIsValidVast(value: Boolean): Self = StObject.set(x, "isValidVast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidVastUndefined: Self = StObject.set(x, "isValidVast", js.undefined)
    
    @scala.inline
    def setIsVpaid(value: Boolean): Self = StObject.set(x, "isVpaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVpaidUndefined: Self = StObject.set(x, "isVpaid", js.undefined)
    
    @scala.inline
    def setMediaFiles(value: js.Array[MediaFile]): Self = StObject.set(x, "mediaFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaFilesUndefined: Self = StObject.set(x, "mediaFiles", js.undefined)
    
    @scala.inline
    def setMediaFilesVarargs(value: MediaFile*): Self = StObject.set(x, "mediaFiles", js.Array(value :_*))
    
    @scala.inline
    def setSkipOffset(value: String): Self = StObject.set(x, "skipOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipOffsetUndefined: Self = StObject.set(x, "skipOffset", js.undefined)
    
    @scala.inline
    def setVastVersion(value: String): Self = StObject.set(x, "vastVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVastVersionUndefined: Self = StObject.set(x, "vastVersion", js.undefined)
  }
}
