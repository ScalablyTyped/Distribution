package typings
package olLib.geomMultiPolygonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/MultiPolygon", JSImport.Default)
@js.native
class default protected () extends MultiPolygon {
  def this(coordinates: js.Array[
      js.Array[js.Array[olLib.coordinateMod.Coordinate]] | scala.Double | olLib.geomPolygonMod.default
    ]) = this()
  def this(coordinates: js.Array[
      js.Array[js.Array[olLib.coordinateMod.Coordinate]] | scala.Double | olLib.geomPolygonMod.default
    ], opt_layout: olLib.geomGeometryLayoutMod.GeometryLayout) = this()
  def this(coordinates: js.Array[
      js.Array[js.Array[olLib.coordinateMod.Coordinate]] | scala.Double | olLib.geomPolygonMod.default
    ], opt_layout: olLib.geomGeometryLayoutMod.GeometryLayout, opt_endss: js.Array[js.Array[scala.Double]]) = this()
}

