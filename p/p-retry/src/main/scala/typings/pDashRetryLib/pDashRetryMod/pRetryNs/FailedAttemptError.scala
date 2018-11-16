package typings
package pDashRetryLib.pDashRetryMod.pRetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FailedAttemptError
  extends stdLib.Error {
  var attemptNumber: scala.Double
  var attemptsLeft: scala.Double
}

