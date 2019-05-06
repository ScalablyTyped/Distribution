package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "QueryBuilder")
@js.native
class QueryBuilder[QM /* <: Model */, RM, RV] ()
  extends QueryBuilderBase[QM, RM, RV]
     with Executable[RV] {
  def castTo[T /* <: objectionLib.Anon_Args */](model: T): QueryBuilder[
    QM, 
    js.Array[stdLib.InstanceType[T]], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def throwIfNotFound(): QueryBuilder[
    QM, 
    RM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
}

/* static members */
@JSImport("objection", "QueryBuilder")
@js.native
object QueryBuilder extends js.Object {
  def forClass[M /* <: objectionLib.objectionMod.Model */, MC /* <: objectionLib.objectionMod.ModelClass[M] */](modelClass: MC): objectionLib.objectionMod.QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
}

