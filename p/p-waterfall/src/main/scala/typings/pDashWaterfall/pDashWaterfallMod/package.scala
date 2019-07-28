package typings.pDashWaterfall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashWaterfallMod {
  type InitialTask[ReturnType] = js.Function0[ReturnType | js.Thenable[ReturnType]]
  type Task[ValueType, ReturnType] = js.Function1[/* previousValue */ ValueType, ReturnType | js.Thenable[ReturnType]]
}
