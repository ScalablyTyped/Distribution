package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSymbol extends StObject {
  
  var children: js.UndefOr[js.Array[DocumentSymbol]] = js.undefined
  
  var containerName: js.UndefOr[String] = js.undefined
  
  var detail: String
  
  var kind: SymbolKind
  
  var name: String
  
  var range: IRange
  
  var selectionRange: IRange
  
  var tags: js.Array[SymbolTag]
}
object DocumentSymbol {
  
  inline def apply(
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
  
  extension [Self <: DocumentSymbol](x: Self) {
    
    inline def setChildren(value: js.Array[DocumentSymbol]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: DocumentSymbol*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setKind(value: SymbolKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSelectionRange(value: IRange): Self = StObject.set(x, "selectionRange", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[SymbolTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: SymbolTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
