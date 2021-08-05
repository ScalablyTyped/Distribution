package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextContent extends StObject {
  
  var items: js.Array[TextContentItem]
  
  var styles: js.Any
}
object TextContent {
  
  inline def apply(items: js.Array[TextContentItem], styles: js.Any): TextContent = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextContent]
  }
  
  extension [Self <: TextContent](x: Self) {
    
    inline def setItems(value: js.Array[TextContentItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: TextContentItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
