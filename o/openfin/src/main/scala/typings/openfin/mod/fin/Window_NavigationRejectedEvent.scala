package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`navigation-rejected`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window_NavigationRejectedEvent extends js.Object {
  var name: String = js.native
  /**
    * source of navigation window name
    */
  var sourceName: String = js.native
  var topic: `navigation-rejected` = js.native
  /**
    * Url that was not reached "http://blocked-content.url"
    */
  var url: String = js.native
  /**
    * the UUID of the application the window belongs to.
    */
  var uuid: String = js.native
}

object Window_NavigationRejectedEvent {
  @scala.inline
  def apply(name: String, sourceName: String, topic: `navigation-rejected`, url: String, uuid: String): Window_NavigationRejectedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window_NavigationRejectedEvent]
  }
  @scala.inline
  implicit class Window_NavigationRejectedEventOps[Self <: Window_NavigationRejectedEvent] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceName(value: String): Self = this.set("sourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: `navigation-rejected`): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
  
}

