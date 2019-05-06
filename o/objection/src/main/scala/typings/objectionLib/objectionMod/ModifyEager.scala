package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyEager[QM1 /* <: Model */, RM1, RV1] extends js.Object {
  def apply[QM2 /* <: Model */](relationExpression: RelationExpression, modifier: java.lang.String): QueryBuilder[QM1, RM1, RV1] = js.native
  def apply[QM2 /* <: Model */](relationExpression: RelationExpression, modifier: js.Array[java.lang.String]): QueryBuilder[QM1, RM1, RV1] = js.native
  def apply[QM2 /* <: Model */](
    relationExpression: RelationExpression,
    modifier: js.Function1[
      /* builder */ QueryBuilder[
        QM2, 
        js.Array[QM2], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM1, RM1, RV1] = js.native
}

