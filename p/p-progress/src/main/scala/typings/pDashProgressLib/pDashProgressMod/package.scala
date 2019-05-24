package typings
package pDashProgressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashProgressMod {
  type ProgressNotifier = js.Function1[/* progress */ scala.Double, scala.Unit]
  type PromiseFactory[ValueType] = js.Function0[js.Thenable[ValueType]]
}
