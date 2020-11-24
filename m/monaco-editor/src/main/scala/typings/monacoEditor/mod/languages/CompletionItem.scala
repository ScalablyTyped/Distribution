package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.Insert
import typings.monacoEditor.mod.IMarkdownString
import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.editor.ISingleEditOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionItem extends js.Object {
  
  /**
    * An optional array of additional text edits that are applied when
    * selecting this completion. Edits must not overlap with the main edit
    * nor with themselves.
    */
  var additionalTextEdits: js.UndefOr[js.Array[ISingleEditOperation]] = js.native
  
  /**
    * A command that should be run upon acceptance of this item.
    */
  var command: js.UndefOr[Command] = js.native
  
  /**
    * An optional set of characters that when pressed while this completion is active will accept it first and
    * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
    * characters will be ignored.
    */
  var commitCharacters: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A human-readable string with additional information
    * about this item, like type or symbol information.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * A human-readable string that represents a doc-comment.
    */
  var documentation: js.UndefOr[String | IMarkdownString] = js.native
  
  /**
    * A string that should be used when filtering a set of
    * completion items. When `falsy` the [label](#CompletionItem.label)
    * is used.
    */
  var filterText: js.UndefOr[String] = js.native
  
  /**
    * A string or snippet that should be inserted in a document when selecting
    * this completion.
    * is used.
    */
  var insertText: String = js.native
  
  /**
    * Addition rules (as bitmask) that should be applied when inserting
    * this completion.
    */
  var insertTextRules: js.UndefOr[CompletionItemInsertTextRule] = js.native
  
  /**
    * The kind of this completion item. Based on the kind
    * an icon is chosen by the editor.
    */
  var kind: CompletionItemKind = js.native
  
  /**
    * The label of this completion item. By default
    * this is also the text that is inserted when selecting
    * this completion.
    */
  var label: String | CompletionItemLabel = js.native
  
  /**
    * Select this item when showing. *Note* that only one completion item can be selected and
    * that the editor decides which item that is. The rule is that the *first* item of those
    * that match best is selected.
    */
  var preselect: js.UndefOr[Boolean] = js.native
  
  /**
    * A range of text that should be replaced by this completion item.
    *
    * Defaults to a range from the start of the [current word](#TextDocument.getWordRangeAtPosition) to the
    * current position.
    *
    * *Note:* The range must be a [single line](#Range.isSingleLine) and it must
    * [contain](#Range.contains) the position at which completion has been [requested](#CompletionItemProvider.provideCompletionItems).
    */
  var range: IRange | Insert = js.native
  
  /**
    * A string that should be used when comparing this item
    * with other items. When `falsy` the [label](#CompletionItem.label)
    * is used.
    */
  var sortText: js.UndefOr[String] = js.native
  
  /**
    * A modifier to the `kind` which affect how the item
    * is rendered, e.g. Deprecated is rendered with a strikeout
    */
  var tags: js.UndefOr[js.Array[CompletionItemTag]] = js.native
}
object CompletionItem {
  
  @scala.inline
  def apply(
    insertText: String,
    kind: CompletionItemKind,
    label: String | CompletionItemLabel,
    range: IRange | Insert
  ): CompletionItem = {
    val __obj = js.Dynamic.literal(insertText = insertText.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem]
  }
  
  @scala.inline
  implicit class CompletionItemOps[Self <: CompletionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsertText(value: String): Self = this.set("insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: CompletionItemKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String | CompletionItemLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: IRange | Insert): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTextEditsVarargs(value: ISingleEditOperation*): Self = this.set("additionalTextEdits", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalTextEdits(value: js.Array[ISingleEditOperation]): Self = this.set("additionalTextEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalTextEdits: Self = this.set("additionalTextEdits", js.undefined)
    
    @scala.inline
    def setCommand(value: Command): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setCommitCharactersVarargs(value: String*): Self = this.set("commitCharacters", js.Array(value :_*))
    
    @scala.inline
    def setCommitCharacters(value: js.Array[String]): Self = this.set("commitCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitCharacters: Self = this.set("commitCharacters", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String | IMarkdownString): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setFilterText(value: String): Self = this.set("filterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterText: Self = this.set("filterText", js.undefined)
    
    @scala.inline
    def setInsertTextRules(value: CompletionItemInsertTextRule): Self = this.set("insertTextRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTextRules: Self = this.set("insertTextRules", js.undefined)
    
    @scala.inline
    def setPreselect(value: Boolean): Self = this.set("preselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreselect: Self = this.set("preselect", js.undefined)
    
    @scala.inline
    def setSortText(value: String): Self = this.set("sortText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortText: Self = this.set("sortText", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: CompletionItemTag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[CompletionItemTag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
