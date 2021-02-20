package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
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
  implicit class WindowExternalProcessExitedEventMutableBuilder[Self <: WindowExternalProcessExitedEvent[_, _], Topic, Type] (val x: Self with (WindowExternalProcessExitedEvent[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessUuid(value: String): Self = StObject.set(x, "processUuid", value.asInstanceOf[js.Any])
  }
}
