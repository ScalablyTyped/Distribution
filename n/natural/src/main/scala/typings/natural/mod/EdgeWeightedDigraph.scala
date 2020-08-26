package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeWeightedDigraph extends js.Object {
  def add(start: Double, end: Double, weight: Double): Unit = js.native
  def e(): Double = js.native
  def v(): Double = js.native
}

object EdgeWeightedDigraph {
  @scala.inline
  def apply(add: (Double, Double, Double) => Unit, e: () => Double, v: () => Double): EdgeWeightedDigraph = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), e = js.Any.fromFunction0(e), v = js.Any.fromFunction0(v))
    __obj.asInstanceOf[EdgeWeightedDigraph]
  }
  @scala.inline
  implicit class EdgeWeightedDigraphOps[Self <: EdgeWeightedDigraph] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Double, Double, Double) => Unit): Self = this.set("add", js.Any.fromFunction3(value))
    @scala.inline
    def setE(value: () => Double): Self = this.set("e", js.Any.fromFunction0(value))
    @scala.inline
    def setV(value: () => Double): Self = this.set("v", js.Any.fromFunction0(value))
  }
  
}

