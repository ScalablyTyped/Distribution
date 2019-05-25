package typings
package olLib.geomCircleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle
  extends olLib.geomSimpleGeometryMod.default {
  def getCenter(): olLib.coordinateMod.Coordinate = js.native
  def getRadius(): scala.Double = js.native
  def setCenter(center: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def setCenterAndRadius(center: olLib.coordinateMod.Coordinate, radius: scala.Double): scala.Unit = js.native
  def setCenterAndRadius(
    center: olLib.coordinateMod.Coordinate,
    radius: scala.Double,
    opt_layout: olLib.geomGeometryLayoutMod.GeometryLayout
  ): scala.Unit = js.native
  def setRadius(radius: scala.Double): scala.Unit = js.native
  @JSName("transform")
  def transform_Circle(source: olLib.projMod.ProjectionLike, destination: olLib.projMod.ProjectionLike): Circle = js.native
}

