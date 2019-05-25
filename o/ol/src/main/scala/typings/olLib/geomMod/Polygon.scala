package typings
package olLib.geomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", "Polygon")
@js.native
class Polygon protected ()
  extends olLib.geomPolygonMod.default {
  def this(coordinates: js.Array[js.Array[olLib.coordinateMod.Coordinate] | scala.Double]) = this()
  def this(coordinates: js.Array[js.Array[olLib.coordinateMod.Coordinate] | scala.Double], opt_layout: olLib.geomGeometryLayoutMod.GeometryLayout) = this()
  def this(coordinates: js.Array[js.Array[olLib.coordinateMod.Coordinate] | scala.Double], opt_layout: olLib.geomGeometryLayoutMod.GeometryLayout, opt_ends: js.Array[scala.Double]) = this()
}

