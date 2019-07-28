package typings.ol.geomMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.geomMultiPolygonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", "MultiPolygon")
@js.native
class MultiPolygon protected () extends default {
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

