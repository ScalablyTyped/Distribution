package typings.nedb.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CursorCount extends js.Object {
  
  def exec(callback: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]): Unit = js.native
}
object CursorCount {
  
  @scala.inline
  def apply(exec: js.Function2[/* err */ Error | Null, /* count */ Double, Unit] => Unit): CursorCount = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
    __obj.asInstanceOf[CursorCount]
  }
  
  @scala.inline
  implicit class CursorCountOps[Self <: CursorCount] (val x: Self) extends AnyVal {
    
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
    def setExec(value: js.Function2[/* err */ Error | Null, /* count */ Double, Unit] => Unit): Self = this.set("exec", js.Any.fromFunction1(value))
  }
}
