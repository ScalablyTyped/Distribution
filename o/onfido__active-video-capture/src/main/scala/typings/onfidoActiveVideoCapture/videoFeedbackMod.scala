package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.typesMod.LivenessError
import typings.onfidoActiveVideoCapture.typesMod.TrackingCallback
import typings.onfidoActiveVideoCapture.typesMod.TranslateCallback
import typings.preact.mod.FunctionComponent
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoFeedbackMod {
  
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
    
    var track: TrackingCallback = js.native
    
    var translate: TranslateCallback = js.native
  }
}
