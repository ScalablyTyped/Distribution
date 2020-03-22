package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowExternalProcessExitedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var exitCode: Double
  var processUuid: String
}

object WindowExternalProcessExitedEvent {
  @scala.inline
  def apply[Topic, Type](exitCode: Double, name: String, processUuid: String, topic: Topic, `type`: Type, uuid: String): WindowExternalProcessExitedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowExternalProcessExitedEvent[Topic, Type]]
  }
}

