package typings
package notifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("notify")
  var notify_Original: notifyLib.NotifyNs.JQueryStatic = js.native
  def notify(data: js.Any): scala.Unit = js.native
  def notify(data: js.Any, className: java.lang.String): scala.Unit = js.native
  def notify(data: js.Any, options: notifyLib.NotifyNs.Options): scala.Unit = js.native
  def notify(element: JQuery, data: js.Any): scala.Unit = js.native
  def notify(element: JQuery, data: js.Any, className: java.lang.String): scala.Unit = js.native
  def notify(element: JQuery, data: js.Any, options: notifyLib.NotifyNs.Options): scala.Unit = js.native
  /**
           * Create a notification positioned relative to the given element.
           */
  def notify(element: JQuery, text: java.lang.String): scala.Unit = js.native
  /**
           * Create a notification positioned relative to the given element.
           */
  def notify(element: JQuery, text: java.lang.String, className: java.lang.String): scala.Unit = js.native
  def notify(element: JQuery, text: java.lang.String, options: notifyLib.NotifyNs.Options): scala.Unit = js.native
  /**
           * Create a global notification.
           */
  def notify(text: java.lang.String): scala.Unit = js.native
  /**
           * Create a global notification.
           */
  def notify(text: java.lang.String, className: java.lang.String): scala.Unit = js.native
  def notify(text: java.lang.String, options: notifyLib.NotifyNs.Options): scala.Unit = js.native
}

