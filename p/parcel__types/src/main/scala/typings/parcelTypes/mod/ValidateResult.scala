package typings.parcelTypes.mod

import typings.parcelDiagnostic.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateResult extends StObject {
  
  var errors: js.Array[Diagnostic]
  
  var warnings: js.Array[Diagnostic]
}
object ValidateResult {
  
  inline def apply(errors: js.Array[Diagnostic], warnings: js.Array[Diagnostic]): ValidateResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateResult] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Diagnostic*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setWarnings(value: js.Array[Diagnostic]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Diagnostic*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
