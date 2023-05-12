package typings.node.childProcessMod

import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<node.child_process.ExecException, 'code'> & std.Omit<node.NodeJS.ErrnoException, 'code'> & {  code :string | number | undefined | null} */
trait ExecFileException extends StObject {
  
  var cause: js.UndefOr[Any] = js.undefined
  
  var cmd: js.UndefOr[String] = js.undefined
  
  var code: js.UndefOr[String | Double | Null] = js.undefined
  
  var errno: js.UndefOr[Double] = js.undefined
  
  var killed: js.UndefOr[Boolean] = js.undefined
  
  var message: String
  
  var name: String
  
  var path: js.UndefOr[String] = js.undefined
  
  var signal: js.UndefOr[Signals] = js.undefined
  
  var stack: js.UndefOr[String] = js.undefined
  
  var syscall: js.UndefOr[String] = js.undefined
}
object ExecFileException {
  
  inline def apply(message: String, name: String): ExecFileException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecFileException] (val x: Self) extends AnyVal {
    
    inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
    
    inline def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
    
    inline def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
    
    inline def setKilled(value: Boolean): Self = StObject.set(x, "killed", value.asInstanceOf[js.Any])
    
    inline def setKilledUndefined: Self = StObject.set(x, "killed", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSignal(value: Signals): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setSyscall(value: String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
    
    inline def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
  }
}
