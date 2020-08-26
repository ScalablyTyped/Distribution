package typings.nivoBar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarExtendedDatum extends js.Object {
  var color: String = js.native
  var data: BarDatum = js.native
  var id: Value = js.native
  var index: Double = js.native
  var indexValue: Value = js.native
  var value: Double = js.native
}

object BarExtendedDatum {
  @scala.inline
  def apply(color: String, data: BarDatum, id: Value, index: Double, indexValue: Value, value: Double): BarExtendedDatum = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexValue = indexValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarExtendedDatum]
  }
  @scala.inline
  implicit class BarExtendedDatumOps[Self <: BarExtendedDatum] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: BarDatum): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Value): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexValue(value: Value): Self = this.set("indexValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

