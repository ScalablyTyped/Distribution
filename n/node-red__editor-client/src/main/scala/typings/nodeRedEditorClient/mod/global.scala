package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.`type`
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.addItem
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.addItems
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.empty
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.filter
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.getItemAt
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.height
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.hide
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.indexOf
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.items
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.length
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.removeItem
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.show
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.sort
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.types
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.validate
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.value
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.width
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  trait JQuery[TElement] extends StObject {
    
    /**
      * Inits EditableList
      * A replacement for a <ol> element where the items can be complex elements in their own right. Used by the core Switch and Change nodes.
      *
      * More info: https://nodered.org/docs/api/ui/editableList/
      */
    def editableList[T](opts: WidgetEditableListOptions[T]): this.type
    @JSName("editableList")
    var editableList_Original: WidgetEditableList
    // tslint:disable-line:no-unnecessary-generics
    /**
      * Adds an item to the end of the list.         *
      * @param value - An object that will be associated with the item in the list.
      */
    @JSName("editableList")
    def editableList_addItem(action: addItem, value: js.Object): Unit
    /**
      * Adds items contained in an array to the end of the list.
      * @param value - An array of objects that will be associated with the item in the list.
      */
    @JSName("editableList")
    def editableList_addItems(action: addItems, value: js.Array[js.Object]): Unit
    /**
      * Clears the list of all items. This does not trigger any callbacks.
      */
    @JSName("editableList")
    def editableList_empty(action: empty): Unit
    /**
      * Filters the list to show/hide items based on the active filter function and returns the number of visible items.
      * If filter is not provided, the list is filtered using the current active filter function.
      * If filter is null, the filter is removed.
      */
    @JSName("editableList")
    def editableList_filter(action: filter): Double
    @JSName("editableList")
    def editableList_filter(action: filter, value: js.Function1[/* data */ js.Object, Boolean]): Double
    // tslint:disable-line:unified-signatures
    /**
      * Get item at index. Returns item dat or undefined.
      * @param value - Item index: 0..length-1
      */
    @JSName("editableList")
    def editableList_getItemAt(action: getItemAt, value: Double): js.UndefOr[js.Object]
    /**
      * Sets the height of the editableList. This must be used in place of the standard jQuery.height() function as it ensures the component resizes properly.
      */
    @JSName("editableList")
    def editableList_height(action: height, value: String): Unit
    @JSName("editableList")
    def editableList_height(action: height, value: Double): Unit
    /**
      * Get index of item. Returns index or -1 if not found
      * @param value - Item data
      */
    @JSName("editableList")
    def editableList_indexOf(action: indexOf, value: js.Object): Double
    // tslint:disable-line:unified-signatures
    /**
      * Gets an Array of all list items. Each item is the jQuery DOM element for the item.
      * Each element stores the original data for the item under property called data.
      */
    @JSName("editableList")
    def editableList_items(action: items): JQuery[HTMLElement]
    /**
      * Gets the number of list items.
      */
    @JSName("editableList")
    def editableList_length(action: length): Double
    /**
      * Removes an item from the list.
      * @param value - The object that identifies the item to be removed.
      */
    @JSName("editableList")
    def editableList_removeItem(action: removeItem, value: js.Object): Unit
    /**
      * Scrolls the list to ensure the specific item is in view.
      * @param value - An object associated with the item in the list.
      */
    @JSName("editableList")
    def editableList_show(action: show, value: js.Object): Unit
    /**
      * Sorts the list using the active sort function.
      *
      * @param value - A callback function that gets called to compare two items in the list to determine their order.
      *
      * If the function returns a value less than 0, itemDataA comes before itemDataB.
      * If the function returns 0, the items are left unchanged.
      * If the function returns a value greater than 0, itemDataA comes after itemDataB.
      */
    @JSName("editableList")
    def editableList_sort(action: sort, value: js.Function2[/* itemDataA */ js.Object, /* itemDataB */ js.Object, Double]): Unit
    // tslint:disable-line:unified-signatures
    /**
      * Sets the width of the editableList. This must be used in place of the standard jQuery.width() function as it ensures the component resizes properly.
      */
    @JSName("editableList")
    def editableList_width(action: width, value: String): Unit
    @JSName("editableList")
    def editableList_width(action: width, value: Double): Unit
    
    /**
      * Inits TypedInput
      * A replacement for a regular <input> that allows the type of the value to be
      * chosen, including options for string, number and boolean types.
      * More info: https://nodered.org/docs/api/ui/typedInput/
      */
    def typedInput(opts: WidgetTypedInputOptions): this.type
    @JSName("typedInput")
    var typedInput_Original: WidgetTypedInput
    @JSName("typedInput")
    def typedInput_hide(action: hide): Unit
    @JSName("typedInput")
    def typedInput_show(action: show): Unit
    // tslint:disable-line:unified-signatures
    /**
      * Gets the selected type of the typedInput.
      */
    @JSName("typedInput")
    def typedInput_type(action: `type`): WidgetTypedInputType | String
    @JSName("typedInput")
    def typedInput_type(action: `type`, value: String): Unit
    /**
      * Sets the selected type of the typedInput.
      */
    @JSName("typedInput")
    def typedInput_type(action: `type`, value: WidgetTypedInputType): Unit
    /**
      * Sets the list of types offered by the typedInput.
      */
    @JSName("typedInput")
    def typedInput_types(action: types, value: js.Array[WidgetTypedInputType | WidgetTypedInputTypeDefinition]): Unit
    /**
      * Triggers a revalidation of the typedInput’s type/value. This occurs automatically
      * whenever the type or value change, but this method allows it to be run manually.
      */
    @JSName("typedInput")
    def typedInput_validate(action: validate): Boolean
    /**
      * Gets the value of the typedInput.
      */
    @JSName("typedInput")
    def typedInput_value(action: value): String
    /**
      * Sets the value of the typedInput.
      */
    @JSName("typedInput")
    def typedInput_value(action: value, value: String): Unit
    /**
      * Sets the width of the typedInput. This must be used in place of the standard
      * ```jQuery.width()``` function as it ensures the component resizes properly.
      */
    @JSName("typedInput")
    def typedInput_width(action: width, value: String): Unit
    @JSName("typedInput")
    def typedInput_width(action: width, value: Double): Unit
  }
  object JQuery {
    
    @scala.inline
    def apply[TElement](editableList: WidgetEditableList, typedInput: WidgetTypedInput): JQuery[TElement] = {
      val __obj = js.Dynamic.literal(editableList = editableList.asInstanceOf[js.Any], typedInput = typedInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[JQuery[TElement]]
    }
    
    @scala.inline
    implicit class JQueryMutableBuilder[Self <: JQuery[?], TElement] (val x: Self & JQuery[TElement]) extends AnyVal {
      
      @scala.inline
      def setEditableList(value: WidgetEditableList): Self = StObject.set(x, "editableList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypedInput(value: WidgetTypedInput): Self = StObject.set(x, "typedInput", value.asInstanceOf[js.Any])
    }
  }
}
