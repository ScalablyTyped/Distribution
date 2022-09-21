package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningStep extends StObject {
  
  // Summary of what occurred during the step.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Details of what occurred during the step.
  var details: js.UndefOr[NullableOption[DetailsInfo]] = js.undefined
  
  // Name of the step.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Type of step. Possible values are: import, scoping, matching, processing, referenceResolution, export,
    * unknownFutureValue.
    */
  var provisioningStepType: js.UndefOr[NullableOption[ProvisioningStepType]] = js.undefined
  
  // Status of the step. Possible values are: success, warning, failure, skipped, unknownFutureValue.
  var status: js.UndefOr[NullableOption[ProvisioningResult]] = js.undefined
}
object ProvisioningStep {
  
  inline def apply(): ProvisioningStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningStep]
  }
  
  extension [Self <: ProvisioningStep](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetails(value: NullableOption[DetailsInfo]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProvisioningStepType(value: NullableOption[ProvisioningStepType]): Self = StObject.set(x, "provisioningStepType", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStepTypeNull: Self = StObject.set(x, "provisioningStepType", null)
    
    inline def setProvisioningStepTypeUndefined: Self = StObject.set(x, "provisioningStepType", js.undefined)
    
    inline def setStatus(value: NullableOption[ProvisioningResult]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
