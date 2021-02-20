package typings.monacoEditor.mod.languages

import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokens extends StObject {
  
  val data: Uint32Array = js.native
  
  val resultId: js.UndefOr[String] = js.native
}
object SemanticTokens {
  
  @scala.inline
  def apply(data: Uint32Array): SemanticTokens = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokens]
  }
  
  @scala.inline
  implicit class SemanticTokensMutableBuilder[Self <: SemanticTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Uint32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
  }
}
