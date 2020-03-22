package typings.openfin.crashReporterOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrashReporterOption extends js.Object {
  var diagnosticMode: Boolean
  var isRunning: js.UndefOr[Boolean] = js.undefined
}

object CrashReporterOption {
  @scala.inline
  def apply(diagnosticMode: Boolean, isRunning: js.UndefOr[Boolean] = js.undefined): CrashReporterOption = {
    val __obj = js.Dynamic.literal(diagnosticMode = diagnosticMode.asInstanceOf[js.Any])
    if (!js.isUndefined(isRunning)) __obj.updateDynamic("isRunning")(isRunning.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashReporterOption]
  }
}

