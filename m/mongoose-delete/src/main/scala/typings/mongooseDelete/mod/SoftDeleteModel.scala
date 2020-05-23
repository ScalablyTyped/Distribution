package typings.mongooseDelete.mod

import typings.mongodb.mod.FindAndModifyWriteOpResultObject
import typings.mongoose.anon.leantrueOmitQueryFindBase
import typings.mongoose.anon.leantrueOmitQueryFindOneA
import typings.mongoose.anon.leantrueOmitQueryFindOpti
import typings.mongoose.anon.rawResulttrueQueryFindOneArrayFilters
import typings.mongoose.anon.rawResulttrueupserttruene
import typings.mongoose.anon.upserttruenewtrueQueryFin
import typings.mongoose.mod.Document
import typings.mongoose.mod.DocumentDefinition
import typings.mongoose.mod.FilterQuery
import typings.mongoose.mod.ModelUpdateOptions
import typings.mongoose.mod.Model_
import typings.mongoose.mod.Query
import typings.mongoose.mod.QueryFindBaseOptions
import typings.mongoose.mod.QueryFindOneAndUpdateOptions
import typings.mongoose.mod.QueryFindOptions
import typings.mongoose.mod.Types.ObjectId
import typings.mongoose.mod.UpdateQuery
import typings.mongooseDelete.anon.DocumentQueryArrayanyanyAll
import typings.mongooseDelete.anon.DocumentQueryanyanyAll
import typings.mongooseDelete.anon.DocumentQueryanynullanyAll
import typings.mongooseDelete.anon.Fn0
import typings.mongooseDelete.anon.FnCall
import typings.mongooseDelete.anon.FnCallConditionsDocOptionsCallback
import typings.mongooseDelete.anon.FnCallConditionsProjectionOptionsCallback
import typings.mongooseDelete.anon.FnCallConditionsUpdateOptionsCallback
import typings.mongooseDelete.anon.QueryArrayDocumentDefinit
import typings.mongooseDelete.anon.QueryDocumentDefinitionanAll
import typings.mongooseDelete.anon.QueryFindAndModifyWriteOpAnd
import typings.mongooseDelete.anon.QueryFindAndModifyWriteOpBatchSize
import typings.mongooseDelete.anon.Queryany
import typings.mongooseDelete.anon.Querynumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftDeleteModel[T /* <: Document */, QueryHelpers] extends Model_[T, QueryHelpers] {
  /** Count only deleted documents */
  @JSName("countDeleted")
  var countDeleted_Original: FnCall = js.native
  /** Count all documents including deleted */
  @JSName("countWithDeleted")
  var countWithDeleted_Original: FnCall = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  var findDeleted_Original: FnCallConditionsProjectionOptionsCallback = js.native
  /** Find One And Update only deleted documents */
  @JSName("findOneAndUpdateDeleted")
  var findOneAndUpdateDeleted_Original: FnCallConditionsUpdateOptionsCallback = js.native
  /** Find One And Update all documents including deleted */
  @JSName("findOneAndUpdateWithDeleted")
  var findOneAndUpdateWithDeleted_Original: FnCallConditionsUpdateOptionsCallback = js.native
  /** Find One only deleted documents */
  @JSName("findOneDeleted")
  var findOneDeleted_Original: Fn0 = js.native
  /** Find One all documents including deleted */
  @JSName("findOneWithDeleted")
  var findOneWithDeleted_Original: Fn0 = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  var findWithDeleted_Original: FnCallConditionsProjectionOptionsCallback = js.native
  /** Update only deleted documents */
  @JSName("updateDeleted")
  var updateDeleted_Original: FnCallConditionsDocOptionsCallback = js.native
  /** Update all documents including deleted */
  @JSName("updateWithDeleted")
  var updateWithDeleted_Original: FnCallConditionsDocOptionsCallback = js.native
  /** Count only deleted documents */
  def countDeleted(conditions: FilterQuery[_]): Querynumber = js.native
  /** Count only deleted documents */
  def countDeleted(conditions: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Querynumber = js.native
  /** Count all documents including deleted */
  def countWithDeleted(conditions: FilterQuery[_]): Querynumber = js.native
  /** Count all documents including deleted */
  def countWithDeleted(conditions: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Querynumber = js.native
  /**
    * Delete documents by conditions
    */
  def delete(): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.Any): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.Any, deleteBy: js.Any): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.Any, deleteBy: js.Any, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  /**
    * Delete a document by ID
    */
  def deleteById(): Query[T] with QueryHelpers = js.native
  def deleteById(id: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: String, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Document): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Document, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: ObjectId, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Callback[T, this.type], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: String, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Document): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Document, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: ObjectId, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Callback[T, this.type], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: String, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Document): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Document, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: ObjectId, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Callback[T, this.type], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  /** Find only deleted documents */
  def findDeleted(): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_]): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: js.Any, options: leantrueOmitQueryFindOpti): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: js.Any, options: QueryFindOptions): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: Null, options: leantrueOmitQueryFindOpti): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: Null, options: QueryFindOptions): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  def findDeleted_QueryArrayDocumentDefinit(conditions: FilterQuery[_]): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  def findDeleted_QueryArrayDocumentDefinit(conditions: FilterQuery[_], projection: js.Any): QueryArrayDocumentDefinit = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_]): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: leantrueOmitQueryFindOneA): QueryDocumentDefinitionanAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: leantrueOmitQueryFindOneA,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocumentDefinition[_], /* res */ js.Any, Unit]
  ): QueryDocumentDefinitionanAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueQueryFindOneArrayFilters): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueupserttruene): QueryFindAndModifyWriteOpAnd = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
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
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: upserttruenewtrueQueryFin): DocumentQueryanyanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): DocumentQueryanyanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: QueryFindOneAndUpdateOptions): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_]): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: leantrueOmitQueryFindOneA): QueryDocumentDefinitionanAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: leantrueOmitQueryFindOneA,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocumentDefinition[_], /* res */ js.Any, Unit]
  ): QueryDocumentDefinitionanAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueQueryFindOneArrayFilters): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueupserttruene): QueryFindAndModifyWriteOpAnd = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
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
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: upserttruenewtrueQueryFin): DocumentQueryanyanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): DocumentQueryanyanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: QueryFindOneAndUpdateOptions): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: FilterQuery[_]): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: FilterQuery[_],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: FilterQuery[_], projection: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: FilterQuery[_], projection: js.Any, options: leantrueOmitQueryFindBase): QueryDocumentDefinitionanAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: leantrueOmitQueryFindBase,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): QueryDocumentDefinitionanAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: FilterQuery[_], projection: js.Any, options: QueryFindBaseOptions): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: QueryFindBaseOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: FilterQuery[_]): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: FilterQuery[_],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: FilterQuery[_], projection: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: FilterQuery[_], projection: js.Any, options: leantrueOmitQueryFindBase): QueryDocumentDefinitionanAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: leantrueOmitQueryFindBase,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): QueryDocumentDefinitionanAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: FilterQuery[_], projection: js.Any, options: QueryFindBaseOptions): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: QueryFindBaseOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_]): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: js.Any, options: leantrueOmitQueryFindOpti): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: js.Any, options: QueryFindOptions): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: Null, options: leantrueOmitQueryFindOpti): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: Null, options: QueryFindOptions): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  def findWithDeleted_QueryArrayDocumentDefinit(conditions: FilterQuery[_]): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  def findWithDeleted_QueryArrayDocumentDefinit(conditions: FilterQuery[_], projection: js.Any): QueryArrayDocumentDefinit = js.native
  /**
    * Restore documents by conditions
    */
  def restore(): Query[T] with QueryHelpers = js.native
  def restore(conditions: js.Any): Query[T] with QueryHelpers = js.native
  def restore(conditions: js.Any, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  /** Update only deleted documents */
  def updateDeleted(conditions: FilterQuery[_], doc: UpdateQuery[_]): Queryany = js.native
  /** Update only deleted documents */
  def updateDeleted(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
  /** Update only deleted documents */
  def updateDeleted(conditions: FilterQuery[_], doc: UpdateQuery[_], options: ModelUpdateOptions): Queryany = js.native
  /** Update only deleted documents */
  def updateDeleted(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(conditions: FilterQuery[_], doc: UpdateQuery[_]): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(conditions: FilterQuery[_], doc: UpdateQuery[_], options: ModelUpdateOptions): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
}

