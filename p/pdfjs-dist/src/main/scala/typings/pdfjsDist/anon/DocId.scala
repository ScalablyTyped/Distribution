package typings.pdfjsDist.anon

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocId extends StObject {
  
  var docId: Any
  
  var ownerDocument: js.UndefOr[Document] = js.undefined
}
object DocId {
  
  inline def apply(docId: Any): DocId = {
    val __obj = js.Dynamic.literal(docId = docId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocId] (val x: Self) extends AnyVal {
    
    inline def setDocId(value: Any): Self = StObject.set(x, "docId", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
  }
}
