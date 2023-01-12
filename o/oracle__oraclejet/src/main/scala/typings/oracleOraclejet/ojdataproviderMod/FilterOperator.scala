package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import typings.oracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOperator[D] extends StObject {
  
  def filter(data: js.Array[Any]): js.Array[Any]
  
  var op: AttributeOperator | CompoundOperator
}
object FilterOperator {
  
  inline def apply[D](filter: js.Array[Any] => js.Array[Any], op: AttributeOperator | CompoundOperator): FilterOperator[D] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOperator[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterOperator[?], D] (val x: Self & FilterOperator[D]) extends AnyVal {
    
    inline def setFilter(value: js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setOp(value: AttributeOperator | CompoundOperator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
