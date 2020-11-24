package typings.officeUiFabricReact.splitButtonClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISplitButtonClassNames extends js.Object {
  
  var divider: js.UndefOr[String] = js.native
  
  var flexContainer: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var splitButtonContainer: js.UndefOr[String] = js.native
}
object ISplitButtonClassNames {
  
  @scala.inline
  def apply(): ISplitButtonClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISplitButtonClassNames]
  }
  
  @scala.inline
  implicit class ISplitButtonClassNamesOps[Self <: ISplitButtonClassNames] (val x: Self) extends AnyVal {
    
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
    def setDivider(value: String): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    
    @scala.inline
    def setFlexContainer(value: String): Self = this.set("flexContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexContainer: Self = this.set("flexContainer", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSplitButtonContainer(value: String): Self = this.set("splitButtonContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitButtonContainer: Self = this.set("splitButtonContainer", js.undefined)
  }
}
