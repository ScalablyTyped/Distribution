package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`external-process-started`
import typings.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowExternalProcessStartedEvent extends WindowBaseEvent {
  /**
    * the process handle uuid
    */
  var processUuid: String
  @JSName("type")
  var type_WindowExternalProcessStartedEvent: `external-process-started`
}

object WindowExternalProcessStartedEvent {
  @scala.inline
  def apply(name: String, processUuid: String, topic: window, `type`: `external-process-started`, uuid: String): WindowExternalProcessStartedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowExternalProcessStartedEvent]
  }
}

