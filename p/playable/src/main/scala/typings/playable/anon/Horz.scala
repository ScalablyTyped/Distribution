package typings.playable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Horz extends js.Object {
  
  var horz: Double = js.native
  
  var vert: Double = js.native
}
object Horz {
  
  @scala.inline
  def apply(horz: Double, vert: Double): Horz = {
    val __obj = js.Dynamic.literal(horz = horz.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horz]
  }
  
  @scala.inline
  implicit class HorzOps[Self <: Horz] (val x: Self) extends AnyVal {
    
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
    def setHorz(value: Double): Self = this.set("horz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVert(value: Double): Self = this.set("vert", value.asInstanceOf[js.Any])
  }
}
