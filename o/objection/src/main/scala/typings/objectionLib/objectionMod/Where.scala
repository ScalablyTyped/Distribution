package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Where[QM /* <: Model */, RM, RV] extends WhereRaw[QM, RM, RV] {
  def apply(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def apply(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def apply(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def apply(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
}

