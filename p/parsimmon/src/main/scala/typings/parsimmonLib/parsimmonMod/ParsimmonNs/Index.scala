package typings
package parsimmonLib.parsimmonMod.ParsimmonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  /** one-based column offset */
  var column: scala.Double
  /** one-based line offset */
  var line: scala.Double
  /** zero-based character offset */
  var offset: scala.Double
}

object Index {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, offset: scala.Double): Index = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Index]
  }
}

