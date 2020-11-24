package typings.officeUiFabricReact.selectedItemWithContextMenuMod

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typings.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectedItemWithContextMenuProps
  extends IBaseProps[js.Any] {
  
  var beginEditing: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.native
  
  var item: IExtendedPersonaProps = js.native
  
  var menuItems: js.Array[IContextualMenuItem] = js.native
  
  var renderedItem: Element = js.native
}
object ISelectedItemWithContextMenuProps {
  
  @scala.inline
  def apply(item: IExtendedPersonaProps, menuItems: js.Array[IContextualMenuItem], renderedItem: Element): ISelectedItemWithContextMenuProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], renderedItem = renderedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectedItemWithContextMenuProps]
  }
  
  @scala.inline
  implicit class ISelectedItemWithContextMenuPropsOps[Self <: ISelectedItemWithContextMenuProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItem(value: IExtendedPersonaProps): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemsVarargs(value: IContextualMenuItem*): Self = this.set("menuItems", js.Array(value :_*))
    
    @scala.inline
    def setMenuItems(value: js.Array[IContextualMenuItem]): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedItem(value: Element): Self = this.set("renderedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginEditing(value: /* item */ IExtendedPersonaProps => Unit): Self = this.set("beginEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeginEditing: Self = this.set("beginEditing", js.undefined)
  }
}
