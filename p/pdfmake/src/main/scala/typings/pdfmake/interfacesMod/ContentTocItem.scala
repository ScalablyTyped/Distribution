package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTocItem
  extends StObject
     with ContentBase
     with _Content {
  
  var text: String | ContentTocItem
  
  var tocItem: Boolean | String | js.Array[String]
  
  var tocMargin: js.UndefOr[Margins] = js.undefined
  
  var tocNumberStyle: js.UndefOr[String | js.Array[String] | Style] = js.undefined
  
  var tocStyle: js.UndefOr[String | js.Array[String] | Style] = js.undefined
}
object ContentTocItem {
  
  inline def apply(text: String | ContentTocItem, tocItem: Boolean | String | js.Array[String]): ContentTocItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], tocItem = tocItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTocItem]
  }
  
  extension [Self <: ContentTocItem](x: Self) {
    
    inline def setText(value: String | ContentTocItem): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTocItem(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "tocItem", value.asInstanceOf[js.Any])
    
    inline def setTocItemVarargs(value: String*): Self = StObject.set(x, "tocItem", js.Array(value :_*))
    
    inline def setTocMargin(value: Margins): Self = StObject.set(x, "tocMargin", value.asInstanceOf[js.Any])
    
    inline def setTocMarginUndefined: Self = StObject.set(x, "tocMargin", js.undefined)
    
    inline def setTocNumberStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "tocNumberStyle", value.asInstanceOf[js.Any])
    
    inline def setTocNumberStyleUndefined: Self = StObject.set(x, "tocNumberStyle", js.undefined)
    
    inline def setTocNumberStyleVarargs(value: String*): Self = StObject.set(x, "tocNumberStyle", js.Array(value :_*))
    
    inline def setTocStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "tocStyle", value.asInstanceOf[js.Any])
    
    inline def setTocStyleUndefined: Self = StObject.set(x, "tocStyle", js.undefined)
    
    inline def setTocStyleVarargs(value: String*): Self = StObject.set(x, "tocStyle", js.Array(value :_*))
  }
}
