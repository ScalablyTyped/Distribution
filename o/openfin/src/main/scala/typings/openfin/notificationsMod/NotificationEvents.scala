package typings.openfin.notificationsMod

import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.RuntimeEvent
import typings.openfin.openfinStrings.click
import typings.openfin.openfinStrings.close
import typings.openfin.openfinStrings.error
import typings.openfin.openfinStrings.message
import typings.openfin.openfinStrings.notification
import typings.openfin.openfinStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEvents extends BaseEventMap {
  var click: RuntimeEvent[notification, typings.openfin.openfinStrings.click]
  var close: RuntimeEvent[notification, typings.openfin.openfinStrings.close]
  var error: RuntimeEvent[notification, typings.openfin.openfinStrings.error]
  var message: RuntimeEvent[notification, typings.openfin.openfinStrings.message]
  var show: RuntimeEvent[notification, typings.openfin.openfinStrings.show]
}

object NotificationEvents {
  @scala.inline
  def apply(
    click: RuntimeEvent[notification, click],
    close: RuntimeEvent[notification, close],
    error: RuntimeEvent[notification, error],
    listenerRemoved: String,
    message: RuntimeEvent[notification, message],
    newListener: String,
    show: RuntimeEvent[notification, show]
  ): NotificationEvents = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationEvents]
  }
}

