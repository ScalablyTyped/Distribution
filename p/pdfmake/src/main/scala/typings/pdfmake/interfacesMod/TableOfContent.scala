package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOfContent extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var numberStyle: js.UndefOr[String | js.Array[String] | Style] = js.native
  
  var textMargin: js.UndefOr[Margins] = js.native
  
  var textStyle: js.UndefOr[String | js.Array[String] | Style] = js.native
  
  var title: js.UndefOr[Content] = js.native
}
object TableOfContent {
  
  @scala.inline
  def apply(): TableOfContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOfContent]
  }
  
  @scala.inline
  implicit class TableOfContentMutableBuilder[Self <: TableOfContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNumberStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberStyleUndefined: Self = StObject.set(x, "numberStyle", js.undefined)
    
    @scala.inline
    def setNumberStyleVarargs(value: String*): Self = StObject.set(x, "numberStyle", js.Array(value :_*))
    
    @scala.inline
    def setTextMargin(value: Margins): Self = StObject.set(x, "textMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMarginUndefined: Self = StObject.set(x, "textMargin", js.undefined)
    
    @scala.inline
    def setTextStyle(value: String | js.Array[String] | Style): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleVarargs(value: String*): Self = StObject.set(x, "textStyle", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: Content): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
