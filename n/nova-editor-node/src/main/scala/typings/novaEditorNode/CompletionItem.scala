package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/completion-item/
@js.native
trait CompletionItem extends js.Object {
  
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.native
  
  var color: js.UndefOr[Color] = js.native
  
  var commitChars: js.UndefOr[Charset] = js.native
  
  var detail: js.UndefOr[String] = js.native
  
  var documentation: js.UndefOr[String] = js.native
  
  var filterText: js.UndefOr[String] = js.native
  
  var insertText: js.UndefOr[String] = js.native
  
  var insertTextFormat: js.UndefOr[InsertTextFormat] = js.native
  
  var kind: CompletionItemKind = js.native
  
  var label: String = js.native
  
  var range: js.UndefOr[Range] = js.native
}
object CompletionItem {
  
  @scala.inline
  def apply(kind: CompletionItemKind, label: String): CompletionItem = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
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
    def setKind(value: CompletionItemKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTextEditsVarargs(value: TextEdit*): Self = this.set("additionalTextEdits", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = this.set("additionalTextEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalTextEdits: Self = this.set("additionalTextEdits", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCommitChars(value: Charset): Self = this.set("commitChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitChars: Self = this.set("commitChars", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setFilterText(value: String): Self = this.set("filterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterText: Self = this.set("filterText", js.undefined)
    
    @scala.inline
    def setInsertText(value: String): Self = this.set("insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
    
    @scala.inline
    def setInsertTextFormat(value: InsertTextFormat): Self = this.set("insertTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTextFormat: Self = this.set("insertTextFormat", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
