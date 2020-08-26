package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/notification-center/
@js.native
trait NotificationCenter extends js.Object {
  def add(request: NotificationRequest): js.Promise[NotificationResponse] = js.native
  def cancel(identifier: String): Unit = js.native
}

object NotificationCenter {
  @scala.inline
  def apply(add: NotificationRequest => js.Promise[NotificationResponse], cancel: String => Unit): NotificationCenter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), cancel = js.Any.fromFunction1(cancel))
    __obj.asInstanceOf[NotificationCenter]
  }
  @scala.inline
  implicit class NotificationCenterOps[Self <: NotificationCenter] (val x: Self) extends AnyVal {
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
    def setAdd(value: NotificationRequest => js.Promise[NotificationResponse]): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setCancel(value: String => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
  }
  
}

