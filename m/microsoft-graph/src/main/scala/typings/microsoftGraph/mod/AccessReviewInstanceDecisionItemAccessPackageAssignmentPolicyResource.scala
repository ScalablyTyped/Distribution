package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource
  extends StObject
     with AccessReviewInstanceDecisionItemResource {
  
  // Display name of the access package to which access has been granted.
  var accessPackageDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identifier of the access package to which access has been granted.
  var accessPackageId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource {
  
  inline def apply(): AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource]
  }
  
  extension [Self <: AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource](x: Self) {
    
    inline def setAccessPackageDisplayName(value: NullableOption[String]): Self = StObject.set(x, "accessPackageDisplayName", value.asInstanceOf[js.Any])
    
    inline def setAccessPackageDisplayNameNull: Self = StObject.set(x, "accessPackageDisplayName", null)
    
    inline def setAccessPackageDisplayNameUndefined: Self = StObject.set(x, "accessPackageDisplayName", js.undefined)
    
    inline def setAccessPackageId(value: NullableOption[String]): Self = StObject.set(x, "accessPackageId", value.asInstanceOf[js.Any])
    
    inline def setAccessPackageIdNull: Self = StObject.set(x, "accessPackageId", null)
    
    inline def setAccessPackageIdUndefined: Self = StObject.set(x, "accessPackageId", js.undefined)
  }
}
