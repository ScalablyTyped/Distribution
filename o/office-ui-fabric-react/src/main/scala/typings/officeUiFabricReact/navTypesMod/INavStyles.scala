package typings.officeUiFabricReact.navTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INavStyles extends js.Object {
  
  /**
    * Style set for the chevron button inside the composite
    * link and group elements.
    */
  var chevronButton: IStyle = js.native
  
  /**
    * Style set for the chevron icon inside the composite
    * link and group elements.
    */
  var chevronIcon: IStyle = js.native
  
  /**
    * Style set for the composite link container div element
    */
  var compositeLink: IStyle = js.native
  
  /**
    * Style set for the group root div.
    */
  var group: IStyle = js.native
  
  /**
    * Style set for the group content div inside group.
    */
  var groupContent: IStyle = js.native
  
  /**
    * Style set for the link element extending the
    * root style set for ActionButton component.
    */
  var link: IStyle = js.native
  
  /**
    * Style set for the link text container div element.
    */
  var linkText: IStyle = js.native
  
  /**
    * Style set for the nav links li element.
    */
  var navItem: IStyle = js.native
  
  /**
    * Style set for the nav links ul element.
    */
  var navItems: IStyle = js.native
  
  /**
    * Style set for the root element.
    */
  var root: IStyle = js.native
}
object INavStyles {
  
  @scala.inline
  def apply(): INavStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavStyles]
  }
  
  @scala.inline
  implicit class INavStylesOps[Self <: INavStyles] (val x: Self) extends AnyVal {
    
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
    def setChevronButton(value: IStyle): Self = this.set("chevronButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChevronButton: Self = this.set("chevronButton", js.undefined)
    
    @scala.inline
    def setChevronButtonNull: Self = this.set("chevronButton", null)
    
    @scala.inline
    def setChevronIcon(value: IStyle): Self = this.set("chevronIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChevronIcon: Self = this.set("chevronIcon", js.undefined)
    
    @scala.inline
    def setChevronIconNull: Self = this.set("chevronIcon", null)
    
    @scala.inline
    def setCompositeLink(value: IStyle): Self = this.set("compositeLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompositeLink: Self = this.set("compositeLink", js.undefined)
    
    @scala.inline
    def setCompositeLinkNull: Self = this.set("compositeLink", null)
    
    @scala.inline
    def setGroup(value: IStyle): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
    
    @scala.inline
    def setGroupContent(value: IStyle): Self = this.set("groupContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupContent: Self = this.set("groupContent", js.undefined)
    
    @scala.inline
    def setGroupContentNull: Self = this.set("groupContent", null)
    
    @scala.inline
    def setLink(value: IStyle): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLinkNull: Self = this.set("link", null)
    
    @scala.inline
    def setLinkText(value: IStyle): Self = this.set("linkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkText: Self = this.set("linkText", js.undefined)
    
    @scala.inline
    def setLinkTextNull: Self = this.set("linkText", null)
    
    @scala.inline
    def setNavItem(value: IStyle): Self = this.set("navItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavItem: Self = this.set("navItem", js.undefined)
    
    @scala.inline
    def setNavItemNull: Self = this.set("navItem", null)
    
    @scala.inline
    def setNavItems(value: IStyle): Self = this.set("navItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavItems: Self = this.set("navItems", js.undefined)
    
    @scala.inline
    def setNavItemsNull: Self = this.set("navItems", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
