package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSetOperations[QB /* <: AnyQueryBuilder */] extends js.Object {
  def apply(callbackOrBuilder: QBOrCallback[QB]): QB = js.native
  def apply(callbackOrBuilder: QBOrCallback[QB], wrap: Boolean): QB = js.native
  def apply(callbacksOrBuilders: js.Array[QBOrCallback[QB]]): QB = js.native
  def apply(callbacksOrBuilders: js.Array[QBOrCallback[QB]], wrap: Boolean): QB = js.native
}

