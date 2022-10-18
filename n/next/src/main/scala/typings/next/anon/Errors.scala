package typings.next.anon

import typings.next.distBuildOutputMod.AmpStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: js.Array[AmpStatus]
  
  var warnings: js.Array[AmpStatus]
}
object Errors {
  
  inline def apply(errors: js.Array[AmpStatus], warnings: js.Array[AmpStatus]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: js.Array[AmpStatus]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: AmpStatus*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setWarnings(value: js.Array[AmpStatus]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: AmpStatus*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
