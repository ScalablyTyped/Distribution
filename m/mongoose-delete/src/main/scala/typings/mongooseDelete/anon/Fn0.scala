package typings.mongooseDelete.anon

import typings.mongoose.anon.leantrueOmitQueryFindBase
import typings.mongoose.mod.FilterQuery
import typings.mongoose.mod.QueryFindBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn0 extends js.Object {
  def apply(): DocumentQueryanynullanyAll = js.native
  def apply(
    conditions: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  def apply(conditions: FilterQuery[_]): DocumentQueryanynullanyAll = js.native
  def apply(
    conditions: FilterQuery[_],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  def apply(conditions: FilterQuery[_], projection: js.Any): DocumentQueryanynullanyAll = js.native
  def apply(
    conditions: FilterQuery[_],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  def apply(conditions: FilterQuery[_], projection: js.Any, options: leantrueOmitQueryFindBase): QueryDocumentDefinitionanAll = js.native
  def apply(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: leantrueOmitQueryFindBase,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): QueryDocumentDefinitionanAll = js.native
  def apply(conditions: FilterQuery[_], projection: js.Any, options: QueryFindBaseOptions): DocumentQueryanynullanyAll = js.native
  def apply(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: QueryFindBaseOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
}

