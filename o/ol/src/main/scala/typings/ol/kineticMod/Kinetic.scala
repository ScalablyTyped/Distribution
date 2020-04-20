package typings.ol.kineticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kinetic extends js.Object {
  def begin(): Unit
  def end(): Boolean
  def getAngle(): Double
  def getDistance(): Double
  def update(x: Double, y: Double): Unit
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
}

