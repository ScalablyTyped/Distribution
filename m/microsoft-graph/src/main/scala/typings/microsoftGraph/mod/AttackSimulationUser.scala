package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackSimulationUser extends StObject {
  
  // Display name of the user.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Email address of the user.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
  
  // This is the id property value of the user resource that represents the user in the Azure Active Directory tenant.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AttackSimulationUser {
  
  inline def apply(): AttackSimulationUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackSimulationUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttackSimulationUser] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
