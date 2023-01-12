package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComputedEditorOptions extends StObject {
  
  def get[T /* <: EditorOption */](id: T): FindComputedEditorOptionValueById[T]
}
object IComputedEditorOptions {
  
  inline def apply(get: Any => FindComputedEditorOptionValueById[Any]): IComputedEditorOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[IComputedEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IComputedEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Any => FindComputedEditorOptionValueById[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
