package typings.ol

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/segments", JSImport.Namespace)
@js.native
object geomFlatSegmentsMod extends js.Object {
  def forEach[T, S](
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    callback: js.ThisFunction2[/* this */ S, /* p0 */ Coordinate, /* p1 */ Coordinate, T]
  ): T | Boolean = js.native
  def forEach[T, S](
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    callback: js.ThisFunction2[/* this */ S, /* p0 */ Coordinate, /* p1 */ Coordinate, T],
    opt_this: S
  ): T | Boolean = js.native
}

