package typings.nivoScatterplot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicSizeSpec extends js.Object {
  var key: String = js.native
  var sizes: js.Tuple2[Double, Double] = js.native
  var values: js.Tuple2[Double, Double] = js.native
}

object DynamicSizeSpec {
  @scala.inline
  def apply(key: String, sizes: js.Tuple2[Double, Double], values: js.Tuple2[Double, Double]): DynamicSizeSpec = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicSizeSpec]
  }
  @scala.inline
  implicit class DynamicSizeSpecOps[Self <: DynamicSizeSpec] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizes(value: js.Tuple2[Double, Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: js.Tuple2[Double, Double]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

