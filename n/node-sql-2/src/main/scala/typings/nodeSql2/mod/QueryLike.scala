package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLike extends StObject {
  
  var text: String
  
  var values: js.Array[js.Any]
}
object QueryLike {
  
  @scala.inline
  def apply(text: String, values: js.Array[js.Any]): QueryLike = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLike]
  }
  
  @scala.inline
  implicit class QueryLikeMutableBuilder[Self <: QueryLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
