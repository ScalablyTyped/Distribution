package typings
package notifyjsDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("notify")
  var notify_Original: JQueryStaticNotify = js.native
  /**
       * notify user
       * @param element a jquery element
       * @param notificationdata global notification data
       * @param options notification options
       */
  def notify(element: js.Any): JQueryStatic = js.native
  /**
       * notify user
       * @param element a jquery element
       * @param notificationdata global notification data
       * @param options notification options
       */
  def notify(element: js.Any, notificationdata: js.Any): JQueryStatic = js.native
  /**
       * notify user
       * @param element a jquery element
       * @param notificationdata global notification data
       * @param options notification options
       */
  def notify(element: js.Any, notificationdata: js.Any, options: NotificationOptions): JQueryStatic = js.native
}

