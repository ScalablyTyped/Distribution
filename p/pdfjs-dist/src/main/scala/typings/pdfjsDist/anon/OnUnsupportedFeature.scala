package typings.pdfjsDist.anon

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnUnsupportedFeature extends StObject {
  
  var onUnsupportedFeature: Any
  
  var ownerDocument: js.UndefOr[Document] = js.undefined
  
  var styleElement: js.UndefOr[Null] = js.undefined
}
object OnUnsupportedFeature {
  
  inline def apply(onUnsupportedFeature: Any): OnUnsupportedFeature = {
    val __obj = js.Dynamic.literal(onUnsupportedFeature = onUnsupportedFeature.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUnsupportedFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnUnsupportedFeature] (val x: Self) extends AnyVal {
    
    inline def setOnUnsupportedFeature(value: Any): Self = StObject.set(x, "onUnsupportedFeature", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
  }
}
