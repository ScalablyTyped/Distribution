package typings.nodeRedEditorClient.mod

import typings.jquery.JQuery.Selector
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.auto
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Widgets
  */
trait WidgetEditableListOptions[T] extends StObject {
  
  /**
    * Determines whether a button is shown below the list that, when clicked, will add a new entry to the list.
    * If not specified, or set to true (boolean) a button is shown with the text ‘Add’.
    * If set to false (boolean), the button is not shown.
    * If set to a non-blank string, a button is shown using its value as the text of the button.
    */
  var addButton: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * A callback function that gets called when a new item is being added to the list.
    * If it was triggered by clicking the ‘add button’, data will be {}. Otherwise it will be the data passed to the call to the addItem method.
    *
    * @param row - the jQuery DOM element to which any row content should be added
    * @param index - the index of the row
    * @param data - the data object for the row
    */
  var addItem: js.UndefOr[
    js.Function3[/* row */ JQuery[HTMLElement], /* index */ Double, /* data */ T, Unit]
  ] = js.undefined
  
  /**
    * If the list is sortable, this option allows items to be dragged from this list to any other jQuery sortable list, such as another editableList.
    */
  var connectWith: js.UndefOr[Selector] = js.undefined
  
  /**
    * A callback function that gets called to filter what items are visible in the list.
    *
    * @param data - the data object for the row
    *
    * The function should return true/false (boolean) to indicate whether the item should be visible.
    */
  var filter: js.UndefOr[js.Function1[/* data */ T, Boolean]] = js.undefined
  
  /**
    * Inserts the DOM/JQuery object as a header for the list.
    */
  var header: js.UndefOr[HTMLElement | JQuery[HTMLElement]] = js.undefined
  
  /**
    * Sets the height of the list including, if enabled, its add button. Setting height
    * to ‘auto’ removes the vertical scrollbar and displays the list at the full height
    * needed to contain the contents.
    */
  var height: js.UndefOr[Double | auto] = js.undefined
  
  /**
    * If set to true, each row is displayed with a delete button on the right-hand side.
    * Clicking the button will remove the row from the list and trigger the removeItem callback, if set.
    */
  var removable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is called when an item is removed from the list.
    *
    * @param data - the original data item for the item
    * The remove can be triggered by either clicking an item’s remove button, or calling the remoteItem method.
    */
  var removeItem: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.undefined
  
  /**
    * A function that gets called when the size of the list changes.
    */
  var resize: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * A function that gets called against each item in the list when the size of the list changes.
    *
    * @param row - the jQuery DOM element for the row
    * @param index - the index of the row
    *
    * The original data for the item is stored under a property called data.
    * ```const originalData = $(row).data('data');```
    *
    * This callback is invoked after the main resize callback is called.
    */
  var resizeItem: js.UndefOr[js.Function2[/* row */ JQuery[HTMLElement], /* index */ Double, Unit]] = js.undefined
  
  /**
    * Determines whether the list should automatically scroll to the bottom whenever a new item is added.
    * If not specified, or set to true (boolean) the list will scroll to show newly added items.
    * If set to false (boolean), the list will not scroll
    */
  var scrollOnAdd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A callback function that gets called to compare two items in the list to determine their order.
    *
    * @param itemDataA - a data item
    * @param itemDataB - a data item
    *
    * If the function returns a value less than 0, itemDataA comes before itemDataB.
    * If the function returns 0, the items are left unchanged.
    * If the function returns a value greater than 0, itemDataA comes after itemDataB.
    */
  var sort: js.UndefOr[js.Function2[/* itemDataA */ T, /* itemDataB */ T, Double]] = js.undefined
  
  /**
    * A function that is called after an item in the list is moved.
    *
    * @param items - an Array of the jQuery DOM elements for each row, in order.
    * Each row element stores the original data for the item under property called data.
    */
  var sortItems: js.UndefOr[js.Function1[/* items */ js.Array[JQuery[HTMLElement]], Unit]] = js.undefined
  
  /**
    * Determines whether the list items can be dragged to sort them.
    * If set to true (boolean), a default drag handle is displayed alongside the item.
    * If set to a CSS Selector, that is used to identify the element that should be used as the drag handle within the item’s content element.
    */
  var sortable: js.UndefOr[Boolean | Selector] = js.undefined
}
object WidgetEditableListOptions {
  
  inline def apply[T](): WidgetEditableListOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetEditableListOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WidgetEditableListOptions[?], T] (val x: Self & WidgetEditableListOptions[T]) extends AnyVal {
    
    inline def setAddButton(value: Boolean | String): Self = StObject.set(x, "addButton", value.asInstanceOf[js.Any])
    
    inline def setAddButtonUndefined: Self = StObject.set(x, "addButton", js.undefined)
    
    inline def setAddItem(value: (/* row */ JQuery[HTMLElement], /* index */ Double, /* data */ T) => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction3(value))
    
    inline def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
    
    inline def setConnectWith(value: Selector): Self = StObject.set(x, "connectWith", value.asInstanceOf[js.Any])
    
    inline def setConnectWithUndefined: Self = StObject.set(x, "connectWith", js.undefined)
    
    inline def setFilter(value: /* data */ T => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setHeader(value: HTMLElement | JQuery[HTMLElement]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeight(value: Double | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
    
    inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
    
    inline def setRemoveItem(value: /* data */ T => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setRemoveItemUndefined: Self = StObject.set(x, "removeItem", js.undefined)
    
    inline def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
    
    inline def setResizeItem(value: (/* row */ JQuery[HTMLElement], /* index */ Double) => Unit): Self = StObject.set(x, "resizeItem", js.Any.fromFunction2(value))
    
    inline def setResizeItemUndefined: Self = StObject.set(x, "resizeItem", js.undefined)
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setScrollOnAdd(value: Boolean): Self = StObject.set(x, "scrollOnAdd", value.asInstanceOf[js.Any])
    
    inline def setScrollOnAddUndefined: Self = StObject.set(x, "scrollOnAdd", js.undefined)
    
    inline def setSort(value: (/* itemDataA */ T, /* itemDataB */ T) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setSortItems(value: /* items */ js.Array[JQuery[HTMLElement]] => Unit): Self = StObject.set(x, "sortItems", js.Any.fromFunction1(value))
    
    inline def setSortItemsUndefined: Self = StObject.set(x, "sortItems", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortable(value: Boolean | Selector): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
  }
}
