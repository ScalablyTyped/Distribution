package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDefinition extends StObject {
  
  var attributes: js.UndefOr[NullableOption[js.Array[AttributeDefinition]]] = js.undefined
  
  var metadata: js.UndefOr[NullableOption[js.Array[ObjectDefinitionMetadataEntry]]] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var supportedApis: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object ObjectDefinition {
  
  inline def apply(): ObjectDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectDefinition] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: NullableOption[js.Array[AttributeDefinition]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeDefinition*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setMetadata(value: NullableOption[js.Array[ObjectDefinitionMetadataEntry]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: ObjectDefinitionMetadataEntry*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSupportedApis(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "supportedApis", value.asInstanceOf[js.Any])
    
    inline def setSupportedApisNull: Self = StObject.set(x, "supportedApis", null)
    
    inline def setSupportedApisUndefined: Self = StObject.set(x, "supportedApis", js.undefined)
    
    inline def setSupportedApisVarargs(value: String*): Self = StObject.set(x, "supportedApis", js.Array(value*))
  }
}
