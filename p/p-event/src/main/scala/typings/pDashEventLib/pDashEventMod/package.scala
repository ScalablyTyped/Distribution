package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashEventMod {
  type AddRemoveListener[FirstArgumentType, RestArgumentsType] = js.Function2[
    /* event */ java.lang.String | js.Symbol, 
    /* listener */ js.Function2[/* firstArgument */ FirstArgumentType, /* repeated */ RestArgumentsType, scala.Unit], 
    scala.Unit
  ]
  type FilterFunction[ElementType] = js.Function1[/* element */ ElementType, scala.Boolean]
}
