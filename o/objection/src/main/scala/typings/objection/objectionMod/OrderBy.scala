package typings.objection.objectionMod

import typings.objection.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(columns: js.Array[Anon_Column | String]): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef, order: String): QueryBuilder[QM, RM, RV] = js.native
}

