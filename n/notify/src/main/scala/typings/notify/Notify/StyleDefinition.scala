package typings.notify.Notify

import typings.notify.anon.DictclassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleDefinition extends js.Object {
  /**
    * Defines the available classes in this style. The "base" property will be applied to every
    * notification with this style.
    */
  var classes: js.UndefOr[DictclassName] = js.native
  /**
    * All notifications will have this CSS applied to it.
    */
  var css: js.UndefOr[String] = js.native
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
  var html: String = js.native
}

object StyleDefinition {
  @scala.inline
  def apply(html: String): StyleDefinition = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleDefinition]
  }
  @scala.inline
  implicit class StyleDefinitionOps[Self <: StyleDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setClasses(value: DictclassName): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
  }
  
}

