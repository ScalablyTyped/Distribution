package typings.nivoAxes.mod

import typings.nivoScales.mod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scales extends js.Object {
  var xScale: js.UndefOr[Scale] = js.native
  var yScale: js.UndefOr[Scale] = js.native
}

object Scales {
  @scala.inline
  def apply(): Scales = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scales]
  }
  @scala.inline
  implicit class ScalesOps[Self <: Scales] (val x: Self) extends AnyVal {
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
    def setXScale(value: Scale): Self = this.set("xScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXScale: Self = this.set("xScale", js.undefined)
    @scala.inline
    def setYScale(value: Scale): Self = this.set("yScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYScale: Self = this.set("yScale", js.undefined)
  }
  
}

