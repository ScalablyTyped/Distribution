package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.Point
import typings.mirada.distSrcTypesOpencvTypesMod.Scalar
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import typings.mirada.distSrcTypesOpencvTypesMod.TermCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvImgprocFilterMod {
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "FILTER_SCHARR")
  @js.native
  val FILTER_SCHARR: SpecialFilter = js.native
  
  inline def GaussianBlur(src: InputArray, dst: OutputArray, ksize: Size, sigmaX: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GaussianBlur")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], sigmaX.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def GaussianBlur(src: InputArray, dst: OutputArray, ksize: Size, sigmaX: double, sigmaY: Unit, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GaussianBlur")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], sigmaX.asInstanceOf[js.Any], sigmaY.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def GaussianBlur(src: InputArray, dst: OutputArray, ksize: Size, sigmaX: double, sigmaY: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GaussianBlur")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], sigmaX.asInstanceOf[js.Any], sigmaY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def GaussianBlur(src: InputArray, dst: OutputArray, ksize: Size, sigmaX: double, sigmaY: double, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GaussianBlur")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], sigmaX.asInstanceOf[js.Any], sigmaY.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def Laplacian(src: InputArray, dst: OutputArray, ddepth: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Unit,
    scale: Unit,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(src: InputArray, dst: OutputArray, ddepth: int, ksize: Unit, scale: Unit, delta: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Unit,
    scale: Unit,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(src: InputArray, dst: OutputArray, ddepth: int, ksize: Unit, scale: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Unit,
    scale: double,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(src: InputArray, dst: OutputArray, ddepth: int, ksize: Unit, scale: double, delta: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Unit,
    scale: double,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(src: InputArray, dst: OutputArray, ddepth: int, ksize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: int,
    scale: Unit,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(src: InputArray, dst: OutputArray, ddepth: int, ksize: int, scale: Unit, delta: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: int,
    scale: Unit,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(src: InputArray, dst: OutputArray, ddepth: int, ksize: int, scale: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: int,
    scale: double,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(src: InputArray, dst: OutputArray, ddepth: int, ksize: int, scale: double, delta: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Laplacian(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: int,
    scale: double,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Laplacian")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_BLACKHAT")
  @js.native
  val MORPH_BLACKHAT: MorphTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_CLOSE")
  @js.native
  val MORPH_CLOSE: MorphTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_CROSS")
  @js.native
  val MORPH_CROSS: MorphShapes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_DILATE")
  @js.native
  val MORPH_DILATE: MorphTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_ELLIPSE")
  @js.native
  val MORPH_ELLIPSE: MorphShapes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_ERODE")
  @js.native
  val MORPH_ERODE: MorphTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_GRADIENT")
  @js.native
  val MORPH_GRADIENT: MorphTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_HITMISS")
  @js.native
  val MORPH_HITMISS: MorphTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_OPEN")
  @js.native
  val MORPH_OPEN: MorphTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_RECT")
  @js.native
  val MORPH_RECT: MorphShapes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_filter", "MORPH_TOPHAT")
  @js.native
  val MORPH_TOPHAT: MorphTypes = js.native
  
  inline def Scharr(src: InputArray, dst: OutputArray, ddepth: int, dx: int, dy: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Scharr")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Scharr(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    scale: Unit,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Scharr")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Scharr(src: InputArray, dst: OutputArray, ddepth: int, dx: int, dy: int, scale: Unit, delta: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Scharr")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Scharr(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    scale: Unit,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Scharr")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Scharr(src: InputArray, dst: OutputArray, ddepth: int, dx: int, dy: int, scale: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Scharr")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Scharr(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    scale: double,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Scharr")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Scharr(src: InputArray, dst: OutputArray, ddepth: int, dx: int, dy: int, scale: double, delta: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Scharr")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Scharr(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    scale: double,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Scharr")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def Sobel(src: InputArray, dst: OutputArray, ddepth: int, dx: int, dy: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: Unit,
    scale: Unit,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: Unit,
    scale: Unit,
    delta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: Unit,
    scale: Unit,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(src: InputArray, dst: OutputArray, ddepth: int, dx: int, dy: int, ksize: Unit, scale: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: Unit,
    scale: double,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: Unit,
    scale: double,
    delta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: Unit,
    scale: double,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(src: InputArray, dst: OutputArray, ddepth: int, dx: int, dy: int, ksize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: int,
    scale: Unit,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: int,
    scale: Unit,
    delta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: int,
    scale: Unit,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(src: InputArray, dst: OutputArray, ddepth: int, dx: int, dy: int, ksize: int, scale: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: int,
    scale: double,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: int,
    scale: double,
    delta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Sobel(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    dx: int,
    dy: int,
    ksize: int,
    scale: double,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Sobel")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bilateralFilter(src: InputArray, dst: OutputArray, d: int, sigmaColor: double, sigmaSpace: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bilateralFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], d.asInstanceOf[js.Any], sigmaColor.asInstanceOf[js.Any], sigmaSpace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bilateralFilter(src: InputArray, dst: OutputArray, d: int, sigmaColor: double, sigmaSpace: double, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bilateralFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], d.asInstanceOf[js.Any], sigmaColor.asInstanceOf[js.Any], sigmaSpace.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def blur(src: InputArray, dst: OutputArray, ksize: Size): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def blur(src: InputArray, dst: OutputArray, ksize: Size, anchor: Unit, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def blur(src: InputArray, dst: OutputArray, ksize: Size, anchor: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def blur(src: InputArray, dst: OutputArray, ksize: Size, anchor: Point, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def boxFilter(src: InputArray, dst: OutputArray, ddepth: int, ksize: Size): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxFilter(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Size,
    anchor: Unit,
    normalize: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxFilter(src: InputArray, dst: OutputArray, ddepth: int, ksize: Size, anchor: Unit, normalize: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxFilter(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Size,
    anchor: Unit,
    normalize: bool,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxFilter(src: InputArray, dst: OutputArray, ddepth: int, ksize: Size, anchor: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxFilter(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Size,
    anchor: Point,
    normalize: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxFilter(src: InputArray, dst: OutputArray, ddepth: int, ksize: Size, anchor: Point, normalize: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxFilter(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Size,
    anchor: Point,
    normalize: bool,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def buildPyramid(src: InputArray, dst: OutputArrayOfArrays, maxlevel: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPyramid")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], maxlevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def buildPyramid(src: InputArray, dst: OutputArrayOfArrays, maxlevel: int, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPyramid")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], maxlevel.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dilate(src: InputArray, dst: OutputArray, kernel: InputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: Unit,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: Unit,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(src: InputArray, dst: OutputArray, kernel: InputArray, anchor: Unit, iterations: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: int,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: int,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: int,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(src: InputArray, dst: OutputArray, kernel: InputArray, anchor: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: Unit,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: Unit,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(src: InputArray, dst: OutputArray, kernel: InputArray, anchor: Point, iterations: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: int,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: int,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dilate(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: int,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dilate")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def erode(src: InputArray, dst: OutputArray, kernel: InputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: Unit,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: Unit,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(src: InputArray, dst: OutputArray, kernel: InputArray, anchor: Unit, iterations: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: int,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: int,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Unit,
    iterations: int,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(src: InputArray, dst: OutputArray, kernel: InputArray, anchor: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: Unit,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: Unit,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(src: InputArray, dst: OutputArray, kernel: InputArray, anchor: Point, iterations: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: int,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: int,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def erode(
    src: InputArray,
    dst: OutputArray,
    kernel: InputArray,
    anchor: Point,
    iterations: int,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erode")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def filter2D(src: InputArray, dst: OutputArray, ddepth: int, kernel: InputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def filter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernel: InputArray,
    anchor: Unit,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def filter2D(src: InputArray, dst: OutputArray, ddepth: int, kernel: InputArray, anchor: Unit, delta: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def filter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernel: InputArray,
    anchor: Unit,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def filter2D(src: InputArray, dst: OutputArray, ddepth: int, kernel: InputArray, anchor: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def filter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernel: InputArray,
    anchor: Point,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def filter2D(src: InputArray, dst: OutputArray, ddepth: int, kernel: InputArray, anchor: Point, delta: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def filter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernel: InputArray,
    anchor: Point,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDerivKernels(kx: OutputArray, ky: OutputArray, dx: int, dy: int, ksize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivKernels")(kx.asInstanceOf[js.Any], ky.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getDerivKernels(kx: OutputArray, ky: OutputArray, dx: int, dy: int, ksize: int, normalize: Unit, ktype: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivKernels")(kx.asInstanceOf[js.Any], ky.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], ktype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getDerivKernels(kx: OutputArray, ky: OutputArray, dx: int, dy: int, ksize: int, normalize: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivKernels")(kx.asInstanceOf[js.Any], ky.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getDerivKernels(kx: OutputArray, ky: OutputArray, dx: int, dy: int, ksize: int, normalize: bool, ktype: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivKernels")(kx.asInstanceOf[js.Any], ky.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], ktype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getGaborKernel(ksize: Size, sigma: double, theta: double, lambd: double, gamma: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getGaborKernel")(ksize.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], lambd.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getGaborKernel(ksize: Size, sigma: double, theta: double, lambd: double, gamma: double, psi: Unit, ktype: int): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getGaborKernel")(ksize.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], lambd.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], psi.asInstanceOf[js.Any], ktype.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getGaborKernel(ksize: Size, sigma: double, theta: double, lambd: double, gamma: double, psi: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getGaborKernel")(ksize.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], lambd.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], psi.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getGaborKernel(ksize: Size, sigma: double, theta: double, lambd: double, gamma: double, psi: double, ktype: int): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getGaborKernel")(ksize.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], lambd.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], psi.asInstanceOf[js.Any], ktype.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def getGaussianKernel(ksize: int, sigma: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getGaussianKernel")(ksize.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getGaussianKernel(ksize: int, sigma: double, ktype: int): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getGaussianKernel")(ksize.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any], ktype.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def getStructuringElement(shape: int, ksize: Size): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getStructuringElement")(shape.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getStructuringElement(shape: int, ksize: Size, anchor: Point): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getStructuringElement")(shape.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def medianBlur(src: InputArray, dst: OutputArray, ksize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("medianBlur")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def morphologyDefaultBorderValue(): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("morphologyDefaultBorderValue")().asInstanceOf[Scalar]
  
  inline def morphologyEx(src: InputArray, dst: OutputArray, op: int, kernel: InputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Unit,
    iterations: Unit,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Unit,
    iterations: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Unit,
    iterations: Unit,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(src: InputArray, dst: OutputArray, op: int, kernel: InputArray, anchor: Unit, iterations: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Unit,
    iterations: int,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Unit,
    iterations: int,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Unit,
    iterations: int,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(src: InputArray, dst: OutputArray, op: int, kernel: InputArray, anchor: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Point,
    iterations: Unit,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Point,
    iterations: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Point,
    iterations: Unit,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(src: InputArray, dst: OutputArray, op: int, kernel: InputArray, anchor: Point, iterations: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Point,
    iterations: int,
    borderType: Unit,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Point,
    iterations: int,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def morphologyEx(
    src: InputArray,
    dst: OutputArray,
    op: int,
    kernel: InputArray,
    anchor: Point,
    iterations: int,
    borderType: int,
    borderValue: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("morphologyEx")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], op.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pyrDown(src: InputArray, dst: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrDown")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pyrDown(src: InputArray, dst: OutputArray, dstsize: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrDown")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dstsize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pyrDown(src: InputArray, dst: OutputArray, dstsize: Any, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrDown")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dstsize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pyrDown(src: InputArray, dst: OutputArray, dstsize: Unit, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrDown")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dstsize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pyrMeanShiftFiltering(src: InputArray, dst: OutputArray, sp: double, sr: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrMeanShiftFiltering")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], sp.asInstanceOf[js.Any], sr.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pyrMeanShiftFiltering(src: InputArray, dst: OutputArray, sp: double, sr: double, maxLevel: Unit, termcrit: TermCriteria): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrMeanShiftFiltering")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], sp.asInstanceOf[js.Any], sr.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], termcrit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pyrMeanShiftFiltering(src: InputArray, dst: OutputArray, sp: double, sr: double, maxLevel: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrMeanShiftFiltering")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], sp.asInstanceOf[js.Any], sr.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pyrMeanShiftFiltering(src: InputArray, dst: OutputArray, sp: double, sr: double, maxLevel: int, termcrit: TermCriteria): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrMeanShiftFiltering")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], sp.asInstanceOf[js.Any], sr.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], termcrit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pyrUp(src: InputArray, dst: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrUp")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pyrUp(src: InputArray, dst: OutputArray, dstsize: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrUp")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dstsize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pyrUp(src: InputArray, dst: OutputArray, dstsize: Any, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrUp")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dstsize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pyrUp(src: InputArray, dst: OutputArray, dstsize: Unit, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pyrUp")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dstsize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sepFilter2D(src: InputArray, dst: OutputArray, ddepth: int, kernelX: InputArray, kernelY: InputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sepFilter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernelX.asInstanceOf[js.Any], kernelY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sepFilter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernelX: InputArray,
    kernelY: InputArray,
    anchor: Unit,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sepFilter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernelX.asInstanceOf[js.Any], kernelY.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sepFilter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernelX: InputArray,
    kernelY: InputArray,
    anchor: Unit,
    delta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sepFilter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernelX.asInstanceOf[js.Any], kernelY.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sepFilter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernelX: InputArray,
    kernelY: InputArray,
    anchor: Unit,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sepFilter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernelX.asInstanceOf[js.Any], kernelY.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sepFilter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernelX: InputArray,
    kernelY: InputArray,
    anchor: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sepFilter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernelX.asInstanceOf[js.Any], kernelY.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sepFilter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernelX: InputArray,
    kernelY: InputArray,
    anchor: Point,
    delta: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sepFilter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernelX.asInstanceOf[js.Any], kernelY.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sepFilter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernelX: InputArray,
    kernelY: InputArray,
    anchor: Point,
    delta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sepFilter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernelX.asInstanceOf[js.Any], kernelY.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sepFilter2D(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    kernelX: InputArray,
    kernelY: InputArray,
    anchor: Point,
    delta: double,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sepFilter2D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], kernelX.asInstanceOf[js.Any], kernelY.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def spatialGradient(src: InputArray, dx: OutputArray, dy: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("spatialGradient")(src.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def spatialGradient(src: InputArray, dx: OutputArray, dy: OutputArray, ksize: Unit, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("spatialGradient")(src.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def spatialGradient(src: InputArray, dx: OutputArray, dy: OutputArray, ksize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("spatialGradient")(src.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def spatialGradient(src: InputArray, dx: OutputArray, dy: OutputArray, ksize: int, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("spatialGradient")(src.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sqrBoxFilter(src: InputArray, dst: OutputArray, ddepth: int, ksize: Size): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrBoxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sqrBoxFilter(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Size,
    anchor: Unit,
    normalize: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrBoxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sqrBoxFilter(src: InputArray, dst: OutputArray, ddepth: int, ksize: Size, anchor: Unit, normalize: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrBoxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sqrBoxFilter(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Size,
    anchor: Unit,
    normalize: bool,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrBoxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sqrBoxFilter(src: InputArray, dst: OutputArray, ddepth: int, ksize: Size, anchor: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrBoxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sqrBoxFilter(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Size,
    anchor: Point,
    normalize: Unit,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrBoxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sqrBoxFilter(src: InputArray, dst: OutputArray, ddepth: int, ksize: Size, anchor: Point, normalize: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrBoxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sqrBoxFilter(
    src: InputArray,
    dst: OutputArray,
    ddepth: int,
    ksize: Size,
    anchor: Point,
    normalize: bool,
    borderType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrBoxFilter")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type MorphShapes = Any
  
  type MorphTypes = Any
  
  type SpecialFilter = Any
}
