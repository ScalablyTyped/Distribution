package typings.ol.kineticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kinetic extends js.Object {
  
  /**
    * FIXME empty description for jsdoc
    */
  def begin(): Unit = js.native
  
  def end(): Boolean = js.native
  
  def getAngle(): Double = js.native
  
  def getDistance(): Double = js.native
  
  def update(x: Double, y: Double): Unit = js.native
}
object Kinetic {
  
  @scala.inline
  def apply(
    begin: () => Unit,
    end: () => Boolean,
    getAngle: () => Double,
    getDistance: () => Double,
    update: (Double, Double) => Unit
  ): Kinetic = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), getAngle = js.Any.fromFunction0(getAngle), getDistance = js.Any.fromFunction0(getDistance), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Kinetic]
  }
  
  @scala.inline
  implicit class KineticOps[Self <: Kinetic] (val x: Self) extends AnyVal {
    
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
    def setBegin(value: () => Unit): Self = this.set("begin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnd(value: () => Boolean): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAngle(value: () => Double): Self = this.set("getAngle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDistance(value: () => Double): Self = this.set("getDistance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: (Double, Double) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
}
