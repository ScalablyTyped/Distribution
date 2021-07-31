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
  
  @scala.inline
  def apply(ul: js.Array[UnorderedListElement]): ContentUnorderedList = {
    val __obj = js.Dynamic.literal(ul = ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentUnorderedList]
  }
  
  @scala.inline
  implicit class ContentUnorderedListMutableBuilder[Self <: ContentUnorderedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: UnorderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUl(value: js.Array[UnorderedListElement]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUlVarargs(value: UnorderedListElement*): Self = StObject.set(x, "ul", js.Array(value :_*))
  }
}
