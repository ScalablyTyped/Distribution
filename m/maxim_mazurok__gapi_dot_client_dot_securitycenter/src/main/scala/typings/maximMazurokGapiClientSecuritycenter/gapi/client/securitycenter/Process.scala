package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Process extends StObject {
  
  /** Process arguments as JSON encoded strings. */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /** True if `args` is incomplete. */
  var argumentsTruncated: js.UndefOr[Boolean] = js.undefined
  
  /** File information for the process executable. */
  var binary: js.UndefOr[File] = js.undefined
  
  /** Process environment variables. */
  var envVariables: js.UndefOr[js.Array[EnvironmentVariable]] = js.undefined
  
  /** True if `env_variables` is incomplete. */
  var envVariablesTruncated: js.UndefOr[Boolean] = js.undefined
  
  /** File information for libraries loaded by the process. */
  var libraries: js.UndefOr[js.Array[File]] = js.undefined
  
  /** The process name visible in utilities like `top` and `ps`; it can be accessed via `/proc/[pid]/comm` and changed with `prctl(PR_SET_NAME)`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The parent process id. */
  var parentPid: js.UndefOr[String] = js.undefined
  
  /** The process id. */
  var pid: js.UndefOr[String] = js.undefined
  
  /**
    * When the process represents the invocation of a script, `binary` provides information about the interpreter while `script` provides information about the script file provided to the
    * interpreter.
    */
  var script: js.UndefOr[File] = js.undefined
}
object Process {
  
  inline def apply(): Process = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Process]
  }
  
  extension [Self <: Process](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setArgumentsTruncated(value: Boolean): Self = StObject.set(x, "argumentsTruncated", value.asInstanceOf[js.Any])
    
    inline def setArgumentsTruncatedUndefined: Self = StObject.set(x, "argumentsTruncated", js.undefined)
    
    inline def setBinary(value: File): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setEnvVariables(value: js.Array[EnvironmentVariable]): Self = StObject.set(x, "envVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvVariablesTruncated(value: Boolean): Self = StObject.set(x, "envVariablesTruncated", value.asInstanceOf[js.Any])
    
    inline def setEnvVariablesTruncatedUndefined: Self = StObject.set(x, "envVariablesTruncated", js.undefined)
    
    inline def setEnvVariablesUndefined: Self = StObject.set(x, "envVariables", js.undefined)
    
    inline def setEnvVariablesVarargs(value: EnvironmentVariable*): Self = StObject.set(x, "envVariables", js.Array(value*))
    
    inline def setLibraries(value: js.Array[File]): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
    
    inline def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
    
    inline def setLibrariesVarargs(value: File*): Self = StObject.set(x, "libraries", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentPid(value: String): Self = StObject.set(x, "parentPid", value.asInstanceOf[js.Any])
    
    inline def setParentPidUndefined: Self = StObject.set(x, "parentPid", js.undefined)
    
    inline def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    
    inline def setScript(value: File): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
