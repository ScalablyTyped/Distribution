package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts extends StObject {
  
  /**
    * This specifies the maximum time that the task can run, excluding the time required to download inputs or upload outputs. That is, the worker will terminate the task if it runs
    * longer than this.
    */
  var execution: js.UndefOr[String] = js.undefined
  
  /**
    * This specifies the maximum amount of time the task can be idle - that is, go without generating some output in either stdout or stderr. If the process is silent for more than the
    * specified time, the worker will terminate the task.
    */
  var idle: js.UndefOr[String] = js.undefined
  
  /**
    * If the execution or IO timeouts are exceeded, the worker will try to gracefully terminate the task and return any existing logs. However, tasks may be hard-frozen in which case this
    * process will fail. This timeout specifies how long to wait for a terminated task to shut down gracefully (e.g. via SIGTERM) before we bring down the hammer (e.g. SIGKILL on *nix,
    * CTRL_BREAK_EVENT on Windows).
    */
  var shutdown: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts {
  
  inline def apply(): GoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts] (val x: Self) extends AnyVal {
    
    inline def setExecution(value: String): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
    
    inline def setIdle(value: String): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    inline def setShutdown(value: String): Self = StObject.set(x, "shutdown", value.asInstanceOf[js.Any])
    
    inline def setShutdownUndefined: Self = StObject.set(x, "shutdown", js.undefined)
  }
}
