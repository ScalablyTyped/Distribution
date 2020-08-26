package typings.nivoAxes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GridValues[T /* <: scala.Double | java.lang.String | typings.std.Date */] = scala.Double | typings.nivoAxes.mod.GridValuesBuilder[T]
  type GridValuesBuilder[T] = js.Array[typings.std.Date | scala.Double | java.lang.String]
  type TickFormatter = js.Function1[
    /* value */ scala.Double | java.lang.String | typings.std.Date, 
    java.lang.String | scala.Double
  ]
}
