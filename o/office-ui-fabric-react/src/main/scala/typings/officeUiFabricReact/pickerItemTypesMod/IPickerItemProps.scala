package typings.officeUiFabricReact.pickerItemTypesMod

import typings.react.mod.AllHTMLAttributes
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerItemProps[T] extends AllHTMLAttributes[HTMLElement] {
  /**
    * Optional callback to access the IPickerItem interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPickerItem]] = js.undefined
  /** Index number of the item in the array of picked items. */
  var index: Double
  /** The item of Type T (Persona, Tag, or any other custom item provided). */
  var item: T
  /** Unique key for each picked item. */
  var key: js.UndefOr[String | Double] = js.undefined
  /**
    * Internal Use only, gives a callback to the renderer to call when an item has changed.
    * This allows the base picker to keep track of changes in the items.
    */
  var onItemChange: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, Unit]] = js.undefined
  /** Callback issued when the item is removed from the array of picked items. */
  var onRemoveItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Aria-label for the picked item remove button. */
  var removeButtonAriaLabel: js.UndefOr[String] = js.undefined
}

object IPickerItemProps {
  @scala.inline
  def apply[T](
    index: Double,
    item: T,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    componentRef: IRefObject[IPickerItem] = null,
    key: String | Double = null,
    onItemChange: (/* item */ T, /* index */ Double) => Unit = null,
    onRemoveItem: () => Unit = null,
    removeButtonAriaLabel: String = null
  ): IPickerItemProps[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onItemChange != null) __obj.updateDynamic("onItemChange")(js.Any.fromFunction2(onItemChange))
    if (onRemoveItem != null) __obj.updateDynamic("onRemoveItem")(js.Any.fromFunction0(onRemoveItem))
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickerItemProps[T]]
  }
}

