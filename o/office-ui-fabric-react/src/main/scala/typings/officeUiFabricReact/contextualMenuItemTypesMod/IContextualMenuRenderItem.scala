package typings.officeUiFabricReact.contextualMenuItemTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuRenderItem extends js.Object {
  /**
    * Dismiss the menu this item belongs to.
    */
  def dismissMenu(): Unit = js.native
  def dismissMenu(dismissAll: Boolean): Unit = js.native
  /**
    * Function to close this item's subMenu, if present.
    */
  def dismissSubMenu(): Unit = js.native
  /**
    * Function to open this item's subMenu, if present.
    */
  def openSubMenu(): Unit = js.native
}

