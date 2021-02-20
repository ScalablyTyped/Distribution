package typings.memfs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processMod extends Shortcut {
  
  @JSImport("memfs/lib/process", JSImport.Default)
  @js.native
  val default: IProcess = js.native
  
  @JSImport("memfs/lib/process", "createProcess")
  @js.native
  def createProcess(): IProcess = js.native
  
  @js.native
  trait IProcess extends StObject {
    
    def cwd(): String = js.native
    
    def emitWarning(message: String, `type`: String): Unit = js.native
    
    def getgid(): Double = js.native
    
    def getuid(): Double = js.native
    
    def nextTick(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Unit = js.native
    
    var platform: String = js.native
  }
  object IProcess {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IProcessMutableBuilder[Self <: IProcess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: () => String): Self = StObject.set(x, "cwd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmitWarning(value: (String, String) => Unit): Self = StObject.set(x, "emitWarning", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetgid(value: () => Double): Self = StObject.set(x, "getgid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetuid(value: () => Double): Self = StObject.set(x, "getuid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNextTick(value: (js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "nextTick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = IProcess
  
  /* This means you don't have to write `default`, but can instead just say `processMod.foo` */
  override def _to: IProcess = default
}
