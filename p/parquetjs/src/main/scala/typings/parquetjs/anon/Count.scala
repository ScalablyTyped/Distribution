package typings.parquetjs.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count extends js.Object {
  var count: Double = js.native
  var dlevels: js.Array[Double] = js.native
  var rlevels: js.Array[Double] = js.native
  var values: js.Array[Buffer] = js.native
}

object Count {
  @scala.inline
  def apply(count: Double, dlevels: js.Array[Double], rlevels: js.Array[Double], values: js.Array[Buffer]): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dlevels = dlevels.asInstanceOf[js.Any], rlevels = rlevels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDlevelsVarargs(value: Double*): Self = this.set("dlevels", js.Array(value :_*))
    @scala.inline
    def setDlevels(value: js.Array[Double]): Self = this.set("dlevels", value.asInstanceOf[js.Any])
    @scala.inline
    def setRlevelsVarargs(value: Double*): Self = this.set("rlevels", js.Array(value :_*))
    @scala.inline
    def setRlevels(value: js.Array[Double]): Self = this.set("rlevels", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Buffer*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Buffer]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

