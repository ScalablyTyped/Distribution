package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.distTypesMod.LivenessError
import typings.onfidoActiveVideoCapture.distTypesMod.SuccessData
import typings.onfidoActiveVideoCapture.distTypesMod.TrackingCallback
import typings.onfidoActiveVideoCapture.distTypesMod.TrackingEvent
import typings.onfidoActiveVideoCapture.distTypesMod.TranslateCallback
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.mediapipe
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.tfjs
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.wasm
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.webgl
import typings.preact.mod.FunctionComponent
import typings.preact.mod.h.JSX.Element
import typings.std.MediaStream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsActiveVideoCaptureMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/ActiveVideoCapture", "ActiveVideoCapture")
  @js.native
  val ActiveVideoCapture: FunctionComponent[Props] = js.native
  
  @js.native
  trait Props extends StObject {
    
    var assetsUrl: String = js.native
    
    var backend: wasm | webgl = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var hasGrantedPermission: Boolean = js.native
    
    var loader: js.UndefOr[Element] = js.native
    
    var navigationBar: js.UndefOr[Element] = js.native
    
    def onError(error: js.Error): Unit = js.native
    def onError(error: LivenessError): Unit = js.native
    
    def onLoad(): Unit = js.native
    
    def onSuccess(event: SuccessData): Unit = js.native
    
    def onUserMedia(stream: MediaStream): Unit = js.native
    
    var recordAudio: Boolean = js.native
    
    var runtime: mediapipe | tfjs = js.native
    
    def track(event: TrackingEvent): Unit = js.native
    def track(event: TrackingEvent, properties: Record[String, Any]): Unit = js.native
    @JSName("track")
    var track_Original: TrackingCallback = js.native
    
    def translate(key: String): String = js.native
    def translate(key: String, options: Record[String, Any]): String = js.native
    @JSName("translate")
    var translate_Original: TranslateCallback = js.native
    
    var videoUrl: js.UndefOr[String] = js.native
    
    var webmMimeTypes: js.UndefOr[js.Array[String]] = js.native
    
    var workerEnabled: Boolean = js.native
  }
}
