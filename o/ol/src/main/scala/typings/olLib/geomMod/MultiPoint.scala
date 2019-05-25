package typings
package olLib.geomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", "MultiPoint")
@js.native
class MultiPoint protected ()
  extends olLib.geomMultiPointMod.default {
  def this(coordinates: js.Array[olLib.coordinateMod.Coordinate | scala.Double]) = this()
  def this(coordinates: js.Array[olLib.coordinateMod.Coordinate | scala.Double], opt_layout: olLib.geomGeometryLayoutMod.GeometryLayout) = this()
}

