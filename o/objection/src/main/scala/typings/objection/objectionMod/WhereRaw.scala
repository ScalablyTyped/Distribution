package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereRaw[QM /* <: Model */, RM, RV] extends RawMethod[QM, RM, RV] {
  def apply(condition: Boolean): QueryBuilder[QM, RM, RV] = js.native
}

