package typings.numeric.numericMod

import typings.numeric.Matrix
import typings.numeric.Vector
import typings.numeric.VectorBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dopri extends js.Object {
  var events: js.UndefOr[Boolean | VectorBoolean] = js.undefined
  var f: Vector
  var iterations: Double
  var msg: String
  var x: Vector
  var y: Vector
  var ymid: Vector
  def at(x: Vector): Vector | Matrix
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
    ymid: Vector,
    events: Boolean | VectorBoolean = null
  ): Dopri = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), f = f, iterations = iterations, msg = msg, x = x, y = y, ymid = ymid)
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dopri]
  }
}

