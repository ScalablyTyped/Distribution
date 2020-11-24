package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  
  def End(): Pos = js.native
  
  def Pos(): typings.mvdanSh.mod.Pos = js.native
}
object Node {
  
  @scala.inline
  def apply(End: () => Pos, Pos: () => Pos): Node = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Pos = js.Any.fromFunction0(Pos))
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => Pos): Self = this.set("End", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPos(value: () => Pos): Self = this.set("Pos", js.Any.fromFunction0(value))
  }
}
