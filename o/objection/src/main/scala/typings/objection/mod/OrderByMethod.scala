package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderByMethod[QB /* <: AnyQueryBuilder */] extends js.Object {
  def apply(columns: js.Array[ColumnRefOrOrderByDescriptor]): QB = js.native
  def apply(column: ColumnRef): QB = js.native
  def apply(column: ColumnRef, order: OrderByDirection): QB = js.native
}

