package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.distTypesMod.LivenessError
import typings.onfidoActiveVideoCapture.distTypesMod.TrackingCallback
import typings.onfidoActiveVideoCapture.distTypesMod.TrackingEvent
import typings.onfidoActiveVideoCapture.distTypesMod.TranslateCallback
import typings.preact.mod.FunctionComponent
import typings.std.Blob
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsVideoFeedbackMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/VideoFeedback", "VideoFeedback")
  @js.native
  val VideoFeedback: FunctionComponent[Props] = js.native
  
  @js.native
  trait Props extends StObject {
    
    var debug: Boolean = js.native
    
    var hasGrantedPermission: js.UndefOr[Boolean] = js.native
    
    def onError(error: js.Error): Unit = js.native
    def onError(error: LivenessError): Unit = js.native
    
    var onUserMedia: js.UndefOr[js.Function0[Unit]] = js.native
    
    def setVideoPayload(arg0: Blob): Unit = js.native
    
    def track(event: TrackingEvent): Unit = js.native
    def track(event: TrackingEvent, properties: Record[String, Any]): Unit = js.native
    @JSName("track")
    var track_Original: TrackingCallback = js.native
    
    def translate(key: String): String = js.native
    def translate(key: String, options: Record[String, Any]): String = js.native
    @JSName("translate")
    var translate_Original: TranslateCallback = js.native
  }
}
