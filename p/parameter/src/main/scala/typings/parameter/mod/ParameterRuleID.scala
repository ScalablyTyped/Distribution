package typings.parameter.mod

import typings.parameter.parameterStrings.id
import typings.parameter.parameterStrings.idQuestionmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleID
  extends ParameterRuleBase
     with _ParameterRuleItem {
  
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_ParameterRuleID: id | idQuestionmark = js.native
}
object ParameterRuleID {
  
  @scala.inline
  def apply(`type`: id | idQuestionmark): ParameterRuleID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleID]
  }
  
  @scala.inline
  implicit class ParameterRuleIDOps[Self <: ParameterRuleID] (val x: Self) extends AnyVal {
    
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
    def setType(value: id | idQuestionmark): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
  }
}
