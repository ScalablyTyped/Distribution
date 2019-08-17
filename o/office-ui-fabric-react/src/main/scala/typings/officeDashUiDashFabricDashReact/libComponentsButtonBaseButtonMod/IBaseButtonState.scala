package typings.officeDashUiDashFabricDashReact.libComponentsButtonBaseButtonMod

import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseButtonState extends js.Object {
  var menuProps: js.UndefOr[IContextualMenuProps | Null] = js.undefined
}

object IBaseButtonState {
  @scala.inline
  def apply(menuProps: IContextualMenuProps = null): IBaseButtonState = {
    val __obj = js.Dynamic.literal()
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps)
    __obj.asInstanceOf[IBaseButtonState]
  }
}

