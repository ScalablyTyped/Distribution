package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeybindingRule extends StObject {
  
  var command: js.UndefOr[String | Null] = js.undefined
  
  var commandArgs: js.UndefOr[Any] = js.undefined
  
  var keybinding: Double
  
  var when: js.UndefOr[String | Null] = js.undefined
}
object IKeybindingRule {
  
  inline def apply(keybinding: Double): IKeybindingRule = {
    val __obj = js.Dynamic.literal(keybinding = keybinding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeybindingRule]
  }
  
  extension [Self <: IKeybindingRule](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandArgs(value: Any): Self = StObject.set(x, "commandArgs", value.asInstanceOf[js.Any])
    
    inline def setCommandArgsUndefined: Self = StObject.set(x, "commandArgs", js.undefined)
    
    inline def setCommandNull: Self = StObject.set(x, "command", null)
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setKeybinding(value: Double): Self = StObject.set(x, "keybinding", value.asInstanceOf[js.Any])
    
    inline def setWhen(value: String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenNull: Self = StObject.set(x, "when", null)
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
