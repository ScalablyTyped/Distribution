package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParamDefinition
  extends StObject
     with PropertyDefinition {
  
  var key: String | Null
  
  var system: js.UndefOr[Boolean] = js.undefined
  
  var value: String | Null
}
object QueryParamDefinition {
  
  inline def apply(): QueryParamDefinition = {
    val __obj = js.Dynamic.literal(key = null, value = null)
    __obj.asInstanceOf[QueryParamDefinition]
  }
  
  extension [Self <: QueryParamDefinition](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setSystem(value: Boolean): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
