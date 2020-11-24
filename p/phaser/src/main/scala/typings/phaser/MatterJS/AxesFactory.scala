package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxesFactory extends js.Object {
  
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {vertices} vertices
    * @return {axes} A new axes from the given vertices
    */
  def fromVertices(vertices: js.Array[Vector]): js.Array[Vector] = js.native
  
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  def rotate(axes: js.Array[Vector], angle: Double): Unit = js.native
}
object AxesFactory {
  
  @scala.inline
  def apply(fromVertices: js.Array[Vector] => js.Array[Vector], rotate: (js.Array[Vector], Double) => Unit): AxesFactory = {
    val __obj = js.Dynamic.literal(fromVertices = js.Any.fromFunction1(fromVertices), rotate = js.Any.fromFunction2(rotate))
    __obj.asInstanceOf[AxesFactory]
  }
  
  @scala.inline
  implicit class AxesFactoryOps[Self <: AxesFactory] (val x: Self) extends AnyVal {
    
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
    def setFromVertices(value: js.Array[Vector] => js.Array[Vector]): Self = this.set("fromVertices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotate(value: (js.Array[Vector], Double) => Unit): Self = this.set("rotate", js.Any.fromFunction2(value))
  }
}
