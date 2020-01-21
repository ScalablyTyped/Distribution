package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeWeightedDigraph extends js.Object {
  def add(start: Double, end: Double, weight: Double): Unit
  def e(): Double
  def v(): Double
}

object EdgeWeightedDigraph {
  @scala.inline
  def apply(add: (Double, Double, Double) => Unit, e: () => Double, v: () => Double): EdgeWeightedDigraph = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), e = js.Any.fromFunction0(e), v = js.Any.fromFunction0(v))
  
    __obj.asInstanceOf[EdgeWeightedDigraph]
  }
}

