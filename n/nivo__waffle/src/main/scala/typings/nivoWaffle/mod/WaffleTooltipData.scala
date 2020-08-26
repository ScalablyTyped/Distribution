package typings.nivoWaffle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/waffle.@nivo/waffle.WaffleDatum & {  color :string,   position :number,   row :number,   column :number,   groupIndex :number,   startAt :number,   endAt :number} */
@js.native
trait WaffleTooltipData extends js.Object {
  var color: String = js.native
  var column: Double = js.native
  var endAt: Double = js.native
  var groupIndex: Double = js.native
  var id: String | Double = js.native
  var label: String | Double = js.native
  var position: Double = js.native
  var row: Double = js.native
  var startAt: Double = js.native
  var value: Double = js.native
}

object WaffleTooltipData {
  @scala.inline
  def apply(
    color: String,
    column: Double,
    endAt: Double,
    groupIndex: Double,
    id: String | Double,
    label: String | Double,
    position: Double,
    row: Double,
    startAt: Double,
    value: Double
  ): WaffleTooltipData = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], endAt = endAt.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaffleTooltipData]
  }
  @scala.inline
  implicit class WaffleTooltipDataOps[Self <: WaffleTooltipData] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndAt(value: Double): Self = this.set("endAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String | Double): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAt(value: Double): Self = this.set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

