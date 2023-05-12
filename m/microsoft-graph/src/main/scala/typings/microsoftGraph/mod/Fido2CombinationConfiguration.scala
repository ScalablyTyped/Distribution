package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fido2CombinationConfiguration
  extends StObject
     with AuthenticationCombinationConfiguration {
  
  // A list of AAGUIDs allowed to be used as part of the specified authentication method combinations.
  var allowedAAGUIDs: js.UndefOr[js.Array[String]] = js.undefined
}
object Fido2CombinationConfiguration {
  
  inline def apply(): Fido2CombinationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fido2CombinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fido2CombinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAllowedAAGUIDs(value: js.Array[String]): Self = StObject.set(x, "allowedAAGUIDs", value.asInstanceOf[js.Any])
    
    inline def setAllowedAAGUIDsUndefined: Self = StObject.set(x, "allowedAAGUIDs", js.undefined)
    
    inline def setAllowedAAGUIDsVarargs(value: String*): Self = StObject.set(x, "allowedAAGUIDs", js.Array(value*))
  }
}
