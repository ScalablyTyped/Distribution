package typings.objection.mod

import typings.knex.mod.JoinClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinMethod[QB /* <: AnyQueryBuilder */] extends js.Object {
  def apply(raw: Raw_): QB = js.native
  def apply(table: TableRef, cb: CallbackVoid[JoinClause]): QB = js.native
  def apply(table: TableRef, leftCol: ColumnRef, op: Operator, rightCol: ColumnRef): QB = js.native
  def apply(table: TableRef, leftCol: ColumnRef, rightCol: ColumnRef): QB = js.native
  def apply(table: TableRef, raw: Raw_): QB = js.native
}

