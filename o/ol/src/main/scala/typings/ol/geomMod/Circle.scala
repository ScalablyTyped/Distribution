package typings.ol.geomMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomCircleMod.default
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", "Circle")
@js.native
class Circle protected () extends default {
  def this(center: Coordinate) = this()
  def this(center: Coordinate, opt_radius: Double) = this()
  def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
}

