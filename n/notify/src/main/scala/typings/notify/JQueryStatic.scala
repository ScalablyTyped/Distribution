package typings.notify

import typings.notify.Notify.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("notify")
  var notify_Original: typings.notify.Notify.JQueryStatic = js.native
  def notify(data: js.Any): Unit = js.native
  def notify(data: js.Any, className: String): Unit = js.native
  def notify(data: js.Any, options: Options): Unit = js.native
  def notify(element: JQuery, data: js.Any): Unit = js.native
  def notify(element: JQuery, data: js.Any, className: String): Unit = js.native
  def notify(element: JQuery, data: js.Any, options: Options): Unit = js.native
  /**
    * Create a notification positioned relative to the given element.
    */
  def notify(element: JQuery, text: String): Unit = js.native
  def notify(element: JQuery, text: String, className: String): Unit = js.native
  def notify(element: JQuery, text: String, options: Options): Unit = js.native
  /**
    * Create a global notification.
    */
  def notify(text: String): Unit = js.native
  def notify(text: String, className: String): Unit = js.native
  def notify(text: String, options: Options): Unit = js.native
}

