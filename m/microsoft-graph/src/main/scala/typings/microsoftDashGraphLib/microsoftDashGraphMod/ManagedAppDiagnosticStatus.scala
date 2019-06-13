package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppDiagnosticStatus extends js.Object {
  /** Instruction on how to mitigate a failed validation */
  var mitigationInstruction: js.UndefOr[java.lang.String] = js.undefined
  /** The state of the operation */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** The validation friendly name */
  var validationName: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedAppDiagnosticStatus {
  @scala.inline
  def apply(
    mitigationInstruction: java.lang.String = null,
    state: java.lang.String = null,
    validationName: java.lang.String = null
  ): ManagedAppDiagnosticStatus = {
    val __obj = js.Dynamic.literal()
    if (mitigationInstruction != null) __obj.updateDynamic("mitigationInstruction")(mitigationInstruction)
    if (state != null) __obj.updateDynamic("state")(state)
    if (validationName != null) __obj.updateDynamic("validationName")(validationName)
    __obj.asInstanceOf[ManagedAppDiagnosticStatus]
  }
}

