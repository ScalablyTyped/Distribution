package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bson.mod.Document
import typings.bson.mod.ObjectId
import typings.mongodb.anon.Id
import typings.mongodb.anon.IdInferIdType
import typings.mongodb.anon.Meta
import typings.mongodb.anon.Open
import typings.mongodb.mod.^
import typings.mongodb.mongodbStrings.ALPNProtocols
import typings.mongodb.mongodbStrings._empty
import typings.mongodb.mongodbStrings._id
import typings.mongodb.mongodbStrings.`1`
import typings.mongodb.mongodbStrings.awaitData
import typings.mongodb.mongodbStrings.ca
import typings.mongodb.mongodbStrings.cert
import typings.mongodb.mongodbStrings.checkServerIdentity
import typings.mongodb.mongodbStrings.ciphers
import typings.mongodb.mongodbStrings.close
import typings.mongodb.mongodbStrings.commandFailed
import typings.mongodb.mongodbStrings.commandStarted
import typings.mongodb.mongodbStrings.commandSucceeded
import typings.mongodb.mongodbStrings.connectionCheckOutFailed
import typings.mongodb.mongodbStrings.connectionCheckOutStarted
import typings.mongodb.mongodbStrings.connectionCheckedIn
import typings.mongodb.mongodbStrings.connectionCheckedOut
import typings.mongodb.mongodbStrings.connectionClosed
import typings.mongodb.mongodbStrings.connectionCreated
import typings.mongodb.mongodbStrings.connectionPoolCleared
import typings.mongodb.mongodbStrings.connectionPoolClosed
import typings.mongodb.mongodbStrings.connectionPoolCreated
import typings.mongodb.mongodbStrings.connectionPoolReady
import typings.mongodb.mongodbStrings.connectionReady
import typings.mongodb.mongodbStrings.crl
import typings.mongodb.mongodbStrings.ecdhCurve
import typings.mongodb.mongodbStrings.error
import typings.mongodb.mongodbStrings.exhaust
import typings.mongodb.mongodbStrings.family
import typings.mongodb.mongodbStrings.generation
import typings.mongodb.mongodbStrings.hints
import typings.mongodb.mongodbStrings.host
import typings.mongodb.mongodbStrings.hostAddress
import typings.mongodb.mongodbStrings.id
import typings.mongodb.mongodbStrings.isServer
import typings.mongodb.mongodbStrings.key
import typings.mongodb.mongodbStrings.localAddress
import typings.mongodb.mongodbStrings.localPort
import typings.mongodb.mongodbStrings.lookup
import typings.mongodb.mongodbStrings.majority
import typings.mongodb.mongodbStrings.minDHSize
import typings.mongodb.mongodbStrings.noCursorTimeout
import typings.mongodb.mongodbStrings.oplogReplay
import typings.mongodb.mongodbStrings.partial
import typings.mongodb.mongodbStrings.passphrase
import typings.mongodb.mongodbStrings.path
import typings.mongodb.mongodbStrings.pfx
import typings.mongodb.mongodbStrings.port
import typings.mongodb.mongodbStrings.pskCallback
import typings.mongodb.mongodbStrings.rejectUnauthorized
import typings.mongodb.mongodbStrings.requestOCSP
import typings.mongodb.mongodbStrings.secureContext
import typings.mongodb.mongodbStrings.secureProtocol
import typings.mongodb.mongodbStrings.server
import typings.mongodb.mongodbStrings.serverClosed
import typings.mongodb.mongodbStrings.serverDescriptionChanged
import typings.mongodb.mongodbStrings.serverHeartbeatFailed
import typings.mongodb.mongodbStrings.serverHeartbeatStarted
import typings.mongodb.mongodbStrings.serverHeartbeatSucceeded
import typings.mongodb.mongodbStrings.serverOpening
import typings.mongodb.mongodbStrings.servername
import typings.mongodb.mongodbStrings.session
import typings.mongodb.mongodbStrings.socket
import typings.mongodb.mongodbStrings.tailable
import typings.mongodb.mongodbStrings.timeout
import typings.mongodb.mongodbStrings.topologyClosed
import typings.mongodb.mongodbStrings.topologyDescriptionChanged
import typings.mongodb.mongodbStrings.topologyOpening
import typings.node.netMod.Socket
import typings.node.netMod.TcpNetConnectOpts
import typings.node.tlsMod.TLSSocket
import typings.node.tlsMod.TLSSocketOptions
import typings.std.Exclude
import typings.std.Extract
import typings.std.MapConstructor
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CURSOR_FLAGS: js.Tuple6[tailable, oplogReplay, noCursorTimeout, awaitData, exhaust, partial] = ^.asInstanceOf[js.Dynamic].selectDynamic("CURSOR_FLAGS").asInstanceOf[js.Tuple6[tailable, oplogReplay, noCursorTimeout, awaitData, exhaust, partial]]

type ExplainVerbosity = String

inline def LEGAL_TCP_SOCKET_OPTIONS: js.Tuple5[family, hints, localAddress, localPort, lookup] = ^.asInstanceOf[js.Dynamic].selectDynamic("LEGAL_TCP_SOCKET_OPTIONS").asInstanceOf[js.Tuple5[family, hints, localAddress, localPort, lookup]]

inline def LEGAL_TLS_SOCKET_OPTIONS: js.Tuple16[
ALPNProtocols, 
ca, 
cert, 
checkServerIdentity, 
ciphers, 
crl, 
ecdhCurve, 
key, 
minDHSize, 
passphrase, 
pfx, 
rejectUnauthorized, 
secureContext, 
secureProtocol, 
servername, 
session] = ^.asInstanceOf[js.Dynamic].selectDynamic("LEGAL_TLS_SOCKET_OPTIONS").asInstanceOf[js.Tuple16[
ALPNProtocols, 
ca, 
cert, 
checkServerIdentity, 
ciphers, 
crl, 
ecdhCurve, 
key, 
minDHSize, 
passphrase, 
pfx, 
rejectUnauthorized, 
secureContext, 
secureProtocol, 
servername, 
session]]

inline def MONGO_CLIENT_EVENTS: js.Array[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("MONGO_CLIENT_EVENTS").asInstanceOf[js.Array[Any]]

inline def Map_=(x: MapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Map")(x.asInstanceOf[js.Any])

inline def ObjectID_ : /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectId */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectID").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectId */ Any]

type ServerApiVersion = `1`

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.ReadonlyArray<infer U> ? T | mongodb.mongodb.RegExpOrString<U> : mongodb.mongodb.RegExpOrString<T>
  }}}
  */
type AlternativeType[T] = T

type AnyError = MongoError | js.Error

type BitwiseFilter = scala.Double | typings.bson.mod.Binary | js.Array[scala.Double]

type Callback[T] = js.Function2[/* error */ js.UndefOr[AnyError], /* result */ js.UndefOr[T], Unit]

type Condition[T] = AlternativeType[T] | FilterOperators[AlternativeType[T]]

type DistinctOptions = CommandOperationOptions

type DropDatabaseOptions = CommandOperationOptions

type DropIndexesOptions = CommandOperationOptions

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  string extends keyof TRecordOrUnion ? TRecordOrUnion : TRecordOrUnion extends any ? std.Pick<TRecordOrUnion, std.Exclude<keyof TRecordOrUnion, KeyUnion>> : never
  }}}
  */
type EnhancedOmit[TRecordOrUnion, KeyUnion] = TRecordOrUnion

type EventEmitterWithState = js.Object

type EventsDescription = Record[String, GenericListener]

type ExplainVerbosityLike = ExplainVerbosity | Boolean

type Filter[TSchema] = Partial[TSchema] | ((/* import warning: importer.ImportType#apply Failed type conversion: {[ Property in mongodb.mongodb.Join<mongodb.mongodb.NestedPaths<mongodb.mongodb.WithId<TSchema>, []>, '.'> ]:? mongodb.mongodb.Condition<mongodb.mongodb.PropertyType<mongodb.mongodb.WithId<TSchema>, Property>>} */ js.Any) & RootFilterOperators[WithId[TSchema]])

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Record<string, any> ? {[ key in keyof T ]:? mongodb.mongodb.FilterOperators<T[key]>} : mongodb.mongodb.FilterOperators<T>
  }}}
  */
type FilterOperations[T] = FilterOperators[T]

type FinalizeFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* reducedValue */ TValue, TValue]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Type extends std.ReadonlyArray<infer Item> ? Item : Type
  }}}
  */
type Flatten[Type] = Type

type Hint = String | Document

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbInts.`-1`
  - typings.mongodb.mongodbInts.`1`
  - typings.mongodb.mongodbStrings.`2d`
  - typings.mongodb.mongodbStrings.`2dsphere`
  - typings.mongodb.mongodbStrings.text
  - typings.mongodb.mongodbStrings.geoHaystack
  - typings.mongodb.mongodbStrings.hashed
  - scala.Double
*/
type IndexDirection = _IndexDirection | scala.Double

type IndexSpecification = OneOrMore[
String | (js.Tuple2[String, IndexDirection]) | StringDictionary[IndexDirection] | (typings.std.Map[String, IndexDirection])]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  TSchema extends {  _id :infer IdType} ? std.Record<any, never> extends IdType ? never : IdType : TSchema extends {  _id :infer IdType | undefined} ? unknown extends IdType ? bson.bson.ObjectId : IdType : bson.bson.ObjectId
  }}}
  */
type InferIdType[TSchema] = ObjectId

type IntegerType = scala.Double | typings.bson.mod.Int32 | typings.bson.mod.Long

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  true extends false & Type ? ResultIfAny : ResultIfNotAny
  }}}
  */
type IsAny[Type, ResultIfAny, ResultIfNotAny] = ResultIfAny

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [] ? '' : T extends [string | number] ? / * template literal string: ${T[0]} * / string : T extends [string | number, ...infer R] ? / * template literal string: ${T[0]}${D}${Join<R,D>} * / string : string
  }}}
  */
type Join[T /* <: js.Array[Any] */, D /* <: String */] = _empty

type KeysOfAType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: std.NonNullable<TSchema[key]> extends Type? key : never}[keyof TSchema] */ js.Any

type KeysOfOtherType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: std.NonNullable<TSchema[key]> extends Type? never : key}[keyof TSchema] */ js.Any

type MapFunction[TSchema] = js.ThisFunction0[/* this */ TSchema, Unit]

type MatchKeysAndValues[TSchema] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Property in mongodb.mongodb.Join<mongodb.mongodb.NestedPaths<TSchema, []>, '.'> ]:? mongodb.mongodb.PropertyType<TSchema, Property>} */ js.Any) & Document

type MongoClientEvents = (Pick[
TopologyEvents, 
connectionPoolCreated | connectionPoolReady | connectionPoolCleared | connectionPoolClosed | connectionCreated | connectionReady | connectionClosed | connectionCheckOutStarted | connectionCheckOutFailed | connectionCheckedOut | connectionCheckedIn | commandStarted | commandSucceeded | commandFailed | serverOpening | serverClosed | serverDescriptionChanged | topologyOpening | topologyClosed | topologyDescriptionChanged | error | timeout | close | serverHeartbeatStarted | serverHeartbeatSucceeded | serverHeartbeatFailed]) & Open

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Depth['length'] extends 8 ? [] : Type extends string | number | boolean | std.Date | std.RegExp | node.buffer.<global>.Buffer | std.Uint8Array | (args : ...any): any | {  _bsontype :string} ? [] : Type extends std.ReadonlyArray<infer ArrayType> ? [] | [number, ...mongodb.mongodb.NestedPaths<ArrayType, [...Depth, 1]>] : Type extends std.Map<string, any> ? [string] : Type extends object ? {[ Key in std.Extract<keyof Type, string> ]: Type[Key] extends Type? [Key] : Type extends Type[Key]? [Key] : Type[Key] extends std.ReadonlyArray<infer ArrayType>? Type extends ArrayType? [Key] : ArrayType extends Type? [Key] : [Key, ...mongodb.mongodb.NestedPaths<Type[Key], [...Depth, 1]>] : [Key, ...mongodb.mongodb.NestedPaths<Type[Key], [...Depth, 1]>] | [Key]}[std.Extract<keyof Type, string>] : []
  }}}
  */
type NestedPaths[Type, Depth /* <: js.Array[scala.Double] */] = js.Array[Any]

type NestedPathsOfType[TSchema, Type] = KeysOfAType[
/* import warning: importer.ImportType#apply Failed type conversion: {[ Property in mongodb.mongodb.Join<mongodb.mongodb.NestedPaths<TSchema, []>, '.'> ]: mongodb.mongodb.PropertyType<TSchema, Property>} */ js.Any, 
Type]

/* Inlined {[ key in keyof bson.bson.ObjectIdLike ]:? never} & bson.bson.Document */
type NonObjectIdLikeDocument = StringDictionary[Any]

type NumericType = IntegerType | typings.bson.mod.Decimal128 | typings.bson.mod.Double

type OneOrMore[T] = T | js.Array[T]

type OnlyFieldsOfType[TSchema, FieldType, AssignableType] = IsAny[
/* import warning: importer.ImportType#apply Failed type conversion: TSchema[keyof TSchema] */ js.Any, 
Record[String, FieldType], 
(AcceptedFields[TSchema, FieldType, AssignableType]) & (NotAcceptedFields[TSchema, FieldType]) & (Record[String, AssignableType])]

type OperationTime = typings.bson.mod.Timestamp

type OptionalId[TSchema] = (EnhancedOmit[TSchema, _id]) & Id[TSchema]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  TSchema extends {  _id :any} ? TSchema : mongodb.mongodb.OptionalId<TSchema>
  }}}
  */
type OptionalUnlessRequiredId[TSchema] = TSchema

type ProfilingLevelOptions = CommandOperationOptions

type Projection[TSchema /* <: Document */] = Document

type ProjectionOperators = Document

type PullAllOperator[TSchema] = (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, std.ReadonlyArray<any>> ]:? TSchema[key]} */ js.Any) & (NotAcceptedFields[TSchema, js.Array[Any]]) & StringDictionary[js.Array[Any]]

type PullOperator[TSchema] = (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, std.ReadonlyArray<any>> ]:? std.Partial<mongodb.mongodb.Flatten<TSchema[key]>> | mongodb.mongodb.FilterOperations<mongodb.mongodb.Flatten<TSchema[key]>>} */ js.Any) & (NotAcceptedFields[TSchema, js.Array[Any]]) & (StringDictionary[FilterOperators[Any] | Any])

type PushOperator[TSchema] = (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, std.ReadonlyArray<any>> ]:? mongodb.mongodb.Flatten<TSchema[key]> | mongodb.mongodb.ArrayOperator<std.Array<mongodb.mongodb.Flatten<TSchema[key]>>>} */ js.Any) & (NotAcceptedFields[TSchema, js.Array[Any]]) & (StringDictionary[ArrayOperator[Any] | Any])

type ReduceFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* values */ js.Array[TValue], TValue]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends string ? bson.bson.BSONRegExp | std.RegExp | T : T
  }}}
  */
type RegExpOrString[T] = T

type RemoveUserOptions = CommandOperationOptions

type ResumeToken = Any

type RunCommandOptions = CommandOperationOptions

type SchemaMember[T, V] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? V} */ js.Any) | StringDictionary[V]

type ServerOptions = (Omit[ConnectionPoolOptions, id | generation | hostAddress]) & MonitorOptions

type ServerSelector = js.Function2[
/* topologyDescription */ TopologyDescription, 
/* servers */ js.Array[ServerDescription], 
js.Array[ServerDescription]]

type SetFields[TSchema] = (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, std.ReadonlyArray<any> | undefined> ]:? mongodb.mongodb.OptionalId<mongodb.mongodb.Flatten<TSchema[key]>> | mongodb.mongodb.AddToSetOperators<std.Array<mongodb.mongodb.OptionalId<mongodb.mongodb.Flatten<TSchema[key]>>>>} */ js.Any) & (NotAcceptedFields[TSchema, js.UndefOr[js.Array[Any]]]) & (StringDictionary[AddToSetOperators[Any] | Any])

type SetProfilingLevelOptions = CommandOperationOptions

type Sort = String | (Exclude[SortDirection, Meta]) | (js.Array[String | (js.Tuple2[String, SortDirection])]) | StringDictionary[SortDirection] | (typings.std.Map[String, SortDirection]) | (js.Tuple2[String, SortDirection])

type Stream = Socket | TLSSocket

type SupportedNodeConnectionOptions = SupportedTLSConnectionOptions & SupportedTLSSocketOptions & SupportedSocketOptions

type SupportedSocketOptions = Pick[TcpNetConnectOpts, family | hints | localAddress | localPort | lookup]

type SupportedTLSConnectionOptions = Pick[
typings.node.tlsMod.ConnectionOptions, 
Extract[
  host | port | path | socket | checkServerIdentity | servername | session | minDHSize | lookup | timeout | pskCallback, 
  ALPNProtocols | ca | cert | checkServerIdentity | ciphers | crl | ecdhCurve | key | minDHSize | passphrase | pfx | rejectUnauthorized | secureContext | secureProtocol | servername | session
]]

type SupportedTLSSocketOptions = Pick[
TLSSocketOptions, 
Extract[
  isServer | server | session | requestOCSP, 
  ALPNProtocols | ca | cert | checkServerIdentity | ciphers | crl | ecdhCurve | key | minDHSize | passphrase | pfx | rejectUnauthorized | secureContext | secureProtocol | servername | session
]]

type TagSet = StringDictionary[String]

type W = scala.Double | majority

type WithId[TSchema] = (EnhancedOmit[TSchema, _id]) & IdInferIdType[TSchema]

type WithSessionCallback = js.Function1[/* session */ ClientSession, js.Promise[Any]]

type WithTransactionCallback[T] = js.Function1[/* session */ ClientSession, js.Promise[T]]

type WithoutId[TSchema] = Omit[TSchema, _id]
