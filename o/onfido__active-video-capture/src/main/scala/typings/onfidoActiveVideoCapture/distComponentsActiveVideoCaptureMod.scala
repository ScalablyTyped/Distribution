package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.distTypesMod.LivenessError
import typings.onfidoActiveVideoCapture.distTypesMod.TrackingCallback
import typings.onfidoActiveVideoCapture.distTypesMod.TrackingEvent
import typings.preact.mod.FunctionComponent
import typings.preact.mod.h.JSX.Element
import typings.std.Blob
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
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var hasGrantedPermission: Boolean = js.native
    
    var navigationBar: js.UndefOr[Element] = js.native
    
    def onError(error: js.Error): Unit = js.native
    def onError(error: LivenessError): Unit = js.native
    
    def onSuccess(event: SuccessData): Unit = js.native
    
    def onUserMedia(): Unit = js.native
    
    def track(event: TrackingEvent): Unit = js.native
    def track(event: TrackingEvent, properties: Record[String, Any]): Unit = js.native
    @JSName("track")
    var track_Original: TrackingCallback = js.native
    
    def translate(key: String): String = js.native
    def translate(key: String, options: Record[String, Any]): String = js.native
    @JSName("translate")
    var translate_Original: TranslateCallback = js.native
  }
  
  trait SuccessData extends StObject {
    
    var videoPayload: Blob
  }
  object SuccessData {
    
    inline def apply(videoPayload: Blob): SuccessData = {
      val __obj = js.Dynamic.literal(videoPayload = videoPayload.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuccessData] (val x: Self) extends AnyVal {
      
      inline def setVideoPayload(value: Blob): Self = StObject.set(x, "videoPayload", value.asInstanceOf[js.Any])
    }
  }
  
  type TranslateCallback = js.Function2[/* key */ String, /* options */ js.UndefOr[Record[String, Any]], String]
}
