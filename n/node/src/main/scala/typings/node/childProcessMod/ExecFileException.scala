package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Error because Already inherited
- typings.node.NodeJS.ErrnoException because var conflicts: cause, code, message, name, stack. Inlined errno, path, syscall */ trait ExecFileException
  extends StObject
     with ExecException {
  
  var errno: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var syscall: js.UndefOr[String] = js.undefined
}
object ExecFileException {
  
  inline def apply(message: String, name: String): ExecFileException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileException]
  }
  
  extension [Self <: ExecFileException](x: Self) {
    
    inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
    
    inline def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSyscall(value: String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
    
    inline def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
  }
}
