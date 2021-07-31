package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/completion-item/
trait CompletionItem extends StObject {
  
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.undefined
  
  var color: js.UndefOr[Color] = js.undefined
  
  var commitChars: js.UndefOr[Charset] = js.undefined
  
  var detail: js.UndefOr[String] = js.undefined
  
  var documentation: js.UndefOr[String] = js.undefined
  
  var filterText: js.UndefOr[String] = js.undefined
  
  var insertText: js.UndefOr[String] = js.undefined
  
  var insertTextFormat: js.UndefOr[InsertTextFormat] = js.undefined
  
  var kind: CompletionItemKind
  
  var label: String
  
  var range: js.UndefOr[Range] = js.undefined
}
object CompletionItem {
  
  @scala.inline
  def apply(kind: CompletionItemKind, label: String): CompletionItem = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem]
  }
  
  @scala.inline
  implicit class CompletionItemMutableBuilder[Self <: CompletionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    @scala.inline
    def setAdditionalTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "additionalTextEdits", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCommitChars(value: Charset): Self = StObject.set(x, "commitChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitCharsUndefined: Self = StObject.set(x, "commitChars", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setFilterText(value: String): Self = StObject.set(x, "filterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTextUndefined: Self = StObject.set(x, "filterText", js.undefined)
    
    @scala.inline
    def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTextFormat(value: InsertTextFormat): Self = StObject.set(x, "insertTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTextFormatUndefined: Self = StObject.set(x, "insertTextFormat", js.undefined)
    
    @scala.inline
    def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    @scala.inline
    def setKind(value: CompletionItemKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
