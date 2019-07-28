package typings.ol.geomCircleMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle
  extends typings.ol.geomSimpleGeometryMod.default {
  def getCenter(): Coordinate = js.native
  def getRadius(): Double = js.native
  def setCenter(center: Coordinate): Unit = js.native
  def setCenterAndRadius(center: Coordinate, radius: Double): Unit = js.native
  def setCenterAndRadius(center: Coordinate, radius: Double, opt_layout: GeometryLayout): Unit = js.native
  def setRadius(radius: Double): Unit = js.native
  @JSName("transform")
  def transform_default(source: ProjectionLike, destination: ProjectionLike): typings.ol.geomGeometryMod.default = js.native
}

