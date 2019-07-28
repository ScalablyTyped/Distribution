package typings.nodeDashSqlDash2.sqlMod

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
    returning: /* repeated */ js.Any => Query[js.Any],
    toQuery: () => QueryLike,
    where: /* repeated */ js.Any => ModifyingQuery
  ): ModifyingQuery = {
    val __obj = js.Dynamic.literal(returning = js.Any.fromFunction1(returning), toQuery = js.Any.fromFunction0(toQuery), where = js.Any.fromFunction1(where))
  
    __obj.asInstanceOf[ModifyingQuery]
  }
}

