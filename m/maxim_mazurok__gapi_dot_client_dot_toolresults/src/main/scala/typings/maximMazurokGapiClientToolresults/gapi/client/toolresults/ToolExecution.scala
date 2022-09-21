package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolExecution extends StObject {
  
  /**
    * The full tokenized command line including the program name (equivalent to argv in a C program). - In response: present if set by create request - In create request: optional - In
    * update request: never set
    */
  var commandLineArguments: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Tool execution exit code. This field will be set once the tool has exited. - In response: present if set by create/update request - In create request: optional - In update request:
    * optional, a FAILED_PRECONDITION error will be returned if an exit_code is already set.
    */
  var exitCode: js.UndefOr[ToolExitCode] = js.undefined
  
  /**
    * References to any plain text logs output the tool execution. This field can be set before the tool has exited in order to be able to have access to a live view of the logs while the
    * tool is running. The maximum allowed number of tool logs per step is 1000. - In response: present if set by create/update request - In create request: optional - In update request:
    * optional, any value provided will be appended to the existing list
    */
  var toolLogs: js.UndefOr[js.Array[FileReference]] = js.undefined
  
  /**
    * References to opaque files of any format output by the tool execution. The maximum allowed number of tool outputs per step is 1000. - In response: present if set by create/update
    * request - In create request: optional - In update request: optional, any value provided will be appended to the existing list
    */
  var toolOutputs: js.UndefOr[js.Array[ToolOutputReference]] = js.undefined
}
object ToolExecution {
  
  inline def apply(): ToolExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolExecution]
  }
  
  extension [Self <: ToolExecution](x: Self) {
    
    inline def setCommandLineArguments(value: js.Array[String]): Self = StObject.set(x, "commandLineArguments", value.asInstanceOf[js.Any])
    
    inline def setCommandLineArgumentsUndefined: Self = StObject.set(x, "commandLineArguments", js.undefined)
    
    inline def setCommandLineArgumentsVarargs(value: String*): Self = StObject.set(x, "commandLineArguments", js.Array(value*))
    
    inline def setExitCode(value: ToolExitCode): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setToolLogs(value: js.Array[FileReference]): Self = StObject.set(x, "toolLogs", value.asInstanceOf[js.Any])
    
    inline def setToolLogsUndefined: Self = StObject.set(x, "toolLogs", js.undefined)
    
    inline def setToolLogsVarargs(value: FileReference*): Self = StObject.set(x, "toolLogs", js.Array(value*))
    
    inline def setToolOutputs(value: js.Array[ToolOutputReference]): Self = StObject.set(x, "toolOutputs", value.asInstanceOf[js.Any])
    
    inline def setToolOutputsUndefined: Self = StObject.set(x, "toolOutputs", js.undefined)
    
    inline def setToolOutputsVarargs(value: ToolOutputReference*): Self = StObject.set(x, "toolOutputs", js.Array(value*))
  }
}
