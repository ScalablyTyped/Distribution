package typings.pdfjsDist.anon

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerDocument extends StObject {
  
  var ownerDocument: js.UndefOr[Document] = js.undefined
}
object OwnerDocument {
  
  inline def apply(): OwnerDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnerDocument]
  }
  
  extension [Self <: OwnerDocument](x: Self) {
    
    inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
  }
}
