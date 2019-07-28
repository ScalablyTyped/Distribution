package typings.pDashQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashQueueMod {
  type Task[TaskResultType] = js.Function0[TaskResultType | js.Thenable[TaskResultType]]
}
