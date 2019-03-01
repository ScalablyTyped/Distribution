package typings
package notifyLib.NotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleDefinition extends js.Object {
  /**
    * Defines the available classes in this style. The "base" property will be applied to every
    * notification with this style.
    */
  var classes: js.UndefOr[notifyLib.Anon_Base] = js.undefined
  /**
    * All notifications will have this CSS applied to it.
    */
  var css: js.UndefOr[java.lang.String] = js.undefined
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
  var html: java.lang.String
}

object StyleDefinition {
  @scala.inline
  def apply(html: java.lang.String, classes: notifyLib.Anon_Base = null, css: java.lang.String = null): StyleDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("html")(html)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (css != null) __obj.updateDynamic("css")(css)
    __obj.asInstanceOf[StyleDefinition]
  }
}

