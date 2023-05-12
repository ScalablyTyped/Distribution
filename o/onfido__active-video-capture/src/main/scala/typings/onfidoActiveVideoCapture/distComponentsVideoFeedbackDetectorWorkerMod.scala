package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.cpu
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.wasm
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.webgl
import typings.std.ImageBitmap
import typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.Face
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsVideoFeedbackDetectorWorkerMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.onfidoActiveVideoCapture.anon.Backend
    - typings.onfidoActiveVideoCapture.anon.Input
    - typings.onfidoActiveVideoCapture.anon.Type
    - typings.onfidoActiveVideoCapture.anon.`0`
  */
  trait WorkerRequestMessage extends StObject
  object WorkerRequestMessage {
    
    inline def `0`(): typings.onfidoActiveVideoCapture.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("reset")
      __obj.asInstanceOf[typings.onfidoActiveVideoCapture.anon.`0`]
    }
    
    inline def Backend(backend: webgl | wasm | cpu, debug: Boolean): typings.onfidoActiveVideoCapture.anon.Backend = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("init")
      __obj.asInstanceOf[typings.onfidoActiveVideoCapture.anon.Backend]
    }
    
    inline def Input(input: ImageBitmap): typings.onfidoActiveVideoCapture.anon.Input = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("detect")
      __obj.asInstanceOf[typings.onfidoActiveVideoCapture.anon.Input]
    }
    
    inline def Type(): typings.onfidoActiveVideoCapture.anon.Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("dispose")
      __obj.asInstanceOf[typings.onfidoActiveVideoCapture.anon.Type]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.onfidoActiveVideoCapture.anon.`1`
    - typings.onfidoActiveVideoCapture.anon.Faces
  */
  trait WorkerResponseMessage extends StObject
  object WorkerResponseMessage {
    
    inline def `1`(): typings.onfidoActiveVideoCapture.anon.`1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ready")
      __obj.asInstanceOf[typings.onfidoActiveVideoCapture.anon.`1`]
    }
    
    inline def Faces(faces: js.Array[Face]): typings.onfidoActiveVideoCapture.anon.Faces = {
      val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("result")
      __obj.asInstanceOf[typings.onfidoActiveVideoCapture.anon.Faces]
    }
  }
}
