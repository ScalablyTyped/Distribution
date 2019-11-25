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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

