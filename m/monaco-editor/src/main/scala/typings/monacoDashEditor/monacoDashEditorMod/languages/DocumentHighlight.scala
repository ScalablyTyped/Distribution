package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentHighlight extends js.Object {
  /**
    * The highlight kind, default is [text](#DocumentHighlightKind.Text).
    */
  var kind: js.UndefOr[DocumentHighlightKind] = js.undefined
  /**
    * The range this highlight applies to.
    */
  var range: IRange
}

object DocumentHighlight {
  @scala.inline
  def apply(range: IRange, kind: DocumentHighlightKind = null): DocumentHighlight = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHighlight]
  }
}

