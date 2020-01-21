package typings.officeUiFabricReact.basePickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasePicker[T] extends js.Object {
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]] = js.native
  /**
    * When called, will take the currently selected suggestion and complete it.
    * If called with forceComplete true, it will attempt to force the current suggestion
    * to complete, must provide both createGenericSuggestion, so the text can be turned into
    * an object in the right shape, and onValidateInput, so the object knows if it's correct or not.
    */
  def completeSuggestion(): Unit = js.native
  def completeSuggestion(forceComplete: Boolean): Unit = js.native
  /** Sets focus to the focus zone. */
  def focus(): Unit = js.native
  /** Set focus to the input */
  def focusInput(): Unit = js.native
}

