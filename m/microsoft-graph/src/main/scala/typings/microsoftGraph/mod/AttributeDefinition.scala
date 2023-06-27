package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeDefinition extends StObject {
  
  var anchor: js.UndefOr[Boolean] = js.undefined
  
  var apiExpressions: js.UndefOr[NullableOption[js.Array[StringKeyStringValuePair]]] = js.undefined
  
  var caseExact: js.UndefOr[Boolean] = js.undefined
  
  var defaultValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  var flowNullValues: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[NullableOption[js.Array[AttributeDefinitionMetadataEntry]]] = js.undefined
  
  var multivalued: js.UndefOr[Boolean] = js.undefined
  
  var mutability: js.UndefOr[Mutability] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var referencedObjects: js.UndefOr[NullableOption[js.Array[ReferencedObject]]] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[AttributeType] = js.undefined
}
object AttributeDefinition {
  
  inline def apply(): AttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeDefinition] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: Boolean): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setApiExpressions(value: NullableOption[js.Array[StringKeyStringValuePair]]): Self = StObject.set(x, "apiExpressions", value.asInstanceOf[js.Any])
    
    inline def setApiExpressionsNull: Self = StObject.set(x, "apiExpressions", null)
    
    inline def setApiExpressionsUndefined: Self = StObject.set(x, "apiExpressions", js.undefined)
    
    inline def setApiExpressionsVarargs(value: StringKeyStringValuePair*): Self = StObject.set(x, "apiExpressions", js.Array(value*))
    
    inline def setCaseExact(value: Boolean): Self = StObject.set(x, "caseExact", value.asInstanceOf[js.Any])
    
    inline def setCaseExactUndefined: Self = StObject.set(x, "caseExact", js.undefined)
    
    inline def setDefaultValue(value: NullableOption[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setFlowNullValues(value: Boolean): Self = StObject.set(x, "flowNullValues", value.asInstanceOf[js.Any])
    
    inline def setFlowNullValuesUndefined: Self = StObject.set(x, "flowNullValues", js.undefined)
    
    inline def setMetadata(value: NullableOption[js.Array[AttributeDefinitionMetadataEntry]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: AttributeDefinitionMetadataEntry*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setMultivalued(value: Boolean): Self = StObject.set(x, "multivalued", value.asInstanceOf[js.Any])
    
    inline def setMultivaluedUndefined: Self = StObject.set(x, "multivalued", js.undefined)
    
    inline def setMutability(value: Mutability): Self = StObject.set(x, "mutability", value.asInstanceOf[js.Any])
    
    inline def setMutabilityUndefined: Self = StObject.set(x, "mutability", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferencedObjects(value: NullableOption[js.Array[ReferencedObject]]): Self = StObject.set(x, "referencedObjects", value.asInstanceOf[js.Any])
    
    inline def setReferencedObjectsNull: Self = StObject.set(x, "referencedObjects", null)
    
    inline def setReferencedObjectsUndefined: Self = StObject.set(x, "referencedObjects", js.undefined)
    
    inline def setReferencedObjectsVarargs(value: ReferencedObject*): Self = StObject.set(x, "referencedObjects", js.Array(value*))
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: AttributeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
