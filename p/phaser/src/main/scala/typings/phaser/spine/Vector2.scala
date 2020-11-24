package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector2 extends js.Object {
  
  def length(): Double = js.native
  
  def normalize(): this.type = js.native
  
  def set(x: Double, y: Double): Vector2 = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Vector2 {
  
  @scala.inline
  def apply(
    length: () => Double,
    normalize: () => Vector2,
    set: (Double, Double) => Vector2,
    x: Double,
    y: Double
  ): Vector2 = {
    val __obj = js.Dynamic.literal(length = js.Any.fromFunction0(length), normalize = js.Any.fromFunction0(normalize), set = js.Any.fromFunction2(set), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector2]
  }
  
  @scala.inline
  implicit class Vector2Ops[Self <: Vector2] (val x: Self) extends AnyVal {
    
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
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNormalize(value: () => Vector2): Self = this.set("normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (Double, Double) => Vector2): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
