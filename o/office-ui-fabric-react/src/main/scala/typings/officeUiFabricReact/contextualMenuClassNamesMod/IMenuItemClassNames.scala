package typings.officeUiFabricReact.contextualMenuClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMenuItemClassNames extends js.Object {
  
  var checkmarkIcon: String = js.native
  
  var divider: String = js.native
  
  var icon: String = js.native
  
  var item: String = js.native
  
  var label: String = js.native
  
  var linkContent: String = js.native
  
  var linkContentMenu: String = js.native
  
  var root: String = js.native
  
  var secondaryText: String = js.native
  
  var splitContainer: String = js.native
  
  var splitMenu: String = js.native
  
  var splitPrimary: String = js.native
  
  var subMenuIcon: String = js.native
}
object IMenuItemClassNames {
  
  @scala.inline
  def apply(
    checkmarkIcon: String,
    divider: String,
    icon: String,
    item: String,
    label: String,
    linkContent: String,
    linkContentMenu: String,
    root: String,
    secondaryText: String,
    splitContainer: String,
    splitMenu: String,
    splitPrimary: String,
    subMenuIcon: String
  ): IMenuItemClassNames = {
    val __obj = js.Dynamic.literal(checkmarkIcon = checkmarkIcon.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], linkContent = linkContent.asInstanceOf[js.Any], linkContentMenu = linkContentMenu.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], secondaryText = secondaryText.asInstanceOf[js.Any], splitContainer = splitContainer.asInstanceOf[js.Any], splitMenu = splitMenu.asInstanceOf[js.Any], splitPrimary = splitPrimary.asInstanceOf[js.Any], subMenuIcon = subMenuIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuItemClassNames]
  }
  
  @scala.inline
  implicit class IMenuItemClassNamesOps[Self <: IMenuItemClassNames] (val x: Self) extends AnyVal {
    
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
    def setCheckmarkIcon(value: String): Self = this.set("checkmarkIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivider(value: String): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkContent(value: String): Self = this.set("linkContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkContentMenu(value: String): Self = this.set("linkContentMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryText(value: String): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitContainer(value: String): Self = this.set("splitContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitMenu(value: String): Self = this.set("splitMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitPrimary(value: String): Self = this.set("splitPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuIcon(value: String): Self = this.set("subMenuIcon", value.asInstanceOf[js.Any])
  }
}
