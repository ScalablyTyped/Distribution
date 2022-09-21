package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessFilter extends StObject {
  
  // Mode to use for the filter. Possible values are include or exclude.
  var mode: js.UndefOr[FilterMode] = js.undefined
  
  /**
    * Rule syntax is similar to that used for membership rules for groups in Azure Active Directory (Azure AD). For details,
    * see rules with multiple expressions
    */
  var rule: js.UndefOr[String] = js.undefined
}
object ConditionalAccessFilter {
  
  inline def apply(): ConditionalAccessFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessFilter]
  }
  
  extension [Self <: ConditionalAccessFilter](x: Self) {
    
    inline def setMode(value: FilterMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
