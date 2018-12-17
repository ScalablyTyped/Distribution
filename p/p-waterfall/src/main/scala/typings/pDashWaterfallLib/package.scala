package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashWaterfallLib {
  type InitialTask[R] = js.Function0[R | js.Thenable[R]]
  type Task[T, R] = js.Function1[/* previousValue */ T, R | js.Thenable[R]]
}
