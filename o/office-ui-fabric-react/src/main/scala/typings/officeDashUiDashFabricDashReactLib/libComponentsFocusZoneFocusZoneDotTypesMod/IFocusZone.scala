package typings
package officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFocusZone extends js.Object {
  /**
       * Sets focus to the first tabbable item in the zone.
       * @param forceIntoFirstElement - If true, focus will be forced into the first element, even
       * if focus is already in the focus zone.
       * @returns True if focus could be set to an active element, false if no operation was taken.
       */
  def focus(): scala.Boolean = js.native
  /**
       * Sets focus to the first tabbable item in the zone.
       * @param forceIntoFirstElement - If true, focus will be forced into the first element, even
       * if focus is already in the focus zone.
       * @returns True if focus could be set to an active element, false if no operation was taken.
       */
  def focus(forceIntoFirstElement: scala.Boolean): scala.Boolean = js.native
  /**
       * Sets focus to a specific child element within the zone. This can be used in conjunction with
       * onBeforeFocus to created delayed focus scenarios (like animate the scroll position to the correct
       * location and then focus.)
       * @param element - The child element within the zone to focus.
       * @returns True if focus could be set to an active element, false if no operation was taken.
       */
  def focusElement(): scala.Boolean = js.native
  /**
       * Sets focus to a specific child element within the zone. This can be used in conjunction with
       * onBeforeFocus to created delayed focus scenarios (like animate the scroll position to the correct
       * location and then focus.)
       * @param element - The child element within the zone to focus.
       * @returns True if focus could be set to an active element, false if no operation was taken.
       */
  def focusElement(childElement: reactLib.HTMLElement): scala.Boolean = js.native
}

