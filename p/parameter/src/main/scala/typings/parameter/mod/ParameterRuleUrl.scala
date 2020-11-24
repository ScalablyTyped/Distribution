package typings.parameter.mod

import typings.parameter.parameterStrings.url
import typings.parameter.parameterStrings.urlQuestionmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleUrl
  extends ParameterRuleBase
     with _ParameterRuleItem {
  
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_ParameterRuleUrl: url | urlQuestionmark = js.native
}
object ParameterRuleUrl {
  
  @scala.inline
  def apply(`type`: url | urlQuestionmark): ParameterRuleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleUrl]
  }
  
  @scala.inline
  implicit class ParameterRuleUrlOps[Self <: ParameterRuleUrl] (val x: Self) extends AnyVal {
    
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
    def setType(value: url | urlQuestionmark): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
