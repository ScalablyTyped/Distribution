package typings.nivoLegends.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  itemTextColor :string,   itemBackground :string,   itemOpacity :number,   symbolSize :number,   symbolBorderWidth :number,   symbolBorderColor :string}> */
@js.native
trait PartialitemTextColorstrin extends js.Object {
  var itemBackground: js.UndefOr[String] = js.native
  var itemOpacity: js.UndefOr[Double] = js.native
  var itemTextColor: js.UndefOr[String] = js.native
  var symbolBorderColor: js.UndefOr[String] = js.native
  var symbolBorderWidth: js.UndefOr[Double] = js.native
  var symbolSize: js.UndefOr[Double] = js.native
}

object PartialitemTextColorstrin {
  @scala.inline
  def apply(): PartialitemTextColorstrin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialitemTextColorstrin]
  }
  @scala.inline
  implicit class PartialitemTextColorstrinOps[Self <: PartialitemTextColorstrin] (val x: Self) extends AnyVal {
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
    def setItemBackground(value: String): Self = this.set("itemBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemBackground: Self = this.set("itemBackground", js.undefined)
    @scala.inline
    def setItemOpacity(value: Double): Self = this.set("itemOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemOpacity: Self = this.set("itemOpacity", js.undefined)
    @scala.inline
    def setItemTextColor(value: String): Self = this.set("itemTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTextColor: Self = this.set("itemTextColor", js.undefined)
    @scala.inline
    def setSymbolBorderColor(value: String): Self = this.set("symbolBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolBorderColor: Self = this.set("symbolBorderColor", js.undefined)
    @scala.inline
    def setSymbolBorderWidth(value: Double): Self = this.set("symbolBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolBorderWidth: Self = this.set("symbolBorderWidth", js.undefined)
    @scala.inline
    def setSymbolSize(value: Double): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
  }
  
}

