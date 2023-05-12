package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRole extends StObject {
  
  // The unified role definition ID of the directory role. Refer to unifiedRoleDefinition resource.
  var roleDefinitionId: js.UndefOr[String] = js.undefined
}
object UnifiedRole {
  
  inline def apply(): UnifiedRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRole] (val x: Self) extends AnyVal {
    
    inline def setRoleDefinitionId(value: String): Self = StObject.set(x, "roleDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setRoleDefinitionIdUndefined: Self = StObject.set(x, "roleDefinitionId", js.undefined)
  }
}
