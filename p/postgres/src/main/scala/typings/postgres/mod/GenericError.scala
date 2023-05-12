package typings.postgres.mod

import typings.postgres.postgresStrings.MAX_PARAMETERS_EXCEEDED
import typings.postgres.postgresStrings.NOT_TAGGED_CALL
import typings.postgres.postgresStrings.SASL_SIGNATURE_MISMATCH
import typings.postgres.postgresStrings.UNDEFINED_VALUE
import typings.postgres.postgresStrings.`57014`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ trait GenericError
  extends StObject
     with _Error {
  
  var code: `57014` | NOT_TAGGED_CALL | UNDEFINED_VALUE | MAX_PARAMETERS_EXCEEDED | SASL_SIGNATURE_MISMATCH
  
  var message: String
}
object GenericError {
  
  inline def apply(
    code: `57014` | NOT_TAGGED_CALL | UNDEFINED_VALUE | MAX_PARAMETERS_EXCEEDED | SASL_SIGNATURE_MISMATCH,
    message: String
  ): GenericError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericError] (val x: Self) extends AnyVal {
    
    inline def setCode(
      value: `57014` | NOT_TAGGED_CALL | UNDEFINED_VALUE | MAX_PARAMETERS_EXCEEDED | SASL_SIGNATURE_MISMATCH
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
