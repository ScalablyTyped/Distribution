package typings.ol.geomCircleMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Circle", JSImport.Default)
@js.native
class default protected () extends Circle {
  def this(center: Coordinate) = this()
  def this(center: Coordinate, opt_radius: Double) = this()
  def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
}

