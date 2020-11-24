package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaFile extends js.Object {
  
  /** Bitrate of the video file, in Kbps. Can be used to filter the response of the creatives.list method. */
  var bitrate: js.UndefOr[String] = js.native
  
  /** The MIME type of this media file. Can be used to filter the response of the creatives.list method. */
  var mimeType: js.UndefOr[String] = js.native
}
object MediaFile {
  
  @scala.inline
  def apply(): MediaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaFile]
  }
  
  @scala.inline
  implicit class MediaFileOps[Self <: MediaFile] (val x: Self) extends AnyVal {
    
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
    def setBitrate(value: String): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
}
