package typings.officeUiFabricReact.breadcrumbTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBreadcrumbStyles extends js.Object {
  
  var chevron: IStyle = js.native
  
  var item: IStyle = js.native
  
  var itemLink: IStyle = js.native
  
  var list: IStyle = js.native
  
  var listItem: IStyle = js.native
  
  var overflow: IStyle = js.native
  
  var overflowButton: IStyle = js.native
  
  var root: IStyle = js.native
}
object IBreadcrumbStyles {
  
  @scala.inline
  def apply(): IBreadcrumbStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBreadcrumbStyles]
  }
  
  @scala.inline
  implicit class IBreadcrumbStylesOps[Self <: IBreadcrumbStyles] (val x: Self) extends AnyVal {
    
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
    def setChevron(value: IStyle): Self = this.set("chevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChevron: Self = this.set("chevron", js.undefined)
    
    @scala.inline
    def setChevronNull: Self = this.set("chevron", null)
    
    @scala.inline
    def setItem(value: IStyle): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setItemNull: Self = this.set("item", null)
    
    @scala.inline
    def setItemLink(value: IStyle): Self = this.set("itemLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemLink: Self = this.set("itemLink", js.undefined)
    
    @scala.inline
    def setItemLinkNull: Self = this.set("itemLink", null)
    
    @scala.inline
    def setList(value: IStyle): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setListNull: Self = this.set("list", null)
    
    @scala.inline
    def setListItem(value: IStyle): Self = this.set("listItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItem: Self = this.set("listItem", js.undefined)
    
    @scala.inline
    def setListItemNull: Self = this.set("listItem", null)
    
    @scala.inline
    def setOverflow(value: IStyle): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setOverflowNull: Self = this.set("overflow", null)
    
    @scala.inline
    def setOverflowButton(value: IStyle): Self = this.set("overflowButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowButton: Self = this.set("overflowButton", js.undefined)
    
    @scala.inline
    def setOverflowButtonNull: Self = this.set("overflowButton", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
