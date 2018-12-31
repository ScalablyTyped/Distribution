package typings
package officeDashUiDashFabricDashReactLib.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseExtendedPicker[T] extends js.Object {
  /** Forces the picker to resolve */
  var forceResolve: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]]
  /** Sets focus to the input. */
  def focus(): scala.Unit
}

