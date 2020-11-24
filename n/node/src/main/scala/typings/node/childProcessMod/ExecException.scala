package typings.node.childProcessMod

import typings.node.processMod.global.NodeJS.Signals
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecException extends Error {
  
  var cmd: js.UndefOr[String] = js.native
  
  var code: js.UndefOr[Double] = js.native
  
  var killed: js.UndefOr[Boolean] = js.native
  
  var signal: js.UndefOr[Signals] = js.native
}
object ExecException {
  
  @scala.inline
  def apply(message: String, name: String): ExecException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecException]
  }
  
  @scala.inline
  implicit class ExecExceptionOps[Self <: ExecException] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmd: Self = this.set("cmd", js.undefined)
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setKilled(value: Boolean): Self = this.set("killed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKilled: Self = this.set("killed", js.undefined)
    
    @scala.inline
    def setSignal(value: Signals): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
}
