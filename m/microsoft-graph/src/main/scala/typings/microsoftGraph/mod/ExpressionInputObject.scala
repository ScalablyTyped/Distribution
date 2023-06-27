package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionInputObject extends StObject {
  
  var definition: js.UndefOr[NullableOption[ObjectDefinition]] = js.undefined
  
  var properties: js.UndefOr[NullableOption[js.Array[StringKeyObjectValuePair]]] = js.undefined
}
object ExpressionInputObject {
  
  inline def apply(): ExpressionInputObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressionInputObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpressionInputObject] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: NullableOption[ObjectDefinition]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionNull: Self = StObject.set(x, "definition", null)
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setProperties(value: NullableOption[js.Array[StringKeyObjectValuePair]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: StringKeyObjectValuePair*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
