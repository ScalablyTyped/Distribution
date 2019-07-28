package typings.pDashProgress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashProgressMod {
  type ProgressNotifier = js.Function1[/* progress */ Double, Unit]
  type PromiseFactory[ValueType] = js.Function0[js.Thenable[ValueType]]
}
