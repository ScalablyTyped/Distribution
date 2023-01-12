package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable7
import typings.bson.mod.Document
import typings.bson.mod.ObjectId
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
import typings.mongodb.mod.Admin
import typings.mongodb.mod.AggregationCursor
import typings.mongodb.mod.BSONSymbol
import typings.mongodb.mod.Batch
import typings.mongodb.mod.BatchType
import typings.mongodb.mod.BulkOperationBase
import typings.mongodb.mod.BulkWriteOperationError
import typings.mongodb.mod.BulkWriteResult
import typings.mongodb.mod.CancellationToken
import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.Collection
import typings.mongodb.mod.CollectionInfo
import typings.mongodb.mod.CommandFailedEvent
import typings.mongodb.mod.CommandStartedEvent
import typings.mongodb.mod.CommandSucceededEvent
import typings.mongodb.mod.ConnectionCheckOutFailedEvent
import typings.mongodb.mod.ConnectionCheckOutStartedEvent
import typings.mongodb.mod.ConnectionCheckedInEvent
import typings.mongodb.mod.ConnectionCheckedOutEvent
import typings.mongodb.mod.ConnectionClosedEvent
import typings.mongodb.mod.ConnectionCreatedEvent
import typings.mongodb.mod.ConnectionPoolClearedEvent
import typings.mongodb.mod.ConnectionPoolClosedEvent
import typings.mongodb.mod.ConnectionPoolCreatedEvent
import typings.mongodb.mod.ConnectionPoolMonitoringEvent
import typings.mongodb.mod.ConnectionPoolReadyEvent
import typings.mongodb.mod.ConnectionReadyEvent
import typings.mongodb.mod.DBRef
import typings.mongodb.mod.Db
import typings.mongodb.mod.ErrorDescription
import typings.mongodb.mod.EventsDescription
import typings.mongodb.mod.FindCursor
import typings.mongodb.mod.FindOperators
import typings.mongodb.mod.Int32
import typings.mongodb.mod.ListCollectionsCursor
import typings.mongodb.mod.ListIndexesCursor
import typings.mongodb.mod.MaxKey
import typings.mongodb.mod.MinKey
import typings.mongodb.mod.MongoAPIError
import typings.mongodb.mod.MongoAWSError
import typings.mongodb.mod.MongoBatchReExecutionError
import typings.mongodb.mod.MongoBulkWriteError
import typings.mongodb.mod.MongoChangeStreamError
import typings.mongodb.mod.MongoCompatibilityError
import typings.mongodb.mod.MongoCursorExhaustedError
import typings.mongodb.mod.MongoCursorInUseError
import typings.mongodb.mod.MongoDecompressionError
import typings.mongodb.mod.MongoDriverError
import typings.mongodb.mod.MongoError
import typings.mongodb.mod.MongoExpiredSessionError
import typings.mongodb.mod.MongoGridFSChunkError
import typings.mongodb.mod.MongoGridFSStreamError
import typings.mongodb.mod.MongoInvalidArgumentError
import typings.mongodb.mod.MongoKerberosError
import typings.mongodb.mod.MongoMissingCredentialsError
import typings.mongodb.mod.MongoMissingDependencyError
import typings.mongodb.mod.MongoNetworkError
import typings.mongodb.mod.MongoNetworkTimeoutError
import typings.mongodb.mod.MongoNotConnectedError
import typings.mongodb.mod.MongoParseError
import typings.mongodb.mod.MongoRuntimeError
import typings.mongodb.mod.MongoServerClosedError
import typings.mongodb.mod.MongoServerError
import typings.mongodb.mod.MongoServerSelectionError
import typings.mongodb.mod.MongoSystemError
import typings.mongodb.mod.MongoTailableCursorError
import typings.mongodb.mod.MongoTopologyClosedError
import typings.mongodb.mod.MongoTransactionError
import typings.mongodb.mod.MongoUnexpectedServerResponseError
import typings.mongodb.mod.MongoWriteConcernError
import typings.mongodb.mod.OrderedBulkOperation
import typings.mongodb.mod.ServerCapabilities
import typings.mongodb.mod.ServerClosedEvent
import typings.mongodb.mod.ServerDescription
import typings.mongodb.mod.ServerDescriptionChangedEvent
import typings.mongodb.mod.ServerHeartbeatFailedEvent
import typings.mongodb.mod.ServerHeartbeatStartedEvent
import typings.mongodb.mod.ServerHeartbeatSucceededEvent
import typings.mongodb.mod.ServerOpeningEvent
import typings.mongodb.mod.ServerSession
import typings.mongodb.mod.StreamDescription
import typings.mongodb.mod.TopologyClosedEvent
import typings.mongodb.mod.TopologyDescription
import typings.mongodb.mod.TopologyDescriptionChangedEvent
import typings.mongodb.mod.TopologyDescriptionOptions
import typings.mongodb.mod.TopologyOpeningEvent
import typings.mongodb.mod.TopologyType
import typings.mongodb.mod.Transaction
import typings.mongodb.mod.TypedEventEmitter
import typings.mongodb.mod.UnorderedBulkOperation
import typings.mongodb.mod.WriteConcernError
import typings.mongodb.mod.WriteConcernErrorData
import typings.mongodb.mod.WriteError
import typings.std.Map
import typings.std.MapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMongoNpmModule extends StObject {
  
  var AbstractCursor: TypeofAbstractCursor
  
  var Admin: Instantiable0[typings.mongodb.mod.Admin]
  
  var AggregationCursor: Instantiable0[typings.mongodb.mod.AggregationCursor[js.Object]]
  
  /* Inlined std.Readonly<{ readonly MONGODB_AWS :'MONGODB-AWS',  readonly MONGODB_CR :'MONGODB-CR',  readonly MONGODB_DEFAULT :'DEFAULT',  readonly MONGODB_GSSAPI :'GSSAPI',  readonly MONGODB_PLAIN :'PLAIN',  readonly MONGODB_SCRAM_SHA1 :'SCRAM-SHA-1',  readonly MONGODB_SCRAM_SHA256 :'SCRAM-SHA-256',  readonly MONGODB_X509 :'MONGODB-X509'}> */
  val AuthMechanism: TypeofAuthMechanism
  
  /* Inlined std.Readonly<{ readonly FatalError :0,  readonly Error :1,  readonly Warning :2,  readonly Info :3,  readonly Trace :4}> */
  val AutoEncryptionLoggerLevel: TypeofAutoEncryptionLogge
  
  var BSONRegExp: TypeofBSONRegExp
  
  var BSONSymbol: Instantiable1[/* value */ String, typings.mongodb.mod.BSONSymbol]
  
  /* Inlined std.Readonly<{ readonly double :1,  readonly string :2,  readonly object :3,  readonly array :4,  readonly binData :5,  readonly undefined :6,  readonly objectId :7,  readonly bool :8,  readonly date :9,  readonly null :10,  readonly regex :11,  readonly dbPointer :12,  readonly javascript :13,  readonly symbol :14,  readonly javascriptWithScope :15,  readonly int :16,  readonly timestamp :17,  readonly long :18,  readonly decimal :19,  readonly minKey :-1,  readonly maxKey :127}> */
  val BSONType: TypeofBSONType
  
  var Batch: Instantiable2[
    /* batchType */ typings.mongodb.mod.BatchType, 
    /* originalZeroIndex */ Double, 
    typings.mongodb.mod.Batch[js.Object]
  ]
  
  /* Inlined std.Readonly<{ readonly INSERT :1,  readonly UPDATE :2,  readonly DELETE :3}> */
  val BatchType: TypeofBatchType
  
  var Binary: TypeofBinary
  
  var BulkOperationBase: Instantiable0[typings.mongodb.mod.BulkOperationBase]
  
  var BulkWriteResult: Instantiable0[typings.mongodb.mod.BulkWriteResult]
  
  val CURSOR_FLAGS: js.Tuple6[tailable, oplogReplay, noCursorTimeout, awaitData, exhaust, partial]
  
  var CancellationToken: Instantiable0[typings.mongodb.mod.CancellationToken]
  
  var ChangeStream: TypeofChangeStream
  
  var ClientSession: Instantiable0[typings.mongodb.mod.ClientSession]
  
  var Code: Instantiable1[/* code */ String, typings.mongodb.mod.Code]
  
  var Collection: Instantiable0[typings.mongodb.mod.Collection[Document]]
  
  var CommandFailedEvent: Instantiable0[typings.mongodb.mod.CommandFailedEvent]
  
  var CommandStartedEvent: Instantiable0[typings.mongodb.mod.CommandStartedEvent]
  
  var CommandSucceededEvent: Instantiable0[typings.mongodb.mod.CommandSucceededEvent]
  
  /* Inlined std.Readonly<{ readonly none :0,  readonly snappy :1,  readonly zlib :2,  readonly zstd :3}> */
  val Compressor: TypeofCompressor
  
  var ConnectionCheckOutFailedEvent: Instantiable0[typings.mongodb.mod.ConnectionCheckOutFailedEvent]
  
  var ConnectionCheckOutStartedEvent: Instantiable0[typings.mongodb.mod.ConnectionCheckOutStartedEvent]
  
  var ConnectionCheckedInEvent: Instantiable0[typings.mongodb.mod.ConnectionCheckedInEvent]
  
  var ConnectionCheckedOutEvent: Instantiable0[typings.mongodb.mod.ConnectionCheckedOutEvent]
  
  var ConnectionClosedEvent: Instantiable0[typings.mongodb.mod.ConnectionClosedEvent]
  
  var ConnectionCreatedEvent: Instantiable0[typings.mongodb.mod.ConnectionCreatedEvent]
  
  var ConnectionPoolClearedEvent: Instantiable0[typings.mongodb.mod.ConnectionPoolClearedEvent]
  
  var ConnectionPoolClosedEvent: Instantiable0[typings.mongodb.mod.ConnectionPoolClosedEvent]
  
  var ConnectionPoolCreatedEvent: Instantiable0[typings.mongodb.mod.ConnectionPoolCreatedEvent]
  
  var ConnectionPoolMonitoringEvent: Instantiable0[typings.mongodb.mod.ConnectionPoolMonitoringEvent]
  
  var ConnectionPoolReadyEvent: Instantiable0[typings.mongodb.mod.ConnectionPoolReadyEvent]
  
  var ConnectionReadyEvent: Instantiable0[typings.mongodb.mod.ConnectionReadyEvent]
  
  var DBRef: Instantiable2[/* collection */ String, /* oid */ ObjectId, typings.mongodb.mod.DBRef]
  
  var Db: TypeofDb
  
  var Decimal128: TypeofDecimal128
  
  var Double: Instantiable1[/* value */ scala.Double, typings.mongodb.mod.Double]
  
  /* Inlined std.Readonly<{ readonly queryPlanner :'queryPlanner',  readonly queryPlannerExtended :'queryPlannerExtended',  readonly executionStats :'executionStats',  readonly allPlansExecution :'allPlansExecution'}> */
  val ExplainVerbosity: TypeofExplainVerbosity
  
  var FindCursor: Instantiable0[typings.mongodb.mod.FindCursor[js.Object]]
  
  var FindOperators: Instantiable0[typings.mongodb.mod.FindOperators]
  
  /* Inlined std.Readonly<{ readonly on :true,  readonly off :false,  readonly none :'none',  readonly forward :'forward',  readonly forwardAndReverse :'forwardAndReverse'}> */
  val GSSAPICanonicalizationValue: TypeofGSSAPICanonicalizat
  
  var GridFSBucket: TypeofGridFSBucket
  
  var GridFSBucketReadStream: TypeofGridFSBucketReadStr
  
  var GridFSBucketWriteStream: TypeofGridFSBucketWriteSt
  
  var HostAddress: TypeofHostAddress
  
  var Int32: Instantiable1[/* value */ Double, typings.mongodb.mod.Int32]
  
  val LEGAL_TCP_SOCKET_OPTIONS: js.Tuple5[family, hints, localAddress, localPort, lookup]
  
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
  ]
  
  var ListCollectionsCursor: Instantiable2[
    /* db */ Db, 
    /* filter */ Document, 
    typings.mongodb.mod.ListCollectionsCursor[PickCollectionInfonametyp | CollectionInfo]
  ]
  
  var ListIndexesCursor: Instantiable1[/* collection */ Collection[Document], typings.mongodb.mod.ListIndexesCursor]
  
  var Logger: TypeofLogger
  
  /* Inlined std.Readonly<{ readonly ERROR :'error',  readonly WARN :'warn',  readonly INFO :'info',  readonly DEBUG :'debug',  readonly error :'error',  readonly warn :'warn',  readonly info :'info',  readonly debug :'debug'}> */
  val LoggerLevel: TypeofLoggerLevel
  
  var Long: TypeofLong
  
  val MONGO_CLIENT_EVENTS: js.Array[Any]
  
  /** @public */
  var Map: MapConstructor
  
  var MaxKey: Instantiable0[typings.mongodb.mod.MaxKey]
  
  var MinKey: Instantiable0[typings.mongodb.mod.MinKey]
  
  var MongoAPIError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoAPIError]
  
  var MongoAWSError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoAWSError]
  
  var MongoBatchReExecutionError: Instantiable0[typings.mongodb.mod.MongoBatchReExecutionError]
  
  var MongoBulkWriteError: Instantiable2[
    /* error */ Code, 
    /* result */ BulkWriteResult, 
    typings.mongodb.mod.MongoBulkWriteError
  ]
  
  var MongoChangeStreamError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoChangeStreamError]
  
  var MongoClient: TypeofMongoClient
  
  var MongoCompatibilityError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoCompatibilityError]
  
  var MongoCredentials: TypeofMongoCredentials
  
  var MongoCursorExhaustedError: Instantiable0[typings.mongodb.mod.MongoCursorExhaustedError]
  
  var MongoCursorInUseError: Instantiable0[typings.mongodb.mod.MongoCursorInUseError]
  
  var MongoDBNamespace: TypeofMongoDBNamespace
  
  var MongoDecompressionError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoDecompressionError]
  
  var MongoDriverError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoDriverError]
  
  var MongoError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoError]
  
  /* Inlined std.Readonly<{ readonly RetryableWriteError :'RetryableWriteError',  readonly TransientTransactionError :'TransientTransactionError',  readonly UnknownTransactionCommitResult :'UnknownTransactionCommitResult',  readonly ResumableChangeStreamError :'ResumableChangeStreamError',  readonly HandshakeError :'HandshakeError',  readonly ResetPool :'ResetPool',  readonly NoWritesPerformed :'NoWritesPerformed'}> */
  val MongoErrorLabel: TypeofMongoErrorLabel
  
  var MongoExpiredSessionError: Instantiable0[typings.mongodb.mod.MongoExpiredSessionError]
  
  var MongoGridFSChunkError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoGridFSChunkError]
  
  var MongoGridFSStreamError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoGridFSStreamError]
  
  var MongoInvalidArgumentError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoInvalidArgumentError]
  
  var MongoKerberosError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoKerberosError]
  
  var MongoMissingCredentialsError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoMissingCredentialsError]
  
  var MongoMissingDependencyError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoMissingDependencyError]
  
  var MongoNetworkError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoNetworkError]
  
  var MongoNetworkTimeoutError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoNetworkTimeoutError]
  
  var MongoNotConnectedError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoNotConnectedError]
  
  var MongoParseError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoParseError]
  
  var MongoRuntimeError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoRuntimeError]
  
  var MongoServerClosedError: Instantiable0[typings.mongodb.mod.MongoServerClosedError]
  
  var MongoServerError: Instantiable1[/* message */ ErrorDescription, typings.mongodb.mod.MongoServerError]
  
  var MongoServerSelectionError: Instantiable2[
    /* message */ String, 
    /* reason */ TopologyDescription, 
    typings.mongodb.mod.MongoServerSelectionError
  ]
  
  var MongoSystemError: Instantiable2[
    /* message */ String, 
    /* reason */ TopologyDescription, 
    typings.mongodb.mod.MongoSystemError
  ]
  
  var MongoTailableCursorError: Instantiable0[typings.mongodb.mod.MongoTailableCursorError]
  
  var MongoTopologyClosedError: Instantiable0[typings.mongodb.mod.MongoTopologyClosedError]
  
  var MongoTransactionError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoTransactionError]
  
  var MongoUnexpectedServerResponseError: Instantiable1[/* message */ String, typings.mongodb.mod.MongoUnexpectedServerResponseError]
  
  var MongoWriteConcernError: Instantiable1[/* message */ ErrorDescription, typings.mongodb.mod.MongoWriteConcernError]
  
  val ObjectID: Instantiable0[ObjectId] & typings.mongodb.anon.TypeofObjectId
  
  /**
    * A class representation of the BSON ObjectId type.
    * @public
    * @category BSONType
    */
  var ObjectId: Instantiable0[typings.mongodb.mod.ObjectId]
  
  var OrderedBulkOperation: Instantiable0[typings.mongodb.mod.OrderedBulkOperation]
  
  /* Inlined std.Readonly<{ readonly off :'off',  readonly slowOnly :'slow_only',  readonly all :'all'}> */
  val ProfilingLevel: TypeofProfilingLevel
  
  /**
    * Global promise store allowing user-provided promises
    * @deprecated Setting a custom promise library is deprecated the next major version will use the global Promise constructor only.
    * @public
    */
  val Promise: TypeofPromise
  
  val Promise_2: Any
  
  var ReadConcern: TypeofReadConcern
  
  /* Inlined std.Readonly<{ readonly local :'local',  readonly majority :'majority',  readonly linearizable :'linearizable',  readonly available :'available',  readonly snapshot :'snapshot'}> */
  val ReadConcernLevel: TypeofReadConcernLevel
  
  var ReadPreference: TypeofReadPreference
  
  /* Inlined std.Readonly<{ readonly primary :'primary',  readonly primaryPreferred :'primaryPreferred',  readonly secondary :'secondary',  readonly secondaryPreferred :'secondaryPreferred',  readonly nearest :'nearest'}> */
  val ReadPreferenceMode: TypeofReadPreferenceMode
  
  /* Inlined std.Readonly<{ readonly BEFORE :'before',  readonly AFTER :'after'}> */
  val ReturnDocument: TypeofReturnDocument
  
  /* Inlined std.Readonly<{ readonly v1 :'1'}> */
  val ServerApiVersion: TypeofServerApiVersion
  
  var ServerCapabilities: Instantiable1[/* hello */ Document, typings.mongodb.mod.ServerCapabilities]
  
  var ServerClosedEvent: Instantiable0[typings.mongodb.mod.ServerClosedEvent]
  
  var ServerDescription: Instantiable0[typings.mongodb.mod.ServerDescription]
  
  var ServerDescriptionChangedEvent: Instantiable0[typings.mongodb.mod.ServerDescriptionChangedEvent]
  
  var ServerHeartbeatFailedEvent: Instantiable0[typings.mongodb.mod.ServerHeartbeatFailedEvent]
  
  var ServerHeartbeatStartedEvent: Instantiable0[typings.mongodb.mod.ServerHeartbeatStartedEvent]
  
  var ServerHeartbeatSucceededEvent: Instantiable0[typings.mongodb.mod.ServerHeartbeatSucceededEvent]
  
  var ServerOpeningEvent: Instantiable0[typings.mongodb.mod.ServerOpeningEvent]
  
  var ServerSession: Instantiable0[typings.mongodb.mod.ServerSession]
  
  /* Inlined std.Readonly<{ readonly Standalone :'Standalone',  readonly Mongos :'Mongos',  readonly PossiblePrimary :'PossiblePrimary',  readonly RSPrimary :'RSPrimary',  readonly RSSecondary :'RSSecondary',  readonly RSArbiter :'RSArbiter',  readonly RSOther :'RSOther',  readonly RSGhost :'RSGhost',  readonly Unknown :'Unknown',  readonly LoadBalancer :'LoadBalancer'}> */
  val ServerType: TypeofServerType
  
  var StreamDescription: Instantiable1[/* address */ String, typings.mongodb.mod.StreamDescription]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (low : unknown, high : number | undefined, unsigned : boolean | undefined): bson.anon.PinExcludekeyofLongTimest */ var Timestamp: TypeofTimestamp
  
  var TopologyClosedEvent: Instantiable0[typings.mongodb.mod.TopologyClosedEvent]
  
  var TopologyDescription: Instantiable7[
    /* topologyType */ typings.mongodb.mod.TopologyType, 
    /* serverDescriptions */ js.UndefOr[(Map[String, ServerDescription]) | Null], 
    /* setName */ js.UndefOr[String | Null], 
    /* maxSetVersion */ js.UndefOr[Double | Null], 
    /* maxElectionId */ js.UndefOr[ObjectId | Null], 
    /* commonWireVersion */ js.UndefOr[Double | Null], 
    /* options */ js.UndefOr[TopologyDescriptionOptions | Null], 
    typings.mongodb.mod.TopologyDescription
  ]
  
  var TopologyDescriptionChangedEvent: Instantiable0[typings.mongodb.mod.TopologyDescriptionChangedEvent]
  
  var TopologyOpeningEvent: Instantiable0[typings.mongodb.mod.TopologyOpeningEvent]
  
  /* Inlined std.Readonly<{ readonly Single :'Single',  readonly ReplicaSetNoPrimary :'ReplicaSetNoPrimary',  readonly ReplicaSetWithPrimary :'ReplicaSetWithPrimary',  readonly Sharded :'Sharded',  readonly Unknown :'Unknown',  readonly LoadBalanced :'LoadBalanced'}> */
  val TopologyType: TypeofTopologyType
  
  var Transaction: Instantiable0[typings.mongodb.mod.Transaction]
  
  var TypedEventEmitter: Instantiable0[typings.mongodb.mod.TypedEventEmitter[EventsDescription]]
  
  var UnorderedBulkOperation: Instantiable0[typings.mongodb.mod.UnorderedBulkOperation]
  
  var WriteConcern: TypeofWriteConcern
  
  var WriteConcernError: Instantiable1[/* error */ WriteConcernErrorData, typings.mongodb.mod.WriteConcernError]
  
  var WriteError: Instantiable1[/* err */ BulkWriteOperationError, typings.mongodb.mod.WriteError]
}
object TypeofMongoNpmModule {
  
  inline def apply(
    AbstractCursor: TypeofAbstractCursor,
    Admin: Instantiable0[Admin],
    AggregationCursor: Instantiable0[AggregationCursor[js.Object]],
    AuthMechanism: TypeofAuthMechanism,
    AutoEncryptionLoggerLevel: TypeofAutoEncryptionLogge,
    BSONRegExp: TypeofBSONRegExp,
    BSONSymbol: Instantiable1[/* value */ String, BSONSymbol],
    BSONType: TypeofBSONType,
    Batch: Instantiable2[/* batchType */ BatchType, /* originalZeroIndex */ Double, Batch[js.Object]],
    BatchType: TypeofBatchType,
    Binary: TypeofBinary,
    BulkOperationBase: Instantiable0[BulkOperationBase],
    BulkWriteResult: Instantiable0[BulkWriteResult],
    CURSOR_FLAGS: js.Tuple6[tailable, oplogReplay, noCursorTimeout, awaitData, exhaust, partial],
    CancellationToken: Instantiable0[CancellationToken],
    ChangeStream: TypeofChangeStream,
    ClientSession: Instantiable0[ClientSession],
    Code: Instantiable1[/* code */ String, typings.mongodb.mod.Code],
    Collection: Instantiable0[Collection[Document]],
    CommandFailedEvent: Instantiable0[CommandFailedEvent],
    CommandStartedEvent: Instantiable0[CommandStartedEvent],
    CommandSucceededEvent: Instantiable0[CommandSucceededEvent],
    Compressor: TypeofCompressor,
    ConnectionCheckOutFailedEvent: Instantiable0[ConnectionCheckOutFailedEvent],
    ConnectionCheckOutStartedEvent: Instantiable0[ConnectionCheckOutStartedEvent],
    ConnectionCheckedInEvent: Instantiable0[ConnectionCheckedInEvent],
    ConnectionCheckedOutEvent: Instantiable0[ConnectionCheckedOutEvent],
    ConnectionClosedEvent: Instantiable0[ConnectionClosedEvent],
    ConnectionCreatedEvent: Instantiable0[ConnectionCreatedEvent],
    ConnectionPoolClearedEvent: Instantiable0[ConnectionPoolClearedEvent],
    ConnectionPoolClosedEvent: Instantiable0[ConnectionPoolClosedEvent],
    ConnectionPoolCreatedEvent: Instantiable0[ConnectionPoolCreatedEvent],
    ConnectionPoolMonitoringEvent: Instantiable0[ConnectionPoolMonitoringEvent],
    ConnectionPoolReadyEvent: Instantiable0[ConnectionPoolReadyEvent],
    ConnectionReadyEvent: Instantiable0[ConnectionReadyEvent],
    DBRef: Instantiable2[/* collection */ String, /* oid */ ObjectId, DBRef],
    Db: TypeofDb,
    Decimal128: TypeofDecimal128,
    Double: Instantiable1[/* value */ Double, typings.mongodb.mod.Double],
    ExplainVerbosity: TypeofExplainVerbosity,
    FindCursor: Instantiable0[FindCursor[js.Object]],
    FindOperators: Instantiable0[FindOperators],
    GSSAPICanonicalizationValue: TypeofGSSAPICanonicalizat,
    GridFSBucket: TypeofGridFSBucket,
    GridFSBucketReadStream: TypeofGridFSBucketReadStr,
    GridFSBucketWriteStream: TypeofGridFSBucketWriteSt,
    HostAddress: TypeofHostAddress,
    Int32: Instantiable1[/* value */ Double, Int32],
    LEGAL_TCP_SOCKET_OPTIONS: js.Tuple5[family, hints, localAddress, localPort, lookup],
    LEGAL_TLS_SOCKET_OPTIONS: js.Tuple16[
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
    ],
    ListCollectionsCursor: Instantiable2[
      /* db */ Db, 
      /* filter */ Document, 
      ListCollectionsCursor[PickCollectionInfonametyp | CollectionInfo]
    ],
    ListIndexesCursor: Instantiable1[/* collection */ Collection[Document], ListIndexesCursor],
    Logger: TypeofLogger,
    LoggerLevel: TypeofLoggerLevel,
    Long: TypeofLong,
    MONGO_CLIENT_EVENTS: js.Array[Any],
    Map: MapConstructor,
    MaxKey: Instantiable0[MaxKey],
    MinKey: Instantiable0[MinKey],
    MongoAPIError: Instantiable1[/* message */ String, MongoAPIError],
    MongoAWSError: Instantiable1[/* message */ String, MongoAWSError],
    MongoBatchReExecutionError: Instantiable0[MongoBatchReExecutionError],
    MongoBulkWriteError: Instantiable2[/* error */ Code, /* result */ BulkWriteResult, MongoBulkWriteError],
    MongoChangeStreamError: Instantiable1[/* message */ String, MongoChangeStreamError],
    MongoClient: TypeofMongoClient,
    MongoCompatibilityError: Instantiable1[/* message */ String, MongoCompatibilityError],
    MongoCredentials: TypeofMongoCredentials,
    MongoCursorExhaustedError: Instantiable0[MongoCursorExhaustedError],
    MongoCursorInUseError: Instantiable0[MongoCursorInUseError],
    MongoDBNamespace: TypeofMongoDBNamespace,
    MongoDecompressionError: Instantiable1[/* message */ String, MongoDecompressionError],
    MongoDriverError: Instantiable1[/* message */ String, MongoDriverError],
    MongoError: Instantiable1[/* message */ String, MongoError],
    MongoErrorLabel: TypeofMongoErrorLabel,
    MongoExpiredSessionError: Instantiable0[MongoExpiredSessionError],
    MongoGridFSChunkError: Instantiable1[/* message */ String, MongoGridFSChunkError],
    MongoGridFSStreamError: Instantiable1[/* message */ String, MongoGridFSStreamError],
    MongoInvalidArgumentError: Instantiable1[/* message */ String, MongoInvalidArgumentError],
    MongoKerberosError: Instantiable1[/* message */ String, MongoKerberosError],
    MongoMissingCredentialsError: Instantiable1[/* message */ String, MongoMissingCredentialsError],
    MongoMissingDependencyError: Instantiable1[/* message */ String, MongoMissingDependencyError],
    MongoNetworkError: Instantiable1[/* message */ String, MongoNetworkError],
    MongoNetworkTimeoutError: Instantiable1[/* message */ String, MongoNetworkTimeoutError],
    MongoNotConnectedError: Instantiable1[/* message */ String, MongoNotConnectedError],
    MongoParseError: Instantiable1[/* message */ String, MongoParseError],
    MongoRuntimeError: Instantiable1[/* message */ String, MongoRuntimeError],
    MongoServerClosedError: Instantiable0[MongoServerClosedError],
    MongoServerError: Instantiable1[/* message */ ErrorDescription, MongoServerError],
    MongoServerSelectionError: Instantiable2[/* message */ String, /* reason */ TopologyDescription, MongoServerSelectionError],
    MongoSystemError: Instantiable2[/* message */ String, /* reason */ TopologyDescription, MongoSystemError],
    MongoTailableCursorError: Instantiable0[MongoTailableCursorError],
    MongoTopologyClosedError: Instantiable0[MongoTopologyClosedError],
    MongoTransactionError: Instantiable1[/* message */ String, MongoTransactionError],
    MongoUnexpectedServerResponseError: Instantiable1[/* message */ String, MongoUnexpectedServerResponseError],
    MongoWriteConcernError: Instantiable1[/* message */ ErrorDescription, MongoWriteConcernError],
    ObjectID: Instantiable0[ObjectId] & typings.mongodb.anon.TypeofObjectId,
    ObjectId: Instantiable0[typings.mongodb.mod.ObjectId],
    OrderedBulkOperation: Instantiable0[OrderedBulkOperation],
    ProfilingLevel: TypeofProfilingLevel,
    Promise: TypeofPromise,
    Promise_2: Any,
    ReadConcern: TypeofReadConcern,
    ReadConcernLevel: TypeofReadConcernLevel,
    ReadPreference: TypeofReadPreference,
    ReadPreferenceMode: TypeofReadPreferenceMode,
    ReturnDocument: TypeofReturnDocument,
    ServerApiVersion: TypeofServerApiVersion,
    ServerCapabilities: Instantiable1[/* hello */ Document, ServerCapabilities],
    ServerClosedEvent: Instantiable0[ServerClosedEvent],
    ServerDescription: Instantiable0[ServerDescription],
    ServerDescriptionChangedEvent: Instantiable0[ServerDescriptionChangedEvent],
    ServerHeartbeatFailedEvent: Instantiable0[ServerHeartbeatFailedEvent],
    ServerHeartbeatStartedEvent: Instantiable0[ServerHeartbeatStartedEvent],
    ServerHeartbeatSucceededEvent: Instantiable0[ServerHeartbeatSucceededEvent],
    ServerOpeningEvent: Instantiable0[ServerOpeningEvent],
    ServerSession: Instantiable0[ServerSession],
    ServerType: TypeofServerType,
    StreamDescription: Instantiable1[/* address */ String, StreamDescription],
    Timestamp: TypeofTimestamp,
    TopologyClosedEvent: Instantiable0[TopologyClosedEvent],
    TopologyDescription: Instantiable7[
      /* topologyType */ TopologyType, 
      /* serverDescriptions */ js.UndefOr[(Map[String, ServerDescription]) | Null], 
      /* setName */ js.UndefOr[String | Null], 
      /* maxSetVersion */ js.UndefOr[Double | Null], 
      /* maxElectionId */ js.UndefOr[ObjectId | Null], 
      /* commonWireVersion */ js.UndefOr[Double | Null], 
      /* options */ js.UndefOr[TopologyDescriptionOptions | Null], 
      TopologyDescription
    ],
    TopologyDescriptionChangedEvent: Instantiable0[TopologyDescriptionChangedEvent],
    TopologyOpeningEvent: Instantiable0[TopologyOpeningEvent],
    TopologyType: TypeofTopologyType,
    Transaction: Instantiable0[Transaction],
    TypedEventEmitter: Instantiable0[TypedEventEmitter[EventsDescription]],
    UnorderedBulkOperation: Instantiable0[UnorderedBulkOperation],
    WriteConcern: TypeofWriteConcern,
    WriteConcernError: Instantiable1[/* error */ WriteConcernErrorData, WriteConcernError],
    WriteError: Instantiable1[/* err */ BulkWriteOperationError, WriteError]
  ): TypeofMongoNpmModule = {
    val __obj = js.Dynamic.literal(AbstractCursor = AbstractCursor.asInstanceOf[js.Any], Admin = Admin.asInstanceOf[js.Any], AggregationCursor = AggregationCursor.asInstanceOf[js.Any], AuthMechanism = AuthMechanism.asInstanceOf[js.Any], AutoEncryptionLoggerLevel = AutoEncryptionLoggerLevel.asInstanceOf[js.Any], BSONRegExp = BSONRegExp.asInstanceOf[js.Any], BSONSymbol = BSONSymbol.asInstanceOf[js.Any], BSONType = BSONType.asInstanceOf[js.Any], Batch = Batch.asInstanceOf[js.Any], BatchType = BatchType.asInstanceOf[js.Any], Binary = Binary.asInstanceOf[js.Any], BulkOperationBase = BulkOperationBase.asInstanceOf[js.Any], BulkWriteResult = BulkWriteResult.asInstanceOf[js.Any], CURSOR_FLAGS = CURSOR_FLAGS.asInstanceOf[js.Any], CancellationToken = CancellationToken.asInstanceOf[js.Any], ChangeStream = ChangeStream.asInstanceOf[js.Any], ClientSession = ClientSession.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Collection = Collection.asInstanceOf[js.Any], CommandFailedEvent = CommandFailedEvent.asInstanceOf[js.Any], CommandStartedEvent = CommandStartedEvent.asInstanceOf[js.Any], CommandSucceededEvent = CommandSucceededEvent.asInstanceOf[js.Any], Compressor = Compressor.asInstanceOf[js.Any], ConnectionCheckOutFailedEvent = ConnectionCheckOutFailedEvent.asInstanceOf[js.Any], ConnectionCheckOutStartedEvent = ConnectionCheckOutStartedEvent.asInstanceOf[js.Any], ConnectionCheckedInEvent = ConnectionCheckedInEvent.asInstanceOf[js.Any], ConnectionCheckedOutEvent = ConnectionCheckedOutEvent.asInstanceOf[js.Any], ConnectionClosedEvent = ConnectionClosedEvent.asInstanceOf[js.Any], ConnectionCreatedEvent = ConnectionCreatedEvent.asInstanceOf[js.Any], ConnectionPoolClearedEvent = ConnectionPoolClearedEvent.asInstanceOf[js.Any], ConnectionPoolClosedEvent = ConnectionPoolClosedEvent.asInstanceOf[js.Any], ConnectionPoolCreatedEvent = ConnectionPoolCreatedEvent.asInstanceOf[js.Any], ConnectionPoolMonitoringEvent = ConnectionPoolMonitoringEvent.asInstanceOf[js.Any], ConnectionPoolReadyEvent = ConnectionPoolReadyEvent.asInstanceOf[js.Any], ConnectionReadyEvent = ConnectionReadyEvent.asInstanceOf[js.Any], DBRef = DBRef.asInstanceOf[js.Any], Db = Db.asInstanceOf[js.Any], Decimal128 = Decimal128.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], ExplainVerbosity = ExplainVerbosity.asInstanceOf[js.Any], FindCursor = FindCursor.asInstanceOf[js.Any], FindOperators = FindOperators.asInstanceOf[js.Any], GSSAPICanonicalizationValue = GSSAPICanonicalizationValue.asInstanceOf[js.Any], GridFSBucket = GridFSBucket.asInstanceOf[js.Any], GridFSBucketReadStream = GridFSBucketReadStream.asInstanceOf[js.Any], GridFSBucketWriteStream = GridFSBucketWriteStream.asInstanceOf[js.Any], HostAddress = HostAddress.asInstanceOf[js.Any], Int32 = Int32.asInstanceOf[js.Any], LEGAL_TCP_SOCKET_OPTIONS = LEGAL_TCP_SOCKET_OPTIONS.asInstanceOf[js.Any], LEGAL_TLS_SOCKET_OPTIONS = LEGAL_TLS_SOCKET_OPTIONS.asInstanceOf[js.Any], ListCollectionsCursor = ListCollectionsCursor.asInstanceOf[js.Any], ListIndexesCursor = ListIndexesCursor.asInstanceOf[js.Any], Logger = Logger.asInstanceOf[js.Any], LoggerLevel = LoggerLevel.asInstanceOf[js.Any], Long = Long.asInstanceOf[js.Any], MONGO_CLIENT_EVENTS = MONGO_CLIENT_EVENTS.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], MaxKey = MaxKey.asInstanceOf[js.Any], MinKey = MinKey.asInstanceOf[js.Any], MongoAPIError = MongoAPIError.asInstanceOf[js.Any], MongoAWSError = MongoAWSError.asInstanceOf[js.Any], MongoBatchReExecutionError = MongoBatchReExecutionError.asInstanceOf[js.Any], MongoBulkWriteError = MongoBulkWriteError.asInstanceOf[js.Any], MongoChangeStreamError = MongoChangeStreamError.asInstanceOf[js.Any], MongoClient = MongoClient.asInstanceOf[js.Any], MongoCompatibilityError = MongoCompatibilityError.asInstanceOf[js.Any], MongoCredentials = MongoCredentials.asInstanceOf[js.Any], MongoCursorExhaustedError = MongoCursorExhaustedError.asInstanceOf[js.Any], MongoCursorInUseError = MongoCursorInUseError.asInstanceOf[js.Any], MongoDBNamespace = MongoDBNamespace.asInstanceOf[js.Any], MongoDecompressionError = MongoDecompressionError.asInstanceOf[js.Any], MongoDriverError = MongoDriverError.asInstanceOf[js.Any], MongoError = MongoError.asInstanceOf[js.Any], MongoErrorLabel = MongoErrorLabel.asInstanceOf[js.Any], MongoExpiredSessionError = MongoExpiredSessionError.asInstanceOf[js.Any], MongoGridFSChunkError = MongoGridFSChunkError.asInstanceOf[js.Any], MongoGridFSStreamError = MongoGridFSStreamError.asInstanceOf[js.Any], MongoInvalidArgumentError = MongoInvalidArgumentError.asInstanceOf[js.Any], MongoKerberosError = MongoKerberosError.asInstanceOf[js.Any], MongoMissingCredentialsError = MongoMissingCredentialsError.asInstanceOf[js.Any], MongoMissingDependencyError = MongoMissingDependencyError.asInstanceOf[js.Any], MongoNetworkError = MongoNetworkError.asInstanceOf[js.Any], MongoNetworkTimeoutError = MongoNetworkTimeoutError.asInstanceOf[js.Any], MongoNotConnectedError = MongoNotConnectedError.asInstanceOf[js.Any], MongoParseError = MongoParseError.asInstanceOf[js.Any], MongoRuntimeError = MongoRuntimeError.asInstanceOf[js.Any], MongoServerClosedError = MongoServerClosedError.asInstanceOf[js.Any], MongoServerError = MongoServerError.asInstanceOf[js.Any], MongoServerSelectionError = MongoServerSelectionError.asInstanceOf[js.Any], MongoSystemError = MongoSystemError.asInstanceOf[js.Any], MongoTailableCursorError = MongoTailableCursorError.asInstanceOf[js.Any], MongoTopologyClosedError = MongoTopologyClosedError.asInstanceOf[js.Any], MongoTransactionError = MongoTransactionError.asInstanceOf[js.Any], MongoUnexpectedServerResponseError = MongoUnexpectedServerResponseError.asInstanceOf[js.Any], MongoWriteConcernError = MongoWriteConcernError.asInstanceOf[js.Any], ObjectID = ObjectID.asInstanceOf[js.Any], ObjectId = ObjectId.asInstanceOf[js.Any], OrderedBulkOperation = OrderedBulkOperation.asInstanceOf[js.Any], ProfilingLevel = ProfilingLevel.asInstanceOf[js.Any], Promise = Promise.asInstanceOf[js.Any], Promise_2 = Promise_2.asInstanceOf[js.Any], ReadConcern = ReadConcern.asInstanceOf[js.Any], ReadConcernLevel = ReadConcernLevel.asInstanceOf[js.Any], ReadPreference = ReadPreference.asInstanceOf[js.Any], ReadPreferenceMode = ReadPreferenceMode.asInstanceOf[js.Any], ReturnDocument = ReturnDocument.asInstanceOf[js.Any], ServerApiVersion = ServerApiVersion.asInstanceOf[js.Any], ServerCapabilities = ServerCapabilities.asInstanceOf[js.Any], ServerClosedEvent = ServerClosedEvent.asInstanceOf[js.Any], ServerDescription = ServerDescription.asInstanceOf[js.Any], ServerDescriptionChangedEvent = ServerDescriptionChangedEvent.asInstanceOf[js.Any], ServerHeartbeatFailedEvent = ServerHeartbeatFailedEvent.asInstanceOf[js.Any], ServerHeartbeatStartedEvent = ServerHeartbeatStartedEvent.asInstanceOf[js.Any], ServerHeartbeatSucceededEvent = ServerHeartbeatSucceededEvent.asInstanceOf[js.Any], ServerOpeningEvent = ServerOpeningEvent.asInstanceOf[js.Any], ServerSession = ServerSession.asInstanceOf[js.Any], ServerType = ServerType.asInstanceOf[js.Any], StreamDescription = StreamDescription.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], TopologyClosedEvent = TopologyClosedEvent.asInstanceOf[js.Any], TopologyDescription = TopologyDescription.asInstanceOf[js.Any], TopologyDescriptionChangedEvent = TopologyDescriptionChangedEvent.asInstanceOf[js.Any], TopologyOpeningEvent = TopologyOpeningEvent.asInstanceOf[js.Any], TopologyType = TopologyType.asInstanceOf[js.Any], Transaction = Transaction.asInstanceOf[js.Any], TypedEventEmitter = TypedEventEmitter.asInstanceOf[js.Any], UnorderedBulkOperation = UnorderedBulkOperation.asInstanceOf[js.Any], WriteConcern = WriteConcern.asInstanceOf[js.Any], WriteConcernError = WriteConcernError.asInstanceOf[js.Any], WriteError = WriteError.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMongoNpmModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofMongoNpmModule] (val x: Self) extends AnyVal {
    
    inline def setAbstractCursor(value: TypeofAbstractCursor): Self = StObject.set(x, "AbstractCursor", value.asInstanceOf[js.Any])
    
    inline def setAdmin(value: Instantiable0[Admin]): Self = StObject.set(x, "Admin", value.asInstanceOf[js.Any])
    
    inline def setAggregationCursor(value: Instantiable0[AggregationCursor[js.Object]]): Self = StObject.set(x, "AggregationCursor", value.asInstanceOf[js.Any])
    
    inline def setAuthMechanism(value: TypeofAuthMechanism): Self = StObject.set(x, "AuthMechanism", value.asInstanceOf[js.Any])
    
    inline def setAutoEncryptionLoggerLevel(value: TypeofAutoEncryptionLogge): Self = StObject.set(x, "AutoEncryptionLoggerLevel", value.asInstanceOf[js.Any])
    
    inline def setBSONRegExp(value: TypeofBSONRegExp): Self = StObject.set(x, "BSONRegExp", value.asInstanceOf[js.Any])
    
    inline def setBSONSymbol(value: Instantiable1[/* value */ String, BSONSymbol]): Self = StObject.set(x, "BSONSymbol", value.asInstanceOf[js.Any])
    
    inline def setBSONType(value: TypeofBSONType): Self = StObject.set(x, "BSONType", value.asInstanceOf[js.Any])
    
    inline def setBatch(value: Instantiable2[/* batchType */ BatchType, /* originalZeroIndex */ Double, Batch[js.Object]]): Self = StObject.set(x, "Batch", value.asInstanceOf[js.Any])
    
    inline def setBatchType(value: TypeofBatchType): Self = StObject.set(x, "BatchType", value.asInstanceOf[js.Any])
    
    inline def setBinary(value: TypeofBinary): Self = StObject.set(x, "Binary", value.asInstanceOf[js.Any])
    
    inline def setBulkOperationBase(value: Instantiable0[BulkOperationBase]): Self = StObject.set(x, "BulkOperationBase", value.asInstanceOf[js.Any])
    
    inline def setBulkWriteResult(value: Instantiable0[BulkWriteResult]): Self = StObject.set(x, "BulkWriteResult", value.asInstanceOf[js.Any])
    
    inline def setCURSOR_FLAGS(value: js.Tuple6[tailable, oplogReplay, noCursorTimeout, awaitData, exhaust, partial]): Self = StObject.set(x, "CURSOR_FLAGS", value.asInstanceOf[js.Any])
    
    inline def setCancellationToken(value: Instantiable0[CancellationToken]): Self = StObject.set(x, "CancellationToken", value.asInstanceOf[js.Any])
    
    inline def setChangeStream(value: TypeofChangeStream): Self = StObject.set(x, "ChangeStream", value.asInstanceOf[js.Any])
    
    inline def setClientSession(value: Instantiable0[ClientSession]): Self = StObject.set(x, "ClientSession", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Instantiable1[/* code */ String, typings.mongodb.mod.Code]): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCollection(value: Instantiable0[Collection[Document]]): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
    
    inline def setCommandFailedEvent(value: Instantiable0[CommandFailedEvent]): Self = StObject.set(x, "CommandFailedEvent", value.asInstanceOf[js.Any])
    
    inline def setCommandStartedEvent(value: Instantiable0[CommandStartedEvent]): Self = StObject.set(x, "CommandStartedEvent", value.asInstanceOf[js.Any])
    
    inline def setCommandSucceededEvent(value: Instantiable0[CommandSucceededEvent]): Self = StObject.set(x, "CommandSucceededEvent", value.asInstanceOf[js.Any])
    
    inline def setCompressor(value: TypeofCompressor): Self = StObject.set(x, "Compressor", value.asInstanceOf[js.Any])
    
    inline def setConnectionCheckOutFailedEvent(value: Instantiable0[ConnectionCheckOutFailedEvent]): Self = StObject.set(x, "ConnectionCheckOutFailedEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionCheckOutStartedEvent(value: Instantiable0[ConnectionCheckOutStartedEvent]): Self = StObject.set(x, "ConnectionCheckOutStartedEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionCheckedInEvent(value: Instantiable0[ConnectionCheckedInEvent]): Self = StObject.set(x, "ConnectionCheckedInEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionCheckedOutEvent(value: Instantiable0[ConnectionCheckedOutEvent]): Self = StObject.set(x, "ConnectionCheckedOutEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionClosedEvent(value: Instantiable0[ConnectionClosedEvent]): Self = StObject.set(x, "ConnectionClosedEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionCreatedEvent(value: Instantiable0[ConnectionCreatedEvent]): Self = StObject.set(x, "ConnectionCreatedEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionPoolClearedEvent(value: Instantiable0[ConnectionPoolClearedEvent]): Self = StObject.set(x, "ConnectionPoolClearedEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionPoolClosedEvent(value: Instantiable0[ConnectionPoolClosedEvent]): Self = StObject.set(x, "ConnectionPoolClosedEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionPoolCreatedEvent(value: Instantiable0[ConnectionPoolCreatedEvent]): Self = StObject.set(x, "ConnectionPoolCreatedEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionPoolMonitoringEvent(value: Instantiable0[ConnectionPoolMonitoringEvent]): Self = StObject.set(x, "ConnectionPoolMonitoringEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionPoolReadyEvent(value: Instantiable0[ConnectionPoolReadyEvent]): Self = StObject.set(x, "ConnectionPoolReadyEvent", value.asInstanceOf[js.Any])
    
    inline def setConnectionReadyEvent(value: Instantiable0[ConnectionReadyEvent]): Self = StObject.set(x, "ConnectionReadyEvent", value.asInstanceOf[js.Any])
    
    inline def setDBRef(value: Instantiable2[/* collection */ String, /* oid */ ObjectId, DBRef]): Self = StObject.set(x, "DBRef", value.asInstanceOf[js.Any])
    
    inline def setDb(value: TypeofDb): Self = StObject.set(x, "Db", value.asInstanceOf[js.Any])
    
    inline def setDecimal128(value: TypeofDecimal128): Self = StObject.set(x, "Decimal128", value.asInstanceOf[js.Any])
    
    inline def setDouble(value: Instantiable1[/* value */ Double, typings.mongodb.mod.Double]): Self = StObject.set(x, "Double", value.asInstanceOf[js.Any])
    
    inline def setExplainVerbosity(value: TypeofExplainVerbosity): Self = StObject.set(x, "ExplainVerbosity", value.asInstanceOf[js.Any])
    
    inline def setFindCursor(value: Instantiable0[FindCursor[js.Object]]): Self = StObject.set(x, "FindCursor", value.asInstanceOf[js.Any])
    
    inline def setFindOperators(value: Instantiable0[FindOperators]): Self = StObject.set(x, "FindOperators", value.asInstanceOf[js.Any])
    
    inline def setGSSAPICanonicalizationValue(value: TypeofGSSAPICanonicalizat): Self = StObject.set(x, "GSSAPICanonicalizationValue", value.asInstanceOf[js.Any])
    
    inline def setGridFSBucket(value: TypeofGridFSBucket): Self = StObject.set(x, "GridFSBucket", value.asInstanceOf[js.Any])
    
    inline def setGridFSBucketReadStream(value: TypeofGridFSBucketReadStr): Self = StObject.set(x, "GridFSBucketReadStream", value.asInstanceOf[js.Any])
    
    inline def setGridFSBucketWriteStream(value: TypeofGridFSBucketWriteSt): Self = StObject.set(x, "GridFSBucketWriteStream", value.asInstanceOf[js.Any])
    
    inline def setHostAddress(value: TypeofHostAddress): Self = StObject.set(x, "HostAddress", value.asInstanceOf[js.Any])
    
    inline def setInt32(value: Instantiable1[/* value */ Double, Int32]): Self = StObject.set(x, "Int32", value.asInstanceOf[js.Any])
    
    inline def setLEGAL_TCP_SOCKET_OPTIONS(value: js.Tuple5[family, hints, localAddress, localPort, lookup]): Self = StObject.set(x, "LEGAL_TCP_SOCKET_OPTIONS", value.asInstanceOf[js.Any])
    
    inline def setLEGAL_TLS_SOCKET_OPTIONS(
      value: js.Tuple16[
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
        ]
    ): Self = StObject.set(x, "LEGAL_TLS_SOCKET_OPTIONS", value.asInstanceOf[js.Any])
    
    inline def setListCollectionsCursor(
      value: Instantiable2[
          /* db */ Db, 
          /* filter */ Document, 
          ListCollectionsCursor[PickCollectionInfonametyp | CollectionInfo]
        ]
    ): Self = StObject.set(x, "ListCollectionsCursor", value.asInstanceOf[js.Any])
    
    inline def setListIndexesCursor(value: Instantiable1[/* collection */ Collection[Document], ListIndexesCursor]): Self = StObject.set(x, "ListIndexesCursor", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: TypeofLogger): Self = StObject.set(x, "Logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerLevel(value: TypeofLoggerLevel): Self = StObject.set(x, "LoggerLevel", value.asInstanceOf[js.Any])
    
    inline def setLong(value: TypeofLong): Self = StObject.set(x, "Long", value.asInstanceOf[js.Any])
    
    inline def setMONGO_CLIENT_EVENTS(value: js.Array[Any]): Self = StObject.set(x, "MONGO_CLIENT_EVENTS", value.asInstanceOf[js.Any])
    
    inline def setMONGO_CLIENT_EVENTSVarargs(value: Any*): Self = StObject.set(x, "MONGO_CLIENT_EVENTS", js.Array(value*))
    
    inline def setMap(value: MapConstructor): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
    
    inline def setMaxKey(value: Instantiable0[MaxKey]): Self = StObject.set(x, "MaxKey", value.asInstanceOf[js.Any])
    
    inline def setMinKey(value: Instantiable0[MinKey]): Self = StObject.set(x, "MinKey", value.asInstanceOf[js.Any])
    
    inline def setMongoAPIError(value: Instantiable1[/* message */ String, MongoAPIError]): Self = StObject.set(x, "MongoAPIError", value.asInstanceOf[js.Any])
    
    inline def setMongoAWSError(value: Instantiable1[/* message */ String, MongoAWSError]): Self = StObject.set(x, "MongoAWSError", value.asInstanceOf[js.Any])
    
    inline def setMongoBatchReExecutionError(value: Instantiable0[MongoBatchReExecutionError]): Self = StObject.set(x, "MongoBatchReExecutionError", value.asInstanceOf[js.Any])
    
    inline def setMongoBulkWriteError(value: Instantiable2[/* error */ Code, /* result */ BulkWriteResult, MongoBulkWriteError]): Self = StObject.set(x, "MongoBulkWriteError", value.asInstanceOf[js.Any])
    
    inline def setMongoChangeStreamError(value: Instantiable1[/* message */ String, MongoChangeStreamError]): Self = StObject.set(x, "MongoChangeStreamError", value.asInstanceOf[js.Any])
    
    inline def setMongoClient(value: TypeofMongoClient): Self = StObject.set(x, "MongoClient", value.asInstanceOf[js.Any])
    
    inline def setMongoCompatibilityError(value: Instantiable1[/* message */ String, MongoCompatibilityError]): Self = StObject.set(x, "MongoCompatibilityError", value.asInstanceOf[js.Any])
    
    inline def setMongoCredentials(value: TypeofMongoCredentials): Self = StObject.set(x, "MongoCredentials", value.asInstanceOf[js.Any])
    
    inline def setMongoCursorExhaustedError(value: Instantiable0[MongoCursorExhaustedError]): Self = StObject.set(x, "MongoCursorExhaustedError", value.asInstanceOf[js.Any])
    
    inline def setMongoCursorInUseError(value: Instantiable0[MongoCursorInUseError]): Self = StObject.set(x, "MongoCursorInUseError", value.asInstanceOf[js.Any])
    
    inline def setMongoDBNamespace(value: TypeofMongoDBNamespace): Self = StObject.set(x, "MongoDBNamespace", value.asInstanceOf[js.Any])
    
    inline def setMongoDecompressionError(value: Instantiable1[/* message */ String, MongoDecompressionError]): Self = StObject.set(x, "MongoDecompressionError", value.asInstanceOf[js.Any])
    
    inline def setMongoDriverError(value: Instantiable1[/* message */ String, MongoDriverError]): Self = StObject.set(x, "MongoDriverError", value.asInstanceOf[js.Any])
    
    inline def setMongoError(value: Instantiable1[/* message */ String, MongoError]): Self = StObject.set(x, "MongoError", value.asInstanceOf[js.Any])
    
    inline def setMongoErrorLabel(value: TypeofMongoErrorLabel): Self = StObject.set(x, "MongoErrorLabel", value.asInstanceOf[js.Any])
    
    inline def setMongoExpiredSessionError(value: Instantiable0[MongoExpiredSessionError]): Self = StObject.set(x, "MongoExpiredSessionError", value.asInstanceOf[js.Any])
    
    inline def setMongoGridFSChunkError(value: Instantiable1[/* message */ String, MongoGridFSChunkError]): Self = StObject.set(x, "MongoGridFSChunkError", value.asInstanceOf[js.Any])
    
    inline def setMongoGridFSStreamError(value: Instantiable1[/* message */ String, MongoGridFSStreamError]): Self = StObject.set(x, "MongoGridFSStreamError", value.asInstanceOf[js.Any])
    
    inline def setMongoInvalidArgumentError(value: Instantiable1[/* message */ String, MongoInvalidArgumentError]): Self = StObject.set(x, "MongoInvalidArgumentError", value.asInstanceOf[js.Any])
    
    inline def setMongoKerberosError(value: Instantiable1[/* message */ String, MongoKerberosError]): Self = StObject.set(x, "MongoKerberosError", value.asInstanceOf[js.Any])
    
    inline def setMongoMissingCredentialsError(value: Instantiable1[/* message */ String, MongoMissingCredentialsError]): Self = StObject.set(x, "MongoMissingCredentialsError", value.asInstanceOf[js.Any])
    
    inline def setMongoMissingDependencyError(value: Instantiable1[/* message */ String, MongoMissingDependencyError]): Self = StObject.set(x, "MongoMissingDependencyError", value.asInstanceOf[js.Any])
    
    inline def setMongoNetworkError(value: Instantiable1[/* message */ String, MongoNetworkError]): Self = StObject.set(x, "MongoNetworkError", value.asInstanceOf[js.Any])
    
    inline def setMongoNetworkTimeoutError(value: Instantiable1[/* message */ String, MongoNetworkTimeoutError]): Self = StObject.set(x, "MongoNetworkTimeoutError", value.asInstanceOf[js.Any])
    
    inline def setMongoNotConnectedError(value: Instantiable1[/* message */ String, MongoNotConnectedError]): Self = StObject.set(x, "MongoNotConnectedError", value.asInstanceOf[js.Any])
    
    inline def setMongoParseError(value: Instantiable1[/* message */ String, MongoParseError]): Self = StObject.set(x, "MongoParseError", value.asInstanceOf[js.Any])
    
    inline def setMongoRuntimeError(value: Instantiable1[/* message */ String, MongoRuntimeError]): Self = StObject.set(x, "MongoRuntimeError", value.asInstanceOf[js.Any])
    
    inline def setMongoServerClosedError(value: Instantiable0[MongoServerClosedError]): Self = StObject.set(x, "MongoServerClosedError", value.asInstanceOf[js.Any])
    
    inline def setMongoServerError(value: Instantiable1[/* message */ ErrorDescription, MongoServerError]): Self = StObject.set(x, "MongoServerError", value.asInstanceOf[js.Any])
    
    inline def setMongoServerSelectionError(
      value: Instantiable2[/* message */ String, /* reason */ TopologyDescription, MongoServerSelectionError]
    ): Self = StObject.set(x, "MongoServerSelectionError", value.asInstanceOf[js.Any])
    
    inline def setMongoSystemError(value: Instantiable2[/* message */ String, /* reason */ TopologyDescription, MongoSystemError]): Self = StObject.set(x, "MongoSystemError", value.asInstanceOf[js.Any])
    
    inline def setMongoTailableCursorError(value: Instantiable0[MongoTailableCursorError]): Self = StObject.set(x, "MongoTailableCursorError", value.asInstanceOf[js.Any])
    
    inline def setMongoTopologyClosedError(value: Instantiable0[MongoTopologyClosedError]): Self = StObject.set(x, "MongoTopologyClosedError", value.asInstanceOf[js.Any])
    
    inline def setMongoTransactionError(value: Instantiable1[/* message */ String, MongoTransactionError]): Self = StObject.set(x, "MongoTransactionError", value.asInstanceOf[js.Any])
    
    inline def setMongoUnexpectedServerResponseError(value: Instantiable1[/* message */ String, MongoUnexpectedServerResponseError]): Self = StObject.set(x, "MongoUnexpectedServerResponseError", value.asInstanceOf[js.Any])
    
    inline def setMongoWriteConcernError(value: Instantiable1[/* message */ ErrorDescription, MongoWriteConcernError]): Self = StObject.set(x, "MongoWriteConcernError", value.asInstanceOf[js.Any])
    
    inline def setObjectID(value: Instantiable0[ObjectId] & typings.mongodb.anon.TypeofObjectId): Self = StObject.set(x, "ObjectID", value.asInstanceOf[js.Any])
    
    inline def setOrderedBulkOperation(value: Instantiable0[OrderedBulkOperation]): Self = StObject.set(x, "OrderedBulkOperation", value.asInstanceOf[js.Any])
    
    inline def setProfilingLevel(value: TypeofProfilingLevel): Self = StObject.set(x, "ProfilingLevel", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: TypeofPromise): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    
    inline def setPromise_2(value: Any): Self = StObject.set(x, "Promise_2", value.asInstanceOf[js.Any])
    
    inline def setReadConcern(value: TypeofReadConcern): Self = StObject.set(x, "ReadConcern", value.asInstanceOf[js.Any])
    
    inline def setReadConcernLevel(value: TypeofReadConcernLevel): Self = StObject.set(x, "ReadConcernLevel", value.asInstanceOf[js.Any])
    
    inline def setReadPreference(value: TypeofReadPreference): Self = StObject.set(x, "ReadPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceMode(value: TypeofReadPreferenceMode): Self = StObject.set(x, "ReadPreferenceMode", value.asInstanceOf[js.Any])
    
    inline def setReturnDocument(value: TypeofReturnDocument): Self = StObject.set(x, "ReturnDocument", value.asInstanceOf[js.Any])
    
    inline def setServerApiVersion(value: TypeofServerApiVersion): Self = StObject.set(x, "ServerApiVersion", value.asInstanceOf[js.Any])
    
    inline def setServerCapabilities(value: Instantiable1[/* hello */ Document, ServerCapabilities]): Self = StObject.set(x, "ServerCapabilities", value.asInstanceOf[js.Any])
    
    inline def setServerClosedEvent(value: Instantiable0[ServerClosedEvent]): Self = StObject.set(x, "ServerClosedEvent", value.asInstanceOf[js.Any])
    
    inline def setServerDescription(value: Instantiable0[ServerDescription]): Self = StObject.set(x, "ServerDescription", value.asInstanceOf[js.Any])
    
    inline def setServerDescriptionChangedEvent(value: Instantiable0[ServerDescriptionChangedEvent]): Self = StObject.set(x, "ServerDescriptionChangedEvent", value.asInstanceOf[js.Any])
    
    inline def setServerHeartbeatFailedEvent(value: Instantiable0[ServerHeartbeatFailedEvent]): Self = StObject.set(x, "ServerHeartbeatFailedEvent", value.asInstanceOf[js.Any])
    
    inline def setServerHeartbeatStartedEvent(value: Instantiable0[ServerHeartbeatStartedEvent]): Self = StObject.set(x, "ServerHeartbeatStartedEvent", value.asInstanceOf[js.Any])
    
    inline def setServerHeartbeatSucceededEvent(value: Instantiable0[ServerHeartbeatSucceededEvent]): Self = StObject.set(x, "ServerHeartbeatSucceededEvent", value.asInstanceOf[js.Any])
    
    inline def setServerOpeningEvent(value: Instantiable0[ServerOpeningEvent]): Self = StObject.set(x, "ServerOpeningEvent", value.asInstanceOf[js.Any])
    
    inline def setServerSession(value: Instantiable0[ServerSession]): Self = StObject.set(x, "ServerSession", value.asInstanceOf[js.Any])
    
    inline def setServerType(value: TypeofServerType): Self = StObject.set(x, "ServerType", value.asInstanceOf[js.Any])
    
    inline def setStreamDescription(value: Instantiable1[/* address */ String, StreamDescription]): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: TypeofTimestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTopologyClosedEvent(value: Instantiable0[TopologyClosedEvent]): Self = StObject.set(x, "TopologyClosedEvent", value.asInstanceOf[js.Any])
    
    inline def setTopologyDescription(
      value: Instantiable7[
          /* topologyType */ TopologyType, 
          /* serverDescriptions */ js.UndefOr[(Map[String, ServerDescription]) | Null], 
          /* setName */ js.UndefOr[String | Null], 
          /* maxSetVersion */ js.UndefOr[Double | Null], 
          /* maxElectionId */ js.UndefOr[ObjectId | Null], 
          /* commonWireVersion */ js.UndefOr[Double | Null], 
          /* options */ js.UndefOr[TopologyDescriptionOptions | Null], 
          TopologyDescription
        ]
    ): Self = StObject.set(x, "TopologyDescription", value.asInstanceOf[js.Any])
    
    inline def setTopologyDescriptionChangedEvent(value: Instantiable0[TopologyDescriptionChangedEvent]): Self = StObject.set(x, "TopologyDescriptionChangedEvent", value.asInstanceOf[js.Any])
    
    inline def setTopologyOpeningEvent(value: Instantiable0[TopologyOpeningEvent]): Self = StObject.set(x, "TopologyOpeningEvent", value.asInstanceOf[js.Any])
    
    inline def setTopologyType(value: TypeofTopologyType): Self = StObject.set(x, "TopologyType", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: Instantiable0[Transaction]): Self = StObject.set(x, "Transaction", value.asInstanceOf[js.Any])
    
    inline def setTypedEventEmitter(value: Instantiable0[TypedEventEmitter[EventsDescription]]): Self = StObject.set(x, "TypedEventEmitter", value.asInstanceOf[js.Any])
    
    inline def setUnorderedBulkOperation(value: Instantiable0[UnorderedBulkOperation]): Self = StObject.set(x, "UnorderedBulkOperation", value.asInstanceOf[js.Any])
    
    inline def setWriteConcern(value: TypeofWriteConcern): Self = StObject.set(x, "WriteConcern", value.asInstanceOf[js.Any])
    
    inline def setWriteConcernError(value: Instantiable1[/* error */ WriteConcernErrorData, WriteConcernError]): Self = StObject.set(x, "WriteConcernError", value.asInstanceOf[js.Any])
    
    inline def setWriteError(value: Instantiable1[/* err */ BulkWriteOperationError, WriteError]): Self = StObject.set(x, "WriteError", value.asInstanceOf[js.Any])
  }
}
