package typings.naverWhale.whale.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsRemovedEvent extends js.Object {
  /**
    * @param callback The callback parameter should be a function that looks like this:
    * function( Permissions permissions) {...};
    * Parameter permissions: The permissions that have been removed.
    */
  def addListener(callback: js.Function1[/* permissions */ typings.chrome.chrome.permissions.Permissions, Unit]): Unit
}

object PermissionsRemovedEvent {
  @scala.inline
  def apply(
    addListener: js.Function1[/* permissions */ typings.chrome.chrome.permissions.Permissions, Unit] => Unit
  ): PermissionsRemovedEvent = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
  
    __obj.asInstanceOf[PermissionsRemovedEvent]
  }
}

