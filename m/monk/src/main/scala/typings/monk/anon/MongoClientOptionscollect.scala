package typings.monk.anon

import typings.mongodb.anon.Compressors
import typings.mongodb.anon.Password
import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.LoggerState
import typings.mongodb.mod.ReadConcern
import typings.mongodb.mod.ReadPreferenceOrMode
import typings.mongodb.mod.SocketOptions
import typings.mongodb.mod.log
import typings.monk.mod.CollectionOptions
import typings.monk.monkNumbers.`4`
import typings.monk.monkNumbers.`6`
import typings.monk.monkStrings.DEFAULT
import typings.monk.monkStrings.GSSAPI
import typings.monk.monkStrings.PLAIN
import typings.monk.monkStrings.`MONGODB-CR`
import typings.monk.monkStrings.`MONGODB-X509`
import typings.monk.monkStrings.`SCRAM-SHA-1`
import typings.monk.monkStrings.`SCRAM-SHA-256`
import typings.monk.monkStrings.majority
import typings.node.Buffer
import typings.node.tlsMod.PeerCertificate
import typings.std.Error
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.MongoClientOptions & {  collectionOptions :monk.monk.CollectionOptions | undefined} */
@js.native
trait MongoClientOptionscollect extends js.Object {
  /**
    * Default: 15; Cutoff latency point in MS for MongoS proxy selection
    */
  var acceptableLatencyMS: js.UndefOr[Double] = js.native
  /**
    * The name of the application that created this MongoClient instance.
    */
  var appname: js.UndefOr[String] = js.native
  /**
    * Authentication credentials
    */
  var auth: js.UndefOr[Password] = js.native
  /**
    * Mechanism for authentication: DEFAULT, GSSAPI, PLAIN, MONGODB-X509, 'MONGODB-CR', SCRAM-SHA-1 or SCRAM-SHA-256
    */
  var authMechanism: js.UndefOr[
    DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
  ] = js.native
  /**
    * If the database authentication is dependent on another databaseName.
    */
  var authSource: js.UndefOr[String] = js.native
  /**
    * Reconnect on error.
    * @default true
    */
  var autoReconnect: js.UndefOr[Boolean] = js.native
  /**
    * Sets a cap on how many operations the driver will buffer up before giving up on getting a
    * working connection, default is -1 which is unlimited.
    */
  var bufferMaxEntries: js.UndefOr[Double] = js.native
  /**
    * Default: true; Server identity checking during SSL
    */
  var checkServerIdentity: js.UndefOr[
    Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]])
  ] = js.native
  /**
    * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
    */
  var ciphers: js.UndefOr[String] = js.native
  var collectionOptions: js.UndefOr[CollectionOptions] = js.native
  /** Type of compression to use */
  var compression: js.UndefOr[Compressors] = js.native
  /**
    * TCP Connection timeout setting.
    * @default 10000
    */
  var connectTimeoutMS: js.UndefOr[Double] = js.native
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  /**
    * Default: false;
    */
  /**
    * Default: false;
    */
  /**
    * Default: false;
    */
  var domainsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
    */
  var ecdhCurve: js.UndefOr[String] = js.native
  /**
    * Version of IP stack. Can be 4, 6 or null.
    * @default null
    *
    * If null, will attempt to connect with IPv6, and will fall back to IPv4 on failure
    * refer to http://mongodb.github.io/node-mongodb-native/3.6/api/MongoClient.html
    */
  var family: js.UndefOr[`4` | `6` | Null] = js.native
  /**
    * Default: false; Force server to create _id fields instead of client.
    */
  var forceServerObjectId: js.UndefOr[Boolean] = js.native
  /**
    * Specify a file sync write concern
    * @default false
    */
  var fsync: js.UndefOr[Boolean] = js.native
  /**
    * Default: true; Turn on high availability monitoring.
    */
  var ha: js.UndefOr[Boolean] = js.native
  /**
    * The High availability period for replicaset inquiry
    * @default 10000
    */
  /**
    * Default: 10000; The High availability period for replicaset inquiry
    */
  /**
    * Default: 10000; The High availability period for replicaset inquiry
    */
  /**
    * Default: 10000; The High availability period for replicaset inquiry
    */
  var haInterval: js.UndefOr[Double] = js.native
  /**
    * **Only applies to the unified topology**
    * The frequency with which topology updates are scheduled
    * @default 10000
    */
  var heartbeatFrequencyMS: js.UndefOr[Double] = js.native
  /**
    * Specify if the BSON serializer should ignore undefined fields.
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.native
  /**
    * TCP KeepAlive enabled on the socket.
    * @default true
    */
  var keepAlive: js.UndefOr[Boolean] = js.native
  /**
    * TCP KeepAlive initial delay before sending first keep-alive packet when idle.
    * @default 30000
    */
  var keepAliveInitialDelay: js.UndefOr[Double] = js.native
  /**
    * **Only applies to the unified topology**
    * The size of the latency window for selecting among multiple suitable servers
    * @default 15
    */
  var localThresholdMS: js.UndefOr[Double] = js.native
  /**
    * Custom logger object
    */
  var logger: js.UndefOr[js.Object | log] = js.native
  /**
    * The logging level (error/warn/info/debug)
    */
  var loggerLevel: js.UndefOr[String] = js.native
  /**
    * **Only applies to the unified topology**
    * The maximum amount of time a connection should remain idle in the connection pool before being marked idle.
    * @default Infinity
    */
  var maxIdleTimeMS: js.UndefOr[Double] = js.native
  /**
    *  **Only applies to the unified topology**
    * The maximum number of connections that may be associated with a pool at a given time.
    * This includes in use and available connections
    * @default 10
    */
  var maxPoolSize: js.UndefOr[Double] = js.native
  /**
    * The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
    */
  var maxStalenessSeconds: js.UndefOr[Double] = js.native
  /**
    * **Only applies to the unified topology**
    * The minimum number of connections that MUST exist at any moment in a single connection pool.
    * @default 0
    */
  var minPoolSize: js.UndefOr[Double] = js.native
  /**
    * If present, the connection pool will be initialized with minSize connections, and will never dip below minSize connections
    */
  var minSize: js.UndefOr[Double] = js.native
  /**
    * Enable command monitoring for this client
    * @default false
    */
  var monitorCommands: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var monitoring: js.UndefOr[Boolean] = js.native
  /**
    * Default: false; Use c++ bson parser.
    */
  var native_parser: js.UndefOr[Boolean] = js.native
  /**
    * TCP Socket NoDelay option.
    * @default true
    */
  var noDelay: js.UndefOr[Boolean] = js.native
  /**
    * number of retries for a tailable cursor
    * @default 5
    */
  var numberOfRetries: js.UndefOr[Double] = js.native
  /**
    * Custom primary key factory to generate _id values (see Custom primary keys).
    */
  var pkFactory: js.UndefOr[js.Object] = js.native
  /**
    * Default:5; Number of connections for each server instance; set to 5 as default for legacy reasons.
    */
  var poolSize: js.UndefOr[Double] = js.native
  /**
    * ES6 compatible promise constructor
    */
  var promiseLibrary: js.UndefOr[PromiseConstructor] = js.native
  /**
    * Default: false; Promotes Binary BSON values to native Node Buffers
    */
  var promoteBuffers: js.UndefOr[Boolean] = js.native
  /**
    * Default: true; Promotes Long values to number if they fit inside the 53 bits resolution.
    */
  var promoteLongs: js.UndefOr[Boolean] = js.native
  /**
    * Default: true; Promotes BSON values to native types where possible, set to false to only receive wrapper types.
    */
  var promoteValues: js.UndefOr[Boolean] = js.native
  /**
    * Return document results as raw BSON buffers.
    */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * https://docs.mongodb.com/manual/reference/read-concern/#read-concern
    */
  var readConcern: js.UndefOr[ReadConcern | String] = js.native
  /**
    * the prefered read preference. use 'ReadPreference' class.
    */
  /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
  /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
  /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/3.1/api/ReadPreference.html */
  var readPreferenceTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Will wait # milliseconds between retries
    * @default 1000
    */
  var reconnectInterval: js.UndefOr[Double] = js.native
  /**
    * If you're connected to a single server or mongos proxy (as opposed to a replica set),
    * the MongoDB driver will try to reconnect every reconnectInterval milliseconds for reconnectTries
    * times, and give up afterward. When the driver gives up, the mongoose connection emits a
    * reconnectFailed event.
    * @default 30
    */
  var reconnectTries: js.UndefOr[Double] = js.native
  /**
    * The name of the replicaset to connect to.
    */
  var replicaSet: js.UndefOr[String] = js.native
  /**
    * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
    */
  var secondaryAcceptableLatencyMS: js.UndefOr[Double] = js.native
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.native
  /**
    * With `useUnifiedTopology`, the MongoDB driver will try to find a server to send any given operation to
    * and keep retrying for `serverSelectionTimeoutMS` milliseconds.
    * Default: 30000
    */
  var serverSelectionTimeoutMS: js.UndefOr[Double] = js.native
  /**
    * String containing the server name requested via TLS SNI.
    */
  var servername: js.UndefOr[String] = js.native
  var session: js.UndefOr[ClientSession] = js.native
  /**
    * Socket Options
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.native
  /**
    * TCP Socket timeout setting.
    * @default 360000
    */
  var socketTimeoutMS: js.UndefOr[Double] = js.native
  /**
    * Use ssl connection (needs to have a mongod server with ssl support)
    */
  var ssl: js.UndefOr[Boolean] = js.native
  /**
    * Array of valid certificates either as Buffers or Strings
    */
  var sslCA: js.UndefOr[js.Array[Buffer | String]] = js.native
  /**
    * SSL Certificate revocation list binary buffer
    */
  var sslCRL: js.UndefOr[js.Array[Buffer | String]] = js.native
  /**
    * SSL Certificate binary buffer
    */
  var sslCert: js.UndefOr[Buffer | String] = js.native
  /**
    * SSL Key file binary buffer
    */
  var sslKey: js.UndefOr[Buffer | String] = js.native
  /**
    * SSL Certificate pass phrase
    */
  var sslPass: js.UndefOr[Buffer | String] = js.native
  /**
    * Default: true; Validate mongod server certificate against ca (mongod server >=2.4 with ssl support required)
    */
  var sslValidate: js.UndefOr[Boolean] = js.native
  /**
    * Enable TLS connections
    * @default false
    */
  var tls: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether or not the driver should error when the server’s TLS certificate is invalid
    */
  var tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether or not the driver should error when there is a mismatch between the server’s hostname
    * and the hostname specified by the TLS certificate
    */
  var tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.native
  /**
    * path to file with either a single or bundle of certificate authorities
    * to be considered trusted when making a TLS connection
    */
  var tlsCAFile: js.UndefOr[String] = js.native
  /**
    * path to the client certificate file or the client private key file;
    * in the case that they both are needed, the files should be concatenated
    */
  var tlsCertificateKeyFile: js.UndefOr[String] = js.native
  /**
    * The password to decrypt the client private key to be used for TLS connections
    */
  var tlsCertificateKeyFilePassword: js.UndefOr[String] = js.native
  /**
    * Relax TLS constraints, disabling validation
    * @default false
    */
  var tlsInsecure: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether or not to use the new url parser. Enables the new, spec-compliant
    * url parser shipped in the core driver. This url parser fixes a number of problems with
    * the original parser, and aims to outright replace that parser in the near future.
    */
  var useNewUrlParser: js.UndefOr[Boolean] = js.native
  /**
    * Enables the new unified topology layer
    */
  var useUnifiedTopology: js.UndefOr[Boolean] = js.native
  /**
    * Validate MongoClient passed in options for correctness.
    * Default: false
    */
  var validateOptions: js.UndefOr[js.Object | Boolean] = js.native
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @default 1
    */
  var w: js.UndefOr[Double | majority | String] = js.native
  /**
    * **Only applies to the unified topology**
    * The maximum amount of time operation execution should wait for a connection to become available.
    * The default is 0 which means there is no limit.
    * @default 0
    */
  var waitQueueTimeoutMS: js.UndefOr[Double] = js.native
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[Double] = js.native
}

object MongoClientOptionscollect {
  @scala.inline
  def apply(): MongoClientOptionscollect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoClientOptionscollect]
  }
  @scala.inline
  implicit class MongoClientOptionscollectOps[Self <: MongoClientOptionscollect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptableLatencyMS(value: Double): Self = this.set("acceptableLatencyMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptableLatencyMS: Self = this.set("acceptableLatencyMS", js.undefined)
    @scala.inline
    def setAppname(value: String): Self = this.set("appname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppname: Self = this.set("appname", js.undefined)
    @scala.inline
    def setAuth(value: Password): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setAuthMechanism(
      value: DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
    ): Self = this.set("authMechanism", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthMechanism: Self = this.set("authMechanism", js.undefined)
    @scala.inline
    def setAuthSource(value: String): Self = this.set("authSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthSource: Self = this.set("authSource", js.undefined)
    @scala.inline
    def setAutoReconnect(value: Boolean): Self = this.set("autoReconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoReconnect: Self = this.set("autoReconnect", js.undefined)
    @scala.inline
    def setBufferMaxEntries(value: Double): Self = this.set("bufferMaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferMaxEntries: Self = this.set("bufferMaxEntries", js.undefined)
    @scala.inline
    def setCheckServerIdentityFunction2(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error]): Self = this.set("checkServerIdentity", js.Any.fromFunction2(value))
    @scala.inline
    def setCheckServerIdentity(value: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]])): Self = this.set("checkServerIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckServerIdentity: Self = this.set("checkServerIdentity", js.undefined)
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    @scala.inline
    def setCollectionOptions(value: CollectionOptions): Self = this.set("collectionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionOptions: Self = this.set("collectionOptions", js.undefined)
    @scala.inline
    def setCompression(value: Compressors): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setConnectTimeoutMS(value: Double): Self = this.set("connectTimeoutMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectTimeoutMS: Self = this.set("connectTimeoutMS", js.undefined)
    @scala.inline
    def setConnectWithNoPrimary(value: Boolean): Self = this.set("connectWithNoPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectWithNoPrimary: Self = this.set("connectWithNoPrimary", js.undefined)
    @scala.inline
    def setDomainsEnabled(value: Boolean): Self = this.set("domainsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainsEnabled: Self = this.set("domainsEnabled", js.undefined)
    @scala.inline
    def setEcdhCurve(value: String): Self = this.set("ecdhCurve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcdhCurve: Self = this.set("ecdhCurve", js.undefined)
    @scala.inline
    def setFamily(value: `4` | `6`): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setFamilyNull: Self = this.set("family", null)
    @scala.inline
    def setForceServerObjectId(value: Boolean): Self = this.set("forceServerObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceServerObjectId: Self = this.set("forceServerObjectId", js.undefined)
    @scala.inline
    def setFsync(value: Boolean): Self = this.set("fsync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFsync: Self = this.set("fsync", js.undefined)
    @scala.inline
    def setHa(value: Boolean): Self = this.set("ha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHa: Self = this.set("ha", js.undefined)
    @scala.inline
    def setHaInterval(value: Double): Self = this.set("haInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHaInterval: Self = this.set("haInterval", js.undefined)
    @scala.inline
    def setHeartbeatFrequencyMS(value: Double): Self = this.set("heartbeatFrequencyMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartbeatFrequencyMS: Self = this.set("heartbeatFrequencyMS", js.undefined)
    @scala.inline
    def setIgnoreUndefined(value: Boolean): Self = this.set("ignoreUndefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUndefined: Self = this.set("ignoreUndefined", js.undefined)
    @scala.inline
    def setJ(value: Boolean): Self = this.set("j", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setKeepAliveInitialDelay(value: Double): Self = this.set("keepAliveInitialDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAliveInitialDelay: Self = this.set("keepAliveInitialDelay", js.undefined)
    @scala.inline
    def setLocalThresholdMS(value: Double): Self = this.set("localThresholdMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalThresholdMS: Self = this.set("localThresholdMS", js.undefined)
    @scala.inline
    def setLoggerFunction2(value: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Unit): Self = this.set("logger", js.Any.fromFunction2(value))
    @scala.inline
    def setLogger(value: js.Object | log): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setLoggerLevel(value: String): Self = this.set("loggerLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggerLevel: Self = this.set("loggerLevel", js.undefined)
    @scala.inline
    def setMaxIdleTimeMS(value: Double): Self = this.set("maxIdleTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIdleTimeMS: Self = this.set("maxIdleTimeMS", js.undefined)
    @scala.inline
    def setMaxPoolSize(value: Double): Self = this.set("maxPoolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPoolSize: Self = this.set("maxPoolSize", js.undefined)
    @scala.inline
    def setMaxStalenessSeconds(value: Double): Self = this.set("maxStalenessSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxStalenessSeconds: Self = this.set("maxStalenessSeconds", js.undefined)
    @scala.inline
    def setMinPoolSize(value: Double): Self = this.set("minPoolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPoolSize: Self = this.set("minPoolSize", js.undefined)
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setMonitorCommands(value: Boolean): Self = this.set("monitorCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitorCommands: Self = this.set("monitorCommands", js.undefined)
    @scala.inline
    def setMonitoring(value: Boolean): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoring: Self = this.set("monitoring", js.undefined)
    @scala.inline
    def setNative_parser(value: Boolean): Self = this.set("native_parser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative_parser: Self = this.set("native_parser", js.undefined)
    @scala.inline
    def setNoDelay(value: Boolean): Self = this.set("noDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDelay: Self = this.set("noDelay", js.undefined)
    @scala.inline
    def setNumberOfRetries(value: Double): Self = this.set("numberOfRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfRetries: Self = this.set("numberOfRetries", js.undefined)
    @scala.inline
    def setPkFactory(value: js.Object): Self = this.set("pkFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePkFactory: Self = this.set("pkFactory", js.undefined)
    @scala.inline
    def setPoolSize(value: Double): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolSize: Self = this.set("poolSize", js.undefined)
    @scala.inline
    def setPromiseLibrary(value: PromiseConstructor): Self = this.set("promiseLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromiseLibrary: Self = this.set("promiseLibrary", js.undefined)
    @scala.inline
    def setPromoteBuffers(value: Boolean): Self = this.set("promoteBuffers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromoteBuffers: Self = this.set("promoteBuffers", js.undefined)
    @scala.inline
    def setPromoteLongs(value: Boolean): Self = this.set("promoteLongs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromoteLongs: Self = this.set("promoteLongs", js.undefined)
    @scala.inline
    def setPromoteValues(value: Boolean): Self = this.set("promoteValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromoteValues: Self = this.set("promoteValues", js.undefined)
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setReadConcern(value: ReadConcern | String): Self = this.set("readConcern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadConcern: Self = this.set("readConcern", js.undefined)
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    @scala.inline
    def setReadPreferenceTagsVarargs(value: String*): Self = this.set("readPreferenceTags", js.Array(value :_*))
    @scala.inline
    def setReadPreferenceTags(value: js.Array[String]): Self = this.set("readPreferenceTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadPreferenceTags: Self = this.set("readPreferenceTags", js.undefined)
    @scala.inline
    def setReconnectInterval(value: Double): Self = this.set("reconnectInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectInterval: Self = this.set("reconnectInterval", js.undefined)
    @scala.inline
    def setReconnectTries(value: Double): Self = this.set("reconnectTries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectTries: Self = this.set("reconnectTries", js.undefined)
    @scala.inline
    def setReplicaSet(value: String): Self = this.set("replicaSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaSet: Self = this.set("replicaSet", js.undefined)
    @scala.inline
    def setSecondaryAcceptableLatencyMS(value: Double): Self = this.set("secondaryAcceptableLatencyMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryAcceptableLatencyMS: Self = this.set("secondaryAcceptableLatencyMS", js.undefined)
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = this.set("serializeFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializeFunctions: Self = this.set("serializeFunctions", js.undefined)
    @scala.inline
    def setServerSelectionTimeoutMS(value: Double): Self = this.set("serverSelectionTimeoutMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSelectionTimeoutMS: Self = this.set("serverSelectionTimeoutMS", js.undefined)
    @scala.inline
    def setServername(value: String): Self = this.set("servername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServername: Self = this.set("servername", js.undefined)
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setSocketOptions(value: SocketOptions): Self = this.set("socketOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketOptions: Self = this.set("socketOptions", js.undefined)
    @scala.inline
    def setSocketTimeoutMS(value: Double): Self = this.set("socketTimeoutMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketTimeoutMS: Self = this.set("socketTimeoutMS", js.undefined)
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setSslCAVarargs(value: (Buffer | String)*): Self = this.set("sslCA", js.Array(value :_*))
    @scala.inline
    def setSslCA(value: js.Array[Buffer | String]): Self = this.set("sslCA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslCA: Self = this.set("sslCA", js.undefined)
    @scala.inline
    def setSslCRLVarargs(value: (Buffer | String)*): Self = this.set("sslCRL", js.Array(value :_*))
    @scala.inline
    def setSslCRL(value: js.Array[Buffer | String]): Self = this.set("sslCRL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslCRL: Self = this.set("sslCRL", js.undefined)
    @scala.inline
    def setSslCert(value: Buffer | String): Self = this.set("sslCert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslCert: Self = this.set("sslCert", js.undefined)
    @scala.inline
    def setSslKey(value: Buffer | String): Self = this.set("sslKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslKey: Self = this.set("sslKey", js.undefined)
    @scala.inline
    def setSslPass(value: Buffer | String): Self = this.set("sslPass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslPass: Self = this.set("sslPass", js.undefined)
    @scala.inline
    def setSslValidate(value: Boolean): Self = this.set("sslValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslValidate: Self = this.set("sslValidate", js.undefined)
    @scala.inline
    def setTls(value: Boolean): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    @scala.inline
    def setTlsAllowInvalidCertificates(value: Boolean): Self = this.set("tlsAllowInvalidCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsAllowInvalidCertificates: Self = this.set("tlsAllowInvalidCertificates", js.undefined)
    @scala.inline
    def setTlsAllowInvalidHostnames(value: Boolean): Self = this.set("tlsAllowInvalidHostnames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsAllowInvalidHostnames: Self = this.set("tlsAllowInvalidHostnames", js.undefined)
    @scala.inline
    def setTlsCAFile(value: String): Self = this.set("tlsCAFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsCAFile: Self = this.set("tlsCAFile", js.undefined)
    @scala.inline
    def setTlsCertificateKeyFile(value: String): Self = this.set("tlsCertificateKeyFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsCertificateKeyFile: Self = this.set("tlsCertificateKeyFile", js.undefined)
    @scala.inline
    def setTlsCertificateKeyFilePassword(value: String): Self = this.set("tlsCertificateKeyFilePassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsCertificateKeyFilePassword: Self = this.set("tlsCertificateKeyFilePassword", js.undefined)
    @scala.inline
    def setTlsInsecure(value: Boolean): Self = this.set("tlsInsecure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsInsecure: Self = this.set("tlsInsecure", js.undefined)
    @scala.inline
    def setUseNewUrlParser(value: Boolean): Self = this.set("useNewUrlParser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNewUrlParser: Self = this.set("useNewUrlParser", js.undefined)
    @scala.inline
    def setUseUnifiedTopology(value: Boolean): Self = this.set("useUnifiedTopology", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseUnifiedTopology: Self = this.set("useUnifiedTopology", js.undefined)
    @scala.inline
    def setValidateOptions(value: js.Object | Boolean): Self = this.set("validateOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOptions: Self = this.set("validateOptions", js.undefined)
    @scala.inline
    def setW(value: Double | majority | String): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    @scala.inline
    def setWaitQueueTimeoutMS(value: Double): Self = this.set("waitQueueTimeoutMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitQueueTimeoutMS: Self = this.set("waitQueueTimeoutMS", js.undefined)
    @scala.inline
    def setWtimeout(value: Double): Self = this.set("wtimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWtimeout: Self = this.set("wtimeout", js.undefined)
  }
  
}

