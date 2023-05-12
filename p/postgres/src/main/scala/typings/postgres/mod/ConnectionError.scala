package typings.postgres.mod

import typings.postgres.postgresStrings.CONNECTION_CLOSED
import typings.postgres.postgresStrings.CONNECTION_DESTROYED
import typings.postgres.postgresStrings.CONNECTION_ENDED
import typings.postgres.postgresStrings.CONNECT_TIMEOUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ trait ConnectionError
  extends StObject
     with _Error {
  
  var address: String
  
  var code: CONNECTION_DESTROYED | CONNECT_TIMEOUT | CONNECTION_CLOSED | CONNECTION_ENDED
  
  var errno: /* import warning: importer.ImportType#apply Failed type conversion: this['code'] */ js.Any
  
  var port: js.UndefOr[Double] = js.undefined
}
object ConnectionError {
  
  inline def apply(
    address: String,
    code: CONNECTION_DESTROYED | CONNECT_TIMEOUT | CONNECTION_CLOSED | CONNECTION_ENDED,
    errno: /* import warning: importer.ImportType#apply Failed type conversion: this['code'] */ js.Any
  ): ConnectionError = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionError] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCode(value: CONNECTION_DESTROYED | CONNECT_TIMEOUT | CONNECTION_CLOSED | CONNECTION_ENDED): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setErrno(value: /* import warning: importer.ImportType#apply Failed type conversion: this['code'] */ js.Any): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
