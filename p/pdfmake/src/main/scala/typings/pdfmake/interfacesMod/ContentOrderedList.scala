package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentOrderedList
  extends StObject
     with ContentBase
     with _Content {
  
  var ol: js.Array[OrderedListElement]
  
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  var separator: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[OrderedListType] = js.undefined
}
object ContentOrderedList {
  
  inline def apply(ol: js.Array[OrderedListElement]): ContentOrderedList = {
    val __obj = js.Dynamic.literal(ol = ol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOrderedList]
  }
  
  extension [Self <: ContentOrderedList](x: Self) {
    
    inline def setOl(value: js.Array[OrderedListElement]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
    
    inline def setOlVarargs(value: OrderedListElement*): Self = StObject.set(x, "ol", js.Array(value :_*))
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setSeparator(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: OrderedListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
