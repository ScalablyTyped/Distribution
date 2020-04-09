package typings.mongooseDelete

import typings.mongodb.mod.FindAndModifyWriteOpResultObject
import typings.mongoose.mod.FilterQuery
import typings.mongoose.mod.QueryFindOneAndUpdateOptions
import typings.mongoose.rawResulttrueQueryFindOneArrayFilters
import typings.mongoose.rawResulttrueupserttruene
import typings.mongoose.upserttruenewtrueQueryFin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallConditionsUpdateOptionsCallback extends js.Object {
  def apply(): DocumentQueryanynullanyAll = js.native
  def apply(conditions: FilterQuery[_], update: js.Any): DocumentQueryanynullanyAll = js.native
  def apply(
    conditions: FilterQuery[_],
    update: js.Any,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  def apply(conditions: FilterQuery[_], update: js.Any, options: QueryFindOneAndUpdateOptions): DocumentQueryanynullanyAll = js.native
  def apply(
    conditions: FilterQuery[_],
    update: js.Any,
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  def apply(conditions: FilterQuery[_], update: js.Any, options: rawResulttrueQueryFindOneArrayFilters): QueryFindAndModifyWriteOpBatchSize = js.native
  def apply(
    conditions: FilterQuery[_],
    update: js.Any,
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpBatchSize = js.native
  def apply(conditions: FilterQuery[_], update: js.Any, options: rawResulttrueupserttruene): QueryFindAndModifyWriteOpAnd = js.native
  def apply(
    conditions: FilterQuery[_],
    update: js.Any,
    options: rawResulttrueupserttruene,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpAnd = js.native
  def apply(conditions: FilterQuery[_], update: js.Any, options: upserttruenewtrueQueryFin): DocumentQueryanyanyAll = js.native
  def apply(
    conditions: FilterQuery[_],
    update: js.Any,
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): DocumentQueryanyanyAll = js.native
}

