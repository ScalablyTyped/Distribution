package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.editor.EndOfLineSequence
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
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEdit]
  }
}

