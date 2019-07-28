package typings.nodeDashSqlDash2.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropQuery extends Executable {
  def ifExists(): Executable
}

object DropQuery {
  @scala.inline
  def apply(ifExists: () => Executable, toQuery: () => QueryLike): DropQuery = {
    val __obj = js.Dynamic.literal(ifExists = js.Any.fromFunction0(ifExists), toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[DropQuery]
  }
}

