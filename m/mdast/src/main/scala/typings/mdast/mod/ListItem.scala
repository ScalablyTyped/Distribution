package typings.mdast.mod

import typings.mdast.mdastStrings.listItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem
  extends StObject
     with Parent {
  
  var checked: js.UndefOr[Boolean | Null] = js.undefined
  
  @JSName("children")
  var children_ListItem: js.Array[BlockContent | DefinitionContent]
  
  var spread: js.UndefOr[Boolean | Null] = js.undefined
  
  @JSName("type")
  var type_ListItem: listItem
}
object ListItem {
  
  inline def apply(children: js.Array[BlockContent | DefinitionContent]): ListItem = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("listItem")
    __obj.asInstanceOf[ListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedNull: Self = StObject.set(x, "checked", null)
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setChildren(value: js.Array[BlockContent | DefinitionContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (BlockContent | DefinitionContent)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def setSpreadNull: Self = StObject.set(x, "spread", null)
    
    inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    inline def setType(value: listItem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
