package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.float
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvImgprocHistMod {
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_hist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def EMD(signature1: InputArray, signature2: InputArray, distType: int): float = (^.asInstanceOf[js.Dynamic].applyDynamic("EMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def EMD(signature1: InputArray, signature2: InputArray, distType: int, cost: Unit, lowerBound: Any): float = (^.asInstanceOf[js.Dynamic].applyDynamic("EMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def EMD(
    signature1: InputArray,
    signature2: InputArray,
    distType: int,
    cost: Unit,
    lowerBound: Any,
    flow: OutputArray
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("EMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def EMD(
    signature1: InputArray,
    signature2: InputArray,
    distType: int,
    cost: Unit,
    lowerBound: Unit,
    flow: OutputArray
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("EMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def EMD(signature1: InputArray, signature2: InputArray, distType: int, cost: InputArray): float = (^.asInstanceOf[js.Dynamic].applyDynamic("EMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def EMD(signature1: InputArray, signature2: InputArray, distType: int, cost: InputArray, lowerBound: Any): float = (^.asInstanceOf[js.Dynamic].applyDynamic("EMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def EMD(
    signature1: InputArray,
    signature2: InputArray,
    distType: int,
    cost: InputArray,
    lowerBound: Any,
    flow: OutputArray
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("EMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def EMD(
    signature1: InputArray,
    signature2: InputArray,
    distType: int,
    cost: InputArray,
    lowerBound: Unit,
    flow: OutputArray
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("EMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[float]
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_hist", "HISTCMP_BHATTACHARYYA")
  @js.native
  val HISTCMP_BHATTACHARYYA: HistCompMethods = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_hist", "HISTCMP_CHISQR")
  @js.native
  val HISTCMP_CHISQR: HistCompMethods = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_hist", "HISTCMP_CHISQR_ALT")
  @js.native
  val HISTCMP_CHISQR_ALT: HistCompMethods = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_hist", "HISTCMP_CORREL")
  @js.native
  val HISTCMP_CORREL: HistCompMethods = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_hist", "HISTCMP_HELLINGER")
  @js.native
  val HISTCMP_HELLINGER: HistCompMethods = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_hist", "HISTCMP_INTERSECT")
  @js.native
  val HISTCMP_INTERSECT: HistCompMethods = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_hist", "HISTCMP_KL_DIV")
  @js.native
  val HISTCMP_KL_DIV: HistCompMethods = js.native
  
  inline def calcBackProject(images: Any, nimages: int, channels: Any, hist: Any, backProject: OutputArray, ranges: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBackProject")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], backProject.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcBackProject(
    images: Any,
    nimages: int,
    channels: Any,
    hist: Any,
    backProject: OutputArray,
    ranges: Any,
    scale: Unit,
    uniform: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBackProject")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], backProject.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], uniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcBackProject(
    images: Any,
    nimages: int,
    channels: Any,
    hist: Any,
    backProject: OutputArray,
    ranges: Any,
    scale: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBackProject")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], backProject.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcBackProject(
    images: Any,
    nimages: int,
    channels: Any,
    hist: Any,
    backProject: OutputArray,
    ranges: Any,
    scale: double,
    uniform: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBackProject")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], backProject.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], uniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcBackProject(images: Any, nimages: int, channels: Any, hist: InputArray, backProject: OutputArray, ranges: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBackProject")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], backProject.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcBackProject(
    images: Any,
    nimages: int,
    channels: Any,
    hist: InputArray,
    backProject: OutputArray,
    ranges: Any,
    scale: Unit,
    uniform: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBackProject")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], backProject.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], uniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcBackProject(
    images: Any,
    nimages: int,
    channels: Any,
    hist: InputArray,
    backProject: OutputArray,
    ranges: Any,
    scale: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBackProject")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], backProject.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcBackProject(
    images: Any,
    nimages: int,
    channels: Any,
    hist: InputArray,
    backProject: OutputArray,
    ranges: Any,
    scale: double,
    uniform: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBackProject")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], backProject.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], uniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcBackProject(
    images: InputArrayOfArrays,
    channels: Any,
    hist: InputArray,
    dst: OutputArray,
    ranges: Any,
    scale: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBackProject")(images.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def calcHist(
    images: Any,
    nimages: int,
    channels: Any,
    mask: InputArray,
    hist: Any,
    dims: int,
    histSize: Any,
    ranges: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHist")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], dims.asInstanceOf[js.Any], histSize.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcHist(
    images: Any,
    nimages: int,
    channels: Any,
    mask: InputArray,
    hist: Any,
    dims: int,
    histSize: Any,
    ranges: Any,
    uniform: Unit,
    accumulate: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHist")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], dims.asInstanceOf[js.Any], histSize.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], uniform.asInstanceOf[js.Any], accumulate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcHist(
    images: Any,
    nimages: int,
    channels: Any,
    mask: InputArray,
    hist: Any,
    dims: int,
    histSize: Any,
    ranges: Any,
    uniform: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHist")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], dims.asInstanceOf[js.Any], histSize.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], uniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcHist(
    images: Any,
    nimages: int,
    channels: Any,
    mask: InputArray,
    hist: Any,
    dims: int,
    histSize: Any,
    ranges: Any,
    uniform: bool,
    accumulate: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHist")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], dims.asInstanceOf[js.Any], histSize.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], uniform.asInstanceOf[js.Any], accumulate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcHist(
    images: Any,
    nimages: int,
    channels: Any,
    mask: InputArray,
    hist: OutputArray,
    dims: int,
    histSize: Any,
    ranges: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHist")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], dims.asInstanceOf[js.Any], histSize.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcHist(
    images: Any,
    nimages: int,
    channels: Any,
    mask: InputArray,
    hist: OutputArray,
    dims: int,
    histSize: Any,
    ranges: Any,
    uniform: Unit,
    accumulate: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHist")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], dims.asInstanceOf[js.Any], histSize.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], uniform.asInstanceOf[js.Any], accumulate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcHist(
    images: Any,
    nimages: int,
    channels: Any,
    mask: InputArray,
    hist: OutputArray,
    dims: int,
    histSize: Any,
    ranges: Any,
    uniform: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHist")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], dims.asInstanceOf[js.Any], histSize.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], uniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcHist(
    images: Any,
    nimages: int,
    channels: Any,
    mask: InputArray,
    hist: OutputArray,
    dims: int,
    histSize: Any,
    ranges: Any,
    uniform: bool,
    accumulate: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHist")(images.asInstanceOf[js.Any], nimages.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], dims.asInstanceOf[js.Any], histSize.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], uniform.asInstanceOf[js.Any], accumulate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcHist(
    images: InputArrayOfArrays,
    channels: Any,
    mask: InputArray,
    hist: OutputArray,
    histSize: Any,
    ranges: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHist")(images.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], histSize.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcHist(
    images: InputArrayOfArrays,
    channels: Any,
    mask: InputArray,
    hist: OutputArray,
    histSize: Any,
    ranges: Any,
    accumulate: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHist")(images.asInstanceOf[js.Any], channels.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], hist.asInstanceOf[js.Any], histSize.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any], accumulate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compareHist(H1: Any, H2: Any, method: int): double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareHist")(H1.asInstanceOf[js.Any], H2.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def compareHist(H1: InputArray, H2: InputArray, method: int): double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareHist")(H1.asInstanceOf[js.Any], H2.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def createCLAHE(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createCLAHE")().asInstanceOf[Any]
  inline def createCLAHE(clipLimit: Unit, tileGridSize: Size): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createCLAHE")(clipLimit.asInstanceOf[js.Any], tileGridSize.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createCLAHE(clipLimit: double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createCLAHE")(clipLimit.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createCLAHE(clipLimit: double, tileGridSize: Size): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createCLAHE")(clipLimit.asInstanceOf[js.Any], tileGridSize.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def equalizeHist(src: InputArray, dst: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equalizeHist")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def wrapperEMD(signature1: InputArray, signature2: InputArray, distType: int): float = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperEMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def wrapperEMD(signature1: InputArray, signature2: InputArray, distType: int, cost: Unit, lowerBound: Any): float = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperEMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def wrapperEMD(
    signature1: InputArray,
    signature2: InputArray,
    distType: int,
    cost: Unit,
    lowerBound: Any,
    flow: OutputArray
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperEMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def wrapperEMD(
    signature1: InputArray,
    signature2: InputArray,
    distType: int,
    cost: Unit,
    lowerBound: Unit,
    flow: OutputArray
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperEMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def wrapperEMD(signature1: InputArray, signature2: InputArray, distType: int, cost: InputArray): float = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperEMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def wrapperEMD(signature1: InputArray, signature2: InputArray, distType: int, cost: InputArray, lowerBound: Any): float = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperEMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def wrapperEMD(
    signature1: InputArray,
    signature2: InputArray,
    distType: int,
    cost: InputArray,
    lowerBound: Any,
    flow: OutputArray
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperEMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def wrapperEMD(
    signature1: InputArray,
    signature2: InputArray,
    distType: int,
    cost: InputArray,
    lowerBound: Unit,
    flow: OutputArray
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperEMD")(signature1.asInstanceOf[js.Any], signature2.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[float]
  
  type HistCompMethods = Any
}
