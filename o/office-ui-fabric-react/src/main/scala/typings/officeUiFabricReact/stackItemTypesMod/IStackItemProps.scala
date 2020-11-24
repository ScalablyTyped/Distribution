package typings.officeUiFabricReact.stackItemTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.auto
import typings.officeUiFabricReact.officeUiFabricReactStrings.baseline
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.end
import typings.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typings.officeUiFabricReact.officeUiFabricReactStrings.initial
import typings.officeUiFabricReact.officeUiFabricReactStrings.start
import typings.officeUiFabricReact.officeUiFabricReactStrings.stretch
import typings.officeUiFabricReact.officeUiFabricReactStrings.unset
import typings.uifabricFoundation.libIcomponentMod.IStyleableComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStackItemProps
  extends IStackItemSlots
     with IStyleableComponentProps[IStackItemProps, IStackItemTokens, IStackItemStyles] {
  
  /**
    * Defines how to align the StackItem along the x-axis (for vertical Stacks) or the y-axis (for horizontal Stacks).
    */
  var align: js.UndefOr[auto | stretch | baseline | start | center | end] = js.native
  
  /**
    * Defines whether the StackItem should be prevented from shrinking.
    * This can be used to prevent a StackItem from shrinking when it is inside of a Stack that has shrinking items.
    * @defaultvalue false
    */
  var disableShrink: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines how much to grow the StackItem in proportion to its siblings.
    */
  var grow: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.native
  
  /**
    * Defines order of the StackItem.
    * @defaultvalue 0
    */
  var order: js.UndefOr[Double | String] = js.native
  
  /**
    * Defines at what ratio should the StackItem shrink to fit the available space.
    */
  var shrink: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.native
  
  /**
    * Defines whether the StackItem should take up 100% of the height of its parent.
    * @defaultvalue true
    */
  var verticalFill: js.UndefOr[Boolean] = js.native
}
object IStackItemProps {
  
  @scala.inline
  def apply(): IStackItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackItemProps]
  }
  
  @scala.inline
  implicit class IStackItemPropsOps[Self <: IStackItemProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: auto | stretch | baseline | start | center | end): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setDisableShrink(value: Boolean): Self = this.set("disableShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableShrink: Self = this.set("disableShrink", js.undefined)
    
    @scala.inline
    def setGrow(value: Boolean | Double | inherit | initial | unset): Self = this.set("grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrow: Self = this.set("grow", js.undefined)
    
    @scala.inline
    def setOrder(value: Double | String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setShrink(value: Boolean | Double | inherit | initial | unset): Self = this.set("shrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShrink: Self = this.set("shrink", js.undefined)
    
    @scala.inline
    def setVerticalFill(value: Boolean): Self = this.set("verticalFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalFill: Self = this.set("verticalFill", js.undefined)
  }
}
