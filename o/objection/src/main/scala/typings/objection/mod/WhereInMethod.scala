package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereInMethod[QB /* <: AnyQueryBuilder */] extends js.Object {
  def apply(col: js.Array[ColumnRef], cb: CallbackVoid[QB]): QB = js.native
  def apply(col: js.Array[ColumnRef], expr: js.Array[Expression[PrimitiveValue]]): QB = js.native
  def apply(col: js.Array[ColumnRef], qb: AnyQueryBuilder): QB = js.native
  def apply(col: ColumnRef, cb: CallbackVoid[QB]): QB = js.native
  def apply(col: ColumnRef, expr: js.Array[Expression[PrimitiveValue]]): QB = js.native
  def apply(col: ColumnRef, qb: AnyQueryBuilder): QB = js.native
  def apply[QBP /* <: QB */](col: ModelProps[ModelType[QBP]], cb: CallbackVoid[QB]): QB = js.native
  // These must come first so that we get autocomplete.
  def apply[QBP /* <: QB */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): QB = js.native
  def apply[QBP /* <: QB */](col: ModelProps[ModelType[QBP]], qb: AnyQueryBuilder): QB = js.native
}

