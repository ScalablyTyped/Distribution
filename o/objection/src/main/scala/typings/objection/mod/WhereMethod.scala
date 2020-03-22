package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereMethod[QB /* <: AnyQueryBuilder */] extends js.Object {
  def apply(cb: CallbackVoid[QB]): QB = js.native
  def apply(col: ColumnRef, expr: Expression[PrimitiveValue]): QB = js.native
  def apply(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): QB = js.native
  def apply(condition: Boolean): QB = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def apply(obj: js.Object): QB = js.native
  def apply(obj: PartialModelObject[ModelType[QB]]): QB = js.native
  def apply(raw: Raw_): QB = js.native
  def apply[QBP /* <: QB */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): QB = js.native
  // These must come first so that we get autocomplete.
  def apply[QBP /* <: QB */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): QB = js.native
  def apply[QBA /* <: AnyQueryBuilder */](qb: QBA): QB = js.native
}

