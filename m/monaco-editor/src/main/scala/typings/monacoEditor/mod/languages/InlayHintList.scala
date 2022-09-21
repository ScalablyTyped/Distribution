package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintList extends StObject {
  
  def dispose(): Unit
  
  var hints: js.Array[InlayHint]
}
object InlayHintList {
  
  inline def apply(dispose: () => Unit, hints: js.Array[InlayHint]): InlayHintList = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), hints = hints.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlayHintList]
  }
  
  extension [Self <: InlayHintList](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setHints(value: js.Array[InlayHint]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsVarargs(value: InlayHint*): Self = StObject.set(x, "hints", js.Array(value*))
  }
}
