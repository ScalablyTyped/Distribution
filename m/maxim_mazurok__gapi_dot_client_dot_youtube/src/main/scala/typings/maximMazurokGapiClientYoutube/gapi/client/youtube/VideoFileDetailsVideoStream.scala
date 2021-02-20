package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFileDetailsVideoStream extends StObject {
  
  /** The video content's display aspect ratio, which specifies the aspect ratio in which the video should be displayed. */
  var aspectRatio: js.UndefOr[Double] = js.native
  
  /** The video stream's bitrate, in bits per second. */
  var bitrateBps: js.UndefOr[String] = js.native
  
  /** The video codec that the stream uses. */
  var codec: js.UndefOr[String] = js.native
  
  /** The video stream's frame rate, in frames per second. */
  var frameRateFps: js.UndefOr[Double] = js.native
  
  /** The encoded video content's height in pixels. */
  var heightPixels: js.UndefOr[Double] = js.native
  
  /** The amount that YouTube needs to rotate the original source content to properly display the video. */
  var rotation: js.UndefOr[String] = js.native
  
  /** A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code. */
  var vendor: js.UndefOr[String] = js.native
  
  /** The encoded video content's width in pixels. You can calculate the video's encoding aspect ratio as width_pixels / height_pixels. */
  var widthPixels: js.UndefOr[Double] = js.native
}
object VideoFileDetailsVideoStream {
  
  @scala.inline
  def apply(): VideoFileDetailsVideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFileDetailsVideoStream]
  }
  
  @scala.inline
  implicit class VideoFileDetailsVideoStreamMutableBuilder[Self <: VideoFileDetailsVideoStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setBitrateBps(value: String): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
    
    @scala.inline
    def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    @scala.inline
    def setFrameRateFps(value: Double): Self = StObject.set(x, "frameRateFps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateFpsUndefined: Self = StObject.set(x, "frameRateFps", js.undefined)
    
    @scala.inline
    def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
    
    @scala.inline
    def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    
    @scala.inline
    def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
  }
}
