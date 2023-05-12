package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.distComponentsVideoFeedbackDetectorWorkerMod.WorkerRequestMessage
import typings.onfidoActiveVideoCapture.distComponentsVideoFeedbackDetectorWorkerMod.WorkerResponseMessage
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.cpu
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.detect
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.dispose
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.init
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.ready
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.reset
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.result
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.wasm
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.webgl
import typings.std.ImageBitmap
import typings.tensorflowModelsFaceLandmarksDetection.distMediapipeTypesMod.MediaPipeFaceMeshMediaPipeModelConfig
import typings.tensorflowModelsFaceLandmarksDetection.distTfjsTypesMod.MediaPipeFaceMeshTfjsModelConfig
import typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.Face
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with WorkerRequestMessage {
    
    var `type`: reset
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("reset")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setType(value: reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`
    extends StObject
       with WorkerResponseMessage {
    
    var `type`: ready
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ready")
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setType(value: ready): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvgFps extends StObject {
    
    var avgFps: String
    
    var currentFps: Double
    
    var fps: js.Array[Double]
    
    var maxFps: Double
  }
  object AvgFps {
    
    inline def apply(avgFps: String, currentFps: Double, fps: js.Array[Double], maxFps: Double): AvgFps = {
      val __obj = js.Dynamic.literal(avgFps = avgFps.asInstanceOf[js.Any], currentFps = currentFps.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], maxFps = maxFps.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvgFps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvgFps] (val x: Self) extends AnyVal {
      
      inline def setAvgFps(value: String): Self = StObject.set(x, "avgFps", value.asInstanceOf[js.Any])
      
      inline def setCurrentFps(value: Double): Self = StObject.set(x, "currentFps", value.asInstanceOf[js.Any])
      
      inline def setFps(value: js.Array[Double]): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsVarargs(value: Double*): Self = StObject.set(x, "fps", js.Array(value*))
      
      inline def setMaxFps(value: Double): Self = StObject.set(x, "maxFps", value.asInstanceOf[js.Any])
    }
  }
  
  trait Backend
    extends StObject
       with WorkerRequestMessage {
    
    var backend: webgl | wasm | cpu
    
    var debug: Boolean
    
    var modelConfig: js.UndefOr[MediaPipeFaceMeshMediaPipeModelConfig | MediaPipeFaceMeshTfjsModelConfig] = js.undefined
    
    var `type`: init
  }
  object Backend {
    
    inline def apply(backend: webgl | wasm | cpu, debug: Boolean): Backend = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("init")
      __obj.asInstanceOf[Backend]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
      
      inline def setBackend(value: webgl | wasm | cpu): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setModelConfig(value: MediaPipeFaceMeshMediaPipeModelConfig | MediaPipeFaceMeshTfjsModelConfig): Self = StObject.set(x, "modelConfig", value.asInstanceOf[js.Any])
      
      inline def setModelConfigUndefined: Self = StObject.set(x, "modelConfig", js.undefined)
      
      inline def setType(value: init): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Faces
    extends StObject
       with WorkerResponseMessage {
    
    var faces: js.Array[Face]
    
    var `type`: result
  }
  object Faces {
    
    inline def apply(faces: js.Array[Face]): Faces = {
      val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("result")
      __obj.asInstanceOf[Faces]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Faces] (val x: Self) extends AnyVal {
      
      inline def setFaces(value: js.Array[Face]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      inline def setFacesVarargs(value: Face*): Self = StObject.set(x, "faces", js.Array(value*))
      
      inline def setType(value: result): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Input
    extends StObject
       with WorkerRequestMessage {
    
    var input: ImageBitmap
    
    var `type`: detect
  }
  object Input {
    
    inline def apply(input: ImageBitmap): Input = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("detect")
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      inline def setInput(value: ImageBitmap): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setType(value: detect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with WorkerRequestMessage {
    
    var `type`: dispose
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("dispose")
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: dispose): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
