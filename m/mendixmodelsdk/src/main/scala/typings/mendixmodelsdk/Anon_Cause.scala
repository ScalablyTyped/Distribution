package typings.mendixmodelsdk

import typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod.CannotFixAppState
import typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod.IEnvironmentStatus
import typings.mendixmodelsdk.mendixmodelsdkStrings.fail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cause extends IEnvironmentStatus {
  var cause: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var state: CannotFixAppState
  var `type`: fail
}

object Anon_Cause {
  @scala.inline
  def apply(state: CannotFixAppState, `type`: fail, cause: String = null, message: String = null): Anon_Cause = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cause]
  }
}

