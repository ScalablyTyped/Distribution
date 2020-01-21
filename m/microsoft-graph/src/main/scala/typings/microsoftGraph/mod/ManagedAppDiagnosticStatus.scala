package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppDiagnosticStatus extends js.Object {
  // Instruction on how to mitigate a failed validation
  var mitigationInstruction: js.UndefOr[String] = js.undefined
  // The state of the operation
  var state: js.UndefOr[String] = js.undefined
  // The validation friendly name
  var validationName: js.UndefOr[String] = js.undefined
}

object ManagedAppDiagnosticStatus {
  @scala.inline
  def apply(mitigationInstruction: String = null, state: String = null, validationName: String = null): ManagedAppDiagnosticStatus = {
    val __obj = js.Dynamic.literal()
    if (mitigationInstruction != null) __obj.updateDynamic("mitigationInstruction")(mitigationInstruction.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (validationName != null) __obj.updateDynamic("validationName")(validationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedAppDiagnosticStatus]
  }
}

