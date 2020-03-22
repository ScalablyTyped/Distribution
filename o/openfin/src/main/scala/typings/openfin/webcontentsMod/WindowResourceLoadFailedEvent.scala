package typings.openfin.webcontentsMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowResourceLoadFailedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var errorCode: Double
  var errorDescription: String
  var isMainFrame: Boolean
  var validatedURL: String
}

object WindowResourceLoadFailedEvent {
  @scala.inline
  def apply[Topic, Type](
    errorCode: Double,
    errorDescription: String,
    isMainFrame: Boolean,
    name: String,
    topic: Topic,
    `type`: Type,
    uuid: String,
    validatedURL: String
  ): WindowResourceLoadFailedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorDescription = errorDescription.asInstanceOf[js.Any], isMainFrame = isMainFrame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], validatedURL = validatedURL.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowResourceLoadFailedEvent[Topic, Type]]
  }
}

