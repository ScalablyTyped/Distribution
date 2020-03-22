package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereInCompositeMethod[QB /* <: AnyQueryBuilder */] extends js.Object {
  def apply(column: js.Array[ColumnRef], expr: js.Array[js.Array[Expression[PrimitiveValue]]]): QB = js.native
  def apply(column: js.Array[ColumnRef], qb: AnyQueryBuilder): QB = js.native
  def apply(column: ColumnRef, expr: js.Array[Expression[PrimitiveValue]]): QB = js.native
  def apply(column: ColumnRef, qb: AnyQueryBuilder): QB = js.native
}

