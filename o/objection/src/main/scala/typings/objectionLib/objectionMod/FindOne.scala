package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOne[QM /* <: Model */] extends js.Object {
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
  ): QueryBuilderYieldingOneOrNone[QM] = js.native
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
  ): QueryBuilderYieldingOneOrNone[QM] = js.native
  def apply(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilderYieldingOneOrNone[QM] = js.native
  def apply(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilderYieldingOneOrNone[QM] = js.native
  def apply(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilderYieldingOneOrNone[QM] = js.native
  def apply(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilderYieldingOneOrNone[QM] = js.native
  def apply(column: ColumnRef, value: Reference): QueryBuilderYieldingOneOrNone[QM] = js.native
  def apply(column: ColumnRef, value: Value): QueryBuilderYieldingOneOrNone[QM] = js.native
  def apply(condition: scala.Boolean): QueryBuilderYieldingOneOrNone[QM] = js.native
  def apply(`object`: js.Object): QueryBuilderYieldingOneOrNone[QM] = js.native
  def apply(sql: java.lang.String, bindings: js.Any*): QueryBuilderYieldingOneOrNone[QM] = js.native
  def apply(sql: java.lang.String, bindings: js.Any): QueryBuilderYieldingOneOrNone[QM] = js.native
}

