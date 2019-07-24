package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongodbMod {
  type AggregationCursorResult = js.Object | scala.Null
  type CollectionMapFunction[TSchema] = js.ThisFunction0[/* this */ TSchema, scala.Unit]
  type CollectionReduceFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* values */ js.Array[TValue], TValue]
  type CommandCursorResult = js.Object | scala.Null
  type CursorResult = js.Object | scala.Null | scala.Boolean
  type EndCallback = js.Function1[/* error */ MongoError, scala.Unit]
  type FilterQuery[T] = (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] | mongodb.mongodb.Condition<T, P>}
    */ mongodbLib.mongodbLibStrings.FilterQuery with T) | org.scalablytyped.runtime.StringDictionary[js.Any]
  type GridFSBucketErrorCallback = js.Function1[/* err */ js.UndefOr[MongoError], scala.Unit]
  type GridFSBucketWriteStreamId = java.lang.String | scala.Double | js.Object | bsonLib.bsonMod.ObjectID
  type IteratorCallback[T] = js.Function1[/* doc */ T, scala.Unit]
  type MongoCallback[T] = js.Function2[/* error */ MongoError, /* result */ T, scala.Unit]
  type WithTransactionCallback[T] = js.Function1[/* session */ ClientSession, js.Promise[T]]
  type log = js.Function2[
    /* message */ js.UndefOr[java.lang.String], 
    /* state */ js.UndefOr[LoggerState], 
    scala.Unit
  ]
}
