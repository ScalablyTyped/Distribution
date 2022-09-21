package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryConfig[I /* <: js.Array[Any] */] extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var types: js.UndefOr[CustomTypesConfig] = js.undefined
  
  var values: js.UndefOr[I] = js.undefined
}
object QueryConfig {
  
  inline def apply[I /* <: js.Array[Any] */](text: String): QueryConfig[I] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryConfig[I]]
  }
  
  extension [Self <: QueryConfig[?], I /* <: js.Array[Any] */](x: Self & QueryConfig[I]) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: CustomTypesConfig): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setValues(value: I): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
