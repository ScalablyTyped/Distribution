package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`navigation-rejected`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window_NavigationRejectedEvent extends js.Object {
  var name: String
  /**
    * source of navigation window name
    */
  var sourceName: String
  var topic: `navigation-rejected`
  /**
    * Url that was not reached "http://blocked-content.url"
    */
  var url: String
  /**
    * the UUID of the application the window belongs to.
    */
  var uuid: String
}

object Window_NavigationRejectedEvent {
  @scala.inline
  def apply(name: String, sourceName: String, topic: `navigation-rejected`, url: String, uuid: String): Window_NavigationRejectedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window_NavigationRejectedEvent]
  }
}

