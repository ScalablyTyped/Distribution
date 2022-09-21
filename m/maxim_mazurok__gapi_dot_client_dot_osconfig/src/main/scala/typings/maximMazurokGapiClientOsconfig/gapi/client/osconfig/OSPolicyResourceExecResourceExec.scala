package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceExecResourceExec extends StObject {
  
  /** Optional arguments to pass to the source during execution. */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A remote or local file. */
  var file: js.UndefOr[OSPolicyResourceFile] = js.undefined
  
  /** Required. The script interpreter to use. */
  var interpreter: js.UndefOr[String] = js.undefined
  
  /**
    * Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or
    * failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
    */
  var outputFilePath: js.UndefOr[String] = js.undefined
  
  /** An inline script. The size of the script is limited to 1024 characters. */
  var script: js.UndefOr[String] = js.undefined
}
object OSPolicyResourceExecResourceExec {
  
  inline def apply(): OSPolicyResourceExecResourceExec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceExecResourceExec]
  }
  
  extension [Self <: OSPolicyResourceExecResourceExec](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFile(value: OSPolicyResourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setInterpreter(value: String): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setOutputFilePath(value: String): Self = StObject.set(x, "outputFilePath", value.asInstanceOf[js.Any])
    
    inline def setOutputFilePathUndefined: Self = StObject.set(x, "outputFilePath", js.undefined)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
