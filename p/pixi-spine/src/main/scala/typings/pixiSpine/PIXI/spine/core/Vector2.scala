package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector2 extends js.Object {
  var x: Double
  var y: Double
  def length(): Double
  def normalize(): this.type
  def set(x: Double, y: Double): Vector2
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
}

