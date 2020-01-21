package typings.pgMinify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorPosition extends js.Object {
  var column: Double
  var line: Double
}

object IErrorPosition {
  @scala.inline
  def apply(column: Double, line: Double): IErrorPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IErrorPosition]
  }
}

