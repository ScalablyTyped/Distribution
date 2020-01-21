package typings.nivoLegends.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nivoLegends.nivoLegendsStrings.row
  - typings.nivoLegends.nivoLegendsStrings.column
*/
trait LegendDirection extends js.Object

object LegendDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def column: typings.nivoLegends.nivoLegendsStrings.column = this.cast("column")
  @scala.inline
  def row: typings.nivoLegends.nivoLegendsStrings.row = this.cast("row")
}

