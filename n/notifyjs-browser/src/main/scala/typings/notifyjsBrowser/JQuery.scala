package typings.notifyjsBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def notify(
    element: js.UndefOr[scala.Nothing],
    notificationdata: js.UndefOr[scala.Nothing],
    options: NotificationOptions
  ): JQueryStatic = js.native
  def notify(element: js.UndefOr[scala.Nothing], notificationdata: js.Any): JQueryStatic = js.native
  def notify(element: js.UndefOr[scala.Nothing], notificationdata: js.Any, options: NotificationOptions): JQueryStatic = js.native
  def notify(element: js.Any): JQueryStatic = js.native
  def notify(element: js.Any, notificationdata: js.UndefOr[scala.Nothing], options: NotificationOptions): JQueryStatic = js.native
  def notify(element: js.Any, notificationdata: js.Any): JQueryStatic = js.native
  def notify(element: js.Any, notificationdata: js.Any, options: NotificationOptions): JQueryStatic = js.native
  @JSName("notify")
  var notify_Original: JQueryStaticNotify = js.native
}
