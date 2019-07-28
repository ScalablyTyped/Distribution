package typings.ol.geomMultiPolygonMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/MultiPolygon", JSImport.Default)
@js.native
class default protected () extends MultiPolygon {
  def this(coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default]) = this()
  def this(
    coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
    opt_layout: GeometryLayout
  ) = this()
  def this(
    coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
    opt_layout: GeometryLayout,
    opt_endss: js.Array[js.Array[Double]]
  ) = this()
}

