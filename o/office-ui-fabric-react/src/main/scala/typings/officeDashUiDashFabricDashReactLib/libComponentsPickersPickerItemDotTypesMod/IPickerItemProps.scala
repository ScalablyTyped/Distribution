package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersPickerItemDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerItemProps[T]
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLElement] {
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.undefined
  var index: scala.Double
  var item: T
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Internal Use only, gives a callback to the renderer to call when an item has changed.
    * This allows the base picker to keep track of changes in the items.
    */
  var onItemChange: js.UndefOr[js.Function2[/* item */ T, /* index */ scala.Double, scala.Unit]] = js.undefined
  var onRemoveItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var removeButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
}

