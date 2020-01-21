package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawMethod[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(raw: Raw_): QueryBuilder[QM, RM, RV] = js.native
  def apply(sql: String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def apply(sql: String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
}

