package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEnterRule extends StObject {
  
  /**
    * The action to execute.
    */
  var action: EnterAction
  
  /**
    * This rule will only execute if the text after the cursor matches this regular expression.
    */
  var afterText: js.UndefOr[js.RegExp] = js.undefined
  
  /**
    * This rule will only execute if the text before the cursor matches this regular expression.
    */
  var beforeText: js.RegExp
  
  /**
    * This rule will only execute if the text above the this line matches this regular expression.
    */
  var previousLineText: js.UndefOr[js.RegExp] = js.undefined
}
object OnEnterRule {
  
  inline def apply(action: EnterAction, beforeText: js.RegExp): OnEnterRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], beforeText = beforeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEnterRule]
  }
  
  extension [Self <: OnEnterRule](x: Self) {
    
    inline def setAction(value: EnterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAfterText(value: js.RegExp): Self = StObject.set(x, "afterText", value.asInstanceOf[js.Any])
    
    inline def setAfterTextUndefined: Self = StObject.set(x, "afterText", js.undefined)
    
    inline def setBeforeText(value: js.RegExp): Self = StObject.set(x, "beforeText", value.asInstanceOf[js.Any])
    
    inline def setPreviousLineText(value: js.RegExp): Self = StObject.set(x, "previousLineText", value.asInstanceOf[js.Any])
    
    inline def setPreviousLineTextUndefined: Self = StObject.set(x, "previousLineText", js.undefined)
  }
}
