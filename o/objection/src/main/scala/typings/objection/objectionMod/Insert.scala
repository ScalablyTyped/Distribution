package typings.objection.objectionMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert[QM /* <: Model */] extends js.Object {
  def apply(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def apply(modelOrObject: Partial[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def apply(modelsOrObjects: js.Array[Partial[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
}

