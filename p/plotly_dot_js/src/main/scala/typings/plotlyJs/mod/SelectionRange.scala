package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionRange extends js.Object {
  var x: js.Array[Double] = js.native
  var y: js.Array[Double] = js.native
}

object SelectionRange {
  @scala.inline
  def apply(x: js.Array[Double], y: js.Array[Double]): SelectionRange = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRange]
  }
  @scala.inline
  implicit class SelectionRangeOps[Self <: SelectionRange] (val x: Self) extends AnyVal {
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
    def setXVarargs(value: Double*): Self = this.set("x", js.Array(value :_*))
    @scala.inline
    def setX(value: js.Array[Double]): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setYVarargs(value: Double*): Self = this.set("y", js.Array(value :_*))
    @scala.inline
    def setY(value: js.Array[Double]): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

