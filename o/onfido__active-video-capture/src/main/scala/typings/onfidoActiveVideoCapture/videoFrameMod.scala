package typings.onfidoActiveVideoCapture

import typings.preact.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoFrameMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/VideoFrame", "VideoFrame")
  @js.native
  val VideoFrame: FunctionComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var faceYaw: js.UndefOr[Double] = js.undefined
    
    var instructionMessage: String
    
    var ready: Boolean
    
    var scanComplete: Boolean
    
    def setScanComplete(arg0: Boolean): Unit
    
    var warningMessage: String
  }
  object Props {
    
    inline def apply(
      instructionMessage: String,
      ready: Boolean,
      scanComplete: Boolean,
      setScanComplete: Boolean => Unit,
      warningMessage: String
    ): Props = {
      val __obj = js.Dynamic.literal(instructionMessage = instructionMessage.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], scanComplete = scanComplete.asInstanceOf[js.Any], setScanComplete = js.Any.fromFunction1(setScanComplete), warningMessage = warningMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setFaceYaw(value: Double): Self = StObject.set(x, "faceYaw", value.asInstanceOf[js.Any])
      
      inline def setFaceYawUndefined: Self = StObject.set(x, "faceYaw", js.undefined)
      
      inline def setInstructionMessage(value: String): Self = StObject.set(x, "instructionMessage", value.asInstanceOf[js.Any])
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setScanComplete(value: Boolean): Self = StObject.set(x, "scanComplete", value.asInstanceOf[js.Any])
      
      inline def setSetScanComplete(value: Boolean => Unit): Self = StObject.set(x, "setScanComplete", js.Any.fromFunction1(value))
      
      inline def setWarningMessage(value: String): Self = StObject.set(x, "warningMessage", value.asInstanceOf[js.Any])
    }
  }
}
