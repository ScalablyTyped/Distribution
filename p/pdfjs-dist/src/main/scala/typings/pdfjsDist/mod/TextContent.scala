package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextContent extends StObject {
  
  var items: js.Array[TextContentItem] = js.native
  
  var styles: js.Any = js.native
}
object TextContent {
  
  @scala.inline
  def apply(items: js.Array[TextContentItem], styles: js.Any): TextContent = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextContent]
  }
  
  @scala.inline
  implicit class TextContentMutableBuilder[Self <: TextContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TextContentItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: TextContentItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
