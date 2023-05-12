package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRbacResourceAction
  extends StObject
     with Entity {
  
  var actionVerb: js.UndefOr[NullableOption[String]] = js.undefined
  
  var authenticationContextId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  var isAuthenticationContextSettable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var resourceScopeId: js.UndefOr[NullableOption[String]] = js.undefined
}
object UnifiedRbacResourceAction {
  
  inline def apply(): UnifiedRbacResourceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRbacResourceAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRbacResourceAction] (val x: Self) extends AnyVal {
    
    inline def setActionVerb(value: NullableOption[String]): Self = StObject.set(x, "actionVerb", value.asInstanceOf[js.Any])
    
    inline def setActionVerbNull: Self = StObject.set(x, "actionVerb", null)
    
    inline def setActionVerbUndefined: Self = StObject.set(x, "actionVerb", js.undefined)
    
    inline def setAuthenticationContextId(value: NullableOption[String]): Self = StObject.set(x, "authenticationContextId", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationContextIdNull: Self = StObject.set(x, "authenticationContextId", null)
    
    inline def setAuthenticationContextIdUndefined: Self = StObject.set(x, "authenticationContextId", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsAuthenticationContextSettable(value: NullableOption[Boolean]): Self = StObject.set(x, "isAuthenticationContextSettable", value.asInstanceOf[js.Any])
    
    inline def setIsAuthenticationContextSettableNull: Self = StObject.set(x, "isAuthenticationContextSettable", null)
    
    inline def setIsAuthenticationContextSettableUndefined: Self = StObject.set(x, "isAuthenticationContextSettable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceScopeId(value: NullableOption[String]): Self = StObject.set(x, "resourceScopeId", value.asInstanceOf[js.Any])
    
    inline def setResourceScopeIdNull: Self = StObject.set(x, "resourceScopeId", null)
    
    inline def setResourceScopeIdUndefined: Self = StObject.set(x, "resourceScopeId", js.undefined)
  }
}
