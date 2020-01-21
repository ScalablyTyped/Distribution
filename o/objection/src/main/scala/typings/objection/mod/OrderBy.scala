package typings.objection.mod

import typings.objection.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(columns: js.Array[AnonColumn | String]): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef, order: String): QueryBuilder[QM, RM, RV] = js.native
}

