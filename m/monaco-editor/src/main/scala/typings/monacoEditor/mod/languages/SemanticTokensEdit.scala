package typings.monacoEditor.mod.languages

import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensEdit extends StObject {
  
  val data: js.UndefOr[Uint32Array] = js.undefined
  
  val deleteCount: Double
  
  val start: Double
}
object SemanticTokensEdit {
  
  inline def apply(deleteCount: Double, start: Double): SemanticTokensEdit = {
    val __obj = js.Dynamic.literal(deleteCount = deleteCount.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdit]
  }
  
  extension [Self <: SemanticTokensEdit](x: Self) {
    
    inline def setData(value: Uint32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDeleteCount(value: Double): Self = StObject.set(x, "deleteCount", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
