package typings
package olLib.kineticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kinetic extends js.Object {
  def begin(): scala.Unit
  def end(): scala.Boolean
  def getAngle(): scala.Double
  def getDistance(): scala.Double
  def update(x: scala.Double, y: scala.Double): scala.Unit
}

object Kinetic {
  @scala.inline
  def apply(
    begin: () => scala.Unit,
    end: () => scala.Boolean,
    getAngle: () => scala.Double,
    getDistance: () => scala.Double,
    update: (scala.Double, scala.Double) => scala.Unit
  ): Kinetic = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), getAngle = js.Any.fromFunction0(getAngle), getDistance = js.Any.fromFunction0(getDistance), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[Kinetic]
  }
}

