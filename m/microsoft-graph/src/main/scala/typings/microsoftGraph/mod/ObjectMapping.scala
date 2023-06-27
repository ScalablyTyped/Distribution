package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectMapping extends StObject {
  
  var attributeMappings: js.UndefOr[NullableOption[js.Array[AttributeMapping]]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var flowTypes: js.UndefOr[ObjectFlowTypes] = js.undefined
  
  var metadata: js.UndefOr[NullableOption[js.Array[ObjectMappingMetadataEntry]]] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var scope: js.UndefOr[NullableOption[Filter]] = js.undefined
  
  var sourceObjectName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var targetObjectName: js.UndefOr[NullableOption[String]] = js.undefined
}
object ObjectMapping {
  
  inline def apply(): ObjectMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectMapping] (val x: Self) extends AnyVal {
    
    inline def setAttributeMappings(value: NullableOption[js.Array[AttributeMapping]]): Self = StObject.set(x, "attributeMappings", value.asInstanceOf[js.Any])
    
    inline def setAttributeMappingsNull: Self = StObject.set(x, "attributeMappings", null)
    
    inline def setAttributeMappingsUndefined: Self = StObject.set(x, "attributeMappings", js.undefined)
    
    inline def setAttributeMappingsVarargs(value: AttributeMapping*): Self = StObject.set(x, "attributeMappings", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFlowTypes(value: ObjectFlowTypes): Self = StObject.set(x, "flowTypes", value.asInstanceOf[js.Any])
    
    inline def setFlowTypesUndefined: Self = StObject.set(x, "flowTypes", js.undefined)
    
    inline def setMetadata(value: NullableOption[js.Array[ObjectMappingMetadataEntry]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: ObjectMappingMetadataEntry*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScope(value: NullableOption[Filter]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSourceObjectName(value: NullableOption[String]): Self = StObject.set(x, "sourceObjectName", value.asInstanceOf[js.Any])
    
    inline def setSourceObjectNameNull: Self = StObject.set(x, "sourceObjectName", null)
    
    inline def setSourceObjectNameUndefined: Self = StObject.set(x, "sourceObjectName", js.undefined)
    
    inline def setTargetObjectName(value: NullableOption[String]): Self = StObject.set(x, "targetObjectName", value.asInstanceOf[js.Any])
    
    inline def setTargetObjectNameNull: Self = StObject.set(x, "targetObjectName", null)
    
    inline def setTargetObjectNameUndefined: Self = StObject.set(x, "targetObjectName", js.undefined)
  }
}
