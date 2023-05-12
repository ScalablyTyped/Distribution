package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.Moments
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.float
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.Point
import typings.mirada.distSrcTypesOpencvTypesMod.Point2f
import typings.mirada.distSrcTypesOpencvTypesMod.Rect
import typings.mirada.distSrcTypesOpencvTypesMod.RotatedRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvImgprocShapeMod {
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CCL_DEFAULT")
  @js.native
  val CCL_DEFAULT: ConnectedComponentsAlgorithmsTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CCL_GRANA")
  @js.native
  val CCL_GRANA: ConnectedComponentsAlgorithmsTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CCL_WU")
  @js.native
  val CCL_WU: ConnectedComponentsAlgorithmsTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CC_STAT_AREA")
  @js.native
  val CC_STAT_AREA: ConnectedComponentsTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CC_STAT_HEIGHT")
  @js.native
  val CC_STAT_HEIGHT: ConnectedComponentsTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CC_STAT_LEFT")
  @js.native
  val CC_STAT_LEFT: ConnectedComponentsTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CC_STAT_MAX")
  @js.native
  val CC_STAT_MAX: ConnectedComponentsTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CC_STAT_TOP")
  @js.native
  val CC_STAT_TOP: ConnectedComponentsTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CC_STAT_WIDTH")
  @js.native
  val CC_STAT_WIDTH: ConnectedComponentsTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CHAIN_APPROX_NONE")
  @js.native
  val CHAIN_APPROX_NONE: ContourApproximationModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CHAIN_APPROX_SIMPLE")
  @js.native
  val CHAIN_APPROX_SIMPLE: ContourApproximationModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CHAIN_APPROX_TC89_KCOS")
  @js.native
  val CHAIN_APPROX_TC89_KCOS: ContourApproximationModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CHAIN_APPROX_TC89_L1")
  @js.native
  val CHAIN_APPROX_TC89_L1: ContourApproximationModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CONTOURS_MATCH_I1")
  @js.native
  val CONTOURS_MATCH_I1: ShapeMatchModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CONTOURS_MATCH_I2")
  @js.native
  val CONTOURS_MATCH_I2: ShapeMatchModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "CONTOURS_MATCH_I3")
  @js.native
  val CONTOURS_MATCH_I3: ShapeMatchModes = js.native
  
  inline def HuMoments(moments: Any, hu: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HuMoments")(moments.asInstanceOf[js.Any], hu.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def HuMoments(m: Any, hu: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("HuMoments")(m.asInstanceOf[js.Any], hu.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "INTERSECT_FULL")
  @js.native
  val INTERSECT_FULL: RectanglesIntersectTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "INTERSECT_NONE")
  @js.native
  val INTERSECT_NONE: RectanglesIntersectTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "INTERSECT_PARTIAL")
  @js.native
  val INTERSECT_PARTIAL: RectanglesIntersectTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "RETR_CCOMP")
  @js.native
  val RETR_CCOMP: RetrievalModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "RETR_EXTERNAL")
  @js.native
  val RETR_EXTERNAL: RetrievalModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "RETR_FLOODFILL")
  @js.native
  val RETR_FLOODFILL: RetrievalModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "RETR_LIST")
  @js.native
  val RETR_LIST: RetrievalModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_shape", "RETR_TREE")
  @js.native
  val RETR_TREE: RetrievalModes = js.native
  
  inline def approxPolyDP(curve: InputArray, approxCurve: OutputArray, epsilon: double, closed: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("approxPolyDP")(curve.asInstanceOf[js.Any], approxCurve.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def arcLength(curve: InputArray, closed: bool): double = (^.asInstanceOf[js.Dynamic].applyDynamic("arcLength")(curve.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def boundingRect(array: InputArray): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("boundingRect")(array.asInstanceOf[js.Any]).asInstanceOf[Rect]
  
  inline def boxPoints(box: RotatedRect, points: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxPoints")(box.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def connectedComponents(image: InputArray, labels: OutputArray): int = (^.asInstanceOf[js.Dynamic].applyDynamic("connectedComponents")(image.asInstanceOf[js.Any], labels.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def connectedComponents(image: InputArray, labels: OutputArray, connectivity: Unit, ltype: int): int = (^.asInstanceOf[js.Dynamic].applyDynamic("connectedComponents")(image.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], connectivity.asInstanceOf[js.Any], ltype.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def connectedComponents(image: InputArray, labels: OutputArray, connectivity: int): int = (^.asInstanceOf[js.Dynamic].applyDynamic("connectedComponents")(image.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], connectivity.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def connectedComponents(image: InputArray, labels: OutputArray, connectivity: int, ltype: int): int = (^.asInstanceOf[js.Dynamic].applyDynamic("connectedComponents")(image.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], connectivity.asInstanceOf[js.Any], ltype.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def connectedComponents(image: InputArray, labels: OutputArray, connectivity: int, ltype: int, ccltype: int): int = (^.asInstanceOf[js.Dynamic].applyDynamic("connectedComponents")(image.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], connectivity.asInstanceOf[js.Any], ltype.asInstanceOf[js.Any], ccltype.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def connectedComponentsWithStats(image: InputArray, labels: OutputArray, stats: OutputArray, centroids: OutputArray): int = (^.asInstanceOf[js.Dynamic].applyDynamic("connectedComponentsWithStats")(image.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def connectedComponentsWithStats(
    image: InputArray,
    labels: OutputArray,
    stats: OutputArray,
    centroids: OutputArray,
    connectivity: Unit,
    ltype: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("connectedComponentsWithStats")(image.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], connectivity.asInstanceOf[js.Any], ltype.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def connectedComponentsWithStats(
    image: InputArray,
    labels: OutputArray,
    stats: OutputArray,
    centroids: OutputArray,
    connectivity: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("connectedComponentsWithStats")(image.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], connectivity.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def connectedComponentsWithStats(
    image: InputArray,
    labels: OutputArray,
    stats: OutputArray,
    centroids: OutputArray,
    connectivity: int,
    ltype: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("connectedComponentsWithStats")(image.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], connectivity.asInstanceOf[js.Any], ltype.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def connectedComponentsWithStats(
    image: InputArray,
    labels: OutputArray,
    stats: OutputArray,
    centroids: OutputArray,
    connectivity: int,
    ltype: int,
    ccltype: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("connectedComponentsWithStats")(image.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], connectivity.asInstanceOf[js.Any], ltype.asInstanceOf[js.Any], ccltype.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def contourArea(contour: InputArray): double = ^.asInstanceOf[js.Dynamic].applyDynamic("contourArea")(contour.asInstanceOf[js.Any]).asInstanceOf[double]
  inline def contourArea(contour: InputArray, oriented: bool): double = (^.asInstanceOf[js.Dynamic].applyDynamic("contourArea")(contour.asInstanceOf[js.Any], oriented.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def convexHull(points: InputArray, hull: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(points.asInstanceOf[js.Any], hull.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convexHull(points: InputArray, hull: OutputArray, clockwise: Unit, returnPoints: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(points.asInstanceOf[js.Any], hull.asInstanceOf[js.Any], clockwise.asInstanceOf[js.Any], returnPoints.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convexHull(points: InputArray, hull: OutputArray, clockwise: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(points.asInstanceOf[js.Any], hull.asInstanceOf[js.Any], clockwise.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convexHull(points: InputArray, hull: OutputArray, clockwise: bool, returnPoints: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(points.asInstanceOf[js.Any], hull.asInstanceOf[js.Any], clockwise.asInstanceOf[js.Any], returnPoints.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convexityDefects(contour: InputArray, convexhull: InputArray, convexityDefects: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convexityDefects")(contour.asInstanceOf[js.Any], convexhull.asInstanceOf[js.Any], convexityDefects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createGeneralizedHoughBallard(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeneralizedHoughBallard")().asInstanceOf[Any]
  
  inline def createGeneralizedHoughGuil(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeneralizedHoughGuil")().asInstanceOf[Any]
  
  inline def findContours(image: InputArray, contours: OutputArrayOfArrays, hierarchy: OutputArray, mode: int, method: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findContours(
    image: InputArray,
    contours: OutputArrayOfArrays,
    hierarchy: OutputArray,
    mode: int,
    method: int,
    offset: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], hierarchy.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], method.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findContours(image: InputArray, contours: OutputArrayOfArrays, mode: int, method: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findContours(image: InputArray, contours: OutputArrayOfArrays, mode: int, method: int, offset: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findContours")(image.asInstanceOf[js.Any], contours.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], method.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fitEllipse(points: InputArray): RotatedRect = ^.asInstanceOf[js.Dynamic].applyDynamic("fitEllipse")(points.asInstanceOf[js.Any]).asInstanceOf[RotatedRect]
  
  inline def fitEllipseAMS(points: InputArray): RotatedRect = ^.asInstanceOf[js.Dynamic].applyDynamic("fitEllipseAMS")(points.asInstanceOf[js.Any]).asInstanceOf[RotatedRect]
  
  inline def fitEllipseDirect(points: InputArray): RotatedRect = ^.asInstanceOf[js.Dynamic].applyDynamic("fitEllipseDirect")(points.asInstanceOf[js.Any]).asInstanceOf[RotatedRect]
  
  inline def fitLine(points: InputArray, line: OutputArray, distType: int, param: double, reps: double, aeps: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fitLine")(points.asInstanceOf[js.Any], line.asInstanceOf[js.Any], distType.asInstanceOf[js.Any], param.asInstanceOf[js.Any], reps.asInstanceOf[js.Any], aeps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def intersectConvexConvex(_p1: InputArray, _p2: InputArray, _p12: OutputArray): float = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectConvexConvex")(_p1.asInstanceOf[js.Any], _p2.asInstanceOf[js.Any], _p12.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def intersectConvexConvex(_p1: InputArray, _p2: InputArray, _p12: OutputArray, handleNested: bool): float = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectConvexConvex")(_p1.asInstanceOf[js.Any], _p2.asInstanceOf[js.Any], _p12.asInstanceOf[js.Any], handleNested.asInstanceOf[js.Any])).asInstanceOf[float]
  
  inline def isContourConvex(contour: InputArray): bool = ^.asInstanceOf[js.Dynamic].applyDynamic("isContourConvex")(contour.asInstanceOf[js.Any]).asInstanceOf[bool]
  
  inline def matchShapes(contour1: InputArray, contour2: InputArray, method: int, parameter: double): double = (^.asInstanceOf[js.Dynamic].applyDynamic("matchShapes")(contour1.asInstanceOf[js.Any], contour2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], parameter.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def minAreaRect(points: InputArray): RotatedRect = ^.asInstanceOf[js.Dynamic].applyDynamic("minAreaRect")(points.asInstanceOf[js.Any]).asInstanceOf[RotatedRect]
  
  inline def minEnclosingCircle(points: InputArray, center: Any, radius: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("minEnclosingCircle")(points.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def minEnclosingTriangle(points: InputArray, triangle: OutputArray): double = (^.asInstanceOf[js.Dynamic].applyDynamic("minEnclosingTriangle")(points.asInstanceOf[js.Any], triangle.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def moments(array: InputArray): Moments = ^.asInstanceOf[js.Dynamic].applyDynamic("moments")(array.asInstanceOf[js.Any]).asInstanceOf[Moments]
  inline def moments(array: InputArray, binaryImage: bool): Moments = (^.asInstanceOf[js.Dynamic].applyDynamic("moments")(array.asInstanceOf[js.Any], binaryImage.asInstanceOf[js.Any])).asInstanceOf[Moments]
  
  inline def pointPolygonTest(contour: InputArray, pt: Point2f, measureDist: bool): double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPolygonTest")(contour.asInstanceOf[js.Any], pt.asInstanceOf[js.Any], measureDist.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def rotatedRectangleIntersection(rect1: Any, rect2: Any, intersectingRegion: OutputArray): int = (^.asInstanceOf[js.Dynamic].applyDynamic("rotatedRectangleIntersection")(rect1.asInstanceOf[js.Any], rect2.asInstanceOf[js.Any], intersectingRegion.asInstanceOf[js.Any])).asInstanceOf[int]
  
  type ConnectedComponentsAlgorithmsTypes = Any
  
  type ConnectedComponentsTypes = Any
  
  type ContourApproximationModes = Any
  
  type RectanglesIntersectTypes = Any
  
  type RetrievalModes = Any
  
  type ShapeMatchModes = Any
}
