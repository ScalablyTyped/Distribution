package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongodbMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.mongodb.Anon_IdAny
  import typings.mongodb.Anon_IdExtractIdType
  import typings.mongodb.Omit
  import typings.mongodb.mongodbStrings._id
  import typings.std.Exclude
  import typings.std.RegExp

  type AcceptedFields[TSchema, FieldType, AssignableType] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, FieldType> ]:? AssignableType}
    */ typings.mongodb.mongodbStrings.AcceptedFields with js.Any
  type AggregationCursorResult = js.Object | Null
  /** https://docs.mongodb.com/manual/reference/operator/query-bitwise */
  type BitwiseQuery = scala.Double | typings.bson.bsonMod.Binary | js.Array[scala.Double]
  type CollectionMapFunction[TSchema] = js.ThisFunction0[/* this */ TSchema, Unit]
  type CollectionReduceFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* values */ js.Array[TValue], TValue]
  type CommandCursorResult = js.Object | Null
  type Condition[T] = MongoAltQuery[T] | QuerySelector[MongoAltQuery[T]]
  type CursorResult = js.Object | Null | Boolean
  type DotAndArrayNotation[AssignableType] = StringDictionary[AssignableType]
  type EndCallback = js.Function1[/* error */ MongoError, Unit]
  type ExtractIdType[TSchema] = typings.bson.bsonMod.ObjectId | (Exclude[js.Any, js.Object])
  type FilterQuery[T] = typings.mongodb.mongodbStrings.FilterQuery with T with RootQuerySelector[T]
  type GridFSBucketErrorCallback = js.Function1[/* err */ js.UndefOr[MongoError], Unit]
  type GridFSBucketWriteStreamId = String | scala.Double | js.Object | typings.bson.bsonMod.ObjectId
  type IteratorCallback[T] = js.Function1[/* doc */ T, Unit]
  /** Update Query */
  type KeysOfAType[TSchema, Type] = /* import warning: ImportType.apply Failed type conversion: {[ key in keyof TSchema ]: TSchema[key] extends Type? key : never}[keyof TSchema] */ js.Any
  type KeysOfOtherType[TSchema, Type] = /* import warning: ImportType.apply Failed type conversion: {[ key in keyof TSchema ]: TSchema[key] extends Type? never : key}[keyof TSchema] */ js.Any
  type MatchKeysAndValues[TSchema] = ReadonlyPartial[TSchema] with DotAndArrayNotation[_]
  type MongoAltQuery[T] = (RegExpForString[js.Any | T]) | T
  type MongoCallback[T] = js.Function2[/* error */ MongoError, /* result */ T, Unit]
  /** It avoid uses fields of non Type */
  type NotAcceptedFields[TSchema, FieldType] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ key in mongodb.mongodb.KeysOfOtherType<TSchema, FieldType> ]:? never}
    */ typings.mongodb.mongodbStrings.NotAcceptedFields with js.Any
  type OnlyFieldsOfType[TSchema, FieldType, AssignableType] = (AcceptedFields[TSchema, FieldType, AssignableType]) with (NotAcceptedFields[TSchema, FieldType]) with DotAndArrayNotation[AssignableType]
  type OptionalId[TSchema] = (Omit[TSchema, _id]) with Anon_IdAny
  type PullAllOperator[TSchema] = typings.mongodb.mongodbStrings.PullAllOperator with TSchema with (NotAcceptedFields[TSchema, js.Array[_]]) with StringDictionary[js.Array[_]]
  type PullOperator[TSchema] = typings.mongodb.mongodbStrings.PullOperator with js.Any with (NotAcceptedFields[TSchema, js.Array[_]]) with (StringDictionary[QuerySelector[_] | js.Any])
  type PushOperator[TSchema] = typings.mongodb.mongodbStrings.PushOperator with js.Any with (NotAcceptedFields[TSchema, js.Array[_]]) with (StringDictionary[ArrayOperator[_] | js.Any])
  type ReadonlyPartial[TSchema] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ key in keyof TSchema ]:? TSchema[key]}
    */ typings.mongodb.mongodbStrings.ReadonlyPartial with TSchema
  // we can search using alternative types in mongodb e.g.
  // string types can be searched using a regex in mongo
  // array types can be searched using their element type
  type RegExpForString[T] = T | RegExp
  type SetFields[TSchema] = typings.mongodb.mongodbStrings.SetFields with js.Any with (NotAcceptedFields[TSchema, js.Array[_]]) with (StringDictionary[AddToSetOperators[_] | js.Any])
  type Unpacked[Type] = Type
  // this adds _id as a required property
  type WithId[TSchema] = (Omit[TSchema, _id]) with Anon_IdExtractIdType[TSchema]
  type WithTransactionCallback[T] = js.Function1[/* session */ ClientSession, js.Promise[T]]
  type log = js.Function2[/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState], Unit]
}
