package typings
package olLib.projMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addCommon(): scala.Unit = js.native
  def addCoordinateTransforms(
    source: ProjectionLike,
    destination: ProjectionLike,
    forward: js.Function1[/* p0 */ olLib.coordinateMod.Coordinate, olLib.coordinateMod.Coordinate],
    inverse: js.Function1[/* p0 */ olLib.coordinateMod.Coordinate, olLib.coordinateMod.Coordinate]
  ): scala.Unit = js.native
  def addEquivalentProjections(projections: js.Array[olLib.projProjectionMod.default]): scala.Unit = js.native
  def addEquivalentTransforms(
    projections1: js.Array[olLib.projProjectionMod.default],
    projections2: js.Array[olLib.projProjectionMod.default],
    forwardTransform: TransformFunction,
    inverseTransform: TransformFunction
  ): scala.Unit = js.native
  def addProjection(projection: olLib.projProjectionMod.default): scala.Unit = js.native
  def addProjections(projections: js.Array[olLib.projProjectionMod.default]): scala.Unit = js.native
  def clearAllProjections(): scala.Unit = js.native
  def cloneTransform(input: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def cloneTransform(input: js.Array[scala.Double], opt_output: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def cloneTransform(input: js.Array[scala.Double], opt_output: js.Array[scala.Double], opt_dimension: scala.Double): js.Array[scala.Double] = js.native
  def createProjection(projection: java.lang.String, defaultCode: java.lang.String): olLib.projProjectionMod.default = js.native
  def createProjection(projection: olLib.projProjectionMod.default, defaultCode: java.lang.String): olLib.projProjectionMod.default = js.native
  def createTransformFromCoordinateTransform(
    coordTransform: js.Function1[/* p0 */ olLib.coordinateMod.Coordinate, olLib.coordinateMod.Coordinate]
  ): TransformFunction = js.native
  def equivalent(projection1: olLib.projProjectionMod.default, projection2: olLib.projProjectionMod.default): scala.Boolean = js.native
  def fromLonLat(coordinate: olLib.coordinateMod.Coordinate): olLib.coordinateMod.Coordinate = js.native
  def fromLonLat(coordinate: olLib.coordinateMod.Coordinate, opt_projection: ProjectionLike): olLib.coordinateMod.Coordinate = js.native
  def get(projectionLike: ProjectionLike): olLib.projProjectionMod.default = js.native
  def getPointResolution(projection: ProjectionLike, resolution: scala.Double, point: olLib.coordinateMod.Coordinate): scala.Double = js.native
  def getPointResolution(
    projection: ProjectionLike,
    resolution: scala.Double,
    point: olLib.coordinateMod.Coordinate,
    opt_units: olLib.projUnitsMod.Units
  ): scala.Double = js.native
  def getTransform(source: ProjectionLike, destination: ProjectionLike): TransformFunction = js.native
  def getTransformFromProjections(
    sourceProjection: olLib.projProjectionMod.default,
    destinationProjection: olLib.projProjectionMod.default
  ): TransformFunction = js.native
  def identityTransform(input: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def identityTransform(input: js.Array[scala.Double], opt_output: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def identityTransform(input: js.Array[scala.Double], opt_output: js.Array[scala.Double], opt_dimension: scala.Double): js.Array[scala.Double] = js.native
  def toLonLat(coordinate: olLib.coordinateMod.Coordinate): olLib.coordinateMod.Coordinate = js.native
  def toLonLat(coordinate: olLib.coordinateMod.Coordinate, opt_projection: ProjectionLike): olLib.coordinateMod.Coordinate = js.native
  def transform(coordinate: olLib.coordinateMod.Coordinate, source: ProjectionLike, destination: ProjectionLike): olLib.coordinateMod.Coordinate = js.native
  def transformExtent(extent: olLib.extentMod.Extent, source: ProjectionLike, destination: ProjectionLike): olLib.extentMod.Extent = js.native
  def transformWithProjections(
    point: olLib.coordinateMod.Coordinate,
    sourceProjection: olLib.projProjectionMod.default,
    destinationProjection: olLib.projProjectionMod.default
  ): olLib.coordinateMod.Coordinate = js.native
}

