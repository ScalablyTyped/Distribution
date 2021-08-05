package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionContext extends StObject {
  
  /**
    * Character that triggered the completion item provider.
    *
    * `undefined` if provider was not triggered by a character.
    */
  var triggerCharacter: js.UndefOr[String] = js.undefined
  
  /**
    * How the completion was triggered.
    */
  var triggerKind: CompletionTriggerKind
}
object CompletionContext {
  
  inline def apply(triggerKind: CompletionTriggerKind): CompletionContext = {
    val __obj = js.Dynamic.literal(triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionContext]
  }
  
  extension [Self <: CompletionContext](x: Self) {
    
    inline def setTriggerCharacter(value: String): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
    
    inline def setTriggerKind(value: CompletionTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
  }
}
