package typings
package atNivoWaffleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: java.lang.String
  var column: scala.Double
  var endAt: scala.Double
  var groupIndex: scala.Double
  var position: scala.Double
  var row: scala.Double
  var startAt: scala.Double
}

object Anon_Color {
  @scala.inline
  def apply(
    color: java.lang.String,
    column: scala.Double,
    endAt: scala.Double,
    groupIndex: scala.Double,
    position: scala.Double,
    row: scala.Double,
    startAt: scala.Double
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color, column = column, endAt = endAt, groupIndex = groupIndex, position = position, row = row, startAt = startAt)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

