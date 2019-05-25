package typings
package olLib.geomGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry
  extends olLib.objectMod.default {
  var simplifiedGeometryCache: org.scalablytyped.runtime.StringDictionary[Geometry] = js.native
  var simplifiedGeometryMaxMinSquaredTolerance: scala.Double = js.native
  var simplifiedGeometryRevision: scala.Double = js.native
  def applyTransform(transformFn: olLib.projMod.TransformFunction): scala.Unit = js.native
  def closestPointXY(
    x: scala.Double,
    y: scala.Double,
    closestPoint: olLib.coordinateMod.Coordinate,
    minSquaredDistance: scala.Double
  ): scala.Double = js.native
  /* protected */ def computeExtent(extent: olLib.extentMod.Extent): olLib.extentMod.Extent = js.native
  def containsXY(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def getClosestPoint(point: olLib.coordinateMod.Coordinate): olLib.coordinateMod.Coordinate = js.native
  def getClosestPoint(point: olLib.coordinateMod.Coordinate, opt_closestPoint: olLib.coordinateMod.Coordinate): olLib.coordinateMod.Coordinate = js.native
  def getExtent(): olLib.extentMod.Extent = js.native
  def getExtent(opt_extent: olLib.extentMod.Extent): olLib.extentMod.Extent = js.native
  def getSimplifiedGeometry(squaredTolerance: scala.Double): Geometry = js.native
  def getType(): olLib.geomGeometryTypeMod.GeometryType = js.native
  def intersectsCoordinate(coordinate: olLib.coordinateMod.Coordinate): scala.Boolean = js.native
  def intersectsExtent(extent: olLib.extentMod.Extent): scala.Boolean = js.native
  def rotate(angle: scala.Double, anchor: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def scale(sx: scala.Double): scala.Unit = js.native
  def scale(sx: scala.Double, opt_sy: scala.Double): scala.Unit = js.native
  def scale(sx: scala.Double, opt_sy: scala.Double, opt_anchor: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def simplify(tolerance: scala.Double): Geometry = js.native
  def transform(source: olLib.projMod.ProjectionLike, destination: olLib.projMod.ProjectionLike): Geometry = js.native
  def translate(deltaX: scala.Double, deltaY: scala.Double): scala.Unit = js.native
}

