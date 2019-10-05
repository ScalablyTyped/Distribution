package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IRange
import typings.monacoDashEditor.monacoDashEditorMod.editor.EndOfLineSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEdit extends js.Object {
  var eol: js.UndefOr[EndOfLineSequence] = js.undefined
  var range: IRange
  var text: String
}

object TextEdit {
  @scala.inline
  def apply(range: IRange, text: String, eol: EndOfLineSequence = null): TextEdit = {
    val __obj = js.Dynamic.literal(range = range, text = text)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    __obj.asInstanceOf[TextEdit]
  }
}

