package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.Insert
import typings.monacoEditor.mod.IMarkdownString
import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.editor.ISingleEditOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionItem extends StObject {
  
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
  var label: String | CompletionItemLabel
  
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
  var range: IRange | Insert
  
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
  
  inline def apply(
    insertText: String,
    kind: CompletionItemKind,
    label: String | CompletionItemLabel,
    range: IRange | Insert
  ): CompletionItem = {
    val __obj = js.Dynamic.literal(insertText = insertText.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem]
  }
  
  extension [Self <: CompletionItem](x: Self) {
    
    inline def setAdditionalTextEdits(value: js.Array[ISingleEditOperation]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    inline def setAdditionalTextEditsVarargs(value: ISingleEditOperation*): Self = StObject.set(x, "additionalTextEdits", js.Array(value :_*))
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommitCharacters(value: js.Array[String]): Self = StObject.set(x, "commitCharacters", value.asInstanceOf[js.Any])
    
    inline def setCommitCharactersUndefined: Self = StObject.set(x, "commitCharacters", js.undefined)
    
    inline def setCommitCharactersVarargs(value: String*): Self = StObject.set(x, "commitCharacters", js.Array(value :_*))
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDocumentation(value: String | IMarkdownString): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setFilterText(value: String): Self = StObject.set(x, "filterText", value.asInstanceOf[js.Any])
    
    inline def setFilterTextUndefined: Self = StObject.set(x, "filterText", js.undefined)
    
    inline def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setInsertTextRules(value: CompletionItemInsertTextRule): Self = StObject.set(x, "insertTextRules", value.asInstanceOf[js.Any])
    
    inline def setInsertTextRulesUndefined: Self = StObject.set(x, "insertTextRules", js.undefined)
    
    inline def setKind(value: CompletionItemKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String | CompletionItemLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPreselect(value: Boolean): Self = StObject.set(x, "preselect", value.asInstanceOf[js.Any])
    
    inline def setPreselectUndefined: Self = StObject.set(x, "preselect", js.undefined)
    
    inline def setRange(value: IRange | Insert): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSortText(value: String): Self = StObject.set(x, "sortText", value.asInstanceOf[js.Any])
    
    inline def setSortTextUndefined: Self = StObject.set(x, "sortText", js.undefined)
    
    inline def setTags(value: js.Array[CompletionItemTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: CompletionItemTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
