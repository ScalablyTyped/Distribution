package typings.parsimmon.parsimmonMod

import org.scalablytyped.runtime.TopLevel
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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Index]
  }
}

/**
	 * is a parser that yields the current index of the parse.
	 */
@JSImport("parsimmon", "index")
@js.native
object index extends TopLevel[Parser[Index]]

