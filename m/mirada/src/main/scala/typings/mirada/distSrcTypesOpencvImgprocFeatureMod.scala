package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import typings.mirada.distSrcTypesOpencvTypesMod.TermCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvImgprocFeatureMod {
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_feature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Canny(dx: InputArray, dy: InputArray, edges: OutputArray, threshold1: double, threshold2: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Canny")(dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], threshold1.asInstanceOf[js.Any], threshold2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Canny(
    dx: InputArray,
    dy: InputArray,
    edges: OutputArray,
    threshold1: double,
    threshold2: double,
    L2gradient: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Canny")(dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], threshold1.asInstanceOf[js.Any], threshold2.asInstanceOf[js.Any], L2gradient.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Canny(image: InputArray, edges: OutputArray, threshold1: double, threshold2: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Canny")(image.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], threshold1.asInstanceOf[js.Any], threshold2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Canny(
    image: InputArray,
    edges: OutputArray,
    threshold1: double,
    threshold2: double,
    apertureSize: Unit,
    L2gradient: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Canny")(image.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], threshold1.asInstanceOf[js.Any], threshold2.asInstanceOf[js.Any], apertureSize.asInstanceOf[js.Any], L2gradient.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Canny(image: InputArray, edges: OutputArray, threshold1: double, threshold2: double, apertureSize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Canny")(image.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], threshold1.asInstanceOf[js.Any], threshold2.asInstanceOf[js.Any], apertureSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Canny(
    image: InputArray,
    edges: OutputArray,
    threshold1: double,
    threshold2: double,
    apertureSize: int,
    L2gradient: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Canny")(image.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], threshold1.asInstanceOf[js.Any], threshold2.asInstanceOf[js.Any], apertureSize.asInstanceOf[js.Any], L2gradient.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_feature", "HOUGH_GRADIENT")
  @js.native
  val HOUGH_GRADIENT: HoughModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_feature", "HOUGH_MULTI_SCALE")
  @js.native
  val HOUGH_MULTI_SCALE: HoughModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_feature", "HOUGH_PROBABILISTIC")
  @js.native
  val HOUGH_PROBABILISTIC: HoughModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_feature", "HOUGH_STANDARD")
  @js.native
  val HOUGH_STANDARD: HoughModes = js.native
  
  inline def HoughCircles(image: InputArray, circles: OutputArray, method: int, dp: double, minDist: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: Unit,
    param2: Unit,
    minRadius: Unit,
    maxRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any], maxRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: Unit,
    param2: Unit,
    minRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: Unit,
    param2: Unit,
    minRadius: int,
    maxRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any], maxRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: Unit,
    param2: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: Unit,
    param2: double,
    minRadius: Unit,
    maxRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any], maxRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: Unit,
    param2: double,
    minRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: Unit,
    param2: double,
    minRadius: int,
    maxRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any], maxRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(image: InputArray, circles: OutputArray, method: int, dp: double, minDist: double, param1: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: double,
    param2: Unit,
    minRadius: Unit,
    maxRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any], maxRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: double,
    param2: Unit,
    minRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: double,
    param2: Unit,
    minRadius: int,
    maxRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any], maxRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: double,
    param2: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: double,
    param2: double,
    minRadius: Unit,
    maxRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any], maxRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: double,
    param2: double,
    minRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughCircles(
    image: InputArray,
    circles: OutputArray,
    method: int,
    dp: double,
    minDist: double,
    param1: double,
    param2: double,
    minRadius: int,
    maxRadius: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughCircles")(image.asInstanceOf[js.Any], circles.asInstanceOf[js.Any], method.asInstanceOf[js.Any], dp.asInstanceOf[js.Any], minDist.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], minRadius.asInstanceOf[js.Any], maxRadius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def HoughLines(image: InputArray, lines: OutputArray, rho: double, theta: double, threshold: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: Unit,
    stn: Unit,
    min_theta: Unit,
    max_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any], max_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: Unit,
    stn: Unit,
    min_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: Unit,
    stn: Unit,
    min_theta: double,
    max_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any], max_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: Unit,
    stn: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: Unit,
    stn: double,
    min_theta: Unit,
    max_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any], max_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: Unit,
    stn: double,
    min_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: Unit,
    stn: double,
    min_theta: double,
    max_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any], max_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(image: InputArray, lines: OutputArray, rho: double, theta: double, threshold: int, srn: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: double,
    stn: Unit,
    min_theta: Unit,
    max_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any], max_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: double,
    stn: Unit,
    min_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: double,
    stn: Unit,
    min_theta: double,
    max_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any], max_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: double,
    stn: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: double,
    stn: double,
    min_theta: Unit,
    max_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any], max_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: double,
    stn: double,
    min_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLines(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    srn: double,
    stn: double,
    min_theta: double,
    max_theta: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLines")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], srn.asInstanceOf[js.Any], stn.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any], max_theta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def HoughLinesP(image: InputArray, lines: OutputArray, rho: double, theta: double, threshold: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLinesP")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLinesP(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    minLineLength: Unit,
    maxLineGap: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLinesP")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], minLineLength.asInstanceOf[js.Any], maxLineGap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLinesP(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    minLineLength: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLinesP")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], minLineLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HoughLinesP(
    image: InputArray,
    lines: OutputArray,
    rho: double,
    theta: double,
    threshold: int,
    minLineLength: double,
    maxLineGap: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLinesP")(image.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], minLineLength.asInstanceOf[js.Any], maxLineGap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def HoughLinesPointSet(
    _point: InputArray,
    _lines: OutputArray,
    lines_max: int,
    threshold: int,
    min_rho: double,
    max_rho: double,
    rho_step: double,
    min_theta: double,
    max_theta: double,
    theta_step: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HoughLinesPointSet")(_point.asInstanceOf[js.Any], _lines.asInstanceOf[js.Any], lines_max.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], min_rho.asInstanceOf[js.Any], max_rho.asInstanceOf[js.Any], rho_step.asInstanceOf[js.Any], min_theta.asInstanceOf[js.Any], max_theta.asInstanceOf[js.Any], theta_step.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_feature", "LSD_REFINE_ADV")
  @js.native
  val LSD_REFINE_ADV: LineSegmentDetectorModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_feature", "LSD_REFINE_NONE")
  @js.native
  val LSD_REFINE_NONE: LineSegmentDetectorModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_feature", "LSD_REFINE_STD")
  @js.native
  val LSD_REFINE_STD: LineSegmentDetectorModes = js.native
  
  inline def cornerEigenValsAndVecs(src: InputArray, dst: OutputArray, blockSize: int, ksize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cornerEigenValsAndVecs")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cornerEigenValsAndVecs(src: InputArray, dst: OutputArray, blockSize: int, ksize: int, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cornerEigenValsAndVecs")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cornerHarris(src: InputArray, dst: OutputArray, blockSize: int, ksize: int, k: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cornerHarris")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cornerHarris(src: InputArray, dst: OutputArray, blockSize: int, ksize: int, k: double, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cornerHarris")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], k.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cornerMinEigenVal(src: InputArray, dst: OutputArray, blockSize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cornerMinEigenVal")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cornerMinEigenVal(src: InputArray, dst: OutputArray, blockSize: int, ksize: Unit, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cornerMinEigenVal")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cornerMinEigenVal(src: InputArray, dst: OutputArray, blockSize: int, ksize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cornerMinEigenVal")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cornerMinEigenVal(src: InputArray, dst: OutputArray, blockSize: int, ksize: int, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cornerMinEigenVal")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cornerSubPix(
    image: InputArray,
    corners: InputOutputArray,
    winSize: Size,
    zeroZone: Size,
    criteria: TermCriteria
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cornerSubPix")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], winSize.asInstanceOf[js.Any], zeroZone.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createLineSegmentDetector(
    _refine: js.UndefOr[int],
    _scale: js.UndefOr[double],
    _sigma_scale: js.UndefOr[double],
    _quant: js.UndefOr[double],
    _ang_th: js.UndefOr[double],
    _log_eps: js.UndefOr[double],
    _density_th: js.UndefOr[double],
    _n_bins: js.UndefOr[int]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentDetector")(_refine.asInstanceOf[js.Any], _scale.asInstanceOf[js.Any], _sigma_scale.asInstanceOf[js.Any], _quant.asInstanceOf[js.Any], _ang_th.asInstanceOf[js.Any], _log_eps.asInstanceOf[js.Any], _density_th.asInstanceOf[js.Any], _n_bins.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: Unit,
    blockSize: Unit,
    useHarrisDetector: Unit,
    k: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: Unit,
    blockSize: Unit,
    useHarrisDetector: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: Unit,
    blockSize: Unit,
    useHarrisDetector: bool,
    k: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: Unit,
    blockSize: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: Unit,
    blockSize: int,
    useHarrisDetector: Unit,
    k: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: Unit,
    blockSize: int,
    useHarrisDetector: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: Unit,
    blockSize: int,
    useHarrisDetector: bool,
    k: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: Unit,
    useHarrisDetector: Unit,
    k: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: Unit,
    useHarrisDetector: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: Unit,
    useHarrisDetector: bool,
    k: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: int,
    gradientSize: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], gradientSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: int,
    gradientSize: int,
    useHarrisDetector: Unit,
    k: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], gradientSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: int,
    gradientSize: int,
    useHarrisDetector: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], gradientSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: int,
    gradientSize: int,
    useHarrisDetector: bool,
    k: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], gradientSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: int,
    useHarrisDetector: Unit,
    k: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: int,
    useHarrisDetector: bool
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def goodFeaturesToTrack(
    image: InputArray,
    corners: OutputArray,
    maxCorners: int,
    qualityLevel: double,
    minDistance: double,
    mask: InputArray,
    blockSize: int,
    useHarrisDetector: bool,
    k: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goodFeaturesToTrack")(image.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], maxCorners.asInstanceOf[js.Any], qualityLevel.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any], useHarrisDetector.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def preCornerDetect(src: InputArray, dst: OutputArray, ksize: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("preCornerDetect")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def preCornerDetect(src: InputArray, dst: OutputArray, ksize: int, borderType: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("preCornerDetect")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], ksize.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type HoughModes = Any
  
  type LineSegmentDetectorModes = Any
}
