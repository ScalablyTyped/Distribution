package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.cpu
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.wasm
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.webgl
import typings.tensorflowModelsFaceLandmarksDetection.distFaceLandmarksDetectorMod.FaceLandmarksDetector
import typings.tensorflowModelsFaceLandmarksDetection.distMediapipeTypesMod.MediaPipeFaceMeshMediaPipeModelConfig
import typings.tensorflowModelsFaceLandmarksDetection.distTfjsTypesMod.MediaPipeFaceMeshTfjsModelConfig
import typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.SupportedModels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsVideoFeedbackCreateDetectorWorkerMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/VideoFeedback/createDetectorWorker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDetectorWorker(
    model: SupportedModels,
    modelConfig: MediaPipeFaceMeshMediaPipeModelConfig,
    debug: Boolean,
    backend: webgl | wasm | cpu,
    workerFrameScale: Double
  ): js.Promise[FaceLandmarksDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetectorWorker")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any], debug.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], workerFrameScale.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceLandmarksDetector]]
  inline def createDetectorWorker(
    model: SupportedModels,
    modelConfig: MediaPipeFaceMeshTfjsModelConfig,
    debug: Boolean,
    backend: webgl | wasm | cpu,
    workerFrameScale: Double
  ): js.Promise[FaceLandmarksDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetectorWorker")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any], debug.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], workerFrameScale.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceLandmarksDetector]]
}
