package typings.officeUiFabricReact.overflowSetTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowSet extends js.Object {
  /**
    * Sets focus to the first tabbable item in the zone.
    * @param forceIntoFirstElement - If true, focus will be forced into the first element, even if
    * focus is already in the focus zone.
    * @returns True if focus could be set to an active element, false if no operation was taken.
    */
  def focus(): Boolean = js.native
  def focus(forceIntoFirstElement: Boolean): Boolean = js.native
  /**
    * Sets focus to a specific child element within the zone. This can be used in conjunction with
    * shouldReceiveFocus to created delayed focus scenarios (like animate the scroll position to the correct
    * location and then focus.)
    * @param childElement - The child element within the zone to focus.
    * @returns True if focus could be set to an active element, false if no operation was taken.
    */
  def focusElement(): Boolean = js.native
  def focusElement(childElement: HTMLElement): Boolean = js.native
}

