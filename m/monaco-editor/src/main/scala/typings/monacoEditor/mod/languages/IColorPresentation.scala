package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColorPresentation extends StObject {
  
  /**
    * An optional array of additional {@link TextEdit text edits} that are applied when
    * selecting this color presentation.
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.undefined
  
  /**
    * The label of this color presentation. It will be shown on the color
    * picker header. By default this is also the text that is inserted when selecting
    * this color presentation.
    */
  var label: String
  
  /**
    * An {@link TextEdit edit} which is applied to a document when selecting
    * this presentation for the color.
    */
  var textEdit: js.UndefOr[TextEdit] = js.undefined
}
object IColorPresentation {
  
  inline def apply(label: String): IColorPresentation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPresentation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IColorPresentation] (val x: Self) extends AnyVal {
    
    inline def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    inline def setAdditionalTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "additionalTextEdits", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setTextEdit(value: TextEdit): Self = StObject.set(x, "textEdit", value.asInstanceOf[js.Any])
    
    inline def setTextEditUndefined: Self = StObject.set(x, "textEdit", js.undefined)
  }
}
