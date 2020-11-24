package typings.plugapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogObject extends js.Object {
  
  def log(): Unit = js.native
}
object LogObject {
  
  @scala.inline
  def apply(log: () => Unit): LogObject = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction0(log))
    __obj.asInstanceOf[LogObject]
  }
  
  @scala.inline
  implicit class LogObjectOps[Self <: LogObject] (val x: Self) extends AnyVal {
    
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
    def setLog(value: () => Unit): Self = this.set("log", js.Any.fromFunction0(value))
  }
}
