package typings.officeUiFabricReact.editingItemMod

import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typings.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditingSelectedPeopleItemProps extends ISelectedPeopleItemProps {
  var floatingPickerProps: js.UndefOr[IBaseFloatingPickerProps[IPersonaProps]] = js.undefined
  var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, String]] = js.undefined
  var onRenderFloatingPicker: js.UndefOr[ComponentType[IBaseFloatingPickerProps[IPersonaProps]]] = js.undefined
  def onEditingComplete(oldItem: js.Any, newItem: js.Any): Unit
}

object IEditingSelectedPeopleItemProps {
  @scala.inline
  def apply(
    onEditingComplete: (js.Any, js.Any) => Unit,
    ISelectedPeopleItemProps: ISelectedPeopleItemProps = null,
    floatingPickerProps: IBaseFloatingPickerProps[IPersonaProps] = null,
    getEditingItemText: /* item */ IExtendedPersonaProps => String = null,
    onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[IPersonaProps]] = null
  ): IEditingSelectedPeopleItemProps = {
    val __obj = js.Dynamic.literal(onEditingComplete = js.Any.fromFunction2(onEditingComplete))
    if (ISelectedPeopleItemProps != null) js.Dynamic.global.Object.assign(__obj, ISelectedPeopleItemProps)
    if (floatingPickerProps != null) __obj.updateDynamic("floatingPickerProps")(floatingPickerProps.asInstanceOf[js.Any])
    if (getEditingItemText != null) __obj.updateDynamic("getEditingItemText")(js.Any.fromFunction1(getEditingItemText))
    if (onRenderFloatingPicker != null) __obj.updateDynamic("onRenderFloatingPicker")(onRenderFloatingPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditingSelectedPeopleItemProps]
  }
}

