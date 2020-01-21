package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereIn[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
}

