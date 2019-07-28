package typings.ol.geomMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.geomPolygonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", "Polygon")
@js.native
class Polygon protected () extends default {
  def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
  def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
  def this(
    coordinates: js.Array[js.Array[Coordinate] | Double],
    opt_layout: GeometryLayout,
    opt_ends: js.Array[Double]
  ) = this()
}

