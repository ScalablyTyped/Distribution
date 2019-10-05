package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionList extends js.Object {
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var incomplete: js.UndefOr[Boolean] = js.undefined
  var suggestions: js.Array[CompletionItem]
}

object CompletionList {
  @scala.inline
  def apply(
    suggestions: js.Array[CompletionItem],
    dispose: () => Unit = null,
    incomplete: js.UndefOr[Boolean] = js.undefined
  ): CompletionList = {
    val __obj = js.Dynamic.literal(suggestions = suggestions)
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction0(dispose))
    if (!js.isUndefined(incomplete)) __obj.updateDynamic("incomplete")(incomplete)
    __obj.asInstanceOf[CompletionList]
  }
}

