package typings.mongodb

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.Anon_IdAny
import typings.mongodb.Omit
import typings.mongodb.mongodbStrings._id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongodbMod {
  type AggregationCursorResult = js.Object | Null
  type CollectionMapFunction[TSchema] = js.ThisFunction0[/* this */ TSchema, Unit]
  type CollectionReduceFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* values */ js.Array[TValue], TValue]
  type CommandCursorResult = js.Object | Null
  type CursorResult = js.Object | Null | Boolean
  type EndCallback = js.Function1[/* error */ MongoError, Unit]
  type FilterQuery[T] = (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] | mongodb.mongodb.Condition<T, P>}
    */ typings.mongodb.mongodbStrings.FilterQuery with T) | StringDictionary[js.Any]
  type GridFSBucketErrorCallback = js.Function1[/* err */ js.UndefOr[MongoError], Unit]
  type GridFSBucketWriteStreamId = String | scala.Double | js.Object | typings.bson.bsonMod.ObjectID
  type IteratorCallback[T] = js.Function1[/* doc */ T, Unit]
  type MongoCallback[T] = js.Function2[/* error */ MongoError, /* result */ T, Unit]
  type OptionalId[TSchema] = (Omit[TSchema, _id]) with Anon_IdAny
  type WithTransactionCallback[T] = js.Function1[/* session */ ClientSession, js.Promise[T]]
  type log = js.Function2[/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState], Unit]
}
