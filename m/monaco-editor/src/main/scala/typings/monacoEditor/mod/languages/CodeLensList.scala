package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeLensList extends StObject {
  
  def dispose(): Unit = js.native
  
  var lenses: js.Array[CodeLens] = js.native
}
object CodeLensList {
  
  @scala.inline
  def apply(dispose: () => Unit, lenses: js.Array[CodeLens]): CodeLensList = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), lenses = lenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLensList]
  }
  
  @scala.inline
  implicit class CodeLensListMutableBuilder[Self <: CodeLensList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLenses(value: js.Array[CodeLens]): Self = StObject.set(x, "lenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLensesVarargs(value: CodeLens*): Self = StObject.set(x, "lenses", js.Array(value :_*))
  }
}
