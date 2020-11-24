package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionReport extends js.Object {
  
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
  implicit class ExpressionReportOps[Self <: ExpressionReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: ExpressionReport*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ExpressionReport]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setSourcePosition(value: SourcePosition): Self = this.set("sourcePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePosition: Self = this.set("sourcePosition", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ValueCount*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[ValueCount]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
