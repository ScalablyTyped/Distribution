package typings.parsimmon.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  /** one-based column offset */
  var column: Double
  /** one-based line offset */
  var line: Double
  /** zero-based character offset */
  var offset: Double
}

object Index {
  @scala.inline
  def apply(column: Double, line: Double, offset: Double): Index = {
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[Index]
  }
}

