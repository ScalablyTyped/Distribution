package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereIn[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], 
      /* queryBuilder */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef, query: QueryBuilder[_, js.Array[_], js.Array[_]]): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
}

