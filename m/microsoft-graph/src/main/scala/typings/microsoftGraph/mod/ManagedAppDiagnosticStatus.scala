package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAppDiagnosticStatus extends StObject {
  
  // Instruction on how to mitigate a failed validation
  var mitigationInstruction: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The state of the operation
  var state: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The validation friendly name
  var validationName: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedAppDiagnosticStatus {
  
  @scala.inline
  def apply(): ManagedAppDiagnosticStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppDiagnosticStatus]
  }
  
  @scala.inline
  implicit class ManagedAppDiagnosticStatusMutableBuilder[Self <: ManagedAppDiagnosticStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMitigationInstruction(value: NullableOption[String]): Self = StObject.set(x, "mitigationInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMitigationInstructionNull: Self = StObject.set(x, "mitigationInstruction", null)
    
    @scala.inline
    def setMitigationInstructionUndefined: Self = StObject.set(x, "mitigationInstruction", js.undefined)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setValidationName(value: NullableOption[String]): Self = StObject.set(x, "validationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationNameNull: Self = StObject.set(x, "validationName", null)
    
    @scala.inline
    def setValidationNameUndefined: Self = StObject.set(x, "validationName", js.undefined)
  }
}
