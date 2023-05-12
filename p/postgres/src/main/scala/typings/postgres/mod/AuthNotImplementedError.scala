package typings.postgres.mod

import typings.postgres.postgresStrings.AUTH_TYPE_NOT_IMPLEMENTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ trait AuthNotImplementedError
  extends StObject
     with _Error {
  
  var code: AUTH_TYPE_NOT_IMPLEMENTED
  
  var message: String
  
  var `type`: Double | String
}
object AuthNotImplementedError {
  
  inline def apply(message: String, `type`: Double | String): AuthNotImplementedError = {
    val __obj = js.Dynamic.literal(code = "AUTH_TYPE_NOT_IMPLEMENTED", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthNotImplementedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthNotImplementedError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: AUTH_TYPE_NOT_IMPLEMENTED): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
