package typings.numeric.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dopri extends js.Object {
  
  def at(x: Vector): Vector | Matrix = js.native
  
  var events: js.UndefOr[Boolean | VectorBoolean] = js.native
  
  var f: Vector = js.native
  
  var iterations: Double = js.native
  
  var msg: String = js.native
  
  var x: Vector = js.native
  
  var y: Vector = js.native
  
  var ymid: Vector = js.native
}
object Dopri {
  
  @scala.inline
  def apply(
    at: Vector => Vector | Matrix,
    f: Vector,
    iterations: Double,
    msg: String,
    x: Vector,
    y: Vector,
    ymid: Vector
  ): Dopri = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), f = f.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], ymid = ymid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dopri]
  }
  
  @scala.inline
  implicit class DopriOps[Self <: Dopri] (val x: Self) extends AnyVal {
    
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
    def setAt(value: Vector => Vector | Matrix): Self = this.set("at", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFVarargs(value: Double*): Self = this.set("f", js.Array(value :_*))
    
    @scala.inline
    def setF(value: Vector): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: Double*): Self = this.set("x", js.Array(value :_*))
    
    @scala.inline
    def setX(value: Vector): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarargs(value: Double*): Self = this.set("y", js.Array(value :_*))
    
    @scala.inline
    def setY(value: Vector): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmidVarargs(value: Double*): Self = this.set("ymid", js.Array(value :_*))
    
    @scala.inline
    def setYmid(value: Vector): Self = this.set("ymid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: Boolean*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: Boolean | VectorBoolean): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
  }
}
