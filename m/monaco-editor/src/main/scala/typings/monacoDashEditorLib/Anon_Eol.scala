package typings
package monacoDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Eol
  extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.TextEdit {
  var eol: js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLineSequence] = js.undefined
  var range: monacoDashEditorLib.monacoDashEditorMod.IRange
  var text: java.lang.String
}

object Anon_Eol {
  @scala.inline
  def apply(
    range: monacoDashEditorLib.monacoDashEditorMod.IRange,
    text: java.lang.String,
    eol: monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLineSequence = null
  ): Anon_Eol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("text")(text)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    __obj.asInstanceOf[Anon_Eol]
  }
}

