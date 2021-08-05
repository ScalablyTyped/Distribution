package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppRule extends StObject {
  
  // The rule type indicating the purpose of the rule. Possible values are: detection, requirement.
  var ruleType: js.UndefOr[Win32LobAppRuleType] = js.undefined
}
object Win32LobAppRule {
  
  inline def apply(): Win32LobAppRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppRule]
  }
  
  extension [Self <: Win32LobAppRule](x: Self) {
    
    inline def setRuleType(value: Win32LobAppRuleType): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
    
    inline def setRuleTypeUndefined: Self = StObject.set(x, "ruleType", js.undefined)
  }
}
