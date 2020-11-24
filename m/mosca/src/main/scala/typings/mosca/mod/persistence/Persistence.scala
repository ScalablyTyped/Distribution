package typings.mosca.mod.persistence

import typings.mosca.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Persistence extends js.Object {
  
  def wire(server: Server): Unit = js.native
}
object Persistence {
  
  @scala.inline
  def apply(wire: Server => Unit): Persistence = {
    val __obj = js.Dynamic.literal(wire = js.Any.fromFunction1(wire))
    __obj.asInstanceOf[Persistence]
  }
  
  @scala.inline
  implicit class PersistenceOps[Self <: Persistence] (val x: Self) extends AnyVal {
    
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
    def setWire(value: Server => Unit): Self = this.set("wire", js.Any.fromFunction1(value))
  }
}
