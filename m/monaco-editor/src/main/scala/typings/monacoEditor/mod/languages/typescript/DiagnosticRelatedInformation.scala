package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.anon.FileName
import typings.monacoEditor.monacoEditorInts.`0`
import typings.monacoEditor.monacoEditorInts.`1`
import typings.monacoEditor.monacoEditorInts.`2`
import typings.monacoEditor.monacoEditorInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticRelatedInformation extends StObject {
  
  /** Diagnostic category: warning = 0, error = 1, suggestion = 2, message = 3 */
  var category: `0` | `1` | `2` | `3`
  
  var code: Double
  
  /** TypeScriptWorker removes all but the `fileName` property to avoid serializing circular JSON structures. */
  var file: js.UndefOr[FileName] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var messageText: String | DiagnosticMessageChain
  
  var start: js.UndefOr[Double] = js.undefined
}
object DiagnosticRelatedInformation {
  
  inline def apply(category: `0` | `1` | `2` | `3`, code: Double, messageText: String | DiagnosticMessageChain): DiagnosticRelatedInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticRelatedInformation]
  }
  
  extension [Self <: DiagnosticRelatedInformation](x: Self) {
    
    inline def setCategory(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setFile(value: FileName): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMessageText(value: String | DiagnosticMessageChain): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
