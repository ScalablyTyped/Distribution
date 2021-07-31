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
  
  @scala.inline
  def apply(text: String | ContentTocItem, tocItem: Boolean | String | js.Array[String]): ContentTocItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], tocItem = tocItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTocItem]
  }
  
  @scala.inline
  implicit class ContentTocItemMutableBuilder[Self <: ContentTocItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String | ContentTocItem): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocItem(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "tocItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocItemVarargs(value: String*): Self = StObject.set(x, "tocItem", js.Array(value :_*))
    
    @scala.inline
    def setTocMargin(value: Margins): Self = StObject.set(x, "tocMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocMarginUndefined: Self = StObject.set(x, "tocMargin", js.undefined)
    
    @scala.inline
    def setTocNumberStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "tocNumberStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocNumberStyleUndefined: Self = StObject.set(x, "tocNumberStyle", js.undefined)
    
    @scala.inline
    def setTocNumberStyleVarargs(value: String*): Self = StObject.set(x, "tocNumberStyle", js.Array(value :_*))
    
    @scala.inline
    def setTocStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "tocStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocStyleUndefined: Self = StObject.set(x, "tocStyle", js.undefined)
    
    @scala.inline
    def setTocStyleVarargs(value: String*): Self = StObject.set(x, "tocStyle", js.Array(value :_*))
  }
}
