package typings.pdfjsDist.anon

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleElement extends StObject {
  
  var ownerDocument: js.UndefOr[Document] = js.undefined
  
  var styleElement: js.UndefOr[Null] = js.undefined
}
object StyleElement {
  
  inline def apply(): StyleElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleElement] (val x: Self) extends AnyVal {
    
    inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
  }
}
