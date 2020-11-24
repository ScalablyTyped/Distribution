package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AcceptedFields[TSchema, FieldType, AssignableType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, FieldType> ]:? AssignableType}
    */ typings.mongodb.mongodbStrings.AcceptedFields with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type AggregationCursorResult = js.Object | scala.Null
  
  /** https://docs.mongodb.com/manual/reference/operator/query-bitwise */
  type BitwiseQuery = scala.Double | typings.bson.mod.Binary | js.Array[scala.Double]
  
  type CollectionMapFunction[TSchema] = js.ThisFunction0[/* this */ TSchema, scala.Unit]
  
  type CollectionReduceFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* values */ js.Array[TValue], TValue]
  
  type CommandCursorResult = js.Object | scala.Null
  
  type Condition[T] = typings.mongodb.mod.MongoAltQuery[T] | typings.mongodb.mod.QuerySelector[typings.mongodb.mod.MongoAltQuery[T]]
  
  type CursorResult = js.Object | scala.Null | scala.Boolean
  
  type Default = js.Any
  
  type DefaultSchema = js.Any
  
  type DotAndArrayNotation[AssignableType] = org.scalablytyped.runtime.StringDictionary[AssignableType]
  
  type EndCallback = js.Function1[/* error */ typings.mongodb.mod.MongoError, scala.Unit]
  
  // TypeScript Omit (Exclude to be specific) does not work for objects with an "any" indexed type
  type EnhancedOmit[T, K] = (typings.mongodb.mod.Omit[T, K]) | T
  
  /**
    * This is similar to Parameters but will work with a type which is
    * a function or with a tuple specifying arguments, which are both
    * common ways to define eventemitter events
    */
  type EventArguments[T] = js.Array[js.Any | T]
  
  type ExtractIdType[TSchema] = typings.bson.mod.ObjectId | (typings.std.Exclude[js.Any, js.Object])
  
  type FieldUpdates[TSchema] = typings.std.Partial[TSchema] with org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type FilterQuery[T] = typings.mongodb.mongodbStrings.FilterQuery with org.scalablytyped.runtime.TopLevel[T] with typings.mongodb.mod.RootQuerySelector[T]
  
  type FlattenIfArray[T] = T
  
  type GridFSBucketErrorCallback = typings.mongodb.mod.MongoCallback[scala.Unit]
  
  type GridFSBucketWriteStreamId = java.lang.String | scala.Double | js.Object | typings.bson.mod.ObjectId
  
  type IteratorCallback[T] = js.Function1[/* doc */ T, scala.Unit]
  
  /** Update Query */
  type KeysOfAType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: std.NonNullable<TSchema[key]> extends Type? key : never}[keyof TSchema] */ js.Any
  
  type KeysOfOtherType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: std.NonNullable<TSchema[key]> extends Type? never : key}[keyof TSchema] */ js.Any
  
  type MatchKeysAndValues[TSchema] = typings.mongodb.mod.ReadonlyPartial[TSchema] with typings.mongodb.mod.DotAndArrayNotation[_]
  
  type MongoAltQuery[T] = (typings.mongodb.mod.RegExpForString[js.Any | T]) | T
  
  type MongoCallback[T] = js.Function2[/* error */ typings.mongodb.mod.MongoError, /* result */ T, scala.Unit]
  
  /** It avoid uses fields of non Type */
  type NotAcceptedFields[TSchema, FieldType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in mongodb.mongodb.KeysOfOtherType<TSchema, FieldType> ]:? never}
    */ typings.mongodb.mongodbStrings.NotAcceptedFields with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type NumericTypes = scala.Double | typings.bson.mod.Decimal128 | typings.bson.mod.Double | typings.bson.mod.Int32 | typings.bson.mod.Long
  
  type ObjectQuerySelector[T] = typings.mongodb.mod.QuerySelector[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? mongodb.mongodb.QuerySelector<T[key]>}
    */ typings.mongodb.mongodbStrings.ObjectQuerySelector with org.scalablytyped.runtime.TopLevel[T])
  
  // We can use TypeScript Omit once minimum required TypeScript Version is above 3.5
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type OnlyFieldsOfType[TSchema, FieldType, AssignableType] = (typings.mongodb.mod.AcceptedFields[TSchema, FieldType, AssignableType]) with (typings.mongodb.mod.NotAcceptedFields[TSchema, FieldType]) with typings.mongodb.mod.DotAndArrayNotation[AssignableType]
  
  type OptionalId[TSchema /* <: typings.mongodb.anon.`0` */] = (// a Schema provided but _id type is not ObjectId
  typings.mongodb.mod.WithId[TSchema]) | ((// a Schema with ObjectId _id type or "any" or "indexed type" provided
  typings.mongodb.mod.EnhancedOmit[TSchema, typings.mongodb.mongodbStrings._id]) with typings.mongodb.anon.`2`[TSchema])
  
  type PullAllOperator[TSchema] = typings.mongodb.mongodbStrings.PullAllOperator with org.scalablytyped.runtime.TopLevel[TSchema] with (typings.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with org.scalablytyped.runtime.StringDictionary[js.Array[_]]
  
  type PullOperator[TSchema] = typings.mongodb.mongodbStrings.PullOperator with org.scalablytyped.runtime.TopLevel[js.Any] with (typings.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with (org.scalablytyped.runtime.StringDictionary[typings.mongodb.mod.QuerySelector[_] | js.Any])
  
  type PushOperator[TSchema] = typings.mongodb.mongodbStrings.PushOperator with org.scalablytyped.runtime.TopLevel[js.Any] with (typings.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with (org.scalablytyped.runtime.StringDictionary[typings.mongodb.mod.ArrayOperator[_] | js.Any])
  
  type ReadonlyPartial[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in keyof TSchema ]:? TSchema[key]}
    */ typings.mongodb.mongodbStrings.ReadonlyPartial with org.scalablytyped.runtime.TopLevel[TSchema]
  
  // we can search using alternative types in mongodb e.g.
  // string types can be searched using a regex in mongo
  // array types can be searched using their element type
  type RegExpForString[T] = T | typings.std.RegExp
  
  type SchemaMember[T, V] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? V}
    */ typings.mongodb.mongodbStrings.SchemaMember with org.scalablytyped.runtime.TopLevel[js.Any]) | org.scalablytyped.runtime.StringDictionary[V]
  
  type SetFields[TSchema] = typings.mongodb.mongodbStrings.SetFields with org.scalablytyped.runtime.TopLevel[js.Any] with (typings.mongodb.mod.NotAcceptedFields[TSchema, js.UndefOr[js.Array[_]]]) with (org.scalablytyped.runtime.StringDictionary[typings.mongodb.mod.AddToSetOperators[_] | js.Any])
  
  type SortOptionObject[T] = typings.mongodb.mod.SchemaMember[T, scala.Double | typings.mongodb.anon.Meta]
  
  type Unpacked[Type] = Type
  
  type UpdateOptionalId[T] = T | typings.mongodb.mod.OptionalId[T]
  
  type WithId[TSchema] = (typings.mongodb.mod.EnhancedOmit[TSchema, typings.mongodb.mongodbStrings._id]) with typings.mongodb.anon.IdExtractIdType[TSchema]
  
  type WithTransactionCallback[T] = js.Function1[/* session */ typings.mongodb.mod.ClientSession, js.Promise[T]]
  
  type log = js.Function2[
    /* message */ js.UndefOr[java.lang.String], 
    /* state */ js.UndefOr[typings.mongodb.mod.LoggerState], 
    scala.Unit
  ]
}
