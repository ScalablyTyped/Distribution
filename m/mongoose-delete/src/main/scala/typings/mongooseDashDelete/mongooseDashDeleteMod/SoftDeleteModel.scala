package typings.mongooseDashDelete.mongooseDashDeleteMod

import typings.mongodb.mongodbMod.FindAndModifyWriteOpResultObject
import typings.mongoose.Anon_New
import typings.mongoose.Anon_NewTrue
import typings.mongoose.Anon_RawResult
import typings.mongoose.mongooseMod.Document
import typings.mongoose.mongooseMod.DocumentQuery
import typings.mongoose.mongooseMod.Model
import typings.mongoose.mongooseMod.ModelUpdateOptions
import typings.mongoose.mongooseMod.Query
import typings.mongoose.mongooseMod.QueryFindOneAndUpdateOptions
import typings.mongoose.mongooseMod.Types.ObjectId
import typings.mongooseDashDelete.Fn_Callback
import typings.mongooseDashDelete.Fn_CallbackConditions
import typings.mongooseDashDelete.Fn_CallbackConditionsDoc
import typings.mongooseDashDelete.Fn_CallbackConditionsDocErr
import typings.mongooseDashDelete.Fn_CallbackConditionsErr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftDeleteModel[T /* <: Document */, QueryHelpers] extends Model[T, QueryHelpers] {
  /** Count only deleted documents */
  @JSName("countDeleted")
  var countDeleted_Original: Fn_Callback = js.native
  /** Count all documents including deleted */
  @JSName("countWithDeleted")
  var countWithDeleted_Original: Fn_Callback = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  var findDeleted_Original: Fn_CallbackConditions = js.native
  /** Find One And Update only deleted documents */
  @JSName("findOneAndUpdateDeleted")
  var findOneAndUpdateDeleted_Original: Fn_CallbackConditionsDoc = js.native
  /** Find One And Update all documents including deleted */
  @JSName("findOneAndUpdateWithDeleted")
  var findOneAndUpdateWithDeleted_Original: Fn_CallbackConditionsDoc = js.native
  /** Find One only deleted documents */
  @JSName("findOneDeleted")
  var findOneDeleted_Original: Fn_CallbackConditionsErr = js.native
  /** Find One all documents including deleted */
  @JSName("findOneWithDeleted")
  var findOneWithDeleted_Original: Fn_CallbackConditionsErr = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  var findWithDeleted_Original: Fn_CallbackConditions = js.native
  /** Update only deleted documents */
  @JSName("updateDeleted")
  var updateDeleted_Original: Fn_CallbackConditionsDocErr = js.native
  /** Update all documents including deleted */
  @JSName("updateWithDeleted")
  var updateWithDeleted_Original: Fn_CallbackConditionsDocErr = js.native
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
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: Anon_New with QueryFindOneAndUpdateOptions): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: Anon_RawResult with QueryFindOneAndUpdateOptions): (Query[FindAndModifyWriteOpResultObject[_ | Null]]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: Anon_NewTrue with QueryFindOneAndUpdateOptions): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    options: Anon_RawResult with QueryFindOneAndUpdateOptions,
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
    options: Anon_New with QueryFindOneAndUpdateOptions,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    options: Anon_NewTrue with QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
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
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: Anon_New with QueryFindOneAndUpdateOptions): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: Anon_RawResult with QueryFindOneAndUpdateOptions): (Query[FindAndModifyWriteOpResultObject[_ | Null]]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: Anon_NewTrue with QueryFindOneAndUpdateOptions): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    options: Anon_New with QueryFindOneAndUpdateOptions,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    options: Anon_RawResult with QueryFindOneAndUpdateOptions,
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
    options: Anon_NewTrue with QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
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

