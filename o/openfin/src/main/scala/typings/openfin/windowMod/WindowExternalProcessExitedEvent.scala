package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowExternalProcessExitedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var exitCode: Double = js.native
  
  var processUuid: String = js.native
}
object WindowExternalProcessExitedEvent {
  
  @scala.inline
  def apply[Topic, Type](exitCode: Double, name: String, processUuid: String, topic: Topic, `type`: Type, uuid: String): WindowExternalProcessExitedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowExternalProcessExitedEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowExternalProcessExitedEventOps[Self <: WindowExternalProcessExitedEvent[_, _], Topic, Type] (val x: Self with (WindowExternalProcessExitedEvent[Topic, Type])) extends AnyVal {
    
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
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessUuid(value: String): Self = this.set("processUuid", value.asInstanceOf[js.Any])
  }
}
