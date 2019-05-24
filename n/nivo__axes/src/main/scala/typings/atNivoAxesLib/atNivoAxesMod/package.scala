package typings
package atNivoAxesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoAxesMod {
  type Axis = js.Any
  type TickFormatter = js.Function1[
    /* value */ scala.Double | java.lang.String | stdLib.Date, 
    java.lang.String | scala.Double
  ]
}
