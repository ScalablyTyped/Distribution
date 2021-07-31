package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComputedEditorOptions extends StObject {
  
  def get[T /* <: EditorOption */](id: T): FindComputedEditorOptionValueById[T]
}
object IComputedEditorOptions {
  
  @scala.inline
  def apply(get: js.Any => FindComputedEditorOptionValueById[js.Any]): IComputedEditorOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[IComputedEditorOptions]
  }
  
  @scala.inline
  implicit class IComputedEditorOptionsMutableBuilder[Self <: IComputedEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: js.Any => FindComputedEditorOptionValueById[js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
