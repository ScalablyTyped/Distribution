package typings.mdast.mod

import typings.mdast.mdastStrings.listItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem extends Parent {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  @JSName("children")
  var children_ListItem: js.Array[BlockContent] = js.native
  
  var spread: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_ListItem: listItem = js.native
}
object ListItem {
  
  @scala.inline
  def apply(children: js.Array[BlockContent], `type`: listItem): ListItem = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
