package typings
package olLib.geomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", "MultiLineString")
@js.native
class MultiLineString protected ()
  extends olLib.geomMultiLineStringMod.default {
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

