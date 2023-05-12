package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessExternalTenants extends StObject {
  
  var membershipKind: js.UndefOr[NullableOption[ConditionalAccessExternalTenantsMembershipKind]] = js.undefined
}
object ConditionalAccessExternalTenants {
  
  inline def apply(): ConditionalAccessExternalTenants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessExternalTenants]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessExternalTenants] (val x: Self) extends AnyVal {
    
    inline def setMembershipKind(value: NullableOption[ConditionalAccessExternalTenantsMembershipKind]): Self = StObject.set(x, "membershipKind", value.asInstanceOf[js.Any])
    
    inline def setMembershipKindNull: Self = StObject.set(x, "membershipKind", null)
    
    inline def setMembershipKindUndefined: Self = StObject.set(x, "membershipKind", js.undefined)
  }
}
