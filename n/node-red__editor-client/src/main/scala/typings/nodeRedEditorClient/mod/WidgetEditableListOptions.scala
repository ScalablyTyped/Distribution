package typings.nodeRedEditorClient.mod

import typings.jquery.JQuery.Selector
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.auto
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Widgets
  */
@js.native
trait WidgetEditableListOptions[T] extends js.Object {
  
  /**
    * Determines whether a button is shown below the list that, when clicked, will add a new entry to the list.
    * If not specified, or set to true (boolean) a button is shown with the text ‘Add’.
    * If set to false (boolean), the button is not shown.
    * If set to a non-blank string, a button is shown using its value as the text of the button.
    */
  var addButtons: js.UndefOr[Boolean | String] = js.native
  
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
  ] = js.native
  
  /**
    * If the list is sortable, this option allows items to be dragged from this list to any other jQuery sortable list, such as another editableList.
    */
  var connectWith: js.UndefOr[Selector] = js.native
  
  /**
    * A callback function that gets called to filter what items are visible in the list.
    *
    * @param data - the data object for the row
    *
    * The function should return true/false (boolean) to indicate whether the item should be visible.
    */
  var filter: js.UndefOr[js.Function1[/* data */ T, Boolean]] = js.native
  
  /**
    * Inserts the DOM/JQuery object as a header for the list.
    */
  var header: js.UndefOr[HTMLElement | JQuery[HTMLElement]] = js.native
  
  /**
    * Sets the height of the list including, if enabled, its add button. Setting height
    * to ‘auto’ removes the vertical scrollbar and displays the list at the full height
    * needed to contain the contents.
    */
  var height: js.UndefOr[Double | auto] = js.native
  
  /**
    * If set to true, each row is displayed with a delete button on the right-hand side.
    * Clicking the button will remove the row from the list and trigger the removeItem callback, if set.
    */
  var removable: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that is called when an item is removed from the list.
    *
    * @param data - the original data item for the item
    * The remove can be triggered by either clicking an item’s remove button, or calling the remoteItem method.
    */
  var removeItem: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.native
  
  /**
    * A function that gets called when the size of the list changes.
    */
  var resize: js.UndefOr[js.Function0[Unit]] = js.native
  
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
  var resizeItem: js.UndefOr[js.Function2[/* row */ JQuery[HTMLElement], /* index */ Double, Unit]] = js.native
  
  /**
    * Determines whether the list should automatically scroll to the bottom whenever a new item is added.
    * If not specified, or set to true (boolean) the list will scroll to show newly added items.
    * If set to false (boolean), the list will not scroll
    */
  var scrollOnAdd: js.UndefOr[Boolean] = js.native
  
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
  var sort: js.UndefOr[js.Function2[/* itemDataA */ T, /* itemDataB */ T, Double]] = js.native
  
  /**
    * A function that is called after an item in the list is moved.
    *
    * @param items - an Array of the jQuery DOM elements for each row, in order.
    * Each row element stores the original data for the item under property called data.
    */
  var sortItems: js.UndefOr[js.Function1[/* items */ js.Array[JQuery[HTMLElement]], Unit]] = js.native
  
  /**
    * Determines whether the list items can be dragged to sort them.
    * If set to true (boolean), a default drag handle is displayed alongside the item.
    * If set to a CSS Selector, that is used to identify the element that should be used as the drag handle within the item’s content element.
    */
  var sortable: js.UndefOr[Boolean | Selector] = js.native
}
object WidgetEditableListOptions {
  
  @scala.inline
  def apply[T](): WidgetEditableListOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetEditableListOptions[T]]
  }
  
  @scala.inline
  implicit class WidgetEditableListOptionsOps[Self <: WidgetEditableListOptions[_], T] (val x: Self with WidgetEditableListOptions[T]) extends AnyVal {
    
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
    def setAddButtons(value: Boolean | String): Self = this.set("addButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddButtons: Self = this.set("addButtons", js.undefined)
    
    @scala.inline
    def setAddItem(value: (/* row */ JQuery[HTMLElement], /* index */ Double, /* data */ T) => Unit): Self = this.set("addItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAddItem: Self = this.set("addItem", js.undefined)
    
    @scala.inline
    def setConnectWith(value: Selector): Self = this.set("connectWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectWith: Self = this.set("connectWith", js.undefined)
    
    @scala.inline
    def setFilter(value: /* data */ T => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setHeader(value: HTMLElement | JQuery[HTMLElement]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | auto): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setRemovable(value: Boolean): Self = this.set("removable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovable: Self = this.set("removable", js.undefined)
    
    @scala.inline
    def setRemoveItem(value: /* data */ T => Unit): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveItem: Self = this.set("removeItem", js.undefined)
    
    @scala.inline
    def setResize(value: () => Unit): Self = this.set("resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setResizeItem(value: (/* row */ JQuery[HTMLElement], /* index */ Double) => Unit): Self = this.set("resizeItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResizeItem: Self = this.set("resizeItem", js.undefined)
    
    @scala.inline
    def setScrollOnAdd(value: Boolean): Self = this.set("scrollOnAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOnAdd: Self = this.set("scrollOnAdd", js.undefined)
    
    @scala.inline
    def setSort(value: (/* itemDataA */ T, /* itemDataB */ T) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortItems(value: /* items */ js.Array[JQuery[HTMLElement]] => Unit): Self = this.set("sortItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSortItems: Self = this.set("sortItems", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | Selector): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
  }
}
