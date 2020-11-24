package typings.memfs.processMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProcess extends js.Object {
  
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
  implicit class IProcessOps[Self <: IProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCwd(value: () => String): Self = this.set("cwd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmitWarning(value: (String, String) => Unit): Self = this.set("emitWarning", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetgid(value: () => Double): Self = this.set("getgid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetuid(value: () => Double): Self = this.set("getuid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextTick(value: (js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Unit): Self = this.set("nextTick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
  }
}
