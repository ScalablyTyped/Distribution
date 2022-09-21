package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAssignmentApprovalSettings extends StObject {
  
  // If false, then approval is not required for new requests in this policy.
  var isApprovalRequiredForAdd: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If false, then approval is not required for updates to requests in this policy.
  var isApprovalRequiredForUpdate: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * If approval is required, the one, two or three elements of this collection define each of the stages of approval. An
    * empty array is present if no approval is required.
    */
  var stages: js.UndefOr[NullableOption[js.Array[AccessPackageApprovalStage]]] = js.undefined
}
object AccessPackageAssignmentApprovalSettings {
  
  inline def apply(): AccessPackageAssignmentApprovalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAssignmentApprovalSettings]
  }
  
  extension [Self <: AccessPackageAssignmentApprovalSettings](x: Self) {
    
    inline def setIsApprovalRequiredForAdd(value: NullableOption[Boolean]): Self = StObject.set(x, "isApprovalRequiredForAdd", value.asInstanceOf[js.Any])
    
    inline def setIsApprovalRequiredForAddNull: Self = StObject.set(x, "isApprovalRequiredForAdd", null)
    
    inline def setIsApprovalRequiredForAddUndefined: Self = StObject.set(x, "isApprovalRequiredForAdd", js.undefined)
    
    inline def setIsApprovalRequiredForUpdate(value: NullableOption[Boolean]): Self = StObject.set(x, "isApprovalRequiredForUpdate", value.asInstanceOf[js.Any])
    
    inline def setIsApprovalRequiredForUpdateNull: Self = StObject.set(x, "isApprovalRequiredForUpdate", null)
    
    inline def setIsApprovalRequiredForUpdateUndefined: Self = StObject.set(x, "isApprovalRequiredForUpdate", js.undefined)
    
    inline def setStages(value: NullableOption[js.Array[AccessPackageApprovalStage]]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesNull: Self = StObject.set(x, "stages", null)
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: AccessPackageApprovalStage*): Self = StObject.set(x, "stages", js.Array(value*))
  }
}
