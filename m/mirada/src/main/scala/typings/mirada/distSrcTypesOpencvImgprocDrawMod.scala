package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Point
import typings.mirada.distSrcTypesOpencvTypesMod.Point2d
import typings.mirada.distSrcTypesOpencvTypesMod.Rect
import typings.mirada.distSrcTypesOpencvTypesMod.Scalar
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import typings.mirada.distSrcTypesOpencvTypesMod.Size2d
import typings.mirada.distSrcTypesOpencvTypesMod.Size2l
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvImgprocDrawMod {
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "FILLED")
  @js.native
  val FILLED: LineTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "FONT_HERSHEY_COMPLEX")
  @js.native
  val FONT_HERSHEY_COMPLEX: HersheyFonts = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "FONT_HERSHEY_COMPLEX_SMALL")
  @js.native
  val FONT_HERSHEY_COMPLEX_SMALL: HersheyFonts = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "FONT_HERSHEY_DUPLEX")
  @js.native
  val FONT_HERSHEY_DUPLEX: HersheyFonts = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "FONT_HERSHEY_PLAIN")
  @js.native
  val FONT_HERSHEY_PLAIN: HersheyFonts = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "FONT_HERSHEY_SCRIPT_COMPLEX")
  @js.native
  val FONT_HERSHEY_SCRIPT_COMPLEX: HersheyFonts = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "FONT_HERSHEY_SCRIPT_SIMPLEX")
  @js.native
  val FONT_HERSHEY_SCRIPT_SIMPLEX: HersheyFonts = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "FONT_HERSHEY_SIMPLEX")
  @js.native
  val FONT_HERSHEY_SIMPLEX: HersheyFonts = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "FONT_HERSHEY_TRIPLEX")
  @js.native
  val FONT_HERSHEY_TRIPLEX: HersheyFonts = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "FONT_ITALIC")
  @js.native
  val FONT_ITALIC: HersheyFonts = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "LINE_4")
  @js.native
  val LINE_4: LineTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "LINE_8")
  @js.native
  val LINE_8: LineTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "LINE_AA")
  @js.native
  val LINE_AA: LineTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "MARKER_CROSS")
  @js.native
  val MARKER_CROSS: MarkerTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "MARKER_DIAMOND")
  @js.native
  val MARKER_DIAMOND: MarkerTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "MARKER_SQUARE")
  @js.native
  val MARKER_SQUARE: MarkerTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "MARKER_STAR")
  @js.native
  val MARKER_STAR: MarkerTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "MARKER_TILTED_CROSS")
  @js.native
  val MARKER_TILTED_CROSS: MarkerTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "MARKER_TRIANGLE_DOWN")
  @js.native
  val MARKER_TRIANGLE_DOWN: MarkerTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_draw", "MARKER_TRIANGLE_UP")
  @js.native
  val MARKER_TRIANGLE_UP: MarkerTypes = js.native
  
  inline def arrowedLine(img: InputOutputArray, pt1: Point, pt2: Point, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: Unit,
    line_type: Unit,
    shift: Unit,
    tipLength: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], tipLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: Unit,
    line_type: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: Unit,
    line_type: Unit,
    shift: int,
    tipLength: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], tipLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(img: InputOutputArray, pt1: Point, pt2: Point, color: Any, thickness: Unit, line_type: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: Unit,
    line_type: int,
    shift: Unit,
    tipLength: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], tipLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: Unit,
    line_type: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: Unit,
    line_type: int,
    shift: int,
    tipLength: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], tipLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(img: InputOutputArray, pt1: Point, pt2: Point, color: Any, thickness: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: int,
    line_type: Unit,
    shift: Unit,
    tipLength: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], tipLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: int,
    line_type: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: int,
    line_type: Unit,
    shift: int,
    tipLength: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], tipLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(img: InputOutputArray, pt1: Point, pt2: Point, color: Any, thickness: int, line_type: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: int,
    line_type: int,
    shift: Unit,
    tipLength: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], tipLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: int,
    line_type: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrowedLine(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: int,
    line_type: int,
    shift: int,
    tipLength: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowedLine")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], tipLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def circle(img: InputOutputArray, center: Point, radius: int, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def circle(
    img: InputOutputArray,
    center: Point,
    radius: int,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def circle(img: InputOutputArray, center: Point, radius: int, color: Any, thickness: Unit, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def circle(
    img: InputOutputArray,
    center: Point,
    radius: int,
    color: Any,
    thickness: Unit,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def circle(img: InputOutputArray, center: Point, radius: int, color: Any, thickness: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def circle(
    img: InputOutputArray,
    center: Point,
    radius: int,
    color: Any,
    thickness: int,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def circle(img: InputOutputArray, center: Point, radius: int, color: Any, thickness: int, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def circle(
    img: InputOutputArray,
    center: Point,
    radius: int,
    color: Any,
    thickness: int,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clipLine(imgRect: Rect, pt1: Any, pt2: Any): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("clipLine")(imgRect.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def clipLine(imgSize: Size2l, pt1: Any, pt2: Any): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("clipLine")(imgSize.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def clipLine(imgSize: Size, pt1: Any, pt2: Any): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("clipLine")(imgSize.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[bool]
  
  inline def drawContours(image: InputOutputArray, contours: InputArrayOfArrays, contourIdx: int, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    hierarchy: Unit,
    maxLevel: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    hierarchy: Unit,
    maxLevel: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    hierarchy: Unit,
    maxLevel: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    hierarchy: InputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    hierarchy: InputArray,
    maxLevel: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    hierarchy: InputArray,
    maxLevel: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    hierarchy: InputArray,
    maxLevel: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: int,
    hierarchy: Unit,
    maxLevel: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: int,
    hierarchy: Unit,
    maxLevel: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: int,
    hierarchy: Unit,
    maxLevel: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: int,
    hierarchy: InputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: int,
    hierarchy: InputArray,
    maxLevel: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: int,
    hierarchy: InputArray,
    maxLevel: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: Unit,
    lineType: int,
    hierarchy: InputArray,
    maxLevel: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(image: InputOutputArray, contours: InputArrayOfArrays, contourIdx: int, color: Any, thickness: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: Unit,
    hierarchy: Unit,
    maxLevel: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: Unit,
    hierarchy: Unit,
    maxLevel: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: Unit,
    hierarchy: Unit,
    maxLevel: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: Unit,
    hierarchy: InputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: Unit,
    hierarchy: InputArray,
    maxLevel: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: Unit,
    hierarchy: InputArray,
    maxLevel: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: Unit,
    hierarchy: InputArray,
    maxLevel: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: int,
    hierarchy: Unit,
    maxLevel: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: int,
    hierarchy: Unit,
    maxLevel: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: int,
    hierarchy: Unit,
    maxLevel: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: int,
    hierarchy: InputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: int,
    hierarchy: InputArray,
    maxLevel: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: int,
    hierarchy: InputArray,
    maxLevel: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawContours(
    image: InputOutputArray,
    contours: InputArrayOfArrays,
    contourIdx: int,
    color: Any,
    thickness: int,
    lineType: int,
    hierarchy: InputArray,
    maxLevel: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], contourIdx.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], maxLevel.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawMarker(img: InputOutputArray, position: Point, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: Unit,
    markerSize: Unit,
    thickness: Unit,
    line_type: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: Unit,
    markerSize: Unit,
    thickness: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: Unit,
    markerSize: Unit,
    thickness: int,
    line_type: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(img: InputOutputArray, position: Point, color: Any, markerType: Unit, markerSize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: Unit,
    markerSize: int,
    thickness: Unit,
    line_type: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: Unit,
    markerSize: int,
    thickness: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: Unit,
    markerSize: int,
    thickness: int,
    line_type: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(img: InputOutputArray, position: Point, color: Any, markerType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: int,
    markerSize: Unit,
    thickness: Unit,
    line_type: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: int,
    markerSize: Unit,
    thickness: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: int,
    markerSize: Unit,
    thickness: int,
    line_type: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(img: InputOutputArray, position: Point, color: Any, markerType: int, markerSize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: int,
    markerSize: int,
    thickness: Unit,
    line_type: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: int,
    markerSize: int,
    thickness: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMarker(
    img: InputOutputArray,
    position: Point,
    color: Any,
    markerType: int,
    markerSize: int,
    thickness: int,
    line_type: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMarker")(img.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], markerSize.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], line_type.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ellipse(img: InputOutputArray, box: Any, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], box.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(img: InputOutputArray, box: Any, color: Any, thickness: Unit, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], box.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(img: InputOutputArray, box: Any, color: Any, thickness: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], box.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(img: InputOutputArray, box: Any, color: Any, thickness: int, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], box.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(
    img: InputOutputArray,
    center: Point,
    axes: Size,
    angle: double,
    startAngle: double,
    endAngle: double,
    color: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(
    img: InputOutputArray,
    center: Point,
    axes: Size,
    angle: double,
    startAngle: double,
    endAngle: double,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(
    img: InputOutputArray,
    center: Point,
    axes: Size,
    angle: double,
    startAngle: double,
    endAngle: double,
    color: Any,
    thickness: Unit,
    lineType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(
    img: InputOutputArray,
    center: Point,
    axes: Size,
    angle: double,
    startAngle: double,
    endAngle: double,
    color: Any,
    thickness: Unit,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(
    img: InputOutputArray,
    center: Point,
    axes: Size,
    angle: double,
    startAngle: double,
    endAngle: double,
    color: Any,
    thickness: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(
    img: InputOutputArray,
    center: Point,
    axes: Size,
    angle: double,
    startAngle: double,
    endAngle: double,
    color: Any,
    thickness: int,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(
    img: InputOutputArray,
    center: Point,
    axes: Size,
    angle: double,
    startAngle: double,
    endAngle: double,
    color: Any,
    thickness: int,
    lineType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse(
    img: InputOutputArray,
    center: Point,
    axes: Size,
    angle: double,
    startAngle: double,
    endAngle: double,
    color: Any,
    thickness: int,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse")(img.asInstanceOf[js.Any], center.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ellipse2Poly(center: Point2d, axes: Size2d, angle: int, arcStart: int, arcEnd: int, delta: int, pts: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse2Poly")(center.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], arcStart.asInstanceOf[js.Any], arcEnd.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], pts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ellipse2Poly(center: Point, axes: Size, angle: int, arcStart: int, arcEnd: int, delta: int, pts: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse2Poly")(center.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], arcStart.asInstanceOf[js.Any], arcEnd.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], pts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fillConvexPoly(img: InputOutputArray, points: InputArray, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillConvexPoly")(img.asInstanceOf[js.Any], points.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillConvexPoly(img: InputOutputArray, points: InputArray, color: Any, lineType: Unit, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillConvexPoly")(img.asInstanceOf[js.Any], points.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillConvexPoly(img: InputOutputArray, points: InputArray, color: Any, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillConvexPoly")(img.asInstanceOf[js.Any], points.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillConvexPoly(img: InputOutputArray, points: InputArray, color: Any, lineType: int, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillConvexPoly")(img.asInstanceOf[js.Any], points.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillConvexPoly(img: InputOutputArray, pts: Any, npts: int, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillConvexPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillConvexPoly(img: InputOutputArray, pts: Any, npts: int, color: Any, lineType: Unit, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillConvexPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillConvexPoly(img: InputOutputArray, pts: Any, npts: int, color: Any, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillConvexPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillConvexPoly(img: InputOutputArray, pts: Any, npts: int, color: Any, lineType: int, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillConvexPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fillPoly(img: InputOutputArray, pts: Any, npts: Any, ncontours: int, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    color: Any,
    lineType: Unit,
    shift: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(img: InputOutputArray, pts: Any, npts: Any, ncontours: int, color: Any, lineType: Unit, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    color: Any,
    lineType: Unit,
    shift: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(img: InputOutputArray, pts: Any, npts: Any, ncontours: int, color: Any, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    color: Any,
    lineType: int,
    shift: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(img: InputOutputArray, pts: Any, npts: Any, ncontours: int, color: Any, lineType: int, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    color: Any,
    lineType: int,
    shift: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(img: InputOutputArray, pts: InputArrayOfArrays, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(
    img: InputOutputArray,
    pts: InputArrayOfArrays,
    color: Any,
    lineType: Unit,
    shift: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(img: InputOutputArray, pts: InputArrayOfArrays, color: Any, lineType: Unit, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(
    img: InputOutputArray,
    pts: InputArrayOfArrays,
    color: Any,
    lineType: Unit,
    shift: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(img: InputOutputArray, pts: InputArrayOfArrays, color: Any, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(
    img: InputOutputArray,
    pts: InputArrayOfArrays,
    color: Any,
    lineType: int,
    shift: Unit,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(img: InputOutputArray, pts: InputArrayOfArrays, color: Any, lineType: int, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fillPoly(
    img: InputOutputArray,
    pts: InputArrayOfArrays,
    color: Any,
    lineType: int,
    shift: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPoly")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFontScaleFromHeight(fontFace: Any, pixelHeight: Any): double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontScaleFromHeight")(fontFace.asInstanceOf[js.Any], pixelHeight.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def getFontScaleFromHeight(fontFace: Any, pixelHeight: Any, thickness: Any): double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontScaleFromHeight")(fontFace.asInstanceOf[js.Any], pixelHeight.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def getTextSize(text: Any, fontFace: int, fontScale: double, thickness: int, baseLine: Any): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextSize")(text.asInstanceOf[js.Any], fontFace.asInstanceOf[js.Any], fontScale.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], baseLine.asInstanceOf[js.Any])).asInstanceOf[Size]
  
  inline def line(img: InputOutputArray, pt1: Point, pt2: Point, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def line(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def line(img: InputOutputArray, pt1: Point, pt2: Point, color: Any, thickness: Unit, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def line(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: Unit,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def line(img: InputOutputArray, pt1: Point, pt2: Point, color: Any, thickness: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def line(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: int,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def line(img: InputOutputArray, pt1: Point, pt2: Point, color: Any, thickness: int, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def line(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: int,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def polylines(img: InputOutputArray, pts: Any, npts: Any, ncontours: int, isClosed: bool, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    isClosed: bool,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    isClosed: bool,
    color: Any,
    thickness: Unit,
    lineType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    isClosed: bool,
    color: Any,
    thickness: Unit,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    isClosed: bool,
    color: Any,
    thickness: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    isClosed: bool,
    color: Any,
    thickness: int,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    isClosed: bool,
    color: Any,
    thickness: int,
    lineType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: Any,
    npts: Any,
    ncontours: int,
    isClosed: bool,
    color: Any,
    thickness: int,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], npts.asInstanceOf[js.Any], ncontours.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(img: InputOutputArray, pts: InputArrayOfArrays, isClosed: bool, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: InputArrayOfArrays,
    isClosed: bool,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: InputArrayOfArrays,
    isClosed: bool,
    color: Any,
    thickness: Unit,
    lineType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: InputArrayOfArrays,
    isClosed: bool,
    color: Any,
    thickness: Unit,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(img: InputOutputArray, pts: InputArrayOfArrays, isClosed: bool, color: Any, thickness: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: InputArrayOfArrays,
    isClosed: bool,
    color: Any,
    thickness: int,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: InputArrayOfArrays,
    isClosed: bool,
    color: Any,
    thickness: int,
    lineType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def polylines(
    img: InputOutputArray,
    pts: InputArrayOfArrays,
    isClosed: bool,
    color: Any,
    thickness: int,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polylines")(img.asInstanceOf[js.Any], pts.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def putText(img: InputOutputArray, text: Any, org_ : Point, fontFace: int, fontScale: double, color: Scalar): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putText")(img.asInstanceOf[js.Any], text.asInstanceOf[js.Any], org_.asInstanceOf[js.Any], fontFace.asInstanceOf[js.Any], fontScale.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def putText(
    img: InputOutputArray,
    text: Any,
    org_ : Point,
    fontFace: int,
    fontScale: double,
    color: Scalar,
    thickness: Unit,
    lineType: Unit,
    bottomLeftOrigin: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putText")(img.asInstanceOf[js.Any], text.asInstanceOf[js.Any], org_.asInstanceOf[js.Any], fontFace.asInstanceOf[js.Any], fontScale.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], bottomLeftOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def putText(
    img: InputOutputArray,
    text: Any,
    org_ : Point,
    fontFace: int,
    fontScale: double,
    color: Scalar,
    thickness: Unit,
    lineType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putText")(img.asInstanceOf[js.Any], text.asInstanceOf[js.Any], org_.asInstanceOf[js.Any], fontFace.asInstanceOf[js.Any], fontScale.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def putText(
    img: InputOutputArray,
    text: Any,
    org_ : Point,
    fontFace: int,
    fontScale: double,
    color: Scalar,
    thickness: Unit,
    lineType: int,
    bottomLeftOrigin: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putText")(img.asInstanceOf[js.Any], text.asInstanceOf[js.Any], org_.asInstanceOf[js.Any], fontFace.asInstanceOf[js.Any], fontScale.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], bottomLeftOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def putText(
    img: InputOutputArray,
    text: Any,
    org_ : Point,
    fontFace: int,
    fontScale: double,
    color: Scalar,
    thickness: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putText")(img.asInstanceOf[js.Any], text.asInstanceOf[js.Any], org_.asInstanceOf[js.Any], fontFace.asInstanceOf[js.Any], fontScale.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def putText(
    img: InputOutputArray,
    text: Any,
    org_ : Point,
    fontFace: int,
    fontScale: double,
    color: Scalar,
    thickness: int,
    lineType: Unit,
    bottomLeftOrigin: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putText")(img.asInstanceOf[js.Any], text.asInstanceOf[js.Any], org_.asInstanceOf[js.Any], fontFace.asInstanceOf[js.Any], fontScale.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], bottomLeftOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def putText(
    img: InputOutputArray,
    text: Any,
    org_ : Point,
    fontFace: int,
    fontScale: double,
    color: Scalar,
    thickness: int,
    lineType: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putText")(img.asInstanceOf[js.Any], text.asInstanceOf[js.Any], org_.asInstanceOf[js.Any], fontFace.asInstanceOf[js.Any], fontScale.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def putText(
    img: InputOutputArray,
    text: Any,
    org_ : Point,
    fontFace: int,
    fontScale: double,
    color: Scalar,
    thickness: int,
    lineType: int,
    bottomLeftOrigin: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putText")(img.asInstanceOf[js.Any], text.asInstanceOf[js.Any], org_.asInstanceOf[js.Any], fontFace.asInstanceOf[js.Any], fontScale.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], bottomLeftOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rectangle(img: InputOutputArray, pt1: Point, pt2: Point, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: Unit,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, pt1: Point, pt2: Point, color: Any, thickness: Unit, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: Unit,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, pt1: Point, pt2: Point, color: Any, thickness: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: int,
    lineType: Unit,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, pt1: Point, pt2: Point, color: Any, thickness: int, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(
    img: InputOutputArray,
    pt1: Point,
    pt2: Point,
    color: Any,
    thickness: int,
    lineType: int,
    shift: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, rec: Rect, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], rec.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, rec: Rect, color: Any, thickness: Unit, lineType: Unit, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], rec.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, rec: Rect, color: Any, thickness: Unit, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], rec.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, rec: Rect, color: Any, thickness: Unit, lineType: int, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], rec.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, rec: Rect, color: Any, thickness: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], rec.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, rec: Rect, color: Any, thickness: int, lineType: Unit, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], rec.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, rec: Rect, color: Any, thickness: int, lineType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], rec.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rectangle(img: InputOutputArray, rec: Rect, color: Any, thickness: int, lineType: int, shift: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(img.asInstanceOf[js.Any], rec.asInstanceOf[js.Any], color.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], lineType.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type HersheyFonts = Any
  
  type LineTypes = Any
  
  type MarkerTypes = Any
}
