package typings.postgres.mod

import typings.postgres.postgresStrings.MESSAGE_NOT_SUPPORTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ trait NotSupportedError
  extends StObject
     with _Error {
  
  var code: MESSAGE_NOT_SUPPORTED
  
  var name: String
}
object NotSupportedError {
  
  inline def apply(name: String): NotSupportedError = {
    val __obj = js.Dynamic.literal(code = "MESSAGE_NOT_SUPPORTED", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotSupportedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotSupportedError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: MESSAGE_NOT_SUPPORTED): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
