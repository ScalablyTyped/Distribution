package typings.messenger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageOptions extends js.Object {
  /**
    * Hide the message after the provided number of seconds.
    */
  var hideAfter: js.UndefOr[Double] = js.native
  /**
    * Hide the message if Backbone client-side navigation occurs.
    */
  var hideOnNavigate: js.UndefOr[Boolean] = js.native
  /**
    * A unique id. If supplied, only one message with that ID will be shown at a time.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The text of the message.
    */
  var message: String = js.native
  /**
    * Should a close button be added to the message?
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Hide the newer message if there is an id collision, as opposed to the older message.
    */
  var singleton: js.UndefOr[Boolean] = js.native
  /**
    * What theme class should be applied to the message? Defaults to the theme set for Messenger in general.
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * "info", "error" or "success" are understood by the provided themes. You can also pass your own string, and that class will be added.
    */
  var `type`: js.UndefOr[String] = js.native
}

object MessageOptions {
  @scala.inline
  def apply(message: String): MessageOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
  @scala.inline
  implicit class MessageOptionsOps[Self <: MessageOptions] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideAfter(value: Double): Self = this.set("hideAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideAfter: Self = this.set("hideAfter", js.undefined)
    @scala.inline
    def setHideOnNavigate(value: Boolean): Self = this.set("hideOnNavigate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnNavigate: Self = this.set("hideOnNavigate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setSingleton(value: Boolean): Self = this.set("singleton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleton: Self = this.set("singleton", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

