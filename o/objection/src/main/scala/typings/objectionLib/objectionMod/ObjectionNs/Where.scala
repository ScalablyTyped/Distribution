package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Where[QM /* <: Model */, RM, RV] extends WhereRaw[QM, RM, RV] {
  def apply(
    callback: js.Function1[/* queryBuilder */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], scala.Unit]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[_, js.Array[_], js.Array[_]]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: java.lang.String, value: QueryBuilder[_, js.Array[_], js.Array[_]]): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], 
      /* queryBuilder */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
}

