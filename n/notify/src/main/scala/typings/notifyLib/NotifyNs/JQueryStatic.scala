package typings
package notifyLib.NotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  def apply(data: js.Any): scala.Unit = js.native
  def apply(data: js.Any, className: java.lang.String): scala.Unit = js.native
  def apply(data: js.Any, options: Options): scala.Unit = js.native
  def apply(element: notifyLib.JQuery, data: js.Any): scala.Unit = js.native
  def apply(element: notifyLib.JQuery, data: js.Any, className: java.lang.String): scala.Unit = js.native
  def apply(element: notifyLib.JQuery, data: js.Any, options: Options): scala.Unit = js.native
  /**
    * Create a notification positioned relative to the given element.
    */
  def apply(element: notifyLib.JQuery, text: java.lang.String): scala.Unit = js.native
  def apply(element: notifyLib.JQuery, text: java.lang.String, className: java.lang.String): scala.Unit = js.native
  def apply(element: notifyLib.JQuery, text: java.lang.String, options: Options): scala.Unit = js.native
  /**
    * Create a global notification.
    */
  def apply(text: java.lang.String): scala.Unit = js.native
  def apply(text: java.lang.String, className: java.lang.String): scala.Unit = js.native
  def apply(text: java.lang.String, options: Options): scala.Unit = js.native
  /**
    * Define a style for Notify to use.
    */
  def addStyle(styleName: java.lang.String, styleDefinition: StyleDefinition): scala.Unit = js.native
  /**
    * Specify the default options for all notifications.
    */
  def defaults(options: Options): scala.Unit = js.native
}

