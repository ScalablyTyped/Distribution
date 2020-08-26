package typings.nivoCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  stroke :string,   strokeWidth :number,   strokeOpacity :number,   strokeDasharray :string}> */
@js.native
trait Partialstrokestringstroke extends js.Object {
  var stroke: js.UndefOr[String] = js.native
  var strokeDasharray: js.UndefOr[String] = js.native
  var strokeOpacity: js.UndefOr[Double] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
}

object Partialstrokestringstroke {
  @scala.inline
  def apply(): Partialstrokestringstroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialstrokestringstroke]
  }
  @scala.inline
  implicit class PartialstrokestringstrokeOps[Self <: Partialstrokestringstroke] (val x: Self) extends AnyVal {
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
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeDasharray(value: String): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

