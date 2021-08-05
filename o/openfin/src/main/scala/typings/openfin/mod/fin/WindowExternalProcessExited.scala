package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`external-process-exited`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowExternalProcessExited
  extends StObject
     with WindowBaseEvent {
  
  /**
    * the process exit code
    */
  var exitCode: Double
  
  /**
    * the process handle uuid
    */
  var processUuid: String
  
  @JSName("type")
  var type_WindowExternalProcessExited: `external-process-exited`
}
object WindowExternalProcessExited {
  
  inline def apply(exitCode: Double, name: String, processUuid: String, uuid: String): WindowExternalProcessExited = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = "window", uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("external-process-exited")
    __obj.asInstanceOf[WindowExternalProcessExited]
  }
  
  extension [Self <: WindowExternalProcessExited](x: Self) {
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setProcessUuid(value: String): Self = StObject.set(x, "processUuid", value.asInstanceOf[js.Any])
    
    inline def setType(value: `external-process-exited`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
