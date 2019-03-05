package typings
package pDashQueueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashQueueMod {
  type Task[TaskResultType] = js.Function0[js.Thenable[TaskResultType]] | js.Function0[TaskResultType]
}
