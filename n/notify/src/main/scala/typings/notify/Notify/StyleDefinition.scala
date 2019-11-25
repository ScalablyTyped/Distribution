package typings.notify.Notify

import typings.notify.Anon_Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleDefinition extends js.Object {
  /**
    * Defines the available classes in this style. The "base" property will be applied to every
    * notification with this style.
    */
  var classes: js.UndefOr[Anon_Base] = js.undefined
  /**
    * All notifications will have this CSS applied to it.
    */
  var css: js.UndefOr[String] = js.undefined
  /**
    * Defines the HTML wrapping the notification.
    *
    * If you only have HTML element that you need to modify per notification then you should give
    * this element an attribute of data-notify-text or data-notify-html. Use data-notify-html if
    * you wish to display arbitrary HTML inside the notification, otherwise, use data-notify-text
    * as it is more secure.
    * For more complex notifications, you may give a value to the data-notify-text/data-notify-html
    * attribute on an element, such as <div data-notify-html="propertyName"></div>. You may then
    * pass a javasript Object with a "propertyName" key to the notify method, whose value will be
    * the text/html that the element is populated with.
    */
  var html: String
}

object StyleDefinition {
  @scala.inline
  def apply(html: String, classes: Anon_Base = null, css: String = null): StyleDefinition = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleDefinition]
  }
}

