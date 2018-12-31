package typings
package pDashRetryLib.pDashRetryMod.pRetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends retryLib.retryMod.OperationOptions {
  var onFailedAttempt: js.UndefOr[js.Function1[/* error */ FailedAttemptError, scala.Unit]] = js.undefined
}

