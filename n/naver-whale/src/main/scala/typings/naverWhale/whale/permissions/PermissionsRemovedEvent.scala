package typings.naverWhale.whale.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionsRemovedEvent extends js.Object {
  /**
    * @param callback The callback parameter should be a function that looks like this:
    * function( Permissions permissions) {...};
    * Parameter permissions: The permissions that have been removed.
    */
  def addListener(callback: js.Function1[/* permissions */ typings.chrome.chrome.permissions.Permissions, Unit]): Unit = js.native
}

object PermissionsRemovedEvent {
  @scala.inline
  def apply(
    addListener: js.Function1[/* permissions */ typings.chrome.chrome.permissions.Permissions, Unit] => Unit
  ): PermissionsRemovedEvent = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
    __obj.asInstanceOf[PermissionsRemovedEvent]
  }
  @scala.inline
  implicit class PermissionsRemovedEventOps[Self <: PermissionsRemovedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddListener(value: js.Function1[/* permissions */ typings.chrome.chrome.permissions.Permissions, Unit] => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
  }
  
}

