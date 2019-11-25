package typings.notyf.notyfDotModelsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderedNotification extends js.Object {
  var node: HTMLElement
  var notification: NotyfNotification
}

object IRenderedNotification {
  @scala.inline
  def apply(node: HTMLElement, notification: NotyfNotification): IRenderedNotification = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRenderedNotification]
  }
}

