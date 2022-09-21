package typings.monacoEditor.anon

import typings.monacoEditor.monacoEditorStrings.active
import typings.monacoEditor.monacoEditorStrings.always
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IGuidesOptions>> */
trait ReadonlyRequiredIGuidesOp extends StObject {
  
  val bracketPairs: Boolean | active
  
  val bracketPairsHorizontal: Boolean | active
  
  val highlightActiveBracketPair: Boolean
  
  val highlightActiveIndentation: Boolean | always
  
  val indentation: Boolean
}
object ReadonlyRequiredIGuidesOp {
  
  inline def apply(
    bracketPairs: Boolean | active,
    bracketPairsHorizontal: Boolean | active,
    highlightActiveBracketPair: Boolean,
    highlightActiveIndentation: Boolean | always,
    indentation: Boolean
  ): ReadonlyRequiredIGuidesOp = {
    val __obj = js.Dynamic.literal(bracketPairs = bracketPairs.asInstanceOf[js.Any], bracketPairsHorizontal = bracketPairsHorizontal.asInstanceOf[js.Any], highlightActiveBracketPair = highlightActiveBracketPair.asInstanceOf[js.Any], highlightActiveIndentation = highlightActiveIndentation.asInstanceOf[js.Any], indentation = indentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIGuidesOp]
  }
  
  extension [Self <: ReadonlyRequiredIGuidesOp](x: Self) {
    
    inline def setBracketPairs(value: Boolean | active): Self = StObject.set(x, "bracketPairs", value.asInstanceOf[js.Any])
    
    inline def setBracketPairsHorizontal(value: Boolean | active): Self = StObject.set(x, "bracketPairsHorizontal", value.asInstanceOf[js.Any])
    
    inline def setHighlightActiveBracketPair(value: Boolean): Self = StObject.set(x, "highlightActiveBracketPair", value.asInstanceOf[js.Any])
    
    inline def setHighlightActiveIndentation(value: Boolean | always): Self = StObject.set(x, "highlightActiveIndentation", value.asInstanceOf[js.Any])
    
    inline def setIndentation(value: Boolean): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
  }
}
