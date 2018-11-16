package typings
package notifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def notify(data: js.Any): scala.Unit = js.native
  def notify(data: js.Any, className: java.lang.String): scala.Unit = js.native
  def notify(data: js.Any, options: notifyLib.NotifyNs.Options): scala.Unit = js.native
  /**
       * Create a notification positioned relative to the currently selected element.
       */
  def notify(text: java.lang.String): scala.Unit = js.native
  /**
       * Create a notification positioned relative to the currently selected element.
       */
  def notify(text: java.lang.String, className: java.lang.String): scala.Unit = js.native
  def notify(text: java.lang.String, options: notifyLib.NotifyNs.Options): scala.Unit = js.native
}

