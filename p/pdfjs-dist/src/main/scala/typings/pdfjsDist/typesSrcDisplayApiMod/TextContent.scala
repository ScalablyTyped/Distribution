package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextContent extends StObject {
  
  /**
    * - Array of
    * {@link TextItem } and {@link TextMarkedContent } objects. TextMarkedContent
    * items are included when includeMarkedContent is true.
    */
  var items: js.Array[TextItem | TextMarkedContent]
  
  /**
    * - {@link TextStyle } objects,
    * indexed by font name.
    */
  var styles: StringDictionary[TextStyle]
}
object TextContent {
  
  inline def apply(items: js.Array[TextItem | TextMarkedContent], styles: StringDictionary[TextStyle]): TextContent = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextContent] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[TextItem | TextMarkedContent]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (TextItem | TextMarkedContent)*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setStyles(value: StringDictionary[TextStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
