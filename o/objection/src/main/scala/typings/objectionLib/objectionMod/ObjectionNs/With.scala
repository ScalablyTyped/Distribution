package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait With[QM /* <: Model */, RM, RV]
  extends WithWrapped[QM, RM, RV]
     with WithRaw[QM, RM, RV] {
  /* InferMemberOverrides */
  override def apply(
    T0: /* alias */ java.lang.String,
    T1: /* callback */ js.Function1[/* queryBuilder */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], js.Any]
  ): QueryBuilder[QM, RM, RV] = js.native
}

