package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesFactory extends js.Object {
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {vertices} vertices
    * @return {axes} A new axes from the given vertices
    */
  def fromVertices(vertices: js.Array[Vector]): js.Array[Vector]
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  def rotate(axes: js.Array[Vector], angle: Double): Unit
}

object AxesFactory {
  @scala.inline
  def apply(fromVertices: js.Array[Vector] => js.Array[Vector], rotate: (js.Array[Vector], Double) => Unit): AxesFactory = {
    val __obj = js.Dynamic.literal(fromVertices = js.Any.fromFunction1(fromVertices), rotate = js.Any.fromFunction2(rotate))
    __obj.asInstanceOf[AxesFactory]
  }
}

