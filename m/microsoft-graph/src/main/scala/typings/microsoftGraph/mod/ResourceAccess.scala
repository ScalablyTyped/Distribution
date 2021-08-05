package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceAccess extends StObject {
  
  // The unique identifier for one of the oauth2PermissionScopes or appRole instances that the resource application exposes.
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the id property references an oauth2PermissionScopes or an appRole. Possible values are Scope or
    * Role.
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResourceAccess {
  
  inline def apply(): ResourceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAccess]
  }
  
  extension [Self <: ResourceAccess](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
