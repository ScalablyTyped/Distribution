package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable7
import typings.bson.mod.DeserializeOptions
import typings.bson.mod.Document
import typings.bson.mod.ObjectId
import typings.bson.mod.SerializeOptions
import typings.meteor.meteorStrings.ALPNProtocols
import typings.meteor.meteorStrings.awaitData
import typings.meteor.meteorStrings.ca
import typings.meteor.meteorStrings.cert
import typings.meteor.meteorStrings.checkServerIdentity
import typings.meteor.meteorStrings.ciphers
import typings.meteor.meteorStrings.crl
import typings.meteor.meteorStrings.ecdhCurve
import typings.meteor.meteorStrings.exhaust
import typings.meteor.meteorStrings.family
import typings.meteor.meteorStrings.hints
import typings.meteor.meteorStrings.key
import typings.meteor.meteorStrings.localAddress
import typings.meteor.meteorStrings.localPort
import typings.meteor.meteorStrings.lookup
import typings.meteor.meteorStrings.minDHSize
import typings.meteor.meteorStrings.noCursorTimeout
import typings.meteor.meteorStrings.oplogReplay
import typings.meteor.meteorStrings.partial
import typings.meteor.meteorStrings.passphrase
import typings.meteor.meteorStrings.pfx
import typings.meteor.meteorStrings.rejectUnauthorized
import typings.meteor.meteorStrings.secureContext
import typings.meteor.meteorStrings.secureProtocol
import typings.meteor.meteorStrings.servername
import typings.meteor.meteorStrings.session
import typings.meteor.meteorStrings.tailable
import typings.mongodb.anon.Code
import typings.mongodb.anon.PickCollectionInfonametyp
import typings.mongodb.mod.BulkWriteOperationError
import typings.mongodb.mod.BulkWriteResult
import typings.mongodb.mod.Collection
import typings.mongodb.mod.CollectionInfo
import typings.mongodb.mod.Db
import typings.mongodb.mod.ErrorDescription
import typings.mongodb.mod.EventsDescription
import typings.mongodb.mod.ServerDescription
import typings.mongodb.mod.TopologyDescription
import typings.mongodb.mod.TopologyDescriptionOptions
import typings.mongodb.mod.WriteConcernErrorData
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMongoNpmModule extends StObject {
  
  var AbstractCursor: TypeofAbstractCursor = js.native
  
  var Admin: Instantiable0[typings.mongodb.mod.Admin] = js.native
  
  var AggregationCursor: Instantiable0[typings.mongodb.mod.AggregationCursor[js.Object]] = js.native
  
  /* Inlined std.Readonly<{ readonly MONGODB_AWS :'MONGODB-AWS',  readonly MONGODB_CR :'MONGODB-CR',  readonly MONGODB_DEFAULT :'DEFAULT',  readonly MONGODB_GSSAPI :'GSSAPI',  readonly MONGODB_PLAIN :'PLAIN',  readonly MONGODB_SCRAM_SHA1 :'SCRAM-SHA-1',  readonly MONGODB_SCRAM_SHA256 :'SCRAM-SHA-256',  readonly MONGODB_X509 :'MONGODB-X509',  readonly MONGODB_OIDC :'MONGODB-OIDC'}> */
  val AuthMechanism: TypeofAuthMechanism = js.native
  
  /* Inlined std.Readonly<{ readonly FatalError :0,  readonly Error :1,  readonly Warning :2,  readonly Info :3,  readonly Trace :4}> */
  val AutoEncryptionLoggerLevel: TypeofAutoEncryptionLogge = js.native
  
  val BSON: Any = js.native
  
  var BSONRegExp: TypeofBSONRegExp = js.native
  
  var BSONSymbol: Instantiable1[/* value */ String, typings.mongodb.mod.BSONSymbol] = js.native
  
  /* Inlined std.Readonly<{ readonly double :1,  readonly string :2,  readonly object :3,  readonly array :4,  readonly binData :5,  readonly undefined :6,  readonly objectId :7,  readonly bool :8,  readonly date :9,  readonly null :10,  readonly regex :11,  readonly dbPointer :12,  readonly javascript :13,  readonly symbol :14,  readonly javascriptWithScope :15,  readonly int :16,  readonly timestamp :17,  readonly long :18,  readonly decimal :19,  readonly minKey :-1,  readonly maxKey :127}> */
  val BSONType: TypeofBSONType = js.native
  
  var Batch: Instantiable2[
    /* batchType */ typings.mongodb.mod.BatchType, 
    /* originalZeroIndex */ Double, 
    typings.mongodb.mod.Batch[js.Object]
  ] = js.native
  
  /* Inlined std.Readonly<{ readonly INSERT :1,  readonly UPDATE :2,  readonly DELETE :3}> */
  val BatchType: TypeofBatchType = js.native
  
  var Binary: TypeofBinary = js.native
  
  var BulkOperationBase: Instantiable0[typings.mongodb.mod.BulkOperationBase] = js.native
  
  var BulkWriteResult: TypeofBulkWriteResult = js.native
  
  val CURSOR_FLAGS: js.Tuple6[tailable, oplogReplay, noCursorTimeout, awaitData, exhaust, partial] = js.native
  
  var CancellationToken: Instantiable0[typings.mongodb.mod.CancellationToken] = js.native
  
  var ChangeStream: TypeofChangeStream = js.native
  
  var ClientSession: Instantiable0[typings.mongodb.mod.ClientSession] = js.native
  
  var Code: Instantiable1[/* code */ String, typings.mongodb.mod.Code] = js.native
  
  var Collection: Instantiable0[typings.mongodb.mod.Collection[Document]] = js.native
  
  var CommandFailedEvent: Instantiable0[typings.mongodb.mod.CommandFailedEvent] = js.native
  
  var CommandStartedEvent: Instantiable0[typings.mongodb.mod.CommandStartedEvent] = js.native
  
  var CommandSucceededEvent: Instantiable0[typings.mongodb.mod.CommandSucceededEvent] = js.native
  
  /* Inlined std.Readonly<{ readonly none :0,  readonly snappy :1,  readonly zlib :2,  readonly zstd :3}> */
  val Compressor: TypeofCompressor = js.native
  
  var ConnectionCheckOutFailedEvent: Instantiable0[typings.mongodb.mod.ConnectionCheckOutFailedEvent] = js.native
  
  var ConnectionCheckOutStartedEvent: Instantiable0[typings.mongodb.mod.ConnectionCheckOutStartedEvent] = js.native
  
  var ConnectionCheckedInEvent: Instantiable0[typings.mongodb.mod.ConnectionCheckedInEvent] = js.native
  
  var ConnectionCheckedOutEvent: Instantiable0[typings.mongodb.mod.ConnectionCheckedOutEvent] = js.native
  
  var ConnectionClosedEvent: Instantiable0[typings.mongodb.mod.ConnectionClosedEvent] = js.native
  
  var ConnectionCreatedEvent: Instantiable0[typings.mongodb.mod.ConnectionCreatedEvent] = js.native
  
  var ConnectionPoolClearedEvent: Instantiable0[typings.mongodb.mod.ConnectionPoolClearedEvent] = js.native
  
  var ConnectionPoolClosedEvent: Instantiable0[typings.mongodb.mod.ConnectionPoolClosedEvent] = js.native
  
  var ConnectionPoolCreatedEvent: Instantiable0[typings.mongodb.mod.ConnectionPoolCreatedEvent] = js.native
  
  var ConnectionPoolMonitoringEvent: Instantiable0[typings.mongodb.mod.ConnectionPoolMonitoringEvent] = js.native
  
  var ConnectionPoolReadyEvent: Instantiable0[typings.mongodb.mod.ConnectionPoolReadyEvent] = js.native
  
  var ConnectionReadyEvent: Instantiable0[typings.mongodb.mod.ConnectionReadyEvent] = js.native
  
  var DBRef: Instantiable2[/* collection */ String, /* oid */ ObjectId, typings.mongodb.mod.DBRef] = js.native
  
  var Db: TypeofDb = js.native
  
  var Decimal128: TypeofDecimal128 = js.native
  
  var Double: Instantiable1[/* value */ scala.Double, typings.mongodb.mod.Double] = js.native
  
  /* Inlined std.Readonly<{ readonly queryPlanner :'queryPlanner',  readonly queryPlannerExtended :'queryPlannerExtended',  readonly executionStats :'executionStats',  readonly allPlansExecution :'allPlansExecution'}> */
  val ExplainVerbosity: TypeofExplainVerbosity = js.native
  
  var FindCursor: Instantiable0[typings.mongodb.mod.FindCursor[js.Object]] = js.native
  
  var FindOperators: Instantiable0[typings.mongodb.mod.FindOperators] = js.native
  
  /* Inlined std.Readonly<{ readonly on :true,  readonly off :false,  readonly none :'none',  readonly forward :'forward',  readonly forwardAndReverse :'forwardAndReverse'}> */
  val GSSAPICanonicalizationValue: TypeofGSSAPICanonicalizat = js.native
  
  var GridFSBucket: TypeofGridFSBucket = js.native
  
  var GridFSBucketReadStream: TypeofGridFSBucketReadStr = js.native
  
  var GridFSBucketWriteStream: TypeofGridFSBucketWriteSt = js.native
  
  var HostAddress: TypeofHostAddress = js.native
  
  var Int32: Instantiable1[/* value */ Double, typings.mongodb.mod.Int32] = js.native
  
  val LEGAL_TCP_SOCKET_OPTIONS: js.Tuple5[family, hints, localAddress, localPort, lookup] = js.native
  
  val LEGAL_TLS_SOCKET_OPTIONS: js.Tuple16[
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
    session
  ] = js.native
  
  var ListCollectionsCursor: Instantiable2[
    /* db */ Db, 
    /* filter */ Document, 
    typings.mongodb.mod.ListCollectionsCursor[PickCollectionInfonametyp | CollectionInfo]
  ] = js.native
  
  var ListIndexesCursor: Instantiable1[/* collection */ Collection[Document], typings.mongodb.mod.ListIndexesCursor] = js.native
  
  var Long: TypeofLong = js.native
  
  val MONGO_CLIENT_EVENTS: js.Array[Any] = js.native
  
  var MaxKey: Instantiable0[typings.mongodb.mod.MaxKey] = js.native
  
  var MinKey: Instantiable0[typings.mongodb.mod.MinKey] = js.native
  
  var MongoAPIError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoAPIError] = js.native
  
  var MongoAWSError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoAWSError] = js.native
  
  var MongoBatchReExecutionError: Instantiable0[typings.mongodb.mod.MongoBatchReExecutionError] = js.native
  
  var MongoBulkWriteError: Instantiable2[
    /* error */ Code, 
    /* result */ BulkWriteResult, 
    typings.mongodb.mod.MongoBulkWriteError
  ] = js.native
  
  var MongoChangeStreamError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoChangeStreamError] = js.native
  
  var MongoClient: TypeofMongoClient = js.native
  
  var MongoCompatibilityError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoCompatibilityError] = js.native
  
  var MongoCredentials: TypeofMongoCredentials = js.native
  
  var MongoCursorExhaustedError: Instantiable0[typings.mongodb.mod.MongoCursorExhaustedError] = js.native
  
  var MongoCursorInUseError: Instantiable0[typings.mongodb.mod.MongoCursorInUseError] = js.native
  
  var MongoDBNamespace: TypeofMongoDBNamespace = js.native
  
  var MongoDecompressionError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoDecompressionError] = js.native
  
  var MongoDriverError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoDriverError] = js.native
  
  var MongoError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoError] = js.native
  
  /* Inlined std.Readonly<{ readonly RetryableWriteError :'RetryableWriteError',  readonly TransientTransactionError :'TransientTransactionError',  readonly UnknownTransactionCommitResult :'UnknownTransactionCommitResult',  readonly ResumableChangeStreamError :'ResumableChangeStreamError',  readonly HandshakeError :'HandshakeError',  readonly ResetPool :'ResetPool',  readonly InterruptInUseConnections :'InterruptInUseConnections',  readonly NoWritesPerformed :'NoWritesPerformed'}> */
  val MongoErrorLabel: TypeofMongoErrorLabel = js.native
  
  var MongoExpiredSessionError: Instantiable0[typings.mongodb.mod.MongoExpiredSessionError] = js.native
  
  var MongoGridFSChunkError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoGridFSChunkError] = js.native
  
  var MongoGridFSStreamError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoGridFSStreamError] = js.native
  
  var MongoInvalidArgumentError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoInvalidArgumentError] = js.native
  
  var MongoKerberosError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoKerberosError] = js.native
  
  var MongoMissingCredentialsError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoMissingCredentialsError] = js.native
  
  var MongoMissingDependencyError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoMissingDependencyError] = js.native
  
  var MongoNetworkError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoNetworkError] = js.native
  
  var MongoNetworkTimeoutError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoNetworkTimeoutError] = js.native
  
  var MongoNotConnectedError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoNotConnectedError] = js.native
  
  var MongoParseError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoParseError] = js.native
  
  var MongoRuntimeError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoRuntimeError] = js.native
  
  var MongoServerClosedError: Instantiable0[typings.mongodb.mod.MongoServerClosedError] = js.native
  
  var MongoServerError: Instantiable1[/* message */ ErrorDescription, typings.mongodb.mod.MongoServerError] = js.native
  
  var MongoServerSelectionError: Instantiable2[
    /* message */ String, 
    /* reason */ TopologyDescription, 
    typings.mongodb.mod.MongoServerSelectionError
  ] = js.native
  
  var MongoSystemError: Instantiable2[
    /* message */ String, 
    /* reason */ TopologyDescription, 
    typings.mongodb.mod.MongoSystemError
  ] = js.native
  
  var MongoTailableCursorError: Instantiable0[typings.mongodb.mod.MongoTailableCursorError] = js.native
  
  var MongoTopologyClosedError: Instantiable0[typings.mongodb.mod.MongoTopologyClosedError] = js.native
  
  var MongoTransactionError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoTransactionError] = js.native
  
  var MongoUnexpectedServerResponseError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoUnexpectedServerResponseError] = js.native
  
  var MongoWriteConcernError: Instantiable1[/* message */ ErrorDescription, typings.mongodb.mod.MongoWriteConcernError] = js.native
  
  var ObjectId: TypeofObjectId = js.native
  
  var OrderedBulkOperation: Instantiable0[typings.mongodb.mod.OrderedBulkOperation] = js.native
  
  /* Inlined std.Readonly<{ readonly off :'off',  readonly slowOnly :'slow_only',  readonly all :'all'}> */
  val ProfilingLevel: TypeofProfilingLevel = js.native
  
  var ReadConcern: TypeofReadConcern = js.native
  
  /* Inlined std.Readonly<{ readonly local :'local',  readonly majority :'majority',  readonly linearizable :'linearizable',  readonly available :'available',  readonly snapshot :'snapshot'}> */
  val ReadConcernLevel: TypeofReadConcernLevel = js.native
  
  var ReadPreference: TypeofReadPreference = js.native
  
  /* Inlined std.Readonly<{ readonly primary :'primary',  readonly primaryPreferred :'primaryPreferred',  readonly secondary :'secondary',  readonly secondaryPreferred :'secondaryPreferred',  readonly nearest :'nearest'}> */
  val ReadPreferenceMode: TypeofReadPreferenceMode = js.native
  
  /* Inlined std.Readonly<{ readonly BEFORE :'before',  readonly AFTER :'after'}> */
  val ReturnDocument: TypeofReturnDocument = js.native
  
  /* Inlined std.Readonly<{ readonly v1 :'1'}> */
  val ServerApiVersion: TypeofServerApiVersion = js.native
  
  var ServerCapabilities: Instantiable1[/* hello */ Document, typings.mongodb.mod.ServerCapabilities] = js.native
  
  var ServerClosedEvent: Instantiable0[typings.mongodb.mod.ServerClosedEvent] = js.native
  
  var ServerDescription: Instantiable0[typings.mongodb.mod.ServerDescription] = js.native
  
  var ServerDescriptionChangedEvent: Instantiable0[typings.mongodb.mod.ServerDescriptionChangedEvent] = js.native
  
  var ServerHeartbeatFailedEvent: Instantiable0[typings.mongodb.mod.ServerHeartbeatFailedEvent] = js.native
  
  var ServerHeartbeatStartedEvent: Instantiable0[typings.mongodb.mod.ServerHeartbeatStartedEvent] = js.native
  
  var ServerHeartbeatSucceededEvent: Instantiable0[typings.mongodb.mod.ServerHeartbeatSucceededEvent] = js.native
  
  var ServerOpeningEvent: Instantiable0[typings.mongodb.mod.ServerOpeningEvent] = js.native
  
  var ServerSession: Instantiable0[typings.mongodb.mod.ServerSession] = js.native
  
  /* Inlined std.Readonly<{ readonly Standalone :'Standalone',  readonly Mongos :'Mongos',  readonly PossiblePrimary :'PossiblePrimary',  readonly RSPrimary :'RSPrimary',  readonly RSSecondary :'RSSecondary',  readonly RSArbiter :'RSArbiter',  readonly RSOther :'RSOther',  readonly RSGhost :'RSGhost',  readonly Unknown :'Unknown',  readonly LoadBalancer :'LoadBalancer'}> */
  val ServerType: TypeofServerType = js.native
  
  var StreamDescription: Instantiable1[/* address */ String, typings.mongodb.mod.StreamDescription] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (low : unknown, high : number | boolean | undefined, unsigned : boolean | undefined): bson.anon.PinExcludekeyofLongTimest */ var Timestamp: TypeofTimestamp = js.native
  
  var TopologyClosedEvent: Instantiable0[typings.mongodb.mod.TopologyClosedEvent] = js.native
  
  var TopologyDescription: Instantiable7[
    /* topologyType */ typings.mongodb.mod.TopologyType, 
    /* serverDescriptions */ js.UndefOr[(Map[String, ServerDescription]) | Null], 
    /* setName */ js.UndefOr[String | Null], 
    /* maxSetVersion */ js.UndefOr[Double | Null], 
    /* maxElectionId */ js.UndefOr[ObjectId | Null], 
    /* commonWireVersion */ js.UndefOr[Double | Null], 
    /* options */ js.UndefOr[TopologyDescriptionOptions | Null], 
    typings.mongodb.mod.TopologyDescription
  ] = js.native
  
  var TopologyDescriptionChangedEvent: Instantiable0[typings.mongodb.mod.TopologyDescriptionChangedEvent] = js.native
  
  var TopologyOpeningEvent: Instantiable0[typings.mongodb.mod.TopologyOpeningEvent] = js.native
  
  /* Inlined std.Readonly<{ readonly Single :'Single',  readonly ReplicaSetNoPrimary :'ReplicaSetNoPrimary',  readonly ReplicaSetWithPrimary :'ReplicaSetWithPrimary',  readonly Sharded :'Sharded',  readonly Unknown :'Unknown',  readonly LoadBalanced :'LoadBalanced'}> */
  val TopologyType: TypeofTopologyType = js.native
  
  var Transaction: Instantiable0[typings.mongodb.mod.Transaction] = js.native
  
  var TypedEventEmitter: Instantiable0[typings.mongodb.mod.TypedEventEmitter[EventsDescription]] = js.native
  
  var UnorderedBulkOperation: Instantiable0[typings.mongodb.mod.UnorderedBulkOperation] = js.native
  
  var WriteConcern: TypeofWriteConcern = js.native
  
  var WriteConcernError: Instantiable1[/* error */ WriteConcernErrorData, typings.mongodb.mod.WriteConcernError] = js.native
  
  var WriteError: Instantiable1[/* err */ BulkWriteOperationError, typings.mongodb.mod.WriteError] = js.native
  
  def deserialize(buffer: js.typedarray.Uint8Array): Document = js.native
  def deserialize(buffer: js.typedarray.Uint8Array, options: DeserializeOptions): Document = js.native
  
  def serialize(`object`: Document): js.typedarray.Uint8Array = js.native
  def serialize(`object`: Document, options: SerializeOptions): js.typedarray.Uint8Array = js.native
}
