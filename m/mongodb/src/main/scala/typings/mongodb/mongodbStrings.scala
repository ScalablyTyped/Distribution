package typings.mongodb

import typings.mongodb.mod.AuthMechanism
import typings.mongodb.mod.BSONTypeAlias
import typings.mongodb.mod.CommonEvents
import typings.mongodb.mod.CompressorName
import typings.mongodb.mod.CursorFlag
import typings.mongodb.mod.GSSAPICanonicalizationValue
import typings.mongodb.mod.LoggerLevel
import typings.mongodb.mod.MongoErrorLabel
import typings.mongodb.mod.ProfilingLevel
import typings.mongodb.mod.ReadConcernLevel
import typings.mongodb.mod.ReadPreferenceMode
import typings.mongodb.mod.ReturnDocument
import typings.mongodb.mod.ServerType
import typings.mongodb.mod.SortDirection
import typings.mongodb.mod.TopologyType
import typings.mongodb.mod._IndexDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongodbStrings {
  
  @js.native
  sealed trait `1` extends StObject
  inline def `1`: `1` = "1".asInstanceOf[`1`]
  
  @js.native
  sealed trait `2d`
    extends StObject
       with _IndexDirection
  inline def `2d`: `2d` = "2d".asInstanceOf[`2d`]
  
  @js.native
  sealed trait `2dsphere`
    extends StObject
       with _IndexDirection
  inline def `2dsphere`: `2dsphere` = "2dsphere".asInstanceOf[`2dsphere`]
  
  @js.native
  sealed trait ALPNProtocols extends StObject
  inline def ALPNProtocols: ALPNProtocols = "ALPNProtocols".asInstanceOf[ALPNProtocols]
  
  @js.native
  sealed trait AcceptedFields extends StObject
  inline def AcceptedFields: AcceptedFields = "AcceptedFields".asInstanceOf[AcceptedFields]
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with AuthMechanism
  inline def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait Filter extends StObject
  inline def Filter: Filter = "Filter".asInstanceOf[Filter]
  
  @js.native
  sealed trait FilterOperations extends StObject
  inline def FilterOperations: FilterOperations = "FilterOperations".asInstanceOf[FilterOperations]
  
  @js.native
  sealed trait GSSAPI
    extends StObject
       with AuthMechanism
  inline def GSSAPI: GSSAPI = "GSSAPI".asInstanceOf[GSSAPI]
  
  @js.native
  sealed trait HandshakeError
    extends StObject
       with MongoErrorLabel
  inline def HandshakeError: HandshakeError = "HandshakeError".asInstanceOf[HandshakeError]
  
  @js.native
  sealed trait LessthansignmonitorGreaterthansign extends StObject
  inline def LessthansignmonitorGreaterthansign: LessthansignmonitorGreaterthansign = "<monitor>".asInstanceOf[LessthansignmonitorGreaterthansign]
  
  @js.native
  sealed trait LoadBalanced
    extends StObject
       with TopologyType
  inline def LoadBalanced: LoadBalanced = "LoadBalanced".asInstanceOf[LoadBalanced]
  
  @js.native
  sealed trait LoadBalancer
    extends StObject
       with ServerType
  inline def LoadBalancer: LoadBalancer = "LoadBalancer".asInstanceOf[LoadBalancer]
  
  @js.native
  sealed trait `MONGODB-AWS`
    extends StObject
       with AuthMechanism
  inline def `MONGODB-AWS`: `MONGODB-AWS` = "MONGODB-AWS".asInstanceOf[`MONGODB-AWS`]
  
  @js.native
  sealed trait `MONGODB-CR`
    extends StObject
       with AuthMechanism
  inline def `MONGODB-CR`: `MONGODB-CR` = "MONGODB-CR".asInstanceOf[`MONGODB-CR`]
  
  @js.native
  sealed trait `MONGODB-X509`
    extends StObject
       with AuthMechanism
  inline def `MONGODB-X509`: `MONGODB-X509` = "MONGODB-X509".asInstanceOf[`MONGODB-X509`]
  
  @js.native
  sealed trait MatchKeysAndValues extends StObject
  inline def MatchKeysAndValues: MatchKeysAndValues = "MatchKeysAndValues".asInstanceOf[MatchKeysAndValues]
  
  @js.native
  sealed trait Mongos
    extends StObject
       with ServerType
  inline def Mongos: Mongos = "Mongos".asInstanceOf[Mongos]
  
  @js.native
  sealed trait NestedPathsOfType extends StObject
  inline def NestedPathsOfType: NestedPathsOfType = "NestedPathsOfType".asInstanceOf[NestedPathsOfType]
  
  @js.native
  sealed trait NotAcceptedFields extends StObject
  inline def NotAcceptedFields: NotAcceptedFields = "NotAcceptedFields".asInstanceOf[NotAcceptedFields]
  
  @js.native
  sealed trait PLAIN
    extends StObject
       with AuthMechanism
  inline def PLAIN: PLAIN = "PLAIN".asInstanceOf[PLAIN]
  
  @js.native
  sealed trait PossiblePrimary
    extends StObject
       with ServerType
  inline def PossiblePrimary: PossiblePrimary = "PossiblePrimary".asInstanceOf[PossiblePrimary]
  
  @js.native
  sealed trait PullAllOperator extends StObject
  inline def PullAllOperator: PullAllOperator = "PullAllOperator".asInstanceOf[PullAllOperator]
  
  @js.native
  sealed trait PullOperator extends StObject
  inline def PullOperator: PullOperator = "PullOperator".asInstanceOf[PullOperator]
  
  @js.native
  sealed trait PushOperator extends StObject
  inline def PushOperator: PushOperator = "PushOperator".asInstanceOf[PushOperator]
  
  @js.native
  sealed trait RSArbiter
    extends StObject
       with ServerType
  inline def RSArbiter: RSArbiter = "RSArbiter".asInstanceOf[RSArbiter]
  
  @js.native
  sealed trait RSGhost
    extends StObject
       with ServerType
  inline def RSGhost: RSGhost = "RSGhost".asInstanceOf[RSGhost]
  
  @js.native
  sealed trait RSOther
    extends StObject
       with ServerType
  inline def RSOther: RSOther = "RSOther".asInstanceOf[RSOther]
  
  @js.native
  sealed trait RSPrimary
    extends StObject
       with ServerType
  inline def RSPrimary: RSPrimary = "RSPrimary".asInstanceOf[RSPrimary]
  
  @js.native
  sealed trait RSSecondary
    extends StObject
       with ServerType
  inline def RSSecondary: RSSecondary = "RSSecondary".asInstanceOf[RSSecondary]
  
  @js.native
  sealed trait ReplicaSetNoPrimary
    extends StObject
       with TopologyType
  inline def ReplicaSetNoPrimary: ReplicaSetNoPrimary = "ReplicaSetNoPrimary".asInstanceOf[ReplicaSetNoPrimary]
  
  @js.native
  sealed trait ReplicaSetWithPrimary
    extends StObject
       with TopologyType
  inline def ReplicaSetWithPrimary: ReplicaSetWithPrimary = "ReplicaSetWithPrimary".asInstanceOf[ReplicaSetWithPrimary]
  
  @js.native
  sealed trait ResetPool
    extends StObject
       with MongoErrorLabel
  inline def ResetPool: ResetPool = "ResetPool".asInstanceOf[ResetPool]
  
  @js.native
  sealed trait ResumableChangeStreamError
    extends StObject
       with MongoErrorLabel
  inline def ResumableChangeStreamError: ResumableChangeStreamError = "ResumableChangeStreamError".asInstanceOf[ResumableChangeStreamError]
  
  @js.native
  sealed trait RetryableWriteError
    extends StObject
       with MongoErrorLabel
  inline def RetryableWriteError: RetryableWriteError = "RetryableWriteError".asInstanceOf[RetryableWriteError]
  
  @js.native
  sealed trait `SCRAM-SHA-1`
    extends StObject
       with AuthMechanism
  inline def `SCRAM-SHA-1`: `SCRAM-SHA-1` = "SCRAM-SHA-1".asInstanceOf[`SCRAM-SHA-1`]
  
  @js.native
  sealed trait `SCRAM-SHA-256`
    extends StObject
       with AuthMechanism
  inline def `SCRAM-SHA-256`: `SCRAM-SHA-256` = "SCRAM-SHA-256".asInstanceOf[`SCRAM-SHA-256`]
  
  @js.native
  sealed trait SchemaMember extends StObject
  inline def SchemaMember: SchemaMember = "SchemaMember".asInstanceOf[SchemaMember]
  
  @js.native
  sealed trait SetFields extends StObject
  inline def SetFields: SetFields = "SetFields".asInstanceOf[SetFields]
  
  @js.native
  sealed trait Sharded
    extends StObject
       with TopologyType
  inline def Sharded: Sharded = "Sharded".asInstanceOf[Sharded]
  
  @js.native
  sealed trait Single
    extends StObject
       with TopologyType
  inline def Single: Single = "Single".asInstanceOf[Single]
  
  @js.native
  sealed trait Standalone
    extends StObject
       with ServerType
  inline def Standalone: Standalone = "Standalone".asInstanceOf[Standalone]
  
  @js.native
  sealed trait TransientTransactionError
    extends StObject
       with MongoErrorLabel
  inline def TransientTransactionError: TransientTransactionError = "TransientTransactionError".asInstanceOf[TransientTransactionError]
  
  @js.native
  sealed trait Unknown
    extends StObject
       with ServerType
       with TopologyType
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait UnknownTransactionCommitResult
    extends StObject
       with MongoErrorLabel
  inline def UnknownTransactionCommitResult: UnknownTransactionCommitResult = "UnknownTransactionCommitResult".asInstanceOf[UnknownTransactionCommitResult]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait _id extends StObject
  inline def _id: _id = "_id".asInstanceOf[_id]
  
  @js.native
  sealed trait after
    extends StObject
       with ReturnDocument
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait all
    extends StObject
       with ProfilingLevel
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait allPlansExecution extends StObject
  inline def allPlansExecution: allPlansExecution = "allPlansExecution".asInstanceOf[allPlansExecution]
  
  @js.native
  sealed trait array
    extends StObject
       with BSONTypeAlias
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait asc
    extends StObject
       with SortDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait ascending
    extends StObject
       with SortDirection
  inline def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @js.native
  sealed trait available
    extends StObject
       with ReadConcernLevel
  inline def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait awaitData
    extends StObject
       with CursorFlag
  inline def awaitData: awaitData = "awaitData".asInstanceOf[awaitData]
  
  @js.native
  sealed trait before
    extends StObject
       with ReturnDocument
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait binData
    extends StObject
       with BSONTypeAlias
  inline def binData: binData = "binData".asInstanceOf[binData]
  
  @js.native
  sealed trait bool
    extends StObject
       with BSONTypeAlias
  inline def bool: bool = "bool".asInstanceOf[bool]
  
  @js.native
  sealed trait ca extends StObject
  inline def ca: ca = "ca".asInstanceOf[ca]
  
  @js.native
  sealed trait cert extends StObject
  inline def cert: cert = "cert".asInstanceOf[cert]
  
  @js.native
  sealed trait change extends StObject
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait checkServerIdentity extends StObject
  inline def checkServerIdentity: checkServerIdentity = "checkServerIdentity".asInstanceOf[checkServerIdentity]
  
  @js.native
  sealed trait ciphers extends StObject
  inline def ciphers: ciphers = "ciphers".asInstanceOf[ciphers]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait commandFailed extends StObject
  inline def commandFailed: commandFailed = "commandFailed".asInstanceOf[commandFailed]
  
  @js.native
  sealed trait commandStarted extends StObject
  inline def commandStarted: commandStarted = "commandStarted".asInstanceOf[commandStarted]
  
  @js.native
  sealed trait commandSucceeded extends StObject
  inline def commandSucceeded: commandSucceeded = "commandSucceeded".asInstanceOf[commandSucceeded]
  
  @js.native
  sealed trait connectionCheckOutFailed extends StObject
  inline def connectionCheckOutFailed: connectionCheckOutFailed = "connectionCheckOutFailed".asInstanceOf[connectionCheckOutFailed]
  
  @js.native
  sealed trait connectionCheckOutStarted extends StObject
  inline def connectionCheckOutStarted: connectionCheckOutStarted = "connectionCheckOutStarted".asInstanceOf[connectionCheckOutStarted]
  
  @js.native
  sealed trait connectionCheckedIn extends StObject
  inline def connectionCheckedIn: connectionCheckedIn = "connectionCheckedIn".asInstanceOf[connectionCheckedIn]
  
  @js.native
  sealed trait connectionCheckedOut extends StObject
  inline def connectionCheckedOut: connectionCheckedOut = "connectionCheckedOut".asInstanceOf[connectionCheckedOut]
  
  @js.native
  sealed trait connectionClosed extends StObject
  inline def connectionClosed: connectionClosed = "connectionClosed".asInstanceOf[connectionClosed]
  
  @js.native
  sealed trait connectionCreated extends StObject
  inline def connectionCreated: connectionCreated = "connectionCreated".asInstanceOf[connectionCreated]
  
  @js.native
  sealed trait connectionPoolCleared extends StObject
  inline def connectionPoolCleared: connectionPoolCleared = "connectionPoolCleared".asInstanceOf[connectionPoolCleared]
  
  @js.native
  sealed trait connectionPoolClosed extends StObject
  inline def connectionPoolClosed: connectionPoolClosed = "connectionPoolClosed".asInstanceOf[connectionPoolClosed]
  
  @js.native
  sealed trait connectionPoolCreated extends StObject
  inline def connectionPoolCreated: connectionPoolCreated = "connectionPoolCreated".asInstanceOf[connectionPoolCreated]
  
  @js.native
  sealed trait connectionPoolReady extends StObject
  inline def connectionPoolReady: connectionPoolReady = "connectionPoolReady".asInstanceOf[connectionPoolReady]
  
  @js.native
  sealed trait connectionReady extends StObject
  inline def connectionReady: connectionReady = "connectionReady".asInstanceOf[connectionReady]
  
  @js.native
  sealed trait create extends StObject
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait createIndexes extends StObject
  inline def createIndexes: createIndexes = "createIndexes".asInstanceOf[createIndexes]
  
  @js.native
  sealed trait crl extends StObject
  inline def crl: crl = "crl".asInstanceOf[crl]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait date
    extends StObject
       with BSONTypeAlias
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait dbPointer
    extends StObject
       with BSONTypeAlias
  inline def dbPointer: dbPointer = "dbPointer".asInstanceOf[dbPointer]
  
  @js.native
  sealed trait debug
    extends StObject
       with LoggerLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait decimal
    extends StObject
       with BSONTypeAlias
  inline def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait desc
    extends StObject
       with SortDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait descending
    extends StObject
       with SortDirection
  inline def descending: descending = "descending".asInstanceOf[descending]
  
  @js.native
  sealed trait double
    extends StObject
       with BSONTypeAlias
  inline def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait drop extends StObject
  inline def drop: drop = "drop".asInstanceOf[drop]
  
  @js.native
  sealed trait dropDatabase extends StObject
  inline def dropDatabase: dropDatabase = "dropDatabase".asInstanceOf[dropDatabase]
  
  @js.native
  sealed trait dropIndexes extends StObject
  inline def dropIndexes: dropIndexes = "dropIndexes".asInstanceOf[dropIndexes]
  
  @js.native
  sealed trait ecdhCurve extends StObject
  inline def ecdhCurve: ecdhCurve = "ecdhCurve".asInstanceOf[ecdhCurve]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with LoggerLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait executionStats extends StObject
  inline def executionStats: executionStats = "executionStats".asInstanceOf[executionStats]
  
  @js.native
  sealed trait exhaust
    extends StObject
       with CursorFlag
  inline def exhaust: exhaust = "exhaust".asInstanceOf[exhaust]
  
  @js.native
  sealed trait family extends StObject
  inline def family: family = "family".asInstanceOf[family]
  
  @js.native
  sealed trait file extends StObject
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait forward
    extends StObject
       with GSSAPICanonicalizationValue
  inline def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait forwardAndReverse
    extends StObject
       with GSSAPICanonicalizationValue
  inline def forwardAndReverse: forwardAndReverse = "forwardAndReverse".asInstanceOf[forwardAndReverse]
  
  @js.native
  sealed trait generation extends StObject
  inline def generation: generation = "generation".asInstanceOf[generation]
  
  @js.native
  sealed trait geoHaystack
    extends StObject
       with _IndexDirection
  inline def geoHaystack: geoHaystack = "geoHaystack".asInstanceOf[geoHaystack]
  
  @js.native
  sealed trait hints extends StObject
  inline def hints: hints = "hints".asInstanceOf[hints]
  
  @js.native
  sealed trait host extends StObject
  inline def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait hostAddress extends StObject
  inline def hostAddress: hostAddress = "hostAddress".asInstanceOf[hostAddress]
  
  @js.native
  sealed trait hours extends StObject
  inline def hours: hours = "hours".asInstanceOf[hours]
  
  @js.native
  sealed trait id extends StObject
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait index extends StObject
  inline def index: index = "index".asInstanceOf[index]
  
  @js.native
  sealed trait info
    extends StObject
       with LoggerLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait init extends StObject
  inline def init: init = "init".asInstanceOf[init]
  
  @js.native
  sealed trait `inline` extends StObject
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait insert extends StObject
  inline def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait int
    extends StObject
       with BSONTypeAlias
  inline def int: int = "int".asInstanceOf[int]
  
  @js.native
  sealed trait invalidate extends StObject
  inline def invalidate: invalidate = "invalidate".asInstanceOf[invalidate]
  
  @js.native
  sealed trait isServer extends StObject
  inline def isServer: isServer = "isServer".asInstanceOf[isServer]
  
  @js.native
  sealed trait javascript
    extends StObject
       with BSONTypeAlias
  inline def javascript: javascript = "javascript".asInstanceOf[javascript]
  
  @js.native
  sealed trait javascriptWithScope
    extends StObject
       with BSONTypeAlias
  inline def javascriptWithScope: javascriptWithScope = "javascriptWithScope".asInstanceOf[javascriptWithScope]
  
  @js.native
  sealed trait key extends StObject
  inline def key: key = "key".asInstanceOf[key]
  
  @js.native
  sealed trait linearizable
    extends StObject
       with ReadConcernLevel
  inline def linearizable: linearizable = "linearizable".asInstanceOf[linearizable]
  
  @js.native
  sealed trait local
    extends StObject
       with ReadConcernLevel
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait localAddress extends StObject
  inline def localAddress: localAddress = "localAddress".asInstanceOf[localAddress]
  
  @js.native
  sealed trait localPort extends StObject
  inline def localPort: localPort = "localPort".asInstanceOf[localPort]
  
  @js.native
  sealed trait long
    extends StObject
       with BSONTypeAlias
  inline def long: long = "long".asInstanceOf[long]
  
  @js.native
  sealed trait lookup extends StObject
  inline def lookup: lookup = "lookup".asInstanceOf[lookup]
  
  @js.native
  sealed trait majority
    extends StObject
       with ReadConcernLevel
  inline def majority: majority = "majority".asInstanceOf[majority]
  
  @js.native
  sealed trait maxKey
    extends StObject
       with BSONTypeAlias
  inline def maxKey: maxKey = "maxKey".asInstanceOf[maxKey]
  
  @js.native
  sealed trait minDHSize extends StObject
  inline def minDHSize: minDHSize = "minDHSize".asInstanceOf[minDHSize]
  
  @js.native
  sealed trait minKey
    extends StObject
       with BSONTypeAlias
  inline def minKey: minKey = "minKey".asInstanceOf[minKey]
  
  @js.native
  sealed trait minutes extends StObject
  inline def minutes: minutes = "minutes".asInstanceOf[minutes]
  
  @js.native
  sealed trait modify extends StObject
  inline def modify: modify = "modify".asInstanceOf[modify]
  
  @js.native
  sealed trait more extends StObject
  inline def more: more = "more".asInstanceOf[more]
  
  @js.native
  sealed trait nameOnly extends StObject
  inline def nameOnly: nameOnly = "nameOnly".asInstanceOf[nameOnly]
  
  @js.native
  sealed trait nearest
    extends StObject
       with ReadPreferenceMode
  inline def nearest: nearest = "nearest".asInstanceOf[nearest]
  
  @js.native
  sealed trait newListener
    extends StObject
       with CommonEvents
  inline def newListener: newListener = "newListener".asInstanceOf[newListener]
  
  @js.native
  sealed trait noCursorTimeout
    extends StObject
       with CursorFlag
  inline def noCursorTimeout: noCursorTimeout = "noCursorTimeout".asInstanceOf[noCursorTimeout]
  
  @js.native
  sealed trait none
    extends StObject
       with CompressorName
       with GSSAPICanonicalizationValue
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `null`
    extends StObject
       with BSONTypeAlias
  inline def `null`: `null` = "null".asInstanceOf[`null`]
  
  @js.native
  sealed trait `object`
    extends StObject
       with BSONTypeAlias
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait objectId
    extends StObject
       with BSONTypeAlias
  inline def objectId: objectId = "objectId".asInstanceOf[objectId]
  
  @js.native
  sealed trait off
    extends StObject
       with ProfilingLevel
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait oplogReplay
    extends StObject
       with CursorFlag
  inline def oplogReplay: oplogReplay = "oplogReplay".asInstanceOf[oplogReplay]
  
  @js.native
  sealed trait partial
    extends StObject
       with CursorFlag
  inline def partial: partial = "partial".asInstanceOf[partial]
  
  @js.native
  sealed trait passphrase extends StObject
  inline def passphrase: passphrase = "passphrase".asInstanceOf[passphrase]
  
  @js.native
  sealed trait path extends StObject
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait pfx extends StObject
  inline def pfx: pfx = "pfx".asInstanceOf[pfx]
  
  @js.native
  sealed trait port extends StObject
  inline def port: port = "port".asInstanceOf[port]
  
  @js.native
  sealed trait primary
    extends StObject
       with ReadPreferenceMode
  inline def primary: primary = "primary".asInstanceOf[primary]
  
  @js.native
  sealed trait primaryPreferred
    extends StObject
       with ReadPreferenceMode
  inline def primaryPreferred: primaryPreferred = "primaryPreferred".asInstanceOf[primaryPreferred]
  
  @js.native
  sealed trait pskCallback extends StObject
  inline def pskCallback: pskCallback = "pskCallback".asInstanceOf[pskCallback]
  
  @js.native
  sealed trait queryPlanner extends StObject
  inline def queryPlanner: queryPlanner = "queryPlanner".asInstanceOf[queryPlanner]
  
  @js.native
  sealed trait queryPlannerExtended extends StObject
  inline def queryPlannerExtended: queryPlannerExtended = "queryPlannerExtended".asInstanceOf[queryPlannerExtended]
  
  @js.native
  sealed trait refineCollectionShardKey extends StObject
  inline def refineCollectionShardKey: refineCollectionShardKey = "refineCollectionShardKey".asInstanceOf[refineCollectionShardKey]
  
  @js.native
  sealed trait regex
    extends StObject
       with BSONTypeAlias
  inline def regex: regex = "regex".asInstanceOf[regex]
  
  @js.native
  sealed trait rejectUnauthorized extends StObject
  inline def rejectUnauthorized: rejectUnauthorized = "rejectUnauthorized".asInstanceOf[rejectUnauthorized]
  
  @js.native
  sealed trait removeListener
    extends StObject
       with CommonEvents
  inline def removeListener: removeListener = "removeListener".asInstanceOf[removeListener]
  
  @js.native
  sealed trait rename extends StObject
  inline def rename: rename = "rename".asInstanceOf[rename]
  
  @js.native
  sealed trait replace extends StObject
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait requestOCSP extends StObject
  inline def requestOCSP: requestOCSP = "requestOCSP".asInstanceOf[requestOCSP]
  
  @js.native
  sealed trait reshardCollection extends StObject
  inline def reshardCollection: reshardCollection = "reshardCollection".asInstanceOf[reshardCollection]
  
  @js.native
  sealed trait response extends StObject
  inline def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait resumeTokenChanged extends StObject
  inline def resumeTokenChanged: resumeTokenChanged = "resumeTokenChanged".asInstanceOf[resumeTokenChanged]
  
  @js.native
  sealed trait secondary
    extends StObject
       with ReadPreferenceMode
  inline def secondary: secondary = "secondary".asInstanceOf[secondary]
  
  @js.native
  sealed trait secondaryPreferred
    extends StObject
       with ReadPreferenceMode
  inline def secondaryPreferred: secondaryPreferred = "secondaryPreferred".asInstanceOf[secondaryPreferred]
  
  @js.native
  sealed trait seconds extends StObject
  inline def seconds: seconds = "seconds".asInstanceOf[seconds]
  
  @js.native
  sealed trait secureContext extends StObject
  inline def secureContext: secureContext = "secureContext".asInstanceOf[secureContext]
  
  @js.native
  sealed trait secureProtocol extends StObject
  inline def secureProtocol: secureProtocol = "secureProtocol".asInstanceOf[secureProtocol]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait serverClosed extends StObject
  inline def serverClosed: serverClosed = "serverClosed".asInstanceOf[serverClosed]
  
  @js.native
  sealed trait serverDescriptionChanged extends StObject
  inline def serverDescriptionChanged: serverDescriptionChanged = "serverDescriptionChanged".asInstanceOf[serverDescriptionChanged]
  
  @js.native
  sealed trait serverHeartbeatFailed extends StObject
  inline def serverHeartbeatFailed: serverHeartbeatFailed = "serverHeartbeatFailed".asInstanceOf[serverHeartbeatFailed]
  
  @js.native
  sealed trait serverHeartbeatStarted extends StObject
  inline def serverHeartbeatStarted: serverHeartbeatStarted = "serverHeartbeatStarted".asInstanceOf[serverHeartbeatStarted]
  
  @js.native
  sealed trait serverHeartbeatSucceeded extends StObject
  inline def serverHeartbeatSucceeded: serverHeartbeatSucceeded = "serverHeartbeatSucceeded".asInstanceOf[serverHeartbeatSucceeded]
  
  @js.native
  sealed trait serverOpening extends StObject
  inline def serverOpening: serverOpening = "serverOpening".asInstanceOf[serverOpening]
  
  @js.native
  sealed trait servername extends StObject
  inline def servername: servername = "servername".asInstanceOf[servername]
  
  @js.native
  sealed trait session extends StObject
  inline def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait shardCollection extends StObject
  inline def shardCollection: shardCollection = "shardCollection".asInstanceOf[shardCollection]
  
  @js.native
  sealed trait slow_only
    extends StObject
       with ProfilingLevel
  inline def slow_only: slow_only = "slow_only".asInstanceOf[slow_only]
  
  @js.native
  sealed trait snappy
    extends StObject
       with CompressorName
  inline def snappy: snappy = "snappy".asInstanceOf[snappy]
  
  @js.native
  sealed trait snapshot
    extends StObject
       with ReadConcernLevel
  inline def snapshot: snapshot = "snapshot".asInstanceOf[snapshot]
  
  @js.native
  sealed trait socket extends StObject
  inline def socket: socket = "socket".asInstanceOf[socket]
  
  @js.native
  sealed trait string
    extends StObject
       with BSONTypeAlias
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait symbol
    extends StObject
       with BSONTypeAlias
  inline def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait tailable
    extends StObject
       with CursorFlag
  inline def tailable: tailable = "tailable".asInstanceOf[tailable]
  
  @js.native
  sealed trait text
    extends StObject
       with _IndexDirection
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait timeout extends StObject
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait timestamp
    extends StObject
       with BSONTypeAlias
  inline def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @js.native
  sealed trait topologyClosed extends StObject
  inline def topologyClosed: topologyClosed = "topologyClosed".asInstanceOf[topologyClosed]
  
  @js.native
  sealed trait topologyDescriptionChanged extends StObject
  inline def topologyDescriptionChanged: topologyDescriptionChanged = "topologyDescriptionChanged".asInstanceOf[topologyDescriptionChanged]
  
  @js.native
  sealed trait topologyOpening extends StObject
  inline def topologyOpening: topologyOpening = "topologyOpening".asInstanceOf[topologyOpening]
  
  @js.native
  sealed trait undefined
    extends StObject
       with BSONTypeAlias
  inline def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait update extends StObject
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait warn
    extends StObject
       with LoggerLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait zlib
    extends StObject
       with CompressorName
  inline def zlib: zlib = "zlib".asInstanceOf[zlib]
  
  @js.native
  sealed trait zstd
    extends StObject
       with CompressorName
  inline def zstd: zstd = "zstd".asInstanceOf[zstd]
}
