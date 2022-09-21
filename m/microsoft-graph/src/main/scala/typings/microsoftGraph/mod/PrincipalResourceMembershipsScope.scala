package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrincipalResourceMembershipsScope
  extends StObject
     with AccessReviewScope {
  
  // Defines the scopes of the principals whose access to resources are reviewed in the access review.
  var principalScopes: js.UndefOr[NullableOption[js.Array[AccessReviewScope]]] = js.undefined
  
  // Defines the scopes of the resources for which access is reviewed.
  var resourceScopes: js.UndefOr[NullableOption[js.Array[AccessReviewScope]]] = js.undefined
}
object PrincipalResourceMembershipsScope {
  
  inline def apply(): PrincipalResourceMembershipsScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalResourceMembershipsScope]
  }
  
  extension [Self <: PrincipalResourceMembershipsScope](x: Self) {
    
    inline def setPrincipalScopes(value: NullableOption[js.Array[AccessReviewScope]]): Self = StObject.set(x, "principalScopes", value.asInstanceOf[js.Any])
    
    inline def setPrincipalScopesNull: Self = StObject.set(x, "principalScopes", null)
    
    inline def setPrincipalScopesUndefined: Self = StObject.set(x, "principalScopes", js.undefined)
    
    inline def setPrincipalScopesVarargs(value: AccessReviewScope*): Self = StObject.set(x, "principalScopes", js.Array(value*))
    
    inline def setResourceScopes(value: NullableOption[js.Array[AccessReviewScope]]): Self = StObject.set(x, "resourceScopes", value.asInstanceOf[js.Any])
    
    inline def setResourceScopesNull: Self = StObject.set(x, "resourceScopes", null)
    
    inline def setResourceScopesUndefined: Self = StObject.set(x, "resourceScopes", js.undefined)
    
    inline def setResourceScopesVarargs(value: AccessReviewScope*): Self = StObject.set(x, "resourceScopes", js.Array(value*))
  }
}
