package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.editor.EndOfLineSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEdit extends StObject {
  
  var eol: js.UndefOr[EndOfLineSequence] = js.undefined
  
  var range: IRange
  
  var text: String
}
object TextEdit {
  
  inline def apply(range: IRange, text: String): TextEdit = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEdit]
  }
  
  extension [Self <: TextEdit](x: Self) {
    
    inline def setEol(value: EndOfLineSequence): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
