package typings.ol.geomMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.geomPointMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", "Point")
@js.native
class Point protected () extends default {
  def this(coordinates: Coordinate) = this()
  def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
}

