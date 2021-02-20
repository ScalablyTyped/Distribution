package typings.officeUiFabricReact

import typings.react.mod.AllHTMLAttributes
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerItemTypesMod {
  
  @js.native
  trait IPickerItem extends StObject
  
  @js.native
  trait IPickerItemProps[T] extends AllHTMLAttributes[HTMLElement] {
    
    /**
      * Optional callback to access the IPickerItem interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IPickerItem]] = js.native
    
    /** Index number of the item in the array of picked items. */
    var index: Double = js.native
    
    /** The item of Type T (Persona, Tag, or any other custom item provided). */
    var item: T = js.native
    
    /** Unique key for each picked item. */
    var key: js.UndefOr[String | Double] = js.native
    
    /**
      * Internal Use only, gives a callback to the renderer to call when an item has changed.
      * This allows the base picker to keep track of changes in the items.
      */
    var onItemChange: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, Unit]] = js.native
    
    /** Callback issued when the item is removed from the array of picked items. */
    var onRemoveItem: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Aria-label for the picked item remove button. */
    var removeButtonAriaLabel: js.UndefOr[String] = js.native
  }
  object IPickerItemProps {
    
    @scala.inline
    def apply[T](index: Double, item: T): IPickerItemProps[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerItemProps[T]]
    }
    
    @scala.inline
    implicit class IPickerItemPropsMutableBuilder[Self <: IPickerItemProps[_], T] (val x: Self with IPickerItemProps[T]) extends AnyVal {
      
      @scala.inline
      def setComponentRef(value: IRefObject[IPickerItem]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IPickerItem | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnItemChange(value: (/* item */ T, /* index */ Double) => Unit): Self = StObject.set(x, "onItemChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemChangeUndefined: Self = StObject.set(x, "onItemChange", js.undefined)
      
      @scala.inline
      def setOnRemoveItem(value: () => Unit): Self = StObject.set(x, "onRemoveItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRemoveItemUndefined: Self = StObject.set(x, "onRemoveItem", js.undefined)
      
      @scala.inline
      def setRemoveButtonAriaLabel(value: String): Self = StObject.set(x, "removeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveButtonAriaLabelUndefined: Self = StObject.set(x, "removeButtonAriaLabel", js.undefined)
    }
  }
}
