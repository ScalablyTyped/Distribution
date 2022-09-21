package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.monacoEditorNumbers.`0`
import typings.monacoEditor.monacoEditorNumbers.`1`
import typings.monacoEditor.monacoEditorNumbers.`2`
import typings.monacoEditor.monacoEditorNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A linked list of formatted diagnostic messages to be used as part of a multiline message.
  * It is built from the bottom up, leaving the head to be the "main" diagnostic.
  */
trait DiagnosticMessageChain extends StObject {
  
  /** Diagnostic category: warning = 0, error = 1, suggestion = 2, message = 3 */
  var category: `0` | `1` | `2` | `3`
  
  var code: Double
  
  var messageText: String
  
  var next: js.UndefOr[js.Array[DiagnosticMessageChain]] = js.undefined
}
object DiagnosticMessageChain {
  
  inline def apply(category: `0` | `1` | `2` | `3`, code: Double, messageText: String): DiagnosticMessageChain = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticMessageChain]
  }
  
  extension [Self <: DiagnosticMessageChain](x: Self) {
    
    inline def setCategory(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setNext(value: js.Array[DiagnosticMessageChain]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: DiagnosticMessageChain*): Self = StObject.set(x, "next", js.Array(value*))
  }
}
