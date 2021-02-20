package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionReport extends StObject {
  
  /** Subexpressions */
  var children: js.UndefOr[js.Array[ExpressionReport]] = js.native
  
  /** Position of expression in original rules source. */
  var sourcePosition: js.UndefOr[SourcePosition] = js.native
  
  /** Values that this expression evaluated to when encountered. */
  var values: js.UndefOr[js.Array[ValueCount]] = js.native
}
object ExpressionReport {
  
  @scala.inline
  def apply(): ExpressionReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressionReport]
  }
  
  @scala.inline
  implicit class ExpressionReportMutableBuilder[Self <: ExpressionReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ExpressionReport]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ExpressionReport*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setSourcePosition(value: SourcePosition): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePositionUndefined: Self = StObject.set(x, "sourcePosition", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[ValueCount]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ValueCount*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
