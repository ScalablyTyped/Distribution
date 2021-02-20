package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentOrderedList
  extends ContentBase
     with _Content {
  
  var ol: js.Array[OrderedListElement] = js.native
  
  var reversed: js.UndefOr[Boolean] = js.native
  
  var separator: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[OrderedListType] = js.native
}
object ContentOrderedList {
  
  @scala.inline
  def apply(ol: js.Array[OrderedListElement]): ContentOrderedList = {
    val __obj = js.Dynamic.literal(ol = ol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOrderedList]
  }
  
  @scala.inline
  implicit class ContentOrderedListMutableBuilder[Self <: ContentOrderedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOl(value: js.Array[OrderedListElement]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOlVarargs(value: OrderedListElement*): Self = StObject.set(x, "ol", js.Array(value :_*))
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    @scala.inline
    def setSeparator(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: OrderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
