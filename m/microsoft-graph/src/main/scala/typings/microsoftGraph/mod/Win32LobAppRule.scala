package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppRule extends js.Object {
  
  // The rule type indicating the purpose of the rule. Possible values are: detection, requirement.
  var ruleType: js.UndefOr[Win32LobAppRuleType] = js.native
}
object Win32LobAppRule {
  
  @scala.inline
  def apply(): Win32LobAppRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppRule]
  }
  
  @scala.inline
  implicit class Win32LobAppRuleOps[Self <: Win32LobAppRule] (val x: Self) extends AnyVal {
    
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
    def setRuleType(value: Win32LobAppRuleType): Self = this.set("ruleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleType: Self = this.set("ruleType", js.undefined)
  }
}
