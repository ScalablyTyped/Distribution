package typings.nivoChord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/chord.Omit<@nivo/chord.@nivo/chord.ArcData, 'formattedValue' | 'label'> */
@js.native
trait OmitArcDataformattedValue extends js.Object {
  var color: String = js.native
  var endAngle: Double = js.native
  var id: String = js.native
  var index: Double = js.native
  var startAngle: Double = js.native
  var value: Double = js.native
}

object OmitArcDataformattedValue {
  @scala.inline
  def apply(color: String, endAngle: Double, id: String, index: Double, startAngle: Double, value: Double): OmitArcDataformattedValue = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitArcDataformattedValue]
  }
  @scala.inline
  implicit class OmitArcDataformattedValueOps[Self <: OmitArcDataformattedValue] (val x: Self) extends AnyVal {
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
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

