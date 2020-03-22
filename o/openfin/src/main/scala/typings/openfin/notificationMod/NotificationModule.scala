package typings.openfin.notificationMod

import typings.openfin.AnonClick
import typings.openfin.baseMod.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationModule extends Base {
  var events: AnonClick = js.native
  var genNoteId: js.Any = js.native
  var nextNoteId: js.Any = js.native
  /**
    * Creates a new Notification.
    * @param { object } options
    * @return {_Notification}
    * @tutorial Notification.create
    * @static
    */
  def create(options: js.Any): Notification = js.native
}

