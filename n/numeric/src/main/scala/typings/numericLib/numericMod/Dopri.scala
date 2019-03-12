package typings
package numericLib.numericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dopri extends js.Object {
  var events: js.UndefOr[scala.Boolean | numericLib.VectorBoolean] = js.undefined
  var f: numericLib.Vector
  var iterations: scala.Double
  var msg: java.lang.String
  var x: numericLib.Vector
  var y: numericLib.Vector
  var ymid: numericLib.Vector
  def at(x: numericLib.Vector): numericLib.Vector | numericLib.Matrix
}

object Dopri {
  @scala.inline
  def apply(
    at: numericLib.Vector => numericLib.Vector | numericLib.Matrix,
    f: numericLib.Vector,
    iterations: scala.Double,
    msg: java.lang.String,
    x: numericLib.Vector,
    y: numericLib.Vector,
    ymid: numericLib.Vector,
    events: scala.Boolean | numericLib.VectorBoolean = null
  ): Dopri = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), f = f, iterations = iterations, msg = msg, x = x, y = y, ymid = ymid)
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dopri]
  }
}

