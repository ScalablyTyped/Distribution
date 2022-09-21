package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddIn extends StObject {
  
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  var properties: js.UndefOr[js.Array[KeyValue]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object AddIn {
  
  inline def apply(): AddIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddIn]
  }
  
  extension [Self <: AddIn](x: Self) {
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProperties(value: js.Array[KeyValue]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: KeyValue*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
