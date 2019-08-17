package typings.officeDashUiDashFabricDashReact.libComponentsCalloutFocusTrapCalloutDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
import typings.officeDashUiDashFabricDashReact.libComponentsFocusTrapZoneFocusTrapZoneDotTypesMod.IFocusTrapZoneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFocusTrapCalloutProps extends ICalloutProps {
  /**
    * Optional props to be passed on to FocusTrapZone
    */
  var focusTrapProps: js.UndefOr[IFocusTrapZoneProps] = js.undefined
}

object IFocusTrapCalloutProps {
  @scala.inline
  def apply(ICalloutProps: ICalloutProps = null, focusTrapProps: IFocusTrapZoneProps = null): IFocusTrapCalloutProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ICalloutProps)
    if (focusTrapProps != null) __obj.updateDynamic("focusTrapProps")(focusTrapProps)
    __obj.asInstanceOf[IFocusTrapCalloutProps]
  }
}

