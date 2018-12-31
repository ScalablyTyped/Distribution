package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashEventLib {
  type AddRmListenerFn[T, TRest] = js.Function2[
    /* event */ java.lang.String | js.Symbol, 
    /* listener */ js.Function2[/* arg1 */ T, /* repeated */ TRest, scala.Unit], 
    scala.Unit
  ]
  type FilterFn[T] = js.Function1[/* el */ T, scala.Boolean]
}
