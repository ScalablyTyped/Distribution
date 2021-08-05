package typings.memfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processMod {
  
  @JSImport("memfs/lib/process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("memfs/lib/process", JSImport.Default)
  @js.native
  val default: IProcess = js.native
  
  inline def createProcess(): IProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("createProcess")().asInstanceOf[IProcess]
  
  trait IProcess extends StObject {
    
    def cwd(): String
    
    def emitWarning(message: String, `type`: String): Unit
    
    def getgid(): Double
    
    def getuid(): Double
    
    def nextTick(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Unit
    
    var platform: String
  }
  object IProcess {
    
    inline def apply(
      cwd: () => String,
      emitWarning: (String, String) => Unit,
      getgid: () => Double,
      getuid: () => Double,
      nextTick: (js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Unit,
      platform: String
    ): IProcess = {
      val __obj = js.Dynamic.literal(cwd = js.Any.fromFunction0(cwd), emitWarning = js.Any.fromFunction2(emitWarning), getgid = js.Any.fromFunction0(getgid), getuid = js.Any.fromFunction0(getuid), nextTick = js.Any.fromFunction2(nextTick), platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProcess]
    }
    
    extension [Self <: IProcess](x: Self) {
      
      inline def setCwd(value: () => String): Self = StObject.set(x, "cwd", js.Any.fromFunction0(value))
      
      inline def setEmitWarning(value: (String, String) => Unit): Self = StObject.set(x, "emitWarning", js.Any.fromFunction2(value))
      
      inline def setGetgid(value: () => Double): Self = StObject.set(x, "getgid", js.Any.fromFunction0(value))
      
      inline def setGetuid(value: () => Double): Self = StObject.set(x, "getuid", js.Any.fromFunction0(value))
      
      inline def setNextTick(value: (js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "nextTick", js.Any.fromFunction2(value))
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
}
