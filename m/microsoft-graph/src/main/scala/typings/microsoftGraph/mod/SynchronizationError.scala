package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationError extends StObject {
  
  var code: js.UndefOr[NullableOption[String]] = js.undefined
  
  var message: js.UndefOr[NullableOption[String]] = js.undefined
  
  var tenantActionable: js.UndefOr[Boolean] = js.undefined
}
object SynchronizationError {
  
  inline def apply(): SynchronizationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTenantActionable(value: Boolean): Self = StObject.set(x, "tenantActionable", value.asInstanceOf[js.Any])
    
    inline def setTenantActionableUndefined: Self = StObject.set(x, "tenantActionable", js.undefined)
  }
}
