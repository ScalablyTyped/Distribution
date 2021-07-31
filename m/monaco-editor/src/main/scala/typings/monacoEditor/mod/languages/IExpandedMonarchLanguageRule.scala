package typings.monacoEditor.mod.languages

import typings.std.RegExp
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
  var regex: js.UndefOr[String | RegExp] = js.undefined
}
object IExpandedMonarchLanguageRule {
  
  @scala.inline
  def apply(): IExpandedMonarchLanguageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandedMonarchLanguageRule]
  }
  
  @scala.inline
  implicit class IExpandedMonarchLanguageRuleMutableBuilder[Self <: IExpandedMonarchLanguageRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: IMonarchLanguageAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: (IExpandedMonarchLanguageAction | IShortMonarchLanguageAction)*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setRegex(value: String | RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
