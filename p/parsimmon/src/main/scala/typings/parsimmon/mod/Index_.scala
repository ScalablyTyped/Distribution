package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index_ extends js.Object {
  /** one-based column offset */
  var column: Double
  /** one-based line offset */
  var line: Double
  /** zero-based character offset */
  var offset: Double
}

object Index_ {
  @scala.inline
  def apply(column: Double, line: Double, offset: Double): Index_ = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Index_]
  }
}

