package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowExternalProcessExitedEvent[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var exitCode: Double
  
  var processUuid: String
}
object WindowExternalProcessExitedEvent {
  
  inline def apply[Topic, Type](exitCode: Double, name: String, processUuid: String, topic: Topic, `type`: Type, uuid: String): WindowExternalProcessExitedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowExternalProcessExitedEvent[Topic, Type]]
  }
  
  extension [Self <: WindowExternalProcessExitedEvent[?, ?], Topic, Type](x: Self & (WindowExternalProcessExitedEvent[Topic, Type])) {
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setProcessUuid(value: String): Self = StObject.set(x, "processUuid", value.asInstanceOf[js.Any])
  }
}
