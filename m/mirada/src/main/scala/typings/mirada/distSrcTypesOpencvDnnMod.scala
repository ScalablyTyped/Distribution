package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.Net
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvHacksMod.sizeT
import typings.mirada.distSrcTypesOpencvHacksMod.uchar
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvDnnMod {
  
  @JSImport("mirada/dist/src/types/opencv/dnn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_BACKEND_DEFAULT")
  @js.native
  val DNN_BACKEND_DEFAULT: Backend = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_BACKEND_HALIDE")
  @js.native
  val DNN_BACKEND_HALIDE: Backend = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_BACKEND_INFERENCE_ENGINE")
  @js.native
  val DNN_BACKEND_INFERENCE_ENGINE: Backend = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_BACKEND_OPENCV")
  @js.native
  val DNN_BACKEND_OPENCV: Backend = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_BACKEND_VKCOM")
  @js.native
  val DNN_BACKEND_VKCOM: Backend = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_TARGET_CPU")
  @js.native
  val DNN_TARGET_CPU: Target = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_TARGET_FPGA")
  @js.native
  val DNN_TARGET_FPGA: Target = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_TARGET_MYRIAD")
  @js.native
  val DNN_TARGET_MYRIAD: Target = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_TARGET_OPENCL")
  @js.native
  val DNN_TARGET_OPENCL: Target = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_TARGET_OPENCL_FP16")
  @js.native
  val DNN_TARGET_OPENCL_FP16: Target = js.native
  
  @JSImport("mirada/dist/src/types/opencv/dnn", "DNN_TARGET_VULKAN")
  @js.native
  val DNN_TARGET_VULKAN: Target = js.native
  
  inline def NMSBoxes(bboxes: Any, scores: Any, score_threshold: Any, nms_threshold: Any, indices: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NMSBoxes")(bboxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], score_threshold.asInstanceOf[js.Any], nms_threshold.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def NMSBoxes(bboxes: Any, scores: Any, score_threshold: Any, nms_threshold: Any, indices: Any, eta: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NMSBoxes")(bboxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], score_threshold.asInstanceOf[js.Any], nms_threshold.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], eta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def NMSBoxes(
    bboxes: Any,
    scores: Any,
    score_threshold: Any,
    nms_threshold: Any,
    indices: Any,
    eta: Any,
    top_k: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NMSBoxes")(bboxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], score_threshold.asInstanceOf[js.Any], nms_threshold.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], eta.asInstanceOf[js.Any], top_k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def NMSBoxes(
    bboxes: Any,
    scores: Any,
    score_threshold: Any,
    nms_threshold: Any,
    indices: Any,
    eta: Unit,
    top_k: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NMSBoxes")(bboxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], score_threshold.asInstanceOf[js.Any], nms_threshold.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], eta.asInstanceOf[js.Any], top_k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def blobFromImage(
    image: InputArray,
    blob: OutputArray,
    scalefactor: js.UndefOr[double],
    size: js.UndefOr[Any],
    mean: js.UndefOr[Any],
    swapRB: js.UndefOr[bool],
    crop: js.UndefOr[bool],
    ddepth: js.UndefOr[int]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFromImage")(image.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], scalefactor.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], swapRB.asInstanceOf[js.Any], crop.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def blobFromImage(
    image: InputArray,
    scalefactor: js.UndefOr[double],
    size: js.UndefOr[Any],
    mean: js.UndefOr[Any],
    swapRB: js.UndefOr[bool],
    crop: js.UndefOr[bool],
    ddepth: js.UndefOr[int]
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFromImage")(image.asInstanceOf[js.Any], scalefactor.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], swapRB.asInstanceOf[js.Any], crop.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def blobFromImages(
    images: InputArrayOfArrays,
    blob: OutputArray,
    scalefactor: js.UndefOr[double],
    size: js.UndefOr[Size],
    mean: js.UndefOr[Any],
    swapRB: js.UndefOr[bool],
    crop: js.UndefOr[bool],
    ddepth: js.UndefOr[int]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFromImages")(images.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], scalefactor.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], swapRB.asInstanceOf[js.Any], crop.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def blobFromImages(
    images: InputArrayOfArrays,
    scalefactor: js.UndefOr[double],
    size: js.UndefOr[Size],
    mean: js.UndefOr[Any],
    swapRB: js.UndefOr[bool],
    crop: js.UndefOr[bool],
    ddepth: js.UndefOr[int]
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFromImages")(images.asInstanceOf[js.Any], scalefactor.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], swapRB.asInstanceOf[js.Any], crop.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def getAvailableBackends(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableBackends")().asInstanceOf[Any]
  
  inline def getAvailableTargets(be: Backend): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableTargets")(be.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def imagesFromBlob(blob_ : Any, images_ : OutputArrayOfArrays): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("imagesFromBlob")(blob_.asInstanceOf[js.Any], images_.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def readNet(model: Any): Net = ^.asInstanceOf[js.Dynamic].applyDynamic("readNet")(model.asInstanceOf[js.Any]).asInstanceOf[Net]
  inline def readNet(model: Any, config: Any): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNet")(model.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNet(model: Any, config: Any, framework: Any): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNet")(model.asInstanceOf[js.Any], config.asInstanceOf[js.Any], framework.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNet(model: Any, config: Unit, framework: Any): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNet")(model.asInstanceOf[js.Any], config.asInstanceOf[js.Any], framework.asInstanceOf[js.Any])).asInstanceOf[Net]
  
  inline def readNetFromCaffe(bufferProto: Any, lenProto: sizeT, bufferModel: Any): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromCaffe")(bufferProto.asInstanceOf[js.Any], lenProto.asInstanceOf[js.Any], bufferModel.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromCaffe(bufferProto: Any, lenProto: sizeT, bufferModel: Any, lenModel: sizeT): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromCaffe")(bufferProto.asInstanceOf[js.Any], lenProto.asInstanceOf[js.Any], bufferModel.asInstanceOf[js.Any], lenModel.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromCaffe(bufferProto: Any, lenProto: sizeT, bufferModel: Unit, lenModel: sizeT): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromCaffe")(bufferProto.asInstanceOf[js.Any], lenProto.asInstanceOf[js.Any], bufferModel.asInstanceOf[js.Any], lenModel.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromCaffe(prototxt: Any): Net = ^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromCaffe")(prototxt.asInstanceOf[js.Any]).asInstanceOf[Net]
  inline def readNetFromCaffe(prototxt: Any, caffeModel: Any | sizeT): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromCaffe")(prototxt.asInstanceOf[js.Any], caffeModel.asInstanceOf[js.Any])).asInstanceOf[Net]
  
  inline def readNetFromCaffe_uchar(bufferProto: uchar): uchar = ^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromCaffe")(bufferProto.asInstanceOf[js.Any]).asInstanceOf[uchar]
  inline def readNetFromCaffe_uchar(bufferProto: uchar, bufferModel: uchar): uchar = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromCaffe")(bufferProto.asInstanceOf[js.Any], bufferModel.asInstanceOf[js.Any])).asInstanceOf[uchar]
  
  inline def readNetFromDarknet(bufferCfg: Any, lenCfg: sizeT, bufferModel: Any): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromDarknet")(bufferCfg.asInstanceOf[js.Any], lenCfg.asInstanceOf[js.Any], bufferModel.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromDarknet(bufferCfg: Any, lenCfg: sizeT, bufferModel: Any, lenModel: sizeT): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromDarknet")(bufferCfg.asInstanceOf[js.Any], lenCfg.asInstanceOf[js.Any], bufferModel.asInstanceOf[js.Any], lenModel.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromDarknet(bufferCfg: Any, lenCfg: sizeT, bufferModel: Unit, lenModel: sizeT): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromDarknet")(bufferCfg.asInstanceOf[js.Any], lenCfg.asInstanceOf[js.Any], bufferModel.asInstanceOf[js.Any], lenModel.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromDarknet(cfgFile: Any): Net = ^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromDarknet")(cfgFile.asInstanceOf[js.Any]).asInstanceOf[Net]
  inline def readNetFromDarknet(cfgFile: Any, darknetModel: Any | sizeT): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromDarknet")(cfgFile.asInstanceOf[js.Any], darknetModel.asInstanceOf[js.Any])).asInstanceOf[Net]
  
  inline def readNetFromDarknet_uchar(bufferCfg: uchar): uchar = ^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromDarknet")(bufferCfg.asInstanceOf[js.Any]).asInstanceOf[uchar]
  inline def readNetFromDarknet_uchar(bufferCfg: uchar, bufferModel: uchar): uchar = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromDarknet")(bufferCfg.asInstanceOf[js.Any], bufferModel.asInstanceOf[js.Any])).asInstanceOf[uchar]
  
  inline def readNetFromModelOptimizer(xml: Any, bin: Any): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromModelOptimizer")(xml.asInstanceOf[js.Any], bin.asInstanceOf[js.Any])).asInstanceOf[Net]
  
  inline def readNetFromONNX(buffer: Any, sizeBuffer: sizeT): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromONNX")(buffer.asInstanceOf[js.Any], sizeBuffer.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromONNX(onnxFile: Any): Net = ^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromONNX")(onnxFile.asInstanceOf[js.Any]).asInstanceOf[Net]
  
  inline def readNetFromONNX_uchar(buffer: uchar): uchar = ^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromONNX")(buffer.asInstanceOf[js.Any]).asInstanceOf[uchar]
  
  inline def readNetFromTensorflow(bufferModel: Any, lenModel: sizeT, bufferConfig: Any): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTensorflow")(bufferModel.asInstanceOf[js.Any], lenModel.asInstanceOf[js.Any], bufferConfig.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromTensorflow(bufferModel: Any, lenModel: sizeT, bufferConfig: Any, lenConfig: sizeT): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTensorflow")(bufferModel.asInstanceOf[js.Any], lenModel.asInstanceOf[js.Any], bufferConfig.asInstanceOf[js.Any], lenConfig.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromTensorflow(bufferModel: Any, lenModel: sizeT, bufferConfig: Unit, lenConfig: sizeT): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTensorflow")(bufferModel.asInstanceOf[js.Any], lenModel.asInstanceOf[js.Any], bufferConfig.asInstanceOf[js.Any], lenConfig.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromTensorflow(model: Any): Net = ^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTensorflow")(model.asInstanceOf[js.Any]).asInstanceOf[Net]
  inline def readNetFromTensorflow(model: Any, config: Any | sizeT): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTensorflow")(model.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Net]
  
  inline def readNetFromTensorflow_uchar(bufferModel: uchar): uchar = ^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTensorflow")(bufferModel.asInstanceOf[js.Any]).asInstanceOf[uchar]
  inline def readNetFromTensorflow_uchar(bufferModel: uchar, bufferConfig: uchar): uchar = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTensorflow")(bufferModel.asInstanceOf[js.Any], bufferConfig.asInstanceOf[js.Any])).asInstanceOf[uchar]
  
  inline def readNetFromTorch(model: Any): Net = ^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTorch")(model.asInstanceOf[js.Any]).asInstanceOf[Net]
  inline def readNetFromTorch(model: Any, isBinary: Unit, evaluate: bool): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTorch")(model.asInstanceOf[js.Any], isBinary.asInstanceOf[js.Any], evaluate.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromTorch(model: Any, isBinary: bool): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTorch")(model.asInstanceOf[js.Any], isBinary.asInstanceOf[js.Any])).asInstanceOf[Net]
  inline def readNetFromTorch(model: Any, isBinary: bool, evaluate: bool): Net = (^.asInstanceOf[js.Dynamic].applyDynamic("readNetFromTorch")(model.asInstanceOf[js.Any], isBinary.asInstanceOf[js.Any], evaluate.asInstanceOf[js.Any])).asInstanceOf[Net]
  
  inline def readNet_uchar(framework: Any, bufferModel: uchar): uchar = (^.asInstanceOf[js.Dynamic].applyDynamic("readNet")(framework.asInstanceOf[js.Any], bufferModel.asInstanceOf[js.Any])).asInstanceOf[uchar]
  inline def readNet_uchar(framework: Any, bufferModel: uchar, bufferConfig: uchar): uchar = (^.asInstanceOf[js.Dynamic].applyDynamic("readNet")(framework.asInstanceOf[js.Any], bufferModel.asInstanceOf[js.Any], bufferConfig.asInstanceOf[js.Any])).asInstanceOf[uchar]
  
  inline def readTensorFromONNX(path: Any): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("readTensorFromONNX")(path.asInstanceOf[js.Any]).asInstanceOf[Mat]
  
  inline def readTorchBlob(filename: Any): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("readTorchBlob")(filename.asInstanceOf[js.Any]).asInstanceOf[Mat]
  inline def readTorchBlob(filename: Any, isBinary: bool): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("readTorchBlob")(filename.asInstanceOf[js.Any], isBinary.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def shrinkCaffeModel(src: Any, dst: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shrinkCaffeModel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shrinkCaffeModel(src: Any, dst: Any, layersTypes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shrinkCaffeModel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], layersTypes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeTextGraph(model: Any, output: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextGraph")(model.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Backend = Any
  
  type Target = Any
}
