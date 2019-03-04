package typings
package pegjsLib.pegjsMod.PEGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var offset: scala.Double
}

object Location {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, offset: scala.Double): Location = {
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[Location]
  }
}

