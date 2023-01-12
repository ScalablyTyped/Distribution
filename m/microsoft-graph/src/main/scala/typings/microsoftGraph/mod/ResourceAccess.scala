package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceAccess extends StObject {
  
  /**
    * The unique identifier of an app role or delegated permission exposed by the resource application. For delegated
    * permissions, this should match the id property of one of the delegated permissions in the oauth2PermissionScopes
    * collection of the resource application's service principal. For app roles (application permissions), this should match
    * the id property of an app role in the appRoles collection of the resource application's service principal.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the id property references a delegated permission or an app role (application permission). The
    * possible values are: Scope (for delegated permissions) or Role (for app roles).
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResourceAccess {
  
  inline def apply(): ResourceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceAccess] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
