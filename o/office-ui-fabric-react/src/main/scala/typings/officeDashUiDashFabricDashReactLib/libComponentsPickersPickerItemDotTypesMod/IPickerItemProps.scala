package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersPickerItemDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerItemProps[T]
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLElement] {
  /**
    * Optional callback to access the IPickerItem interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IPickerItem]] = js.undefined
  /** Index number of the item in the array of picked items. */
  var index: scala.Double
  /** The item of Type T (Persona, Tag, or any other custom item provided). */
  var item: T
  /** Unique key for each picked item. */
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Internal Use only, gives a callback to the renderer to call when an item has changed.
    * This allows the base picker to keep track of changes in the items.
    */
  var onItemChange: js.UndefOr[js.Function2[/* item */ T, /* index */ scala.Double, scala.Unit]] = js.undefined
  /** Callback issued when the item is removed from the array of picked items. */
  var onRemoveItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Aria-label for the picked item remove button. */
  var removeButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
}

