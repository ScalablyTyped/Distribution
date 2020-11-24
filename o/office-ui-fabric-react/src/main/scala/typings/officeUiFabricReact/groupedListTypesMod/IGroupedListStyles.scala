package typings.officeUiFabricReact.groupedListTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupedListStyles extends js.Object {
  
  var group: IStyle = js.native
  
  var groupIsDropping: IStyle = js.native
  
  var root: IStyle = js.native
}
object IGroupedListStyles {
  
  @scala.inline
  def apply(): IGroupedListStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupedListStyles]
  }
  
  @scala.inline
  implicit class IGroupedListStylesOps[Self <: IGroupedListStyles] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: IStyle): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
    
    @scala.inline
    def setGroupIsDropping(value: IStyle): Self = this.set("groupIsDropping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIsDropping: Self = this.set("groupIsDropping", js.undefined)
    
    @scala.inline
    def setGroupIsDroppingNull: Self = this.set("groupIsDropping", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
