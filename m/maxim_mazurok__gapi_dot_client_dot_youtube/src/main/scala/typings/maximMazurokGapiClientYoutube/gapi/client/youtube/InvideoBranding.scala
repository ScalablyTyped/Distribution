package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvideoBranding extends StObject {
  
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
  implicit class InvideoBrandingMutableBuilder[Self <: InvideoBranding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageBytes(value: String): Self = StObject.set(x, "imageBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBytesUndefined: Self = StObject.set(x, "imageBytes", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setPosition(value: InvideoPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTargetChannelId(value: String): Self = StObject.set(x, "targetChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetChannelIdUndefined: Self = StObject.set(x, "targetChannelId", js.undefined)
    
    @scala.inline
    def setTiming(value: InvideoTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
  }
}
