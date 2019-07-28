package typings.naverDashWhale.whaleNs.permissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsAddedEvent extends js.Object {
  /**
    * @param callback The callback parameter should be a function that looks like this:
    * function( Permissions permissions) {...};
    * Parameter permissions: The newly acquired permissions.
    */
  def addListener(callback: js.Function1[/* permissions */ typings.chrome.chromeNs.permissionsNs.Permissions, Unit]): Unit
}

object PermissionsAddedEvent {
  @scala.inline
  def apply(
    addListener: js.Function1[/* permissions */ typings.chrome.chromeNs.permissionsNs.Permissions, Unit] => Unit
  ): PermissionsAddedEvent = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
  
    __obj.asInstanceOf[PermissionsAddedEvent]
  }
}

