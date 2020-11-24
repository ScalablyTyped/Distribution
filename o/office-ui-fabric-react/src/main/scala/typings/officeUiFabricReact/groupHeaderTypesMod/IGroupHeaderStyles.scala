package typings.officeUiFabricReact.groupHeaderTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupHeaderStyles extends js.Object {
  
  var check: IStyle = js.native
  
  var dropIcon: IStyle = js.native
  
  var expand: IStyle = js.native
  
  var expandIsCollapsed: IStyle = js.native
  
  var groupHeaderContainer: IStyle = js.native
  
  var headerCount: IStyle = js.native
  
  var root: IStyle = js.native
  
  var title: IStyle = js.native
}
object IGroupHeaderStyles {
  
  @scala.inline
  def apply(): IGroupHeaderStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupHeaderStyles]
  }
  
  @scala.inline
  implicit class IGroupHeaderStylesOps[Self <: IGroupHeaderStyles] (val x: Self) extends AnyVal {
    
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
    def setCheck(value: IStyle): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setCheckNull: Self = this.set("check", null)
    
    @scala.inline
    def setDropIcon(value: IStyle): Self = this.set("dropIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropIcon: Self = this.set("dropIcon", js.undefined)
    
    @scala.inline
    def setDropIconNull: Self = this.set("dropIcon", null)
    
    @scala.inline
    def setExpand(value: IStyle): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setExpandNull: Self = this.set("expand", null)
    
    @scala.inline
    def setExpandIsCollapsed(value: IStyle): Self = this.set("expandIsCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandIsCollapsed: Self = this.set("expandIsCollapsed", js.undefined)
    
    @scala.inline
    def setExpandIsCollapsedNull: Self = this.set("expandIsCollapsed", null)
    
    @scala.inline
    def setGroupHeaderContainer(value: IStyle): Self = this.set("groupHeaderContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeaderContainer: Self = this.set("groupHeaderContainer", js.undefined)
    
    @scala.inline
    def setGroupHeaderContainerNull: Self = this.set("groupHeaderContainer", null)
    
    @scala.inline
    def setHeaderCount(value: IStyle): Self = this.set("headerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderCount: Self = this.set("headerCount", js.undefined)
    
    @scala.inline
    def setHeaderCountNull: Self = this.set("headerCount", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setTitle(value: IStyle): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
}
