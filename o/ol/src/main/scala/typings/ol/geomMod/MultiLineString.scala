package typings.ol.geomMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.geomMultiLineStringMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", "MultiLineString")
@js.native
class MultiLineString protected () extends default {
  def this(coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default]) = this()
  def this(
    coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
    opt_layout: GeometryLayout
  ) = this()
  def this(
    coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
    opt_layout: GeometryLayout,
    opt_ends: js.Array[Double]
  ) = this()
}

