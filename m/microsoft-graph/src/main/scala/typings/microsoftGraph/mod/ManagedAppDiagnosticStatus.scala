package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAppDiagnosticStatus extends js.Object {
  // Instruction on how to mitigate a failed validation
  var mitigationInstruction: js.UndefOr[String] = js.native
  // The state of the operation
  var state: js.UndefOr[String] = js.native
  // The validation friendly name
  var validationName: js.UndefOr[String] = js.native
}

object ManagedAppDiagnosticStatus {
  @scala.inline
  def apply(): ManagedAppDiagnosticStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppDiagnosticStatus]
  }
  @scala.inline
  implicit class ManagedAppDiagnosticStatusOps[Self <: ManagedAppDiagnosticStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMitigationInstruction(value: String): Self = this.set("mitigationInstruction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMitigationInstruction: Self = this.set("mitigationInstruction", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setValidationName(value: String): Self = this.set("validationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationName: Self = this.set("validationName", js.undefined)
  }
  
}

