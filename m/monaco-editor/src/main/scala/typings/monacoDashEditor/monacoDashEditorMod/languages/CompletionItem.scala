package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IMarkdownString
import typings.monacoDashEditor.monacoDashEditorMod.IRange
import typings.monacoDashEditor.monacoDashEditorMod.editor.ISingleEditOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionItem extends js.Object {
  /**
    * An optional array of additional text edits that are applied when
    * selecting this completion. Edits must not overlap with the main edit
    * nor with themselves.
    */
  var additionalTextEdits: js.UndefOr[js.Array[ISingleEditOperation]] = js.undefined
  /**
    * A command that should be run upon acceptance of this item.
    */
  var command: js.UndefOr[Command] = js.undefined
  /**
    * An optional set of characters that when pressed while this completion is active will accept it first and
    * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
    * characters will be ignored.
    */
  var commitCharacters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A human-readable string with additional information
    * about this item, like type or symbol information.
    */
  var detail: js.UndefOr[String] = js.undefined
  /**
    * A human-readable string that represents a doc-comment.
    */
  var documentation: js.UndefOr[String | IMarkdownString] = js.undefined
  /**
    * A string that should be used when filtering a set of
    * completion items. When `falsy` the [label](#CompletionItem.label)
    * is used.
    */
  var filterText: js.UndefOr[String] = js.undefined
  /**
    * A string or snippet that should be inserted in a document when selecting
    * this completion.
    * is used.
    */
  var insertText: String
  /**
    * Addition rules (as bitmask) that should be applied when inserting
    * this completion.
    */
  var insertTextRules: js.UndefOr[CompletionItemInsertTextRule] = js.undefined
  /**
    * The kind of this completion item. Based on the kind
    * an icon is chosen by the editor.
    */
  var kind: CompletionItemKind
  /**
    * The label of this completion item. By default
    * this is also the text that is inserted when selecting
    * this completion.
    */
  var label: String
  /**
    * Select this item when showing. *Note* that only one completion item can be selected and
    * that the editor decides which item that is. The rule is that the *first* item of those
    * that match best is selected.
    */
  var preselect: js.UndefOr[Boolean] = js.undefined
  /**
    * A range of text that should be replaced by this completion item.
    *
    * Defaults to a range from the start of the [current word](#TextDocument.getWordRangeAtPosition) to the
    * current position.
    *
    * *Note:* The range must be a [single line](#Range.isSingleLine) and it must
    * [contain](#Range.contains) the position at which completion has been [requested](#CompletionItemProvider.provideCompletionItems).
    */
  var range: IRange
  /**
    * A string that should be used when comparing this item
    * with other items. When `falsy` the [label](#CompletionItem.label)
    * is used.
    */
  var sortText: js.UndefOr[String] = js.undefined
  /**
    * A modifier to the `kind` which affect how the item
    * is rendered, e.g. Deprecated is rendered with a strikeout
    */
  var tags: js.UndefOr[js.Array[CompletionItemTag]] = js.undefined
}

object CompletionItem {
  @scala.inline
  def apply(
    insertText: String,
    kind: CompletionItemKind,
    label: String,
    range: IRange,
    additionalTextEdits: js.Array[ISingleEditOperation] = null,
    command: Command = null,
    commitCharacters: js.Array[String] = null,
    detail: String = null,
    documentation: String | IMarkdownString = null,
    filterText: String = null,
    insertTextRules: CompletionItemInsertTextRule = null,
    preselect: js.UndefOr[Boolean] = js.undefined,
    sortText: String = null,
    tags: js.Array[CompletionItemTag] = null
  ): CompletionItem = {
    val __obj = js.Dynamic.literal(insertText = insertText.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    if (additionalTextEdits != null) __obj.updateDynamic("additionalTextEdits")(additionalTextEdits.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (commitCharacters != null) __obj.updateDynamic("commitCharacters")(commitCharacters.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (filterText != null) __obj.updateDynamic("filterText")(filterText.asInstanceOf[js.Any])
    if (insertTextRules != null) __obj.updateDynamic("insertTextRules")(insertTextRules.asInstanceOf[js.Any])
    if (!js.isUndefined(preselect)) __obj.updateDynamic("preselect")(preselect.asInstanceOf[js.Any])
    if (sortText != null) __obj.updateDynamic("sortText")(sortText.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem]
  }
}

