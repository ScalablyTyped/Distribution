package typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaWithMenu extends IPersonaProps {
  /** Additional menuItems to be rendered in a contextualMenu for each Persona. */
  var menuItems: js.UndefOr[js.Array[IContextualMenuItem]] = js.undefined
}

object IPersonaWithMenu {
  @scala.inline
  def apply(IPersonaProps: IPersonaProps = null, menuItems: js.Array[IContextualMenuItem] = null): IPersonaWithMenu = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPersonaProps)
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems)
    __obj.asInstanceOf[IPersonaWithMenu]
  }
}

