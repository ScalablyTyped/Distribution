package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pEventNs {
  type AddRemoveListener[EventName /* <: java.lang.String | js.Symbol */, Arguments /* <: js.Array[_] */] = js.Function2[
    /* event */ EventName, 
    /* listener */ js.Function1[/* args */ Arguments, scala.Unit], 
    scala.Unit
  ]
  type FilterFunction[ElementType /* <: js.Array[_] */] = js.Function1[/* args */ ElementType, scala.Boolean]
}
