package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColorPresentation extends StObject {
  
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
  implicit class IColorPresentationMutableBuilder[Self <: IColorPresentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    @scala.inline
    def setAdditionalTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "additionalTextEdits", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEdit(value: TextEdit): Self = StObject.set(x, "textEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEditUndefined: Self = StObject.set(x, "textEdit", js.undefined)
  }
}
