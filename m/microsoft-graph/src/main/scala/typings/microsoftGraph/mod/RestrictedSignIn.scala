package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictedSignIn
  extends StObject
     with SignIn {
  
  var targetTenantId: js.UndefOr[NullableOption[String]] = js.undefined
}
object RestrictedSignIn {
  
  inline def apply(): RestrictedSignIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictedSignIn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestrictedSignIn] (val x: Self) extends AnyVal {
    
    inline def setTargetTenantId(value: NullableOption[String]): Self = StObject.set(x, "targetTenantId", value.asInstanceOf[js.Any])
    
    inline def setTargetTenantIdNull: Self = StObject.set(x, "targetTenantId", null)
    
    inline def setTargetTenantIdUndefined: Self = StObject.set(x, "targetTenantId", js.undefined)
  }
}
