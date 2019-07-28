package typings.ol.geomPolygonMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Polygon", JSImport.Default)
@js.native
class default protected () extends Polygon {
  def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
  def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
  def this(
    coordinates: js.Array[js.Array[Coordinate] | Double],
    opt_layout: GeometryLayout,
    opt_ends: js.Array[Double]
  ) = this()
}

