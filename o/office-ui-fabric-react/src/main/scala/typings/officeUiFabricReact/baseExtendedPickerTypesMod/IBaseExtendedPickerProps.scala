package typings.officeUiFabricReact.baseExtendedPickerTypesMod

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.basePickerTypesMod.IInputProps
import typings.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typings.officeUiFabricReact.libAutofillMod.Autofill
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseExtendedPickerProps[T] extends js.Object {
  /**
    * ClassName for the picker.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Ref of the component
    */
  var componentRef: js.UndefOr[IRefObject[IBaseExtendedPicker[T]]] = js.native
  /**
    * Current rendered query string that's corealte to current rendered result
    **/
  var currentRenderedQueryString: js.UndefOr[String] = js.native
  /**
    * Initial items that have already been selected and should appear in the people picker.
    */
  var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * Flag for disabling the picker.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Floating picker properties
    */
  var floatingPickerProps: IBaseFloatingPickerProps[T] = js.native
  /**
    * Focus zone props
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
  /**
    * Header/title element for the picker
    */
  var headerComponent: js.UndefOr[Element] = js.native
  /**
    * Autofill input native props
    * @defaultvalue undefined
    */
  var inputProps: js.UndefOr[IInputProps] = js.native
  /**
    * Restrict the amount of selectable items.
    * @defaultvalue undefined
    */
  var itemLimit: js.UndefOr[Double] = js.native
  /**
    * A callback for when the user moves the focus away from the picker
    */
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.native
  /**
    * A callback for when the selected list of items changes.
    */
  var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.native
  /**
    * A callback for when the user put focus on the picker
    */
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.native
  /**
    * A callback on when an item was added to the selected item list
    */
  var onItemAdded: js.UndefOr[js.Function1[/* addedItem */ T, Unit]] = js.native
  /**
    * A callback to process a selection after the user selects a suggestion from the picker.
    * The returned item will be added to the selected items list
    */
  var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T]]] = js.native
  /**
    * A callback on when an item or items were removed from the selected item list
    */
  var onItemsRemoved: js.UndefOr[js.Function1[/* removedItems */ js.Array[T], Unit]] = js.native
  /**
    * A callback for when text is pasted into the input
    */
  var onPaste: js.UndefOr[js.Function1[/* pastedText */ String, js.Array[T]]] = js.native
  /**
    * Function that specifies how the floating picker will appear.
    */
  var onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[T]] = js.native
  /**
    * Function that specifies how the floating picker will appear.
    */
  var onRenderSelectedItems: ComponentType[IBaseSelectedItemsListProps[T]] = js.native
  /**
    * If using as a controlled component use selectedItems here instead of the SelectedItemsList
    */
  var selectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * Selected items list properties
    */
  var selectedItemsListProps: IBaseSelectedItemsListProps[T] = js.native
  /**
    * If using as a controlled component use suggestionItems here instead of FloatingPicker
    */
  var suggestionItems: js.UndefOr[js.Array[T]] = js.native
}

object IBaseExtendedPickerProps {
  @scala.inline
  def apply[T](
    floatingPickerProps: IBaseFloatingPickerProps[T],
    onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[T]],
    onRenderSelectedItems: ComponentType[IBaseSelectedItemsListProps[T]],
    selectedItemsListProps: IBaseSelectedItemsListProps[T]
  ): IBaseExtendedPickerProps[T] = {
    val __obj = js.Dynamic.literal(floatingPickerProps = floatingPickerProps.asInstanceOf[js.Any], onRenderFloatingPicker = onRenderFloatingPicker.asInstanceOf[js.Any], onRenderSelectedItems = onRenderSelectedItems.asInstanceOf[js.Any], selectedItemsListProps = selectedItemsListProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseExtendedPickerProps[T]]
  }
  @scala.inline
  implicit class IBaseExtendedPickerPropsOps[Self <: IBaseExtendedPickerProps[_], T] (val x: Self with IBaseExtendedPickerProps[T]) extends AnyVal {
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
    def setFloatingPickerProps(value: IBaseFloatingPickerProps[T]): Self = this.set("floatingPickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRenderFloatingPicker(value: ComponentType[IBaseFloatingPickerProps[T]]): Self = this.set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRenderSelectedItems(value: ComponentType[IBaseSelectedItemsListProps[T]]): Self = this.set("onRenderSelectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedItemsListProps(value: IBaseSelectedItemsListProps[T]): Self = this.set("selectedItemsListProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IBaseExtendedPicker[T] | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IBaseExtendedPicker[T]]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setCurrentRenderedQueryString(value: String): Self = this.set("currentRenderedQueryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentRenderedQueryString: Self = this.set("currentRenderedQueryString", js.undefined)
    @scala.inline
    def setDefaultSelectedItemsVarargs(value: T*): Self = this.set("defaultSelectedItems", js.Array(value :_*))
    @scala.inline
    def setDefaultSelectedItems(value: js.Array[T]): Self = this.set("defaultSelectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedItems: Self = this.set("defaultSelectedItems", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFocusZoneProps(value: IFocusZoneProps): Self = this.set("focusZoneProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusZoneProps: Self = this.set("focusZoneProps", js.undefined)
    @scala.inline
    def setHeaderComponent(value: Element): Self = this.set("headerComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderComponent: Self = this.set("headerComponent", js.undefined)
    @scala.inline
    def setInputProps(value: IInputProps): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    @scala.inline
    def setItemLimit(value: Double): Self = this.set("itemLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemLimit: Self = this.set("itemLimit", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLInputElement | Autofill] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* items */ js.UndefOr[js.Array[T]] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLInputElement | Autofill] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnItemAdded(value: /* addedItem */ T => Unit): Self = this.set("onItemAdded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemAdded: Self = this.set("onItemAdded", js.undefined)
    @scala.inline
    def setOnItemSelected(value: /* selectedItem */ js.UndefOr[T] => T | js.Thenable[T]): Self = this.set("onItemSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemSelected: Self = this.set("onItemSelected", js.undefined)
    @scala.inline
    def setOnItemsRemoved(value: /* removedItems */ js.Array[T] => Unit): Self = this.set("onItemsRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemsRemoved: Self = this.set("onItemsRemoved", js.undefined)
    @scala.inline
    def setOnPaste(value: /* pastedText */ String => js.Array[T]): Self = this.set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setSelectedItemsVarargs(value: T*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: js.Array[T]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    @scala.inline
    def setSuggestionItemsVarargs(value: T*): Self = this.set("suggestionItems", js.Array(value :_*))
    @scala.inline
    def setSuggestionItems(value: js.Array[T]): Self = this.set("suggestionItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionItems: Self = this.set("suggestionItems", js.undefined)
  }
  
}

