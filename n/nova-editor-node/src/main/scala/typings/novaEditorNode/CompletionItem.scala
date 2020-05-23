package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/completion-item/
trait CompletionItem extends js.Object {
  var commitCharacters: js.UndefOr[js.Array[String]] = js.undefined
  var detail: js.UndefOr[String] = js.undefined
  var documentation: js.UndefOr[String] = js.undefined
  var filterText: js.UndefOr[String] = js.undefined
  var insertText: js.UndefOr[String] = js.undefined
  var kind: CompletionItemKind
  var label: String
  var range: js.UndefOr[Range] = js.undefined
  var tokenize: Boolean
}

object CompletionItem {
  @scala.inline
  def apply(
    kind: CompletionItemKind,
    label: String,
    tokenize: Boolean,
    commitCharacters: js.Array[String] = null,
    detail: String = null,
    documentation: String = null,
    filterText: String = null,
    insertText: String = null,
    range: Range = null
  ): CompletionItem = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
    if (commitCharacters != null) __obj.updateDynamic("commitCharacters")(commitCharacters.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (filterText != null) __obj.updateDynamic("filterText")(filterText.asInstanceOf[js.Any])
    if (insertText != null) __obj.updateDynamic("insertText")(insertText.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem]
  }
}

