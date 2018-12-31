package typings
package officeDashUiDashFabricDashReactLib.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseExtendedPickerProps[T] extends js.Object {
  /**
    * ClassName for the picker.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Ref of the component
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IBaseExtendedPicker[T]]] = js.undefined
  /**
    * Current rendered query string that's corealte to current rendered result
    **/
  var currentRenderedQueryString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Initial items that have already been selected and should appear in the people picker.
    */
  var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.undefined
  /**
    * Flag for disabling the picker.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Floating picker properties
    */
  var floatingPickerProps: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps[T]
  /**
    * Focus zone props
    */
  var focusZoneProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps
  ] = js.undefined
  /**
    * Header/title element for the picker
    */
  var headerComponent: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * Autofill input native props
    * @defaultvalue undefined
    */
  var inputProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.IInputProps
  ] = js.undefined
  /**
    * Restrict the amount of selectable items.
    * @defaultvalue undefined
    */
  var itemLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * A callback for when the user moves the focus away from the picker
    */
  var onBlur: js.UndefOr[
    reactLib.reactMod.ReactNs.FocusEventHandler[
      reactLib.HTMLInputElement | officeDashUiDashFabricDashReactLib.libAutofillMod.Autofill
    ]
  ] = js.undefined
  /**
    * A callback for when the selected list of items changes.
    */
  var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], scala.Unit]] = js.undefined
  /**
    * A callback for when the user put focus on the picker
    */
  var onFocus: js.UndefOr[
    reactLib.reactMod.ReactNs.FocusEventHandler[
      reactLib.HTMLInputElement | officeDashUiDashFabricDashReactLib.libAutofillMod.Autofill
    ]
  ] = js.undefined
  /**
    * A callback on when an item was added to the selected item list
    */
  var onItemAdded: js.UndefOr[js.Function1[/* addedItem */ T, scala.Unit]] = js.undefined
  /**
    * A callback to process a selection after the user selects a suggestion from the picker.
    * The returned item will be added to the selected items list
    */
  var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T]]] = js.undefined
  /**
    * A callback on when an item or items were removed from the selected item list
    */
  var onItemsRemoved: js.UndefOr[js.Function1[/* removedItems */ js.Array[T], scala.Unit]] = js.undefined
  /**
    * A callback for when text is pasted into the input
    */
  var onPaste: js.UndefOr[js.Function1[/* pastedText */ java.lang.String, js.Array[T]]] = js.undefined
  /**
    * If using as a controlled component use selectedItems here instead of the SelectedItemsList
    */
  var selectedItems: js.UndefOr[js.Array[T]] = js.undefined
  /**
    * Selected items list properties
    */
  var selectedItemsListProps: officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsListProps[T]
  /**
    * If using as a controlled component use suggestionItems here instead of FloatingPicker
    */
  var suggestionItems: js.UndefOr[js.Array[T]] = js.undefined
  /**
    * Function that specifies how the floating picker will appear.
    */
  def onRenderFloatingPicker(
    props: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps[T]
  ): reactLib.reactMod.Global.JSXNs.Element
  /**
    * Function that specifies how the floating picker will appear.
    */
  def onRenderSelectedItems(
    props: officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsListProps[T]
  ): reactLib.reactMod.Global.JSXNs.Element
}

