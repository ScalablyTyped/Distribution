package typings.node.childProcessMod

import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnSyncReturns[T] extends StObject {
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var output: js.Array[T | Null]
  
  var pid: Double
  
  var signal: Signals | Null
  
  var status: Double | Null
  
  var stderr: T
  
  var stdout: T
}
object SpawnSyncReturns {
  
  inline def apply[T](output: js.Array[T | Null], pid: Double, stderr: T, stdout: T): SpawnSyncReturns[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], signal = null, status = null)
    __obj.asInstanceOf[SpawnSyncReturns[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpawnSyncReturns[?], T] (val x: Self & SpawnSyncReturns[T]) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setOutput(value: js.Array[T | Null]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputVarargs(value: (T | Null)*): Self = StObject.set(x, "output", js.Array(value*))
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: Signals): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalNull: Self = StObject.set(x, "signal", null)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStderr(value: T): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: T): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
