package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExpandedMonarchLanguageRule extends StObject {
  
  /**
    * action to take on match
    */
  var action: js.UndefOr[IMonarchLanguageAction] = js.undefined
  
  /**
    * or an include rule. include all rules from the included state
    */
  var include: js.UndefOr[String] = js.undefined
  
  /**
    * match tokens
    */
  var regex: js.UndefOr[String | js.RegExp] = js.undefined
}
object IExpandedMonarchLanguageRule {
  
  inline def apply(): IExpandedMonarchLanguageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandedMonarchLanguageRule]
  }
  
  extension [Self <: IExpandedMonarchLanguageRule](x: Self) {
    
    inline def setAction(value: IMonarchLanguageAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: (IExpandedMonarchLanguageAction | IShortMonarchLanguageAction)*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setRegex(value: String | js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
