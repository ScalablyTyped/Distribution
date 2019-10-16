package typings.atNivoWaffle.atNivoWaffleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/waffle.@nivo/waffle.WaffleDatum & {  color  :string,   position  :number,   row  :number,   column  :number,   groupIndex  :number,   startAt  :number,   endAt  :number} */
trait WaffleTooltipData extends js.Object {
  var color: String
  var column: Double
  var endAt: Double
  var groupIndex: Double
  var id: String | Double
  var label: String | Double
  var position: Double
  var row: Double
  var startAt: Double
  var value: Double
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
    val __obj = js.Dynamic.literal(color = color, column = column, endAt = endAt, groupIndex = groupIndex, id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], position = position, row = row, startAt = startAt, value = value)
  
    __obj.asInstanceOf[WaffleTooltipData]
  }
}

