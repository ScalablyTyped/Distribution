package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRbacResourceNamespace
  extends StObject
     with Entity {
  
  var name: js.UndefOr[String] = js.undefined
  
  var resourceActions: js.UndefOr[NullableOption[js.Array[UnifiedRbacResourceAction]]] = js.undefined
}
object UnifiedRbacResourceNamespace {
  
  inline def apply(): UnifiedRbacResourceNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRbacResourceNamespace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRbacResourceNamespace] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceActions(value: NullableOption[js.Array[UnifiedRbacResourceAction]]): Self = StObject.set(x, "resourceActions", value.asInstanceOf[js.Any])
    
    inline def setResourceActionsNull: Self = StObject.set(x, "resourceActions", null)
    
    inline def setResourceActionsUndefined: Self = StObject.set(x, "resourceActions", js.undefined)
    
    inline def setResourceActionsVarargs(value: UnifiedRbacResourceAction*): Self = StObject.set(x, "resourceActions", js.Array(value*))
  }
}
