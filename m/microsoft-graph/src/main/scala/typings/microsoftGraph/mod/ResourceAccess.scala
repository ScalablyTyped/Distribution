package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceAccess extends StObject {
  
  // The unique identifier for one of the oauth2PermissionScopes or appRole instances that the resource application exposes.
  var id: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the id property references an oauth2PermissionScopes or an appRole. Possible values are Scope or
    * Role.
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.native
}
object ResourceAccess {
  
  @scala.inline
  def apply(): ResourceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAccess]
  }
  
  @scala.inline
  implicit class ResourceAccessMutableBuilder[Self <: ResourceAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
