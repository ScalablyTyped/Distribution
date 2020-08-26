package typings.officeUiFabricReact.focusTrapCalloutTypesMod

import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFocusTrapCalloutProps extends ICalloutProps {
  /**
    * Optional props to be passed on to FocusTrapZone
    */
  var focusTrapProps: js.UndefOr[IFocusTrapZoneProps] = js.native
}

object IFocusTrapCalloutProps {
  @scala.inline
  def apply(): IFocusTrapCalloutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFocusTrapCalloutProps]
  }
  @scala.inline
  implicit class IFocusTrapCalloutPropsOps[Self <: IFocusTrapCalloutProps] (val x: Self) extends AnyVal {
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
    def setFocusTrapProps(value: IFocusTrapZoneProps): Self = this.set("focusTrapProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusTrapProps: Self = this.set("focusTrapProps", js.undefined)
  }
  
}

