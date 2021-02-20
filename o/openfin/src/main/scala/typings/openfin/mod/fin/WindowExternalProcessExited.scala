package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`external-process-exited`
import typings.openfin.openfinStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowExternalProcessExited extends WindowBaseEvent {
  
  /**
    * the process exit code
    */
  var exitCode: Double = js.native
  
  /**
    * the process handle uuid
    */
  var processUuid: String = js.native
  
  @JSName("type")
  var type_WindowExternalProcessExited: `external-process-exited` = js.native
}
object WindowExternalProcessExited {
  
  @scala.inline
  def apply(
    exitCode: Double,
    name: String,
    processUuid: String,
    topic: window,
    `type`: `external-process-exited`,
    uuid: String
  ): WindowExternalProcessExited = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowExternalProcessExited]
  }
  
  @scala.inline
  implicit class WindowExternalProcessExitedMutableBuilder[Self <: WindowExternalProcessExited] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessUuid(value: String): Self = StObject.set(x, "processUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `external-process-exited`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
