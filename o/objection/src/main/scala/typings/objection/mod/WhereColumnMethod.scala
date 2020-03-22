package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereColumnMethod[QB /* <: AnyQueryBuilder */] extends js.Object {
  def apply(col1: ColumnRef, col2: ColumnRef): QB = js.native
  def apply(col1: ColumnRef, op: Operator, col2: ColumnRef): QB = js.native
  def apply[QBP /* <: QB */](col1: ModelProps[ModelType[QBP]], col2: ColumnRef): QB = js.native
  // These must come first so that we get autocomplete.
  def apply[QBP /* <: QB */](col1: ModelProps[ModelType[QBP]], op: Operator, col2: ColumnRef): QB = js.native
}

