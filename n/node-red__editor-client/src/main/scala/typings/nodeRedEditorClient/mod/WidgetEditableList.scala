package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.addItem
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.addItems
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.empty
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.filter
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.getItemAt
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.height
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.indexOf
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.items
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.length
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.removeItem
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.show
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.sort
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.width
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetEditableList
  extends StObject
     with JQuery[HTMLElement] {
  
  /**
    * Adds items contained in an array to the end of the list.
    * @param value - An array of objects that will be associated with the item in the list.
    */
  def apply(action: addItems, value: js.Array[js.Object]): Unit = js.native
  // tslint:disable-line:no-unnecessary-generics
  /**
    * Adds an item to the end of the list.         *
    * @param value - An object that will be associated with the item in the list.
    */
  def apply(action: addItem, value: js.Object): Unit = js.native
  /**
    * Clears the list of all items. This does not trigger any callbacks.
    */
  def apply(action: empty): Unit = js.native
  /**
    * Filters the list to show/hide items based on the active filter function and returns the number of visible items.
    * If filter is not provided, the list is filtered using the current active filter function.
    * If filter is null, the filter is removed.
    */
  def apply(action: filter): Double = js.native
  def apply(action: filter, value: js.Function1[/* data */ js.Object, Boolean]): Double = js.native
  // tslint:disable-line:unified-signatures
  /**
    * Get item at index. Returns item dat or undefined.
    * @param value - Item index: 0..length-1
    */
  def apply(action: getItemAt, value: Double): js.UndefOr[js.Object] = js.native
  /**
    * Sets the height of the editableList. This must be used in place of the standard jQuery.height() function as it ensures the component resizes properly.
    */
  def apply(action: height, value: String): Unit = js.native
  def apply(action: height, value: Double): Unit = js.native
  /**
    * Get index of item. Returns index or -1 if not found
    * @param value - Item data
    */
  def apply(action: indexOf, value: js.Object): Double = js.native
  // tslint:disable-line:unified-signatures
  /**
    * Gets an Array of all list items. Each item is the jQuery DOM element for the item.
    * Each element stores the original data for the item under property called data.
    */
  def apply(action: items): JQuery[HTMLElement] = js.native
  /**
    * Gets the number of list items.
    */
  def apply(action: length): Double = js.native
  /**
    * Removes an item from the list.
    * @param value - The object that identifies the item to be removed.
    */
  def apply(action: removeItem, value: js.Object): Unit = js.native
  /**
    * Scrolls the list to ensure the specific item is in view.
    * @param value - An object associated with the item in the list.
    */
  def apply(action: show, value: js.Object): Unit = js.native
  /**
    * Sorts the list using the active sort function.
    *
    * @param value - A callback function that gets called to compare two items in the list to determine their order.
    *
    * If the function returns a value less than 0, itemDataA comes before itemDataB.
    * If the function returns 0, the items are left unchanged.
    * If the function returns a value greater than 0, itemDataA comes after itemDataB.
    */
  def apply(action: sort, value: js.Function2[/* itemDataA */ js.Object, /* itemDataB */ js.Object, Double]): Unit = js.native
  // tslint:disable-line:unified-signatures
  /**
    * Sets the width of the editableList. This must be used in place of the standard jQuery.width() function as it ensures the component resizes properly.
    */
  def apply(action: width, value: String): Unit = js.native
  def apply(action: width, value: Double): Unit = js.native
  /**
    * Inits EditableList
    * A replacement for a <ol> element where the items can be complex elements in their own right. Used by the core Switch and Change nodes.
    *
    * More info: https://nodered.org/docs/api/ui/editableList/
    */
  def apply[T](opts: WidgetEditableListOptions[T]): this.type = js.native
}
