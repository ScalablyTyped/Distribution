package typings.objection

import org.scalablytyped.runtime.Instantiable0
import typings.objection.objectionMod.Model
import typings.objection.objectionMod.ModelClass
import typings.objection.objectionMod.QueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassQueryBuilder
  extends Instantiable0[QueryBuilder[Model, js.Object, js.Object]] {
  def forClass[M /* <: Model */, MC /* <: ModelClass[M] */](modelClass: MC): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
}

