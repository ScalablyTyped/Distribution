package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComputedEditorOptions extends js.Object {
  
  def get[T /* <: EditorOption */](id: T): FindComputedEditorOptionValueById[T] = js.native
}
object IComputedEditorOptions {
  
  @scala.inline
  def apply(get: js.Any => FindComputedEditorOptionValueById[js.Any]): IComputedEditorOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[IComputedEditorOptions]
  }
  
  @scala.inline
  implicit class IComputedEditorOptionsOps[Self <: IComputedEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: js.Any => FindComputedEditorOptionValueById[js.Any]): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
