package typings
package monacoDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EolRange
  extends monacoDashEditorLib.monacoDashEditorMod.languagesNs.TextEdit {
  var eol: monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLineSequence
  var range: js.UndefOr[scala.Nothing]
  var text: js.UndefOr[scala.Nothing]
}

object Anon_EolRange {
  @scala.inline
  def apply(
    eol: monacoDashEditorLib.monacoDashEditorMod.editorNs.EndOfLineSequence,
    range: js.UndefOr[scala.Nothing] = js.undefined,
    text: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_EolRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eol")(eol)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_EolRange]
  }
}

