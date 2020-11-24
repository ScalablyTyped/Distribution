package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvideoBranding extends js.Object {
  
  /** The bytes the uploaded image. Only used in api to youtube communication. */
  var imageBytes: js.UndefOr[String] = js.native
  
  /** The url of the uploaded image. Only used in apiary to api communication. */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** The spatial position within the video where the branding watermark will be displayed. */
  var position: js.UndefOr[InvideoPosition] = js.native
  
  /** The channel to which this branding links. If not present it defaults to the current channel. */
  var targetChannelId: js.UndefOr[String] = js.native
  
  /** The temporal position within the video where watermark will be displayed. */
  var timing: js.UndefOr[InvideoTiming] = js.native
}
object InvideoBranding {
  
  @scala.inline
  def apply(): InvideoBranding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvideoBranding]
  }
  
  @scala.inline
  implicit class InvideoBrandingOps[Self <: InvideoBranding] (val x: Self) extends AnyVal {
    
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
    def setImageBytes(value: String): Self = this.set("imageBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBytes: Self = this.set("imageBytes", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setPosition(value: InvideoPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTargetChannelId(value: String): Self = this.set("targetChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetChannelId: Self = this.set("targetChannelId", js.undefined)
    
    @scala.inline
    def setTiming(value: InvideoTiming): Self = this.set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
  }
}
