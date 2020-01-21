package typings.officeUiFabricReact.selectedPeopleListMod

import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.basePickerTypesMod.ValidationState
import typings.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsList
import typings.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typings.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps
import typings.officeUiFabricReact.libSelectionMod.Selection
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod._Global_.JSX.Element
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectedPeopleProps extends IBaseSelectedItemsListProps[IExtendedPersonaProps] {
  var copyMenuItemText: js.UndefOr[String] = js.undefined
  var editMenuItemText: js.UndefOr[String] = js.undefined
  var floatingPickerProps: js.UndefOr[IBaseFloatingPickerProps[IPersonaProps]] = js.undefined
  var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, String]] = js.undefined
  var onExpandGroup: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.undefined
  var onRenderFloatingPicker: js.UndefOr[ComponentType[IBaseFloatingPickerProps[IPersonaProps]]] = js.undefined
  var removeMenuItemText: js.UndefOr[String] = js.undefined
}

object ISelectedPeopleProps {
  @scala.inline
  def apply(
    canRemoveItem: IExtendedPersonaProps => Boolean = null,
    componentRef: IRefObject[IBaseSelectedItemsList[IExtendedPersonaProps]] = null,
    copyMenuItemText: String = null,
    createGenericItem: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[IExtendedPersonaProps] = null,
    defaultSelectedItems: js.Array[IExtendedPersonaProps] = null,
    editMenuItemText: String = null,
    floatingPickerProps: IBaseFloatingPickerProps[IPersonaProps] = null,
    getEditingItemText: /* item */ IExtendedPersonaProps => String = null,
    key: Key = null,
    onChange: /* items */ js.UndefOr[js.Array[IExtendedPersonaProps]] => Unit = null,
    onCopyItems: /* items */ js.Array[IExtendedPersonaProps] => String = null,
    onExpandGroup: /* item */ IExtendedPersonaProps => Unit = null,
    onItemDeleted: IExtendedPersonaProps => Unit = null,
    onItemSelected: /* selectedItem */ js.UndefOr[IExtendedPersonaProps] => IExtendedPersonaProps | js.Thenable[IExtendedPersonaProps] = null,
    onItemsDeleted: /* deletedItems */ js.Array[IExtendedPersonaProps] => Unit = null,
    onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[IPersonaProps]] = null,
    onRenderItem: /* props */ ISelectedItemProps[IExtendedPersonaProps] => Element = null,
    ref: LegacyRef[js.Any] = null,
    removeButtonAriaLabel: String = null,
    removeMenuItemText: String = null,
    selectedItems: js.Array[IExtendedPersonaProps] = null,
    selection: Selection[IObjectWithKey] = null
  ): ISelectedPeopleProps = {
    val __obj = js.Dynamic.literal()
    if (canRemoveItem != null) __obj.updateDynamic("canRemoveItem")(js.Any.fromFunction1(canRemoveItem))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (copyMenuItemText != null) __obj.updateDynamic("copyMenuItemText")(copyMenuItemText.asInstanceOf[js.Any])
    if (createGenericItem != null) __obj.updateDynamic("createGenericItem")(js.Any.fromFunction2(createGenericItem))
    if (defaultSelectedItems != null) __obj.updateDynamic("defaultSelectedItems")(defaultSelectedItems.asInstanceOf[js.Any])
    if (editMenuItemText != null) __obj.updateDynamic("editMenuItemText")(editMenuItemText.asInstanceOf[js.Any])
    if (floatingPickerProps != null) __obj.updateDynamic("floatingPickerProps")(floatingPickerProps.asInstanceOf[js.Any])
    if (getEditingItemText != null) __obj.updateDynamic("getEditingItemText")(js.Any.fromFunction1(getEditingItemText))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onCopyItems != null) __obj.updateDynamic("onCopyItems")(js.Any.fromFunction1(onCopyItems))
    if (onExpandGroup != null) __obj.updateDynamic("onExpandGroup")(js.Any.fromFunction1(onExpandGroup))
    if (onItemDeleted != null) __obj.updateDynamic("onItemDeleted")(js.Any.fromFunction1(onItemDeleted))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1(onItemSelected))
    if (onItemsDeleted != null) __obj.updateDynamic("onItemsDeleted")(js.Any.fromFunction1(onItemsDeleted))
    if (onRenderFloatingPicker != null) __obj.updateDynamic("onRenderFloatingPicker")(onRenderFloatingPicker.asInstanceOf[js.Any])
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction1(onRenderItem))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    if (removeMenuItemText != null) __obj.updateDynamic("removeMenuItemText")(removeMenuItemText.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectedPeopleProps]
  }
}

