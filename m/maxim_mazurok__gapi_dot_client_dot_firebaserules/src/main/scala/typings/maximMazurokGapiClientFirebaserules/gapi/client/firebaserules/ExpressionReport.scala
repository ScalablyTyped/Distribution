package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionReport extends StObject {
  
  /** Subexpressions */
  var children: js.UndefOr[js.Array[ExpressionReport]] = js.undefined
  
  /** Position of expression in original rules source. */
  var sourcePosition: js.UndefOr[SourcePosition] = js.undefined
  
  /** Values that this expression evaluated to when encountered. */
  var values: js.UndefOr[js.Array[ValueCount]] = js.undefined
}
object ExpressionReport {
  
  inline def apply(): ExpressionReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressionReport]
  }
  
  extension [Self <: ExpressionReport](x: Self) {
    
    inline def setChildren(value: js.Array[ExpressionReport]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ExpressionReport*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setSourcePosition(value: SourcePosition): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    inline def setSourcePositionUndefined: Self = StObject.set(x, "sourcePosition", js.undefined)
    
    inline def setValues(value: js.Array[ValueCount]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: ValueCount*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
