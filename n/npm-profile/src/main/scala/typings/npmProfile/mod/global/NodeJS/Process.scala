package typings.npmProfile.mod.global.NodeJS

import typings.npmProfile.mod.LogLevel
import typings.npmProfile.npmProfileStrings.`log `
import typings.npmProfile.npmProfileStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Process extends js.Object {
  
  @JSName("emit")
  def emit_log(event: log, logLevel: LogLevel, any: String*): Boolean = js.native
  
  @JSName("on")
  def on_log(event: `log `, listener: js.Function1[/* logLevel */ LogLevel, Unit]): this.type = js.native
}
object Process {
  
  @scala.inline
  def apply(
    emit: (log, LogLevel, /* repeated */ String) => Boolean,
    on: (`log `, js.Function1[/* logLevel */ LogLevel, Unit]) => Process
  ): Process = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction3(emit), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[Process]
  }
  
  @scala.inline
  implicit class ProcessOps[Self <: Process] (val x: Self) extends AnyVal {
    
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
    def setEmit(value: (log, LogLevel, /* repeated */ String) => Boolean): Self = this.set("emit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOn(value: (`log `, js.Function1[/* logLevel */ LogLevel, Unit]) => Process): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
