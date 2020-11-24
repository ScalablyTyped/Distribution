package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSymbol extends js.Object {
  
  var children: js.UndefOr[js.Array[DocumentSymbol]] = js.native
  
  var containerName: js.UndefOr[String] = js.native
  
  var detail: String = js.native
  
  var kind: SymbolKind = js.native
  
  var name: String = js.native
  
  var range: IRange = js.native
  
  var selectionRange: IRange = js.native
  
  var tags: js.Array[SymbolTag] = js.native
}
object DocumentSymbol {
  
  @scala.inline
  def apply(
    detail: String,
    kind: SymbolKind,
    name: String,
    range: IRange,
    selectionRange: IRange,
    tags: js.Array[SymbolTag]
  ): DocumentSymbol = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selectionRange = selectionRange.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbol]
  }
  
  @scala.inline
  implicit class DocumentSymbolOps[Self <: DocumentSymbol] (val x: Self) extends AnyVal {
    
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
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: SymbolKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: IRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRange(value: IRange): Self = this.set("selectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: SymbolTag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[SymbolTag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: DocumentSymbol*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[DocumentSymbol]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
  }
}
