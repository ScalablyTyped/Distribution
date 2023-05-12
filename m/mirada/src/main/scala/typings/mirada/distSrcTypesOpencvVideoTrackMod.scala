package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.RotatedRect
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import typings.mirada.distSrcTypesOpencvTypesMod.TermCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvVideoTrackMod {
  
  @JSImport("mirada/dist/src/types/opencv/video_track", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CamShift(probImage: InputArray, window: Any, criteria: TermCriteria): RotatedRect = (^.asInstanceOf[js.Dynamic].applyDynamic("CamShift")(probImage.asInstanceOf[js.Any], window.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[RotatedRect]
  
  @JSImport("mirada/dist/src/types/opencv/video_track", "MOTION_AFFINE")
  @js.native
  val MOTION_AFFINE: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/video_track", "MOTION_EUCLIDEAN")
  @js.native
  val MOTION_EUCLIDEAN: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/video_track", "MOTION_HOMOGRAPHY")
  @js.native
  val MOTION_HOMOGRAPHY: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/video_track", "MOTION_TRANSLATION")
  @js.native
  val MOTION_TRANSLATION: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/video_track", "OPTFLOW_FARNEBACK_GAUSSIAN")
  @js.native
  val OPTFLOW_FARNEBACK_GAUSSIAN: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/video_track", "OPTFLOW_LK_GET_MIN_EIGENVALS")
  @js.native
  val OPTFLOW_LK_GET_MIN_EIGENVALS: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/video_track", "OPTFLOW_USE_INITIAL_FLOW")
  @js.native
  val OPTFLOW_USE_INITIAL_FLOW: Any = js.native
  
  inline def buildOpticalFlowPyramid(img: InputArray, pyramid: OutputArrayOfArrays, winSize: Size, maxLevel: int): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: Unit,
    pyrBorder: Unit,
    derivBorder: Unit,
    tryReuseInputImage: bool
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any], tryReuseInputImage.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: Unit,
    pyrBorder: Unit,
    derivBorder: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: Unit,
    pyrBorder: Unit,
    derivBorder: int,
    tryReuseInputImage: bool
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any], tryReuseInputImage.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: Unit,
    pyrBorder: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: Unit,
    pyrBorder: int,
    derivBorder: Unit,
    tryReuseInputImage: bool
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any], tryReuseInputImage.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: Unit,
    pyrBorder: int,
    derivBorder: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: Unit,
    pyrBorder: int,
    derivBorder: int,
    tryReuseInputImage: bool
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any], tryReuseInputImage.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(img: InputArray, pyramid: OutputArrayOfArrays, winSize: Size, maxLevel: int, withDerivatives: bool): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: bool,
    pyrBorder: Unit,
    derivBorder: Unit,
    tryReuseInputImage: bool
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any], tryReuseInputImage.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: bool,
    pyrBorder: Unit,
    derivBorder: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: bool,
    pyrBorder: Unit,
    derivBorder: int,
    tryReuseInputImage: bool
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any], tryReuseInputImage.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: bool,
    pyrBorder: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: bool,
    pyrBorder: int,
    derivBorder: Unit,
    tryReuseInputImage: bool
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any], tryReuseInputImage.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: bool,
    pyrBorder: int,
    derivBorder: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def buildOpticalFlowPyramid(
    img: InputArray,
    pyramid: OutputArrayOfArrays,
    winSize: Size,
    maxLevel: int,
    withDerivatives: bool,
    pyrBorder: int,
    derivBorder: int,
    tryReuseInputImage: bool
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("buildOpticalFlowPyramid")(img.asInstanceOf[js.Any], pyramid.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], withDerivatives.asInstanceOf[js.Any], pyrBorder.asInstanceOf[js.Any], derivBorder.asInstanceOf[js.Any], tryReuseInputImage.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def calcOpticalFlowFarneback(
    prev: InputArray,
    next: InputArray,
    flow: InputOutputArray,
    pyr_scale: double,
    levels: int,
    winsize: int,
    iterations: int,
    poly_n: int,
    poly_sigma: double,
    flags: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowFarneback")(prev.asInstanceOf[js.Any], next.asInstanceOf[js.Any], flow.asInstanceOf[js.Any], pyr_scale.asInstanceOf[js.Any], levels.asInstanceOf[js.Any], winsize.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], poly_n.asInstanceOf[js.Any], poly_sigma.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: Unit,
    criteria: Unit,
    flags: Unit,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: Unit,
    criteria: Unit,
    flags: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: Unit,
    criteria: Unit,
    flags: int,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: Unit,
    criteria: TermCriteria
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: Unit,
    criteria: TermCriteria,
    flags: Unit,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: Unit,
    criteria: TermCriteria,
    flags: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: Unit,
    criteria: TermCriteria,
    flags: int,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: int,
    criteria: Unit,
    flags: Unit,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: int,
    criteria: Unit,
    flags: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: int,
    criteria: Unit,
    flags: int,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: int,
    criteria: TermCriteria
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: int,
    criteria: TermCriteria,
    flags: Unit,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: int,
    criteria: TermCriteria,
    flags: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Unit,
    maxLevel: int,
    criteria: TermCriteria,
    flags: int,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: Unit,
    criteria: Unit,
    flags: Unit,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: Unit,
    criteria: Unit,
    flags: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: Unit,
    criteria: Unit,
    flags: int,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: Unit,
    criteria: TermCriteria
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: Unit,
    criteria: TermCriteria,
    flags: Unit,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: Unit,
    criteria: TermCriteria,
    flags: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: Unit,
    criteria: TermCriteria,
    flags: int,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: int,
    criteria: Unit,
    flags: Unit,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: int,
    criteria: Unit,
    flags: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: int,
    criteria: Unit,
    flags: int,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: int,
    criteria: TermCriteria
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: int,
    criteria: TermCriteria,
    flags: Unit,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: int,
    criteria: TermCriteria,
    flags: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calcOpticalFlowPyrLK(
    prevImg: InputArray,
    nextImg: InputArray,
    prevPts: InputArray,
    nextPts: InputOutputArray,
    status: OutputArray,
    err: OutputArray,
    winSize: Size,
    maxLevel: int,
    criteria: TermCriteria,
    flags: int,
    minEigThreshold: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcOpticalFlowPyrLK")(prevImg.asInstanceOf[js.Any], nextImg.asInstanceOf[js.Any], prevPts.asInstanceOf[js.Any], nextPts.asInstanceOf[js.Any], status.asInstanceOf[js.Any], err.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], minEigThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def computeECC(templateImage: InputArray, inputImage: InputArray): double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def computeECC(templateImage: InputArray, inputImage: InputArray, inputMask: InputArray): double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any], inputMask.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def estimateRigidTransform(src: InputArray, dst: InputArray, fullAffine: bool): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateRigidTransform")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], fullAffine.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def findTransformECC(templateImage: InputArray, inputImage: InputArray, warpMatrix: InputOutputArray): double = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransformECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any], warpMatrix.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def findTransformECC(
    templateImage: InputArray,
    inputImage: InputArray,
    warpMatrix: InputOutputArray,
    motionType: Unit,
    criteria: Unit,
    inputMask: InputArray
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransformECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any], warpMatrix.asInstanceOf[js.Any], motionType.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], inputMask.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def findTransformECC(
    templateImage: InputArray,
    inputImage: InputArray,
    warpMatrix: InputOutputArray,
    motionType: Unit,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransformECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any], warpMatrix.asInstanceOf[js.Any], motionType.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def findTransformECC(
    templateImage: InputArray,
    inputImage: InputArray,
    warpMatrix: InputOutputArray,
    motionType: Unit,
    criteria: TermCriteria,
    inputMask: InputArray
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransformECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any], warpMatrix.asInstanceOf[js.Any], motionType.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], inputMask.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def findTransformECC(templateImage: InputArray, inputImage: InputArray, warpMatrix: InputOutputArray, motionType: int): double = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransformECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any], warpMatrix.asInstanceOf[js.Any], motionType.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def findTransformECC(
    templateImage: InputArray,
    inputImage: InputArray,
    warpMatrix: InputOutputArray,
    motionType: int,
    criteria: Unit,
    inputMask: InputArray
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransformECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any], warpMatrix.asInstanceOf[js.Any], motionType.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], inputMask.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def findTransformECC(
    templateImage: InputArray,
    inputImage: InputArray,
    warpMatrix: InputOutputArray,
    motionType: int,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransformECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any], warpMatrix.asInstanceOf[js.Any], motionType.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def findTransformECC(
    templateImage: InputArray,
    inputImage: InputArray,
    warpMatrix: InputOutputArray,
    motionType: int,
    criteria: TermCriteria,
    inputMask: InputArray
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransformECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any], warpMatrix.asInstanceOf[js.Any], motionType.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], inputMask.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def findTransformECC(
    templateImage: InputArray,
    inputImage: InputArray,
    warpMatrix: InputOutputArray,
    motionType: int,
    criteria: TermCriteria,
    inputMask: InputArray,
    gaussFiltSize: int
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransformECC")(templateImage.asInstanceOf[js.Any], inputImage.asInstanceOf[js.Any], warpMatrix.asInstanceOf[js.Any], motionType.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], inputMask.asInstanceOf[js.Any], gaussFiltSize.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def meanShift(probImage: InputArray, window: Any, criteria: TermCriteria): int = (^.asInstanceOf[js.Dynamic].applyDynamic("meanShift")(probImage.asInstanceOf[js.Any], window.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def readOpticalFlow(path: Any): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("readOpticalFlow")(path.asInstanceOf[js.Any]).asInstanceOf[Mat]
  
  inline def writeOpticalFlow(path: Any, flow: InputArray): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("writeOpticalFlow")(path.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[bool]
}
