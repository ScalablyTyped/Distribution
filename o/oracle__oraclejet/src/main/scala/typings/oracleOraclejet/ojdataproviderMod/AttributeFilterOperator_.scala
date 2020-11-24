package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeFilterOperator_[D] extends js.Object {
  
  var attribute: String = js.native
  
  var op: AttributeOperator = js.native
  
  var value: js.Any = js.native
}
object AttributeFilterOperator_ {
  
  @scala.inline
  def apply[D](attribute: String, op: AttributeOperator, value: js.Any): AttributeFilterOperator_[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeFilterOperator_[D]]
  }
  
  @scala.inline
  implicit class AttributeFilterOperator_Ops[Self <: AttributeFilterOperator_[_], D] (val x: Self with AttributeFilterOperator_[D]) extends AnyVal {
    
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: AttributeOperator): Self = this.set("op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
