package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColorPresentation extends js.Object {
  
  /**
    * An optional array of additional [text edits](#TextEdit) that are applied when
    * selecting this color presentation.
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.native
  
  /**
    * The label of this color presentation. It will be shown on the color
    * picker header. By default this is also the text that is inserted when selecting
    * this color presentation.
    */
  var label: String = js.native
  
  /**
    * An [edit](#TextEdit) which is applied to a document when selecting
    * this presentation for the color.
    */
  var textEdit: js.UndefOr[TextEdit] = js.native
}
object IColorPresentation {
  
  @scala.inline
  def apply(label: String): IColorPresentation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPresentation]
  }
  
  @scala.inline
  implicit class IColorPresentationOps[Self <: IColorPresentation] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTextEditsVarargs(value: TextEdit*): Self = this.set("additionalTextEdits", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = this.set("additionalTextEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalTextEdits: Self = this.set("additionalTextEdits", js.undefined)
    
    @scala.inline
    def setTextEdit(value: TextEdit): Self = this.set("textEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEdit: Self = this.set("textEdit", js.undefined)
  }
}
