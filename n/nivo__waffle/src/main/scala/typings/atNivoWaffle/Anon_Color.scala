package typings.atNivoWaffle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: String
  var column: Double
  var endAt: Double
  var groupIndex: Double
  var position: Double
  var row: Double
  var startAt: Double
}

object Anon_Color {
  @scala.inline
  def apply(
    color: String,
    column: Double,
    endAt: Double,
    groupIndex: Double,
    position: Double,
    row: Double,
    startAt: Double
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color, column = column, endAt = endAt, groupIndex = groupIndex, position = position, row = row, startAt = startAt)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

