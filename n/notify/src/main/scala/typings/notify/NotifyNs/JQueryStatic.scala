package typings.notify.NotifyNs

import typings.notify.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  def apply(data: js.Any): Unit = js.native
  def apply(data: js.Any, className: String): Unit = js.native
  def apply(data: js.Any, options: Options): Unit = js.native
  def apply(element: JQuery, data: js.Any): Unit = js.native
  def apply(element: JQuery, data: js.Any, className: String): Unit = js.native
  def apply(element: JQuery, data: js.Any, options: Options): Unit = js.native
  /**
    * Create a notification positioned relative to the given element.
    */
  def apply(element: JQuery, text: String): Unit = js.native
  def apply(element: JQuery, text: String, className: String): Unit = js.native
  def apply(element: JQuery, text: String, options: Options): Unit = js.native
  /**
    * Create a global notification.
    */
  def apply(text: String): Unit = js.native
  def apply(text: String, className: String): Unit = js.native
  def apply(text: String, options: Options): Unit = js.native
  /**
    * Define a style for Notify to use.
    */
  def addStyle(styleName: String, styleDefinition: StyleDefinition): Unit = js.native
  /**
    * Specify the default options for all notifications.
    */
  def defaults(options: Options): Unit = js.native
}

