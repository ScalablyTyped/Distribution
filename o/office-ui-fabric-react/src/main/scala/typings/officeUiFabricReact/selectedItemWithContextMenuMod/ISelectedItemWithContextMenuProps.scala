package typings.officeUiFabricReact.selectedItemWithContextMenuMod

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typings.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typings.react.mod._Global_.JSX.Element
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.createRefMod.IRefObject
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

