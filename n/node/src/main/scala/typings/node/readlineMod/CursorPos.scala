package typings.node.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorPos extends js.Object {
  var cols: Double
  var rows: Double
}

object CursorPos {
  @scala.inline
  def apply(cols: Double, rows: Double): CursorPos = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CursorPos]
  }
}

