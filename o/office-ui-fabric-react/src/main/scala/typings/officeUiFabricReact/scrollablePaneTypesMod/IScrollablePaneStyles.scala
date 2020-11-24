package typings.officeUiFabricReact.scrollablePaneTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScrollablePaneStyles extends js.Object {
  
  /**
    * Style set for the contentContainer element.
    */
  var contentContainer: IStyle = js.native
  
  /**
    * Style set for the root element.
    */
  var root: IStyle = js.native
  
  /**
    * Style set for the stickyAbove element.
    */
  var stickyAbove: IStyle = js.native
  
  /**
    * Style set for the stickyBelow element.
    */
  var stickyBelow: IStyle = js.native
  
  /**
    * Style set for the stickyBelowItems element.
    */
  var stickyBelowItems: IStyle = js.native
}
object IScrollablePaneStyles {
  
  @scala.inline
  def apply(): IScrollablePaneStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollablePaneStyles]
  }
  
  @scala.inline
  implicit class IScrollablePaneStylesOps[Self <: IScrollablePaneStyles] (val x: Self) extends AnyVal {
    
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
    def setContentContainer(value: IStyle): Self = this.set("contentContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainer: Self = this.set("contentContainer", js.undefined)
    
    @scala.inline
    def setContentContainerNull: Self = this.set("contentContainer", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setStickyAbove(value: IStyle): Self = this.set("stickyAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyAbove: Self = this.set("stickyAbove", js.undefined)
    
    @scala.inline
    def setStickyAboveNull: Self = this.set("stickyAbove", null)
    
    @scala.inline
    def setStickyBelow(value: IStyle): Self = this.set("stickyBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyBelow: Self = this.set("stickyBelow", js.undefined)
    
    @scala.inline
    def setStickyBelowNull: Self = this.set("stickyBelow", null)
    
    @scala.inline
    def setStickyBelowItems(value: IStyle): Self = this.set("stickyBelowItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyBelowItems: Self = this.set("stickyBelowItems", js.undefined)
    
    @scala.inline
    def setStickyBelowItemsNull: Self = this.set("stickyBelowItems", null)
  }
}
