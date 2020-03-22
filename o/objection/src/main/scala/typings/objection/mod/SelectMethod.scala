package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectMethod[QB /* <: AnyQueryBuilder */] extends js.Object {
  // These must come first so that we get autocomplete.
  // Allows things like `select(1)`, not sure if we should be more specific here?
  def apply[QBP /* <: QB */](columns: (js.Any | ModelProps[ModelType[QBP]] | Selection[QBP])*): QB = js.native
  def apply[QBP /* <: QB */](columns: js.Array[ModelProps[ModelType[QBP]] | Selection[QBP]]): QB = js.native
}

