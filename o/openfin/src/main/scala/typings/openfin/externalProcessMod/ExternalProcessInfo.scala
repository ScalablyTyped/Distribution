package typings.openfin.externalProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalProcessInfo extends js.Object {
  var listener: js.UndefOr[LaunchExternalProcessListener] = js.undefined
  var pid: Double
}

object ExternalProcessInfo {
  @scala.inline
  def apply(pid: Double, listener: /* code */ ExitCode => Unit = null): ExternalProcessInfo = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any])
    if (listener != null) __obj.updateDynamic("listener")(js.Any.fromFunction1(listener))
    __obj.asInstanceOf[ExternalProcessInfo]
  }
}

