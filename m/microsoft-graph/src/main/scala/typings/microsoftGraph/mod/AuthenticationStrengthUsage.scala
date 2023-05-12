package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationStrengthUsage extends StObject {
  
  var mfa: js.UndefOr[NullableOption[js.Array[ConditionalAccessPolicy]]] = js.undefined
  
  var none: js.UndefOr[NullableOption[js.Array[ConditionalAccessPolicy]]] = js.undefined
}
object AuthenticationStrengthUsage {
  
  inline def apply(): AuthenticationStrengthUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationStrengthUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationStrengthUsage] (val x: Self) extends AnyVal {
    
    inline def setMfa(value: NullableOption[js.Array[ConditionalAccessPolicy]]): Self = StObject.set(x, "mfa", value.asInstanceOf[js.Any])
    
    inline def setMfaNull: Self = StObject.set(x, "mfa", null)
    
    inline def setMfaUndefined: Self = StObject.set(x, "mfa", js.undefined)
    
    inline def setMfaVarargs(value: ConditionalAccessPolicy*): Self = StObject.set(x, "mfa", js.Array(value*))
    
    inline def setNone(value: NullableOption[js.Array[ConditionalAccessPolicy]]): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneNull: Self = StObject.set(x, "none", null)
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    inline def setNoneVarargs(value: ConditionalAccessPolicy*): Self = StObject.set(x, "none", js.Array(value*))
  }
}
