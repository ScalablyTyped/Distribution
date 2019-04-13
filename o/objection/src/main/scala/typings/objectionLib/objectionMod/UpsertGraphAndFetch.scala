package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpsertGraphAndFetch[QM /* <: Model */] extends js.Object {
  def apply(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def apply(modelOrObject: DeepPartialGraph[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def apply(modelOrObject: DeepPartialGraph[QM], options: UpsertGraphOptions): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def apply(modelsOrObjects: js.Array[DeepPartialGraph[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def apply(modelsOrObjects: js.Array[DeepPartialGraph[QM]], options: UpsertGraphOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
}

