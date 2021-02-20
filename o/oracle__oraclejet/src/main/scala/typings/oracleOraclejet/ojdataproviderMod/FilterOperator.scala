package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import typings.oracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOperator[D] extends StObject {
  
  def filter(data: js.Array[_]): js.Array[_] = js.native
  
  var op: AttributeOperator | CompoundOperator = js.native
}
object FilterOperator {
  
  @scala.inline
  def apply[D](filter: js.Array[_] => js.Array[_], op: AttributeOperator | CompoundOperator): FilterOperator[D] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOperator[D]]
  }
  
  @scala.inline
  implicit class FilterOperatorMutableBuilder[Self <: FilterOperator[_], D] (val x: Self with FilterOperator[D]) extends AnyVal {
    
    @scala.inline
    def setFilter(value: js.Array[_] => js.Array[_]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOp(value: AttributeOperator | CompoundOperator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
