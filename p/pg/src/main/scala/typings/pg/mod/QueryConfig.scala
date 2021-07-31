package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryConfig[I /* <: js.Array[js.Any] */] extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var values: js.UndefOr[I] = js.undefined
}
object QueryConfig {
  
  @scala.inline
  def apply[I /* <: js.Array[js.Any] */](text: String): QueryConfig[I] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryConfig[I]]
  }
  
  @scala.inline
  implicit class QueryConfigMutableBuilder[Self <: QueryConfig[?], I /* <: js.Array[js.Any] */] (val x: Self & QueryConfig[I]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: I): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
