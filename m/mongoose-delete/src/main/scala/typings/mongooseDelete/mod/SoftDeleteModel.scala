package typings.mongooseDelete.mod

import typings.mongodb.mod.FindAndModifyWriteOpResultObject
import typings.mongoose.AnonNew
import typings.mongoose.AnonNewTrue
import typings.mongoose.AnonRawResult
import typings.mongoose.mod.Document
import typings.mongoose.mod.DocumentQuery
import typings.mongoose.mod.ModelUpdateOptions
import typings.mongoose.mod.Model_
import typings.mongoose.mod.Query
import typings.mongoose.mod.QueryFindOneAndUpdateOptions
import typings.mongoose.mod.Types.ObjectId
import typings.mongooseDelete.FnCallback
import typings.mongooseDelete.FnCallbackConditions
import typings.mongooseDelete.FnCallbackConditionsDoc
import typings.mongooseDelete.FnCallbackConditionsDocErr
import typings.mongooseDelete.FnCallbackConditionsErr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftDeleteModel[T /* <: Document */, QueryHelpers] extends Model_[T, QueryHelpers] {
  /** Count only deleted documents */
  @JSName("countDeleted")
  var countDeleted_Original: FnCallback = js.native
  /** Count all documents including deleted */
  @JSName("countWithDeleted")
  var countWithDeleted_Original: FnCallback = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  var findDeleted_Original: FnCallbackConditions = js.native
  /** Find One And Update only deleted documents */
  @JSName("findOneAndUpdateDeleted")
  var findOneAndUpdateDeleted_Original: FnCallbackConditionsDoc = js.native
  /** Find One And Update all documents including deleted */
  @JSName("findOneAndUpdateWithDeleted")
  var findOneAndUpdateWithDeleted_Original: FnCallbackConditionsDoc = js.native
  /** Find One only deleted documents */
  @JSName("findOneDeleted")
  var findOneDeleted_Original: FnCallbackConditionsErr = js.native
  /** Find One all documents including deleted */
  @JSName("findOneWithDeleted")
  var findOneWithDeleted_Original: FnCallbackConditionsErr = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  var findWithDeleted_Original: FnCallbackConditions = js.native
  /** Update only deleted documents */
  @JSName("updateDeleted")
  var updateDeleted_Original: FnCallbackConditionsDocErr = js.native
  /** Update all documents including deleted */
  @JSName("updateWithDeleted")
  var updateWithDeleted_Original: FnCallbackConditionsDocErr = js.native
  /** Count only deleted documents */
  def countDeleted(conditions: js.Any): Query[Double] with js.Object = js.native
  /** Count only deleted documents */
  def countDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Query[Double] with js.Object = js.native
  /** Count all documents including deleted */
  def countWithDeleted(conditions: js.Any): Query[Double] with js.Object = js.native
  /** Count all documents including deleted */
  def countWithDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Query[Double] with js.Object = js.native
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
  def findDeleted(): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: js.Any): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: js.Any, projection: js.Any): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: js.Any, projection: js.Any, options: js.Any): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: js.Any, projection: Null, options: js.Any): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: Null,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: Null,
    options: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: AnonNewTrue with QueryFindOneAndUpdateOptions): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: AnonNew with QueryFindOneAndUpdateOptions): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: AnonRawResult with QueryFindOneAndUpdateOptions): (Query[FindAndModifyWriteOpResultObject[_ | Null]]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    options: AnonNewTrue with QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    options: AnonRawResult with QueryFindOneAndUpdateOptions,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[_ | Null]]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    options: AnonNew with QueryFindOneAndUpdateOptions,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: QueryFindOneAndUpdateOptions): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: AnonNew with QueryFindOneAndUpdateOptions): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: AnonNewTrue with QueryFindOneAndUpdateOptions): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: AnonRawResult with QueryFindOneAndUpdateOptions): (Query[FindAndModifyWriteOpResultObject[_ | Null]]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    options: AnonRawResult with QueryFindOneAndUpdateOptions,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[_ | Null]]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    options: AnonNewTrue with QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    options: AnonNew with QueryFindOneAndUpdateOptions,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: QueryFindOneAndUpdateOptions): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One only deleted documents */
  def findOneDeleted(): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: js.Any, projection: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: js.Any,
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: js.Any, projection: js.Any, options: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: js.Any, projection: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: js.Any,
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: js.Any, projection: js.Any, options: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: js.Any): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: js.Any, projection: js.Any): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: js.Any, projection: js.Any, options: js.Any): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: js.Any, projection: Null, options: js.Any): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: Null,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: Null,
    options: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): (DocumentQuery[js.Array[_], _, js.Object]) with js.Object = js.native
  /**
    * Restore documents by conditions
    */
  def restore(): Query[T] with QueryHelpers = js.native
  def restore(conditions: js.Any): Query[T] with QueryHelpers = js.native
  def restore(conditions: js.Any, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  /** Update only deleted documents */
  def updateDeleted(conditions: js.Any, doc: js.Any): Query[_] with js.Object = js.native
  /** Update only deleted documents */
  def updateDeleted(conditions: js.Any, doc: js.Any, callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]): Query[_] with js.Object = js.native
  /** Update only deleted documents */
  def updateDeleted(conditions: js.Any, doc: js.Any, options: ModelUpdateOptions): Query[_] with js.Object = js.native
  /** Update only deleted documents */
  def updateDeleted(
    conditions: js.Any,
    doc: js.Any,
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] with js.Object = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(conditions: js.Any, doc: js.Any): Query[_] with js.Object = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(conditions: js.Any, doc: js.Any, callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]): Query[_] with js.Object = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(conditions: js.Any, doc: js.Any, options: ModelUpdateOptions): Query[_] with js.Object = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(
    conditions: js.Any,
    doc: js.Any,
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] with js.Object = js.native
}

