package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxesFactory extends StObject {
  
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
  implicit class AxesFactoryMutableBuilder[Self <: AxesFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromVertices(value: js.Array[Vector] => js.Array[Vector]): Self = StObject.set(x, "fromVertices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotate(value: (js.Array[Vector], Double) => Unit): Self = StObject.set(x, "rotate", js.Any.fromFunction2(value))
  }
}
