package typings.mongooseDelete.anon

import typings.mongodb.mod.FindAndModifyWriteOpResultObject
import typings.mongoose.anon.leantrueOmitQueryFindOneA
import typings.mongoose.anon.rawResulttrueQueryFindOneArrayFilters
import typings.mongoose.anon.rawResulttrueupserttruene
import typings.mongoose.anon.upserttruenewtrueQueryFin
import typings.mongoose.mod.DocumentDefinition
import typings.mongoose.mod.FilterQuery
import typings.mongoose.mod.QueryFindOneAndUpdateOptions
import typings.mongoose.mod.UpdateQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallConditionsUpdateOptionsCallback extends js.Object {
  
  def apply(): DocumentQueryanynullanyAll = js.native
  def apply(conditions: FilterQuery[_], update: UpdateQuery[_]): DocumentQueryanynullanyAll = js.native
  def apply(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  def apply(conditions: FilterQuery[_], update: UpdateQuery[_], options: leantrueOmitQueryFindOneA): QueryDocumentDefinitionanAll = js.native
  def apply(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: leantrueOmitQueryFindOneA,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocumentDefinition[_], /* res */ js.Any, Unit]
  ): QueryDocumentDefinitionanAll = js.native
  def apply(conditions: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueQueryFindOneArrayFilters): QueryFindAndModifyWriteOpAsyncIterator = js.native
  def apply(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpAsyncIterator = js.native
  def apply(conditions: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueupserttruene): QueryFindAndModifyWriteOpAnd = js.native
  def apply(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: rawResulttrueupserttruene,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpAnd = js.native
  def apply(conditions: FilterQuery[_], update: UpdateQuery[_], options: upserttruenewtrueQueryFin): DocumentQueryanyanyAll = js.native
  def apply(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): DocumentQueryanyanyAll = js.native
  def apply(conditions: FilterQuery[_], update: UpdateQuery[_], options: QueryFindOneAndUpdateOptions): DocumentQueryanynullanyAll = js.native
  def apply(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
}
