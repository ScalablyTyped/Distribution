package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBasePicker[T] extends js.Object {
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]]
  /** Sets focus to the focus zone. */
  def focus(): scala.Unit
  /** Set focus to the input */
  def focusInput(): scala.Unit
}

