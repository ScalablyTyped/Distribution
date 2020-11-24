package typings.officeUiFabricReact.pickerItemTypesMod

import typings.react.mod.AllHTMLAttributes
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IPickerItemPropsOps[Self <: IPickerItemProps[_], T] (val x: Self with IPickerItemProps[T]) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IPickerItem | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IPickerItem]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOnItemChange(value: (/* item */ T, /* index */ Double) => Unit): Self = this.set("onItemChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnItemChange: Self = this.set("onItemChange", js.undefined)
    
    @scala.inline
    def setOnRemoveItem(value: () => Unit): Self = this.set("onRemoveItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRemoveItem: Self = this.set("onRemoveItem", js.undefined)
    
    @scala.inline
    def setRemoveButtonAriaLabel(value: String): Self = this.set("removeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveButtonAriaLabel: Self = this.set("removeButtonAriaLabel", js.undefined)
  }
}
