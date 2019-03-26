package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashEventMod {
  type AddRemoveListener[Arguments /* <: js.Array[_] */] = js.Function2[
    /* event */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* args */ Arguments, scala.Unit], 
    scala.Unit
  ]
  type FilterFunction[ElementType /* <: js.Array[_] */] = js.Function1[/* args */ ElementType, scala.Boolean]
}
