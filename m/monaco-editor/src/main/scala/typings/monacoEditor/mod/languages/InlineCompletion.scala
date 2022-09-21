package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.Snippet
import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.editor.ISingleEditOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineCompletion extends StObject {
  
  /**
    * An optional array of additional text edits that are applied when
    * selecting this completion. Edits must not overlap with the main edit
    * nor with themselves.
    */
  val additionalTextEdits: js.UndefOr[js.Array[ISingleEditOperation]] = js.undefined
  
  val command: js.UndefOr[Command] = js.undefined
  
  /**
    * If set to `true`, unopened closing brackets are removed and unclosed opening brackets are closed.
    * Defaults to `false`.
    */
  val completeBracketPairs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A text that is used to decide if this inline completion should be shown.
    * An inline completion is shown if the text to replace is a subword of the filter text.
    */
  val filterText: js.UndefOr[String] = js.undefined
  
  /**
    * The text to insert.
    * If the text contains a line break, the range must end at the end of a line.
    * If existing text should be replaced, the existing text must be a prefix of the text to insert.
    *
    * The text can also be a snippet. In that case, a preview with default parameters is shown.
    * When accepting the suggestion, the full snippet is inserted.
    */
  val insertText: String | Snippet
  
  /**
    * The range to replace.
    * Must begin and end on the same line.
    */
  val range: js.UndefOr[IRange] = js.undefined
}
object InlineCompletion {
  
  inline def apply(insertText: String | Snippet): InlineCompletion = {
    val __obj = js.Dynamic.literal(insertText = insertText.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineCompletion]
  }
  
  extension [Self <: InlineCompletion](x: Self) {
    
    inline def setAdditionalTextEdits(value: js.Array[ISingleEditOperation]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    inline def setAdditionalTextEditsVarargs(value: ISingleEditOperation*): Self = StObject.set(x, "additionalTextEdits", js.Array(value*))
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCompleteBracketPairs(value: Boolean): Self = StObject.set(x, "completeBracketPairs", value.asInstanceOf[js.Any])
    
    inline def setCompleteBracketPairsUndefined: Self = StObject.set(x, "completeBracketPairs", js.undefined)
    
    inline def setFilterText(value: String): Self = StObject.set(x, "filterText", value.asInstanceOf[js.Any])
    
    inline def setFilterTextUndefined: Self = StObject.set(x, "filterText", js.undefined)
    
    inline def setInsertText(value: String | Snippet): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
