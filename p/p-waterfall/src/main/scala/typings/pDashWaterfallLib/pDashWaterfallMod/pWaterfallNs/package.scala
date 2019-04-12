package typings
package pDashWaterfallLib.pDashWaterfallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pWaterfallNs {
  type InitialTask[ReturnType] = js.Function0[ReturnType | js.Thenable[ReturnType]]
  type Task[ValueType, ReturnType] = js.Function1[/* previousValue */ ValueType, ReturnType | js.Thenable[ReturnType]]
}
