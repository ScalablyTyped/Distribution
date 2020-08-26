package typings.officeUiFabricReact.baseSelectedItemsListTypesMod

import typings.officeUiFabricReact.basePickerTypesMod.ValidationState
import typings.officeUiFabricReact.libSelectionMod.Selection
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseSelectedItemsListProps[T]
  extends ClassAttributes[js.Any] {
  /**
    * A callback on whether this item can be deleted
    */
  var canRemoveItem: js.UndefOr[js.Function1[/* item */ T, Boolean]] = js.native
  var componentRef: js.UndefOr[IRefObject[IBaseSelectedItemsList[T]]] = js.native
  /**
    * Function that specifies how arbitrary text entered into the well is handled.
    */
  var createGenericItem: js.UndefOr[
    js.Function2[/* input */ String, /* ValidationState */ ValidationState, ISuggestionModel[T]]
  ] = js.native
  /**
    * Initial items that have already been selected and should appear in the people picker.
    */
  var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * A callback for when the selected list of items changes.
    */
  var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.native
  /**
    * A callback for when items are copied
    */
  var onCopyItems: js.UndefOr[js.Function1[/* items */ js.Array[T], String]] = js.native
  /**
    * A callback when an item is deleted
    * @deprecated Use `onItemsDeleted` instead.
    */
  var onItemDeleted: js.UndefOr[js.Function1[/* deletedItem */ T, Unit]] = js.native
  /**
    * A callback to process a selection after the user selects something from the picker.
    */
  var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T]]] = js.native
  /**
    * A callback when and item or items are deleted
    */
  var onItemsDeleted: js.UndefOr[js.Function1[/* deletedItems */ js.Array[T], Unit]] = js.native
  /**
    * Function that specifies how the selected item will appear.
    */
  var onRenderItem: js.UndefOr[js.Function1[/* props */ ISelectedItemProps[T], Element]] = js.native
  /**
    * Aria label for the 'X' button in the selected item component.
    * @defaultvalue ''
    */
  var removeButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * The items that the base picker should currently display as selected.
    * If this is provided then the picker will act as a controlled component.
    */
  var selectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * The selection
    */
  var selection: js.UndefOr[Selection[IObjectWithKey]] = js.native
}

object IBaseSelectedItemsListProps {
  @scala.inline
  def apply[T](): IBaseSelectedItemsListProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseSelectedItemsListProps[T]]
  }
  @scala.inline
  implicit class IBaseSelectedItemsListPropsOps[Self <: IBaseSelectedItemsListProps[_], T] (val x: Self with IBaseSelectedItemsListProps[T]) extends AnyVal {
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
    def setCanRemoveItem(value: /* item */ T => Boolean): Self = this.set("canRemoveItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCanRemoveItem: Self = this.set("canRemoveItem", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IBaseSelectedItemsList[T] | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IBaseSelectedItemsList[T]]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setCreateGenericItem(value: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[T]): Self = this.set("createGenericItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreateGenericItem: Self = this.set("createGenericItem", js.undefined)
    @scala.inline
    def setDefaultSelectedItemsVarargs(value: T*): Self = this.set("defaultSelectedItems", js.Array(value :_*))
    @scala.inline
    def setDefaultSelectedItems(value: js.Array[T]): Self = this.set("defaultSelectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedItems: Self = this.set("defaultSelectedItems", js.undefined)
    @scala.inline
    def setOnChange(value: /* items */ js.UndefOr[js.Array[T]] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnCopyItems(value: /* items */ js.Array[T] => String): Self = this.set("onCopyItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCopyItems: Self = this.set("onCopyItems", js.undefined)
    @scala.inline
    def setOnItemDeleted(value: /* deletedItem */ T => Unit): Self = this.set("onItemDeleted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemDeleted: Self = this.set("onItemDeleted", js.undefined)
    @scala.inline
    def setOnItemSelected(value: /* selectedItem */ js.UndefOr[T] => T | js.Thenable[T]): Self = this.set("onItemSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemSelected: Self = this.set("onItemSelected", js.undefined)
    @scala.inline
    def setOnItemsDeleted(value: /* deletedItems */ js.Array[T] => Unit): Self = this.set("onItemsDeleted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemsDeleted: Self = this.set("onItemsDeleted", js.undefined)
    @scala.inline
    def setOnRenderItem(value: /* props */ ISelectedItemProps[T] => Element): Self = this.set("onRenderItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRenderItem: Self = this.set("onRenderItem", js.undefined)
    @scala.inline
    def setRemoveButtonAriaLabel(value: String): Self = this.set("removeButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveButtonAriaLabel: Self = this.set("removeButtonAriaLabel", js.undefined)
    @scala.inline
    def setSelectedItemsVarargs(value: T*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: js.Array[T]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    @scala.inline
    def setSelection(value: Selection[IObjectWithKey]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
  }
  
}

