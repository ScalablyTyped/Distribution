package typings.numeric.numericMod

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
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), f = f.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], ymid = ymid.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dopri]
  }
}

