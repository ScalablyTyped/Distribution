package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPresentation extends js.Object {
  /**
    * An optional array of additional [text edits](#TextEdit) that are applied when
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
    * An [edit](#TextEdit) which is applied to a document when selecting
    * this presentation for the color.
    */
  var textEdit: js.UndefOr[TextEdit] = js.undefined
}

object IColorPresentation {
  @scala.inline
  def apply(label: String, additionalTextEdits: js.Array[TextEdit] = null, textEdit: TextEdit = null): IColorPresentation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (additionalTextEdits != null) __obj.updateDynamic("additionalTextEdits")(additionalTextEdits.asInstanceOf[js.Any])
    if (textEdit != null) __obj.updateDynamic("textEdit")(textEdit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPresentation]
  }
}

