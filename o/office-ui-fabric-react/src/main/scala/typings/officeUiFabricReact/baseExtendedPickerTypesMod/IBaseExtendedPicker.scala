package typings.officeUiFabricReact.baseExtendedPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseExtendedPicker[T] extends js.Object {
  /** Forces the picker to resolve */
  var forceResolve: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]] = js.undefined
  /** Sets focus to the input. */
  def focus(): Unit
}

object IBaseExtendedPicker {
  @scala.inline
  def apply[T](focus: () => Unit, forceResolve: () => Unit = null, items: js.Array[T] = null): IBaseExtendedPicker[T] = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    if (forceResolve != null) __obj.updateDynamic("forceResolve")(js.Any.fromFunction0(forceResolve))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseExtendedPicker[T]]
  }
}

