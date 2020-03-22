package typings.openfin.webcontentsMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`object`
import typings.openfin.openfinStrings.image
import typings.openfin.openfinStrings.mainFrame
import typings.openfin.openfinStrings.other
import typings.openfin.openfinStrings.script
import typings.openfin.openfinStrings.styleSheet
import typings.openfin.openfinStrings.subFrame
import typings.openfin.openfinStrings.xhr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowResourceResponseReceivedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var headers: js.Any
  var httpResponseCode: Double
  var newUrl: String
  var originalUrl: String
  var referrer: String
  var requestMethod: String
  var resourceType: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other
  var status: Boolean
}

object WindowResourceResponseReceivedEvent {
  @scala.inline
  def apply[Topic, Type](
    headers: js.Any,
    httpResponseCode: Double,
    name: String,
    newUrl: String,
    originalUrl: String,
    referrer: String,
    requestMethod: String,
    resourceType: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other,
    status: Boolean,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowResourceResponseReceivedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpResponseCode = httpResponseCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newUrl = newUrl.asInstanceOf[js.Any], originalUrl = originalUrl.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], requestMethod = requestMethod.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowResourceResponseReceivedEvent[Topic, Type]]
  }
}

