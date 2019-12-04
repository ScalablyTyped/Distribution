package typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListItemsSelectedItemWithContextMenuMod

import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectedItemWithContextMenuProps
  extends IBaseProps[js.Any] {
  var beginEditing: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.undefined
  var item: IExtendedPersonaProps
  var menuItems: js.Array[IContextualMenuItem]
  var renderedItem: Element
}

object ISelectedItemWithContextMenuProps {
  @scala.inline
  def apply(
    item: IExtendedPersonaProps,
    menuItems: js.Array[IContextualMenuItem],
    renderedItem: Element,
    beginEditing: /* item */ IExtendedPersonaProps => Unit = null,
    componentRef: IRefObject[js.Any] = null
  ): ISelectedItemWithContextMenuProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], renderedItem = renderedItem.asInstanceOf[js.Any])
    if (beginEditing != null) __obj.updateDynamic("beginEditing")(js.Any.fromFunction1(beginEditing))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectedItemWithContextMenuProps]
  }
}

