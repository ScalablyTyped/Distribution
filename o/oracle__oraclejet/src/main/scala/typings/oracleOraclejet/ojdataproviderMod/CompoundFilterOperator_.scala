package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompoundFilterOperator_[D] extends js.Object {
  
  var criteria: js.Array[FilterOperator[D]] = js.native
  
  var op: CompoundOperator = js.native
}
object CompoundFilterOperator_ {
  
  @scala.inline
  def apply[D](criteria: js.Array[FilterOperator[D]], op: CompoundOperator): CompoundFilterOperator_[D] = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundFilterOperator_[D]]
  }
  
  @scala.inline
  implicit class CompoundFilterOperator_Ops[Self <: CompoundFilterOperator_[_], D] (val x: Self with CompoundFilterOperator_[D]) extends AnyVal {
    
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
    def setCriteriaVarargs(value: FilterOperator[D]*): Self = this.set("criteria", js.Array(value :_*))
    
    @scala.inline
    def setCriteria(value: js.Array[FilterOperator[D]]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: CompoundOperator): Self = this.set("op", value.asInstanceOf[js.Any])
  }
}
