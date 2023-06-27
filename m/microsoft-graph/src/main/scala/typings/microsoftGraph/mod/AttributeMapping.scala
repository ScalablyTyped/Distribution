package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeMapping extends StObject {
  
  var defaultValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  var exportMissingReferences: js.UndefOr[Boolean] = js.undefined
  
  var flowBehavior: js.UndefOr[AttributeFlowBehavior] = js.undefined
  
  var flowType: js.UndefOr[AttributeFlowType] = js.undefined
  
  var matchingPriority: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[NullableOption[AttributeMappingSource]] = js.undefined
  
  var targetAttributeName: js.UndefOr[NullableOption[String]] = js.undefined
}
object AttributeMapping {
  
  inline def apply(): AttributeMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeMapping] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: NullableOption[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setExportMissingReferences(value: Boolean): Self = StObject.set(x, "exportMissingReferences", value.asInstanceOf[js.Any])
    
    inline def setExportMissingReferencesUndefined: Self = StObject.set(x, "exportMissingReferences", js.undefined)
    
    inline def setFlowBehavior(value: AttributeFlowBehavior): Self = StObject.set(x, "flowBehavior", value.asInstanceOf[js.Any])
    
    inline def setFlowBehaviorUndefined: Self = StObject.set(x, "flowBehavior", js.undefined)
    
    inline def setFlowType(value: AttributeFlowType): Self = StObject.set(x, "flowType", value.asInstanceOf[js.Any])
    
    inline def setFlowTypeUndefined: Self = StObject.set(x, "flowType", js.undefined)
    
    inline def setMatchingPriority(value: Double): Self = StObject.set(x, "matchingPriority", value.asInstanceOf[js.Any])
    
    inline def setMatchingPriorityUndefined: Self = StObject.set(x, "matchingPriority", js.undefined)
    
    inline def setSource(value: NullableOption[AttributeMappingSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTargetAttributeName(value: NullableOption[String]): Self = StObject.set(x, "targetAttributeName", value.asInstanceOf[js.Any])
    
    inline def setTargetAttributeNameNull: Self = StObject.set(x, "targetAttributeName", null)
    
    inline def setTargetAttributeNameUndefined: Self = StObject.set(x, "targetAttributeName", js.undefined)
  }
}
