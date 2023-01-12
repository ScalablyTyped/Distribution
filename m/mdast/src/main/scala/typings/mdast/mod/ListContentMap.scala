package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContentMap extends StObject {
  
  var listItem: ListItem
}
object ListContentMap {
  
  inline def apply(listItem: ListItem): ListContentMap = {
    val __obj = js.Dynamic.literal(listItem = listItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContentMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContentMap] (val x: Self) extends AnyVal {
    
    inline def setListItem(value: ListItem): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
  }
}
