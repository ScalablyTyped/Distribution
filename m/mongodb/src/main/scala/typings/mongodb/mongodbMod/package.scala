package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongodbMod {
  import typings.mongodb.Anon_IdAny
  import typings.mongodb.Anon_IdExtractIdType
  import typings.mongodb.Omit
  import typings.mongodb.mongodbStrings._id
  import typings.std.Exclude
  import typings.std.RegExp

  type AggregationCursorResult = js.Object | Null
  /** https://docs.mongodb.com/manual/reference/operator/query-bitwise */
  type BitwiseQuery = scala.Double | typings.bson.bsonMod.Binary | js.Array[scala.Double]
  type CollectionMapFunction[TSchema] = js.ThisFunction0[/* this */ TSchema, Unit]
  type CollectionReduceFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* values */ js.Array[TValue], TValue]
  type CommandCursorResult = js.Object | Null
  type CursorResult = js.Object | Null | Boolean
  type EndCallback = js.Function1[/* error */ MongoError, Unit]
  type ExtractIdType[TSchema] = typings.bson.bsonMod.ObjectId | (Exclude[js.Any, js.Object])
  type FilterQuery[T] = typings.mongodb.mongodbStrings.FilterQuery with js.Any with RootQuerySelector[T]
  type GridFSBucketErrorCallback = js.Function1[/* err */ js.UndefOr[MongoError], Unit]
  type GridFSBucketWriteStreamId = String | scala.Double | js.Object | typings.bson.bsonMod.ObjectId
  type IteratorCallback[T] = js.Function1[/* doc */ T, Unit]
  type MongoAltQuery[T] = (RegExpForString[js.Any | T]) | T
  type MongoCallback[T] = js.Function2[/* error */ MongoError, /* result */ T, Unit]
  type OptionalId[TSchema] = (Omit[TSchema, _id]) with Anon_IdAny
  // we can search using alternative types in mongodb e.g.
  // string types can be searched using a regex in mongo
  // array types can be searched using their element type
  type RegExpForString[T] = T | RegExp
  // this adds _id as a required property
  type WithId[TSchema] = (Omit[TSchema, _id]) with Anon_IdExtractIdType[TSchema]
  type WithTransactionCallback[T] = js.Function1[/* session */ ClientSession, js.Promise[T]]
  type log = js.Function2[/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState], Unit]
}
