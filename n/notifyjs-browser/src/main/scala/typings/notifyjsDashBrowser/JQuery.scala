package typings.notifyjsDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("notify")
  var notify_Original: JQueryStaticNotify = js.native
  def notify(element: js.Any): JQueryStatic = js.native
  def notify(element: js.Any, notificationdata: js.Any): JQueryStatic = js.native
  def notify(element: js.Any, notificationdata: js.Any, options: NotificationOptions): JQueryStatic = js.native
}

