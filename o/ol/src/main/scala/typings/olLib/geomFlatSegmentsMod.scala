package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/segments", JSImport.Namespace)
@js.native
object geomFlatSegmentsMod extends js.Object {
  def forEach[T, S](
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p1 */ olLib.coordinateMod.Coordinate, 
      /* p2 */ olLib.coordinateMod.Coordinate, 
      T
    ]
  ): T | scala.Boolean = js.native
  def forEach[T, S](
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p1 */ olLib.coordinateMod.Coordinate, 
      /* p2 */ olLib.coordinateMod.Coordinate, 
      T
    ],
    opt_this: S
  ): T | scala.Boolean = js.native
}

