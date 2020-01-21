package typings.objection.mod

import typings.knex.mod.JoinClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithRaw[QM /* <: Model */, RM, RV] extends js.Object {
  var join: JoinClause = js.native
  def apply(alias: String, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def apply(alias: String, sql: String): QueryBuilder[QM, RM, RV] = js.native
  def apply(alias: String, sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
}

