package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Join[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    tableName: TableName,
    clause: js.ThisFunction1[
      /* this */ knexLib.knexMod.JoinClause, 
      /* join */ knexLib.knexMod.JoinClause, 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def apply(tableName: TableName, column1: ColumnRef, operator: java.lang.String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | Raw | Reference]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(tableName: TableName, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
}

