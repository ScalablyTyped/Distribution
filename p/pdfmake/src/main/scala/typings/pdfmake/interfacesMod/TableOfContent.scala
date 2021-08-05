package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOfContent extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var numberStyle: js.UndefOr[String | js.Array[String] | Style] = js.undefined
  
  var textMargin: js.UndefOr[Margins] = js.undefined
  
  var textStyle: js.UndefOr[String | js.Array[String] | Style] = js.undefined
  
  var title: js.UndefOr[Content] = js.undefined
}
object TableOfContent {
  
  inline def apply(): TableOfContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOfContent]
  }
  
  extension [Self <: TableOfContent](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNumberStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
    
    inline def setNumberStyleUndefined: Self = StObject.set(x, "numberStyle", js.undefined)
    
    inline def setNumberStyleVarargs(value: String*): Self = StObject.set(x, "numberStyle", js.Array(value :_*))
    
    inline def setTextMargin(value: Margins): Self = StObject.set(x, "textMargin", value.asInstanceOf[js.Any])
    
    inline def setTextMarginUndefined: Self = StObject.set(x, "textMargin", js.undefined)
    
    inline def setTextStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTextStyleVarargs(value: String*): Self = StObject.set(x, "textStyle", js.Array(value :_*))
    
    inline def setTitle(value: Content): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
