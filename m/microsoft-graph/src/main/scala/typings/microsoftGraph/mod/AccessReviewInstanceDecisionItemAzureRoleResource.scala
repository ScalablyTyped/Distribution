package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewInstanceDecisionItemAzureRoleResource
  extends StObject
     with AccessReviewInstanceDecisionItemResource {
  
  // Details of the scope this role is associated with.
  var scope: js.UndefOr[NullableOption[AccessReviewInstanceDecisionItemResource]] = js.undefined
}
object AccessReviewInstanceDecisionItemAzureRoleResource {
  
  inline def apply(): AccessReviewInstanceDecisionItemAzureRoleResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewInstanceDecisionItemAzureRoleResource]
  }
  
  extension [Self <: AccessReviewInstanceDecisionItemAzureRoleResource](x: Self) {
    
    inline def setScope(value: NullableOption[AccessReviewInstanceDecisionItemResource]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
