package typings.node.childProcessMod

import typings.node.processMod.global.NodeJS.Signals
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnSyncReturns[T] extends StObject {
  
  var error: js.UndefOr[Error] = js.undefined
  
  var output: js.Array[String]
  
  var pid: Double
  
  var signal: Signals | Null
  
  var status: Double | Null
  
  var stderr: T
  
  var stdout: T
}
object SpawnSyncReturns {
  
  @scala.inline
  def apply[T](output: js.Array[String], pid: Double, stderr: T, stdout: T): SpawnSyncReturns[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], signal = null, status = null)
    __obj.asInstanceOf[SpawnSyncReturns[T]]
  }
  
  @scala.inline
  implicit class SpawnSyncReturnsMutableBuilder[Self <: SpawnSyncReturns[?], T] (val x: Self & SpawnSyncReturns[T]) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setOutput(value: js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value :_*))
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: Signals): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalNull: Self = StObject.set(x, "signal", null)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStderr(value: T): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: T): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
