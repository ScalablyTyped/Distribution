package typings.objection.mod

import org.scalablytyped.runtime.StringDictionary
import typings.knex.mod.JoinClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Join[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def apply(tableName: TableName, clause: js.ThisFunction1[/* this */ JoinClause, /* join */ JoinClause, Unit]): QueryBuilder[QM, RM, RV] = js.native
  def apply(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def apply(tableName: TableName, column1: ColumnRef, operator: String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def apply(tableName: TableName, columns: StringDictionary[String | Double | Raw_ | Reference]): QueryBuilder[QM, RM, RV] = js.native
  def apply(tableName: TableName, raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
}

