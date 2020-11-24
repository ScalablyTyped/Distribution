package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lit extends Node {
  
  var Value: String = js.native
  
  var ValueEnd: Pos = js.native
  
  var ValuePos: Pos = js.native
}
object Lit {
  
  @scala.inline
  def apply(End: () => Pos, Pos: () => Pos, Value: String, ValueEnd: Pos, ValuePos: Pos): Lit = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Pos = js.Any.fromFunction0(Pos), Value = Value.asInstanceOf[js.Any], ValueEnd = ValueEnd.asInstanceOf[js.Any], ValuePos = ValuePos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lit]
  }
  
  @scala.inline
  implicit class LitOps[Self <: Lit] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueEnd(value: Pos): Self = this.set("ValueEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePos(value: Pos): Self = this.set("ValuePos", value.asInstanceOf[js.Any])
  }
}
