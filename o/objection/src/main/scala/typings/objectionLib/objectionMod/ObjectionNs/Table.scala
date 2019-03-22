package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], 
      /* queryBuilder */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(tableName: TableName): QueryBuilder[QM, RM, RV] = js.native
}

