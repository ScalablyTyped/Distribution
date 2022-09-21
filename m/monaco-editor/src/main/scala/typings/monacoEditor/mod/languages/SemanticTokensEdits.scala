package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensEdits extends StObject {
  
  val edits: js.Array[SemanticTokensEdit]
  
  val resultId: js.UndefOr[String] = js.undefined
}
object SemanticTokensEdits {
  
  inline def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensEdits = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdits]
  }
  
  extension [Self <: SemanticTokensEdits](x: Self) {
    
    inline def setEdits(value: js.Array[SemanticTokensEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsVarargs(value: SemanticTokensEdit*): Self = StObject.set(x, "edits", js.Array(value*))
    
    inline def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    
    inline def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
  }
}
