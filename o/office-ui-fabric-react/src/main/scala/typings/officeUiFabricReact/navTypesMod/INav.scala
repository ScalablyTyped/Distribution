package typings.officeUiFabricReact.navTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INav extends js.Object {
  /**
    * The meta 'key' property of the currently selected NavItem of the Nav. Can return
    * undefined if the currently selected nav item has no populated key property. Be aware
    * that in order for Nav to properly understand which key is selected all NavItems in
    * all groups of the Nav must have populated key properties.
    */
  var selectedKey: js.UndefOr[String] = js.native
  /**
    * Sets focus to the first tabbable item in the zone.
    * @param forceIntoFirstElement - If true, focus will be forced into the first element, even
    * if focus is already in the focus zone.
    * @returns True if focus could be set to an active element, false if no operation was taken.
    */
  def focus(): Boolean = js.native
  def focus(forceIntoFirstElement: Boolean): Boolean = js.native
}

