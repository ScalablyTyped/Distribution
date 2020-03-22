package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromMethod[QB /* <: AnyQueryBuilder */] extends js.Object {
  def apply(cb: CallbackVoid[QB]): QB = js.native
  def apply(raw: Raw_): QB = js.native
  def apply(table: String): QB = js.native
  def apply[QBP /* <: AnyQueryBuilder */](qb: QBP): QB = js.native
}

