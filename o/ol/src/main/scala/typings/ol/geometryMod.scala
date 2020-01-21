package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.geometryTypeMod.GeometryType
import typings.ol.projMod.ProjectionLike
import typings.ol.projMod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Geometry", JSImport.Namespace)
@js.native
object geometryMod extends js.Object {
  @js.native
  trait Geometry
    extends typings.ol.objectMod.default {
    var simplifiedGeometryMaxMinSquaredTolerance: Double = js.native
    var simplifiedGeometryRevision: Double = js.native
    def applyTransform(transformFn: TransformFunction): Unit = js.native
    def closestPointXY(x: Double, y: Double, closestPoint: Coordinate, minSquaredDistance: Double): Double = js.native
    /* protected */ def computeExtent(extent: Extent): Extent = js.native
    def containsXY(x: Double, y: Double): Boolean = js.native
    def getClosestPoint(point: Coordinate): Coordinate = js.native
    def getClosestPoint(point: Coordinate, opt_closestPoint: Coordinate): Coordinate = js.native
    def getExtent(): Extent = js.native
    def getExtent(opt_extent: Extent): Extent = js.native
    def getSimplifiedGeometry(squaredTolerance: Double): Geometry = js.native
    def getType(): GeometryType = js.native
    def intersectsCoordinate(coordinate: Coordinate): Boolean = js.native
    def intersectsExtent(extent: Extent): Boolean = js.native
    def rotate(angle: Double, anchor: Coordinate): Unit = js.native
    def scale(sx: Double): Unit = js.native
    def scale(sx: Double, opt_sy: Double): Unit = js.native
    def scale(sx: Double, opt_sy: Double, opt_anchor: Coordinate): Unit = js.native
    def simplify(tolerance: Double): Geometry = js.native
    def simplifyTransformed(squaredTolerance: Double): Geometry = js.native
    def simplifyTransformed(squaredTolerance: Double, opt_transform: TransformFunction): Geometry = js.native
    def transform(source: ProjectionLike, destination: ProjectionLike): Geometry = js.native
    def translate(deltaX: Double, deltaY: Double): Unit = js.native
  }
  
  @js.native
  abstract class default () extends Geometry
  
}

