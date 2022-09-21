package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewInstanceDecisionItemResource extends StObject {
  
  // Display name of the resource
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identifier of the resource
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Type of resource. Types include: Group, ServicePrincipal, DirectoryRole, AzureRole, AccessPackageAssignmentPolicy.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewInstanceDecisionItemResource {
  
  inline def apply(): AccessReviewInstanceDecisionItemResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewInstanceDecisionItemResource]
  }
  
  extension [Self <: AccessReviewInstanceDecisionItemResource](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
