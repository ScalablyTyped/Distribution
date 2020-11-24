package typings.parameter.mod

import typings.parameter.parameterStrings.`object`
import typings.parameter.parameterStrings.objectQuestionmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleObject
  extends ParameterRuleBase
     with _ParameterRuleItem {
  
  var rule: js.UndefOr[ParameterRules] = js.native
  
  @JSName("type")
  var type_ParameterRuleObject: `object` | objectQuestionmark = js.native
}
object ParameterRuleObject {
  
  @scala.inline
  def apply(`type`: `object` | objectQuestionmark): ParameterRuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleObject]
  }
  
  @scala.inline
  implicit class ParameterRuleObjectOps[Self <: ParameterRuleObject] (val x: Self) extends AnyVal {
    
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
    def setType(value: `object` | objectQuestionmark): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: ParameterRules): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
}
