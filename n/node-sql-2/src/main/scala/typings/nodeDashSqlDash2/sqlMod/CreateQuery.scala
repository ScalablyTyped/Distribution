package typings.nodeDashSqlDash2.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQuery extends Executable {
  def ifNotExists(): Executable
}

object CreateQuery {
  @scala.inline
  def apply(ifNotExists: () => Executable, toQuery: () => QueryLike): CreateQuery = {
    val __obj = js.Dynamic.literal(ifNotExists = js.Any.fromFunction0(ifNotExists), toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[CreateQuery]
  }
}

