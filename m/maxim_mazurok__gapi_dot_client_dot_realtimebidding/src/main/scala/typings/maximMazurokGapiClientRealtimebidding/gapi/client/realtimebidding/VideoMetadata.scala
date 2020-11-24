package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoMetadata extends js.Object {
  
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
  implicit class VideoMetadataOps[Self <: VideoMetadata] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setIsValidVast(value: Boolean): Self = this.set("isValidVast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsValidVast: Self = this.set("isValidVast", js.undefined)
    
    @scala.inline
    def setIsVpaid(value: Boolean): Self = this.set("isVpaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVpaid: Self = this.set("isVpaid", js.undefined)
    
    @scala.inline
    def setMediaFilesVarargs(value: MediaFile*): Self = this.set("mediaFiles", js.Array(value :_*))
    
    @scala.inline
    def setMediaFiles(value: js.Array[MediaFile]): Self = this.set("mediaFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaFiles: Self = this.set("mediaFiles", js.undefined)
    
    @scala.inline
    def setSkipOffset(value: String): Self = this.set("skipOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipOffset: Self = this.set("skipOffset", js.undefined)
    
    @scala.inline
    def setVastVersion(value: String): Self = this.set("vastVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVastVersion: Self = this.set("vastVersion", js.undefined)
  }
}
