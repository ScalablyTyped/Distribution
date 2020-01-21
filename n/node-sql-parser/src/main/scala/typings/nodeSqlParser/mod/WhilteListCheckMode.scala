package typings.nodeSqlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeSqlParser.nodeSqlParserStrings.table
  - typings.nodeSqlParser.nodeSqlParserStrings.column
*/
trait WhilteListCheckMode extends js.Object

object WhilteListCheckMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def column: typings.nodeSqlParser.nodeSqlParserStrings.column = this.cast("column")
  @scala.inline
  def table: typings.nodeSqlParser.nodeSqlParserStrings.table = this.cast("table")
}

