package typings.onfidoActiveVideoCapture

import typings.std.Blob
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersUseMediaRecorderMod {
  
  @JSImport("@onfido/active-video-capture/dist/helpers/useMediaRecorder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMediaRecorder(): MediaRecorderHook = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaRecorder")().asInstanceOf[MediaRecorderHook]
  inline def useMediaRecorder(stream: MediaStream): MediaRecorderHook = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaRecorder")(stream.asInstanceOf[js.Any]).asInstanceOf[MediaRecorderHook]
  
  trait MediaRecorderHook extends StObject {
    
    def startCapture(): Unit
    
    def stopCapture(): js.Promise[Blob | Null]
  }
  object MediaRecorderHook {
    
    inline def apply(startCapture: () => Unit, stopCapture: () => js.Promise[Blob | Null]): MediaRecorderHook = {
      val __obj = js.Dynamic.literal(startCapture = js.Any.fromFunction0(startCapture), stopCapture = js.Any.fromFunction0(stopCapture))
      __obj.asInstanceOf[MediaRecorderHook]
    }
    
    extension [Self <: MediaRecorderHook](x: Self) {
      
      inline def setStartCapture(value: () => Unit): Self = StObject.set(x, "startCapture", js.Any.fromFunction0(value))
      
      inline def setStopCapture(value: () => js.Promise[Blob | Null]): Self = StObject.set(x, "stopCapture", js.Any.fromFunction0(value))
    }
  }
}
