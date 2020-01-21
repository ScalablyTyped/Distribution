package typings.nivoAxes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Axis = js.Any
  type TickFormatter = js.Function1[
    /* value */ scala.Double | java.lang.String | typings.std.Date, 
    java.lang.String | scala.Double
  ]
}
