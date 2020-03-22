package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMethod[QB /* <: AnyQueryBuilder */] extends js.Object {
  def apply(): QueryContext = js.native
  def apply(context: js.Object): QB = js.native
}

