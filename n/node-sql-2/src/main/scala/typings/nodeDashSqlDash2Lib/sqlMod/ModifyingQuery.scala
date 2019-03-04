package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyingQuery extends Executable {
  def returning[U](nodes: js.Any*): Query[U]
  def where(nodes: js.Any*): ModifyingQuery
}

object ModifyingQuery {
  @scala.inline
  def apply(
    returning: js.Function1[/* repeated */ js.Any, Query[js.Any]],
    toQuery: js.Function0[QueryLike],
    where: js.Function1[/* repeated */ js.Any, ModifyingQuery]
  ): ModifyingQuery = {
    val __obj = js.Dynamic.literal(returning = returning, toQuery = toQuery, where = where)
  
    __obj.asInstanceOf[ModifyingQuery]
  }
}

