package typings.mdast.mod

import typings.mdast.mdastStrings.listItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem
  extends StObject
     with Parent {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  @JSName("children")
  var children_ListItem: js.Array[BlockContent]
  
  var spread: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_ListItem: listItem
}
object ListItem {
  
  @scala.inline
  def apply(children: js.Array[BlockContent]): ListItem = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("listItem")
    __obj.asInstanceOf[ListItem]
  }
  
  @scala.inline
  implicit class ListItemMutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[BlockContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: BlockContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    @scala.inline
    def setType(value: listItem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
