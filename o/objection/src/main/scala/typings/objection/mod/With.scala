package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait With[QM /* <: Model */, RM, RV]
  extends WithWrapped[QM, RM, RV]
     with WithRaw[QM, RM, RV] {
  /* InferMemberOverrides */
  override def apply(
    T0: /* alias */ String,
    T1: /* callback */ js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      js.Any
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
}

