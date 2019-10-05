package typings.pegjs.pegjsMod.PEG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var column: Double
  var line: Double
  var offset: Double
}

object Location {
  @scala.inline
  def apply(column: Double, line: Double, offset: Double): Location = {
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[Location]
  }
}

