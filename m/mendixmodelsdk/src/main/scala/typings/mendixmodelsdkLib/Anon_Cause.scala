package typings
package mendixmodelsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cause
  extends mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus {
  var cause: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var state: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.CannotFixAppState
  var `type`: mendixmodelsdkLib.mendixmodelsdkLibStrings.fail
}

object Anon_Cause {
  @scala.inline
  def apply(
    state: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.CannotFixAppState,
    `type`: mendixmodelsdkLib.mendixmodelsdkLibStrings.fail,
    cause: java.lang.String = null,
    message: java.lang.String = null
  ): Anon_Cause = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("state")(state)
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Cause]
  }
}

