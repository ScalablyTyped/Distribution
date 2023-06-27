package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterClause extends StObject {
  
  var operatorName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var sourceOperandName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var targetOperand: js.UndefOr[NullableOption[FilterOperand]] = js.undefined
}
object FilterClause {
  
  inline def apply(): FilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterClause]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterClause] (val x: Self) extends AnyVal {
    
    inline def setOperatorName(value: NullableOption[String]): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameNull: Self = StObject.set(x, "operatorName", null)
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    inline def setSourceOperandName(value: NullableOption[String]): Self = StObject.set(x, "sourceOperandName", value.asInstanceOf[js.Any])
    
    inline def setSourceOperandNameNull: Self = StObject.set(x, "sourceOperandName", null)
    
    inline def setSourceOperandNameUndefined: Self = StObject.set(x, "sourceOperandName", js.undefined)
    
    inline def setTargetOperand(value: NullableOption[FilterOperand]): Self = StObject.set(x, "targetOperand", value.asInstanceOf[js.Any])
    
    inline def setTargetOperandNull: Self = StObject.set(x, "targetOperand", null)
    
    inline def setTargetOperandUndefined: Self = StObject.set(x, "targetOperand", js.undefined)
  }
}
