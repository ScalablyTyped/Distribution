package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.typesMod.LivenessError
import typings.onfidoActiveVideoCapture.typesMod.TrackingCallback
import typings.preact.mod.FunctionComponent
import typings.preact.mod.h.JSX.Element
import typings.std.Blob
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activeVideoCaptureMod {
  
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
    
    var track: TrackingCallback = js.native
    
    var translate: TranslateCallback = js.native
  }
  
  trait SuccessData extends StObject {
    
    var videoPayload: Blob
  }
  object SuccessData {
    
    inline def apply(videoPayload: Blob): SuccessData = {
      val __obj = js.Dynamic.literal(videoPayload = videoPayload.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessData]
    }
    
    extension [Self <: SuccessData](x: Self) {
      
      inline def setVideoPayload(value: Blob): Self = StObject.set(x, "videoPayload", value.asInstanceOf[js.Any])
    }
  }
  
  type TranslateCallback = js.Function2[/* key */ String, /* options */ js.UndefOr[Record[String, Any]], String]
}
