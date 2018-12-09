package typings
package officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBaseSelectedItemsListProps[T]
  extends reactLib.reactMod.ReactNs.Props[js.Any] {
  /**
       * A callback on whether this item can be deleted
       */
  var canRemoveItem: js.UndefOr[js.Function1[/* item */ T, scala.Boolean]] = js.undefined
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IBaseSelectedItemsList[T]]] = js.undefined
  /**
       * Function that specifies how arbitrary text entered into the well is handled.
       */
  var createGenericItem: js.UndefOr[
    js.Function2[
      /* input */ java.lang.String, 
      /* ValidationState */ officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.ValidationState, 
      officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T]
    ]
  ] = js.undefined
  /**
       * Initial items that have already been selected and should appear in the people picker.
       */
  var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.undefined
  /**
       * A callback for when the selected list of items changes.
       */
  var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], scala.Unit]] = js.undefined
  /**
       * A callback for when items are copied
       */
  var onCopyItems: js.UndefOr[js.Function1[/* items */ js.Array[T], java.lang.String]] = js.undefined
  /**
       * A callback when an item is deleted
       * @deprecated Use `onItemsDeleted` instead.
       */
  var onItemDeleted: js.UndefOr[js.Function1[/* deletedItem */ T, scala.Unit]] = js.undefined
  /**
       * A callback to process a selection after the user selects something from the picker.
       */
  var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T]]] = js.undefined
  /**
       * A callback when and item or items are deleted
       */
  var onItemsDeleted: js.UndefOr[js.Function1[/* deletedItems */ js.Array[T], scala.Unit]] = js.undefined
  /**
       * Function that specifies how the selected item will appear.
       */
  var onRenderItem: js.UndefOr[
    js.Function1[/* props */ ISelectedItemProps[T], reactLib.reactMod.Global.JSXNs.Element]
  ] = js.undefined
  /**
       * Aria label for the 'X' button in the selected item component.
       * @defaultvalue ''
       */
  var removeButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The items that the base picker should currently display as selected. If this is provided then the picker will act as a
       * controlled component.
       */
  var selectedItems: js.UndefOr[js.Array[T]] = js.undefined
  /**
       * The selection
       */
  var selection: js.UndefOr[officeDashUiDashFabricDashReactLib.libSelectionMod.Selection] = js.undefined
}

