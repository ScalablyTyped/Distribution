package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var color: typings.plotlyJs.mod.Color = js.native
  var range: js.Array[Double] = js.native
}

object Color {
  @scala.inline
  def apply(color: typings.plotlyJs.mod.Color, range: js.Array[Double]): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[Double]): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

