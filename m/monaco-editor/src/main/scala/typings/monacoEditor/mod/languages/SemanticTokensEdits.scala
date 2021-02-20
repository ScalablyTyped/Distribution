package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensEdits extends StObject {
  
  val edits: js.Array[SemanticTokensEdit] = js.native
  
  val resultId: js.UndefOr[String] = js.native
}
object SemanticTokensEdits {
  
  @scala.inline
  def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensEdits = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdits]
  }
  
  @scala.inline
  implicit class SemanticTokensEditsMutableBuilder[Self <: SemanticTokensEdits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdits(value: js.Array[SemanticTokensEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditsVarargs(value: SemanticTokensEdit*): Self = StObject.set(x, "edits", js.Array(value :_*))
    
    @scala.inline
    def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
  }
}
