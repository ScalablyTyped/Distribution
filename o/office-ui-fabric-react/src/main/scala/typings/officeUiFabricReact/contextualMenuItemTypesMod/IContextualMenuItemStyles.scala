package typings.officeUiFabricReact.contextualMenuItemTypesMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextualMenuItemStyles extends IButtonStyles {
  
  /**
    * Styles for a menu item that is an anchor link.
    */
  var anchorLink: IStyle = js.native
  
  /**
    * Default style for checkmark icons.
    */
  var checkmarkIcon: IStyle = js.native
  
  /**
    * Styles for a divider item of a ContextualMenu.
    */
  var divider: IStyle = js.native
  
  /**
    * Default icon color style for known icons.
    */
  var iconColor: IStyle = js.native
  
  /**
    * Styles for the icon element of a menu item.
    */
  @JSName("icon")
  var icon_IContextualMenuItemStyles: IStyle = js.native
  
  /**
    * Styles for a menu item that is an anchor link.
    */
  var item: IStyle = js.native
  
  /**
    * Styles for the label of a menu item.
    */
  @JSName("label")
  var label_IContextualMenuItemStyles: IStyle = js.native
  
  /**
    * Styles for the content inside the button/link of the menuItem.
    */
  var linkContent: IStyle = js.native
  
  /**
    * Styles for a menu item that is a link.
    */
  var linkContentMenu: IStyle = js.native
  
  /**
    * Style for the root element.
    */
  @JSName("root")
  var root_IContextualMenuItemStyles: IStyle = js.native
  
  /**
    * Styles for the secondary text of a menu item.
    */
  @JSName("secondaryText")
  var secondaryText_IContextualMenuItemStyles: IStyle = js.native
  
  /**
    * Styles for the container of a split menu item.
    */
  var splitContainer: IStyle = js.native
  
  /**
    * Styles for the menu portion of a split menu item.
    */
  var splitMenu: IStyle = js.native
  
  /**
    * Styles for the primary portion of a split menu item.
    */
  var splitPrimary: IStyle = js.native
  
  /**
    * Styles for the submenu icon of a menu item.
    */
  var subMenuIcon: IStyle = js.native
}
object IContextualMenuItemStyles {
  
  @scala.inline
  def apply(): IContextualMenuItemStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualMenuItemStyles]
  }
  
  @scala.inline
  implicit class IContextualMenuItemStylesOps[Self <: IContextualMenuItemStyles] (val x: Self) extends AnyVal {
    
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
    def setAnchorLink(value: IStyle): Self = this.set("anchorLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorLink: Self = this.set("anchorLink", js.undefined)
    
    @scala.inline
    def setAnchorLinkNull: Self = this.set("anchorLink", null)
    
    @scala.inline
    def setCheckmarkIcon(value: IStyle): Self = this.set("checkmarkIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckmarkIcon: Self = this.set("checkmarkIcon", js.undefined)
    
    @scala.inline
    def setCheckmarkIconNull: Self = this.set("checkmarkIcon", null)
    
    @scala.inline
    def setDivider(value: IStyle): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    
    @scala.inline
    def setDividerNull: Self = this.set("divider", null)
    
    @scala.inline
    def setIcon(value: IStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setIconColor(value: IStyle): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setIconColorNull: Self = this.set("iconColor", null)
    
    @scala.inline
    def setItem(value: IStyle): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setItemNull: Self = this.set("item", null)
    
    @scala.inline
    def setLabel(value: IStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    
    @scala.inline
    def setLinkContent(value: IStyle): Self = this.set("linkContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkContent: Self = this.set("linkContent", js.undefined)
    
    @scala.inline
    def setLinkContentNull: Self = this.set("linkContent", null)
    
    @scala.inline
    def setLinkContentMenu(value: IStyle): Self = this.set("linkContentMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkContentMenu: Self = this.set("linkContentMenu", js.undefined)
    
    @scala.inline
    def setLinkContentMenuNull: Self = this.set("linkContentMenu", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setSecondaryText(value: IStyle): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    
    @scala.inline
    def setSecondaryTextNull: Self = this.set("secondaryText", null)
    
    @scala.inline
    def setSplitContainer(value: IStyle): Self = this.set("splitContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitContainer: Self = this.set("splitContainer", js.undefined)
    
    @scala.inline
    def setSplitContainerNull: Self = this.set("splitContainer", null)
    
    @scala.inline
    def setSplitMenu(value: IStyle): Self = this.set("splitMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitMenu: Self = this.set("splitMenu", js.undefined)
    
    @scala.inline
    def setSplitMenuNull: Self = this.set("splitMenu", null)
    
    @scala.inline
    def setSplitPrimary(value: IStyle): Self = this.set("splitPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitPrimary: Self = this.set("splitPrimary", js.undefined)
    
    @scala.inline
    def setSplitPrimaryNull: Self = this.set("splitPrimary", null)
    
    @scala.inline
    def setSubMenuIcon(value: IStyle): Self = this.set("subMenuIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenuIcon: Self = this.set("subMenuIcon", js.undefined)
    
    @scala.inline
    def setSubMenuIconNull: Self = this.set("subMenuIcon", null)
  }
}
