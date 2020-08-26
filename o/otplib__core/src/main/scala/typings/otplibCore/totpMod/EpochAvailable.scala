package typings.otplibCore.totpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpochAvailable extends js.Object {
  var current: Double = js.native
  var future: js.Array[Double] = js.native
  var past: js.Array[Double] = js.native
}

object EpochAvailable {
  @scala.inline
  def apply(current: Double, future: js.Array[Double], past: js.Array[Double]): EpochAvailable = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpochAvailable]
  }
  @scala.inline
  implicit class EpochAvailableOps[Self <: EpochAvailable] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setFutureVarargs(value: Double*): Self = this.set("future", js.Array(value :_*))
    @scala.inline
    def setFuture(value: js.Array[Double]): Self = this.set("future", value.asInstanceOf[js.Any])
    @scala.inline
    def setPastVarargs(value: Double*): Self = this.set("past", js.Array(value :_*))
    @scala.inline
    def setPast(value: js.Array[Double]): Self = this.set("past", value.asInstanceOf[js.Any])
  }
  
}

