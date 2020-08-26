package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`external-process-started`
import typings.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowExternalProcessStartedEvent extends WindowBaseEvent {
  /**
    * the process handle uuid
    */
  var processUuid: String = js.native
  @JSName("type")
  var type_WindowExternalProcessStartedEvent: `external-process-started` = js.native
}

object WindowExternalProcessStartedEvent {
  @scala.inline
  def apply(name: String, processUuid: String, topic: window, `type`: `external-process-started`, uuid: String): WindowExternalProcessStartedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowExternalProcessStartedEvent]
  }
  @scala.inline
  implicit class WindowExternalProcessStartedEventOps[Self <: WindowExternalProcessStartedEvent] (val x: Self) extends AnyVal {
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
    def setProcessUuid(value: String): Self = this.set("processUuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `external-process-started`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

