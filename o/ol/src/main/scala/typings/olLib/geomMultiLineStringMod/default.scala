package typings
package olLib.geomMultiLineStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/MultiLineString", JSImport.Default)
@js.native
class default protected () extends MultiLineString {
  def this(coordinates: js.Array[
      js.Array[olLib.coordinateMod.Coordinate] | scala.Double | olLib.geomLineStringMod.default
    ]) = this()
  def this(coordinates: js.Array[
      js.Array[olLib.coordinateMod.Coordinate] | scala.Double | olLib.geomLineStringMod.default
    ], opt_layout: olLib.geomGeometryLayoutMod.GeometryLayout) = this()
  def this(coordinates: js.Array[
      js.Array[olLib.coordinateMod.Coordinate] | scala.Double | olLib.geomLineStringMod.default
    ], opt_layout: olLib.geomGeometryLayoutMod.GeometryLayout, opt_ends: js.Array[scala.Double]) = this()
}

