package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentUnorderedList
  extends StObject
     with ContentBase
     with _Content {
  
  var `type`: js.UndefOr[UnorderedListType] = js.undefined
  
  var ul: js.Array[UnorderedListElement]
}
object ContentUnorderedList {
  
  inline def apply(ul: js.Array[UnorderedListElement]): ContentUnorderedList = {
    val __obj = js.Dynamic.literal(ul = ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentUnorderedList]
  }
  
  extension [Self <: ContentUnorderedList](x: Self) {
    
    inline def setType(value: UnorderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUl(value: js.Array[UnorderedListElement]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    
    inline def setUlVarargs(value: UnorderedListElement*): Self = StObject.set(x, "ul", js.Array(value :_*))
  }
}
