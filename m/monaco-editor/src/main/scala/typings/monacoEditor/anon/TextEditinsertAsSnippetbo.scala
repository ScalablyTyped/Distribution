package typings.monacoEditor.anon

import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.editor.EndOfLineSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined monaco-editor.monaco-editor.languages.TextEdit & {  insertAsSnippet :boolean | undefined} */
trait TextEditinsertAsSnippetbo extends StObject {
  
  var eol: js.UndefOr[EndOfLineSequence] = js.undefined
  
  var insertAsSnippet: js.UndefOr[Boolean] = js.undefined
  
  var range: IRange
  
  var text: String
}
object TextEditinsertAsSnippetbo {
  
  inline def apply(range: IRange, text: String): TextEditinsertAsSnippetbo = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditinsertAsSnippetbo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEditinsertAsSnippetbo] (val x: Self) extends AnyVal {
    
    inline def setEol(value: EndOfLineSequence): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
    
    inline def setInsertAsSnippet(value: Boolean): Self = StObject.set(x, "insertAsSnippet", value.asInstanceOf[js.Any])
    
    inline def setInsertAsSnippetUndefined: Self = StObject.set(x, "insertAsSnippet", js.undefined)
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
