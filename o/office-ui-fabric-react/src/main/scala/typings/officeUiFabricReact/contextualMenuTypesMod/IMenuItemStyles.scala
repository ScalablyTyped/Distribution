package typings.officeUiFabricReact.contextualMenuTypesMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenuItemStyles extends IButtonStyles {
  /**
    * Styles for a menu item that is an anchor link.
    */
  var anchorLink: IStyle = js.native
  /**
    * Default style for checkmark icons.
    */
  var checkmarkIcon: IStyle = js.native
  /**
    * Styles for a divider item of a ConextualMenu.
    */
  var divider: IStyle = js.native
  /**
    * Default icon color style for known icons.
    */
  var iconColor: IStyle = js.native
  /**
    * Styles for a menu item that is an anchor link.
    */
  var item: IStyle = js.native
  /**
    * Styles for the content inside the button/link of the menuItem.
    */
  var linkContent: IStyle = js.native
  /**
    * Styles for the submenu icon of a menu item.
    */
  var subMenuIcon: IStyle = js.native
}

object IMenuItemStyles {
  @scala.inline
  def apply(): IMenuItemStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuItemStyles]
  }
  @scala.inline
  implicit class IMenuItemStylesOps[Self <: IMenuItemStyles] (val x: Self) extends AnyVal {
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
    def setLinkContent(value: IStyle): Self = this.set("linkContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkContent: Self = this.set("linkContent", js.undefined)
    @scala.inline
    def setLinkContentNull: Self = this.set("linkContent", null)
    @scala.inline
    def setSubMenuIcon(value: IStyle): Self = this.set("subMenuIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenuIcon: Self = this.set("subMenuIcon", js.undefined)
    @scala.inline
    def setSubMenuIconNull: Self = this.set("subMenuIcon", null)
  }
  
}

