package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/notification-center/
trait NotificationCenter extends js.Object {
  def add(request: NotificationRequest): js.Promise[NotificationResponse]
  def cancel(identifier: String): Unit
}

object NotificationCenter {
  @scala.inline
  def apply(add: NotificationRequest => js.Promise[NotificationResponse], cancel: String => Unit): NotificationCenter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), cancel = js.Any.fromFunction1(cancel))
    __obj.asInstanceOf[NotificationCenter]
  }
}

