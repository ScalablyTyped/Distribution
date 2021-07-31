package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorOption[K1 /* <: EditorOption */, V] extends StObject {
  
  var defaultValue: V
  
  val id: K1
  
  val name: String
}
object IEditorOption {
  
  @scala.inline
  def apply[K1 /* <: EditorOption */, V](defaultValue: V, id: K1, name: String): IEditorOption[K1, V] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorOption[K1, V]]
  }
  
  @scala.inline
  implicit class IEditorOptionMutableBuilder[Self <: IEditorOption[?, ?], K1 /* <: EditorOption */, V] (val x: Self & (IEditorOption[K1, V])) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: V): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: K1): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
