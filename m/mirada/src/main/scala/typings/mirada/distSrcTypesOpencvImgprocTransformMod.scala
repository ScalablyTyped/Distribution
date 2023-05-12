package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Point2f
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvImgprocTransformMod {
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_AREA")
  @js.native
  val INTER_AREA: InterpolationFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_BITS")
  @js.native
  val INTER_BITS: InterpolationMasks = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_BITS2")
  @js.native
  val INTER_BITS2: InterpolationMasks = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_CUBIC")
  @js.native
  val INTER_CUBIC: InterpolationFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_LANCZOS4")
  @js.native
  val INTER_LANCZOS4: InterpolationFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_LINEAR")
  @js.native
  val INTER_LINEAR: InterpolationFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_LINEAR_EXACT")
  @js.native
  val INTER_LINEAR_EXACT: InterpolationFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_MAX")
  @js.native
  val INTER_MAX: InterpolationFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_NEAREST")
  @js.native
  val INTER_NEAREST: InterpolationFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_TAB_SIZE")
  @js.native
  val INTER_TAB_SIZE: InterpolationMasks = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "INTER_TAB_SIZE2")
  @js.native
  val INTER_TAB_SIZE2: InterpolationMasks = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "WARP_FILL_OUTLIERS")
  @js.native
  val WARP_FILL_OUTLIERS: InterpolationFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "WARP_INVERSE_MAP")
  @js.native
  val WARP_INVERSE_MAP: InterpolationFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "WARP_POLAR_LINEAR")
  @js.native
  val WARP_POLAR_LINEAR: WarpPolarMode = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_transform", "WARP_POLAR_LOG")
  @js.native
  val WARP_POLAR_LOG: WarpPolarMode = js.native
  
  inline def convertMaps(map1: InputArray, map2: InputArray, dstmap1: OutputArray, dstmap2: OutputArray, dstmap1type: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMaps")(map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], dstmap1.asInstanceOf[js.Any], dstmap2.asInstanceOf[js.Any], dstmap1type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convertMaps(
    map1: InputArray,
    map2: InputArray,
    dstmap1: OutputArray,
    dstmap2: OutputArray,
    dstmap1type: int,
    nninterpolation: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMaps")(map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], dstmap1.asInstanceOf[js.Any], dstmap2.asInstanceOf[js.Any], dstmap1type.asInstanceOf[js.Any], nninterpolation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAffineTransform(src: Any, dst: Any): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getAffineTransform")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getAffineTransform(src: InputArray, dst: InputArray): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getAffineTransform")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def getPerspectiveTransform(src: Any, dst: Any): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getPerspectiveTransform")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getPerspectiveTransform(src: Any, dst: Any, solveMethod: int): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getPerspectiveTransform")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], solveMethod.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getPerspectiveTransform(src: InputArray, dst: InputArray): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getPerspectiveTransform")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getPerspectiveTransform(src: InputArray, dst: InputArray, solveMethod: int): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getPerspectiveTransform")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], solveMethod.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def getRectSubPix(image: InputArray, patchSize: Size, center: Point2f, patch: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectSubPix")(image.asInstanceOf[js.Any], patchSize.asInstanceOf[js.Any], center.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getRectSubPix(image: InputArray, patchSize: Size, center: Point2f, patch: OutputArray, patchType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectSubPix")(image.asInstanceOf[js.Any], patchSize.asInstanceOf[js.Any], center.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], patchType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getRotationMatrix2D(center: Point2f, angle: double, scale: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotationMatrix2D")(center.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def invertAffineTransform(M: InputArray, iM: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invertAffineTransform")(M.asInstanceOf[js.Any], iM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def linearPolar(src: InputArray, dst: OutputArray, center: Point2f, maxRadius: double, flags: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linearPolar")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], center.asInstanceOf[js.Any], maxRadius.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logPolar(src: InputArray, dst: OutputArray, center: Point2f, M: double, flags: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logPolar")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], center.asInstanceOf[js.Any], M.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remap(src: InputArray, dst: OutputArray, map1: InputArray, map2: InputArray, interpolation: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remap")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def remap(
    src: InputArray,
    dst: OutputArray,
    map1: InputArray,
    map2: InputArray,
    interpolation: int,
    borderMode: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remap")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def remap(
    src: InputArray,
    dst: OutputArray,
    map1: InputArray,
    map2: InputArray,
    interpolation: int,
    borderMode: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remap")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def remap(
    src: InputArray,
    dst: OutputArray,
    map1: InputArray,
    map2: InputArray,
    interpolation: int,
    borderMode: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remap")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resize(src: InputArray, dst: OutputArray, dsize: Size): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resize(src: InputArray, dst: OutputArray, dsize: Size, fx: Unit, fy: Unit, interpolation: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], fx.asInstanceOf[js.Any], fy.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resize(src: InputArray, dst: OutputArray, dsize: Size, fx: Unit, fy: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], fx.asInstanceOf[js.Any], fy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resize(src: InputArray, dst: OutputArray, dsize: Size, fx: Unit, fy: double, interpolation: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], fx.asInstanceOf[js.Any], fy.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resize(src: InputArray, dst: OutputArray, dsize: Size, fx: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], fx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resize(src: InputArray, dst: OutputArray, dsize: Size, fx: double, fy: Unit, interpolation: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], fx.asInstanceOf[js.Any], fy.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resize(src: InputArray, dst: OutputArray, dsize: Size, fx: double, fy: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], fx.asInstanceOf[js.Any], fy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resize(src: InputArray, dst: OutputArray, dsize: Size, fx: double, fy: double, interpolation: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], fx.asInstanceOf[js.Any], fy.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def warpAffine(src: InputArray, dst: OutputArray, M: InputArray, dsize: Size): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpAffine")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpAffine(
    src: InputArray,
    dst: OutputArray,
    M: InputArray,
    dsize: Size,
    flags: Unit,
    borderMode: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpAffine")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpAffine(src: InputArray, dst: OutputArray, M: InputArray, dsize: Size, flags: Unit, borderMode: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpAffine")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpAffine(
    src: InputArray,
    dst: OutputArray,
    M: InputArray,
    dsize: Size,
    flags: Unit,
    borderMode: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpAffine")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpAffine(src: InputArray, dst: OutputArray, M: InputArray, dsize: Size, flags: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpAffine")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpAffine(
    src: InputArray,
    dst: OutputArray,
    M: InputArray,
    dsize: Size,
    flags: int,
    borderMode: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpAffine")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpAffine(src: InputArray, dst: OutputArray, M: InputArray, dsize: Size, flags: int, borderMode: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpAffine")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpAffine(
    src: InputArray,
    dst: OutputArray,
    M: InputArray,
    dsize: Size,
    flags: int,
    borderMode: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpAffine")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def warpPerspective(src: InputArray, dst: OutputArray, M: InputArray, dsize: Size): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpPerspective")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpPerspective(
    src: InputArray,
    dst: OutputArray,
    M: InputArray,
    dsize: Size,
    flags: Unit,
    borderMode: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpPerspective")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpPerspective(src: InputArray, dst: OutputArray, M: InputArray, dsize: Size, flags: Unit, borderMode: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpPerspective")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpPerspective(
    src: InputArray,
    dst: OutputArray,
    M: InputArray,
    dsize: Size,
    flags: Unit,
    borderMode: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpPerspective")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpPerspective(src: InputArray, dst: OutputArray, M: InputArray, dsize: Size, flags: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpPerspective")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpPerspective(
    src: InputArray,
    dst: OutputArray,
    M: InputArray,
    dsize: Size,
    flags: int,
    borderMode: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpPerspective")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpPerspective(src: InputArray, dst: OutputArray, M: InputArray, dsize: Size, flags: int, borderMode: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpPerspective")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warpPerspective(
    src: InputArray,
    dst: OutputArray,
    M: InputArray,
    dsize: Size,
    flags: int,
    borderMode: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpPerspective")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], M.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], borderMode.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def warpPolar(src: InputArray, dst: OutputArray, dsize: Size, center: Point2f, maxRadius: double, flags: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warpPolar")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dsize.asInstanceOf[js.Any], center.asInstanceOf[js.Any], maxRadius.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type InterpolationFlags = Any
  
  type InterpolationMasks = Any
  
  type WarpPolarMode = Any
}
