package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimaryUserFlow extends StObject {
  
  var primaryUserFlow: js.UndefOr[String] = js.undefined
  
  var tenantId: js.UndefOr[String] = js.undefined
}
object PrimaryUserFlow {
  
  inline def apply(): PrimaryUserFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryUserFlow]
  }
  
  extension [Self <: PrimaryUserFlow](x: Self) {
    
    inline def setPrimaryUserFlow(value: String): Self = StObject.set(x, "primaryUserFlow", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUserFlowUndefined: Self = StObject.set(x, "primaryUserFlow", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
