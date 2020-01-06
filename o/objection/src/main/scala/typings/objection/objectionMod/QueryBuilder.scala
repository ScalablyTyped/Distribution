package typings.objection.objectionMod

import typings.objection.TypeofClassModel
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "QueryBuilder")
@js.native
class QueryBuilder[QM /* <: Model */, RM, RV] ()
  extends QueryBuilderBase[QM, RM, RV]
     with Executable[RV] {
  def castTo[T /* <: TypeofClassModel */](model: T): QueryBuilder[
    QM, 
    js.Array[InstanceType[T]], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def throwIfNotFound(): QueryBuilder[
    QM, 
    RM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
}

/* static members */
@JSImport("objection", "QueryBuilder")
@js.native
object QueryBuilder extends js.Object {
  def forClass[M /* <: Model */, MC /* <: ModelClass[M] */](modelClass: MC): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
}

