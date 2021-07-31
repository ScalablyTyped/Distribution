package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppRule extends StObject {
  
  // The rule type indicating the purpose of the rule. Possible values are: detection, requirement.
  var ruleType: js.UndefOr[Win32LobAppRuleType] = js.undefined
}
object Win32LobAppRule {
  
  @scala.inline
  def apply(): Win32LobAppRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppRule]
  }
  
  @scala.inline
  implicit class Win32LobAppRuleMutableBuilder[Self <: Win32LobAppRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleType(value: Win32LobAppRuleType): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleTypeUndefined: Self = StObject.set(x, "ruleType", js.undefined)
  }
}
