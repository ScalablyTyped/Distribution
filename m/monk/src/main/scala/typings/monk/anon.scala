package typings.monk

import typings.bson.mod.Document
import typings.mongodb.mod.Auth
import typings.mongodb.mod.AuthMechanism
import typings.mongodb.mod.AuthMechanismProperties
import typings.mongodb.mod.AutoEncryptionOptions
import typings.mongodb.mod.CompressorName
import typings.mongodb.mod.DriverInfo
import typings.mongodb.mod.PkFactory
import typings.mongodb.mod.ReadConcernLevel
import typings.mongodb.mod.ReadConcernLike
import typings.mongodb.mod.ReadPreference
import typings.mongodb.mod.ReadPreferenceMode
import typings.mongodb.mod.ServerApi
import typings.mongodb.mod.ServerApiVersion
import typings.mongodb.mod.TagSet
import typings.mongodb.mod.W
import typings.mongodb.mod.WriteConcern
import typings.mongodb.mod.WriteConcernSettings
import typings.monk.mod.CollectionOptions
import typings.monk.mod.ICollection
import typings.monk.mod.IMonkManager
import typings.monk.mod.IObjectID
import typings.monk.monkBooleans.`false`
import typings.monk.monkBooleans.`true`
import typings.monk.monkInts.`1`
import typings.monk.monkInts.`2`
import typings.monk.monkInts.`3`
import typings.monk.monkInts.`4`
import typings.monk.monkInts.`5`
import typings.monk.monkInts.`6`
import typings.monk.monkInts.`7`
import typings.monk.monkInts.`8`
import typings.monk.monkInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var replace: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(replace = true)
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setReplace(value: `true`): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    }
  }
  
  trait Close extends StObject {
    
    def close(): Unit
    
    def pause(): Unit
    
    def resume(): Unit
  }
  object Close {
    
    inline def apply(close: () => Unit, pause: () => Unit, resume: () => Unit): Close = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume))
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    }
  }
  
  trait Collection extends StObject {
    
    var collection: ICollection[Any]
    
    var monkInstance: IMonkManager
  }
  object Collection {
    
    inline def apply(collection: ICollection[Any], monkInstance: IMonkManager): Collection = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], monkInstance = monkInstance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: ICollection[Any]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setMonkInstance(value: IMonkManager): Self = StObject.set(x, "monkInstance", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var _id: IObjectID
  }
  object Id {
    
    inline def apply(_id: IObjectID): Id = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def set_id(value: IObjectID): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined mongodb.mongodb.MongoClientOptions & {  collectionOptions :monk.monk.CollectionOptions | undefined} */
  trait MongoClientOptionscollect extends StObject {
    
    /** The name of the application that created this MongoClient instance. MongoDB 3.4 and newer will print this value in the server log upon establishing each connection. It is also recorded in the slow query log and profile collections */
    var appName: js.UndefOr[String] = js.undefined
    
    /** The auth settings for when connection to server. */
    var auth: js.UndefOr[Auth] = js.undefined
    
    /** Specify the authentication mechanism that MongoDB will use to authenticate the connection. */
    var authMechanism: js.UndefOr[AuthMechanism] = js.undefined
    
    /** Specify properties for the specified authMechanism as a comma-separated list of colon-separated key-value pairs. */
    var authMechanismProperties: js.UndefOr[AuthMechanismProperties] = js.undefined
    
    /** Specify the database name associated with the user’s credentials. */
    var authSource: js.UndefOr[String] = js.undefined
    
    /**
      * Optionally enable in-use auto encryption
      *
      * @remarks
      *  Automatic encryption is an enterprise only feature that only applies to operations on a collection. Automatic encryption is not supported for operations on a database or view, and operations that are not bypassed will result in error
      *  (see [libmongocrypt: Auto Encryption Allow-List](https://github.com/mongodb/specifications/blob/master/source/client-side-encryption/client-side-encryption.rst#libmongocrypt-auto-encryption-allow-list)). To bypass automatic encryption for all operations, set bypassAutoEncryption=true in AutoEncryptionOpts.
      *
      *  Automatic encryption requires the authenticated user to have the [listCollections privilege action](https://www.mongodb.com/docs/manual/reference/command/listCollections/#dbcmd.listCollections).
      *
      *  If a MongoClient with a limited connection pool size (i.e a non-zero maxPoolSize) is configured with AutoEncryptionOptions, a separate internal MongoClient is created if any of the following are true:
      *  - AutoEncryptionOptions.keyVaultClient is not passed.
      *  - AutoEncryptionOptions.bypassAutomaticEncryption is false.
      *
      * If an internal MongoClient is created, it is configured with the same options as the parent MongoClient except minPoolSize is set to 0 and AutoEncryptionOptions is omitted.
      */
    var autoEncryption: js.UndefOr[AutoEncryptionOptions] = js.undefined
    
    var bsonRegExp: js.UndefOr[Boolean] = js.undefined
    
    var checkKeys: js.UndefOr[Boolean] = js.undefined
    
    var collectionOptions: js.UndefOr[CollectionOptions] = js.undefined
    
    /** An array or comma-delimited string of compressors to enable network compression for communication between this client and a mongod/mongos instance. */
    var compressors: js.UndefOr[js.Array[CompressorName] | String] = js.undefined
    
    /** The time in milliseconds to attempt a connection before timing out. */
    var connectTimeoutMS: js.UndefOr[Double] = js.undefined
    
    /** Allow a driver to force a Single topology type with a connection string containing one host */
    var directConnection: js.UndefOr[Boolean] = js.undefined
    
    /** Allows a wrapping driver to amend the client metadata generated by the driver to include information about the wrapping driver */
    var driverInfo: js.UndefOr[DriverInfo] = js.undefined
    
    /** Enable utf8 validation when deserializing BSON documents.  Defaults to true. */
    var enableUtf8Validation: js.UndefOr[Boolean] = js.undefined
    
    var fieldsAsRaw: js.UndefOr[Document] = js.undefined
    
    /** Force server to assign `_id` values instead of driver */
    var forceServerObjectId: js.UndefOr[Boolean] = js.undefined
    
    /** heartbeatFrequencyMS controls when the driver checks the state of the MongoDB deployment. Specify the interval (in milliseconds) between checks, counted from the end of the previous check until the beginning of the next one. */
    var heartbeatFrequencyMS: js.UndefOr[Double] = js.undefined
    
    var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The journal write concern
      * @deprecated Please use the `writeConcern` option instead
      */
    var journal: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated TCP Connection keep alive enabled. Will not be able to turn off in the future. */
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated The number of milliseconds to wait before initiating keepAlive on the TCP socket.
      *             Will not be configurable in the future.
      */
    var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
    
    /** Instruct the driver it is connecting to a load balancer fronting a mongos like service */
    var loadBalanced: js.UndefOr[Boolean] = js.undefined
    
    /** The size (in milliseconds) of the latency window for selecting among multiple suitable MongoDB instances. */
    var localThresholdMS: js.UndefOr[Double] = js.undefined
    
    /** The maximum number of connections that may be in the process of being established concurrently by the connection pool. */
    var maxConnecting: js.UndefOr[Double] = js.undefined
    
    /** The maximum number of milliseconds that a connection can remain idle in the pool before being removed and closed. */
    var maxIdleTimeMS: js.UndefOr[Double] = js.undefined
    
    /** The maximum number of connections in the connection pool. */
    var maxPoolSize: js.UndefOr[Double] = js.undefined
    
    /** Specifies, in seconds, how stale a secondary can be before the client stops using it for read operations. */
    var maxStalenessSeconds: js.UndefOr[Double] = js.undefined
    
    /** Sets the minimum heartbeat frequency. In the event that the driver has to frequently re-check a server's availability, it will wait at least this long since the previous check to avoid wasted effort. */
    var minHeartbeatFrequencyMS: js.UndefOr[Double] = js.undefined
    
    /** The minimum number of connections in the connection pool. */
    var minPoolSize: js.UndefOr[Double] = js.undefined
    
    /** Enable command monitoring for this client */
    var monitorCommands: js.UndefOr[Boolean] = js.undefined
    
    /** TCP Connection no delay */
    var noDelay: js.UndefOr[Boolean] = js.undefined
    
    /** A primary key factory function for generation of custom `_id` keys */
    var pkFactory: js.UndefOr[PkFactory] = js.undefined
    
    var promoteBuffers: js.UndefOr[Boolean] = js.undefined
    
    var promoteLongs: js.UndefOr[Boolean] = js.undefined
    
    var promoteValues: js.UndefOr[Boolean] = js.undefined
    
    /** Configures a Socks5 proxy host used for creating TCP connections. */
    var proxyHost: js.UndefOr[String] = js.undefined
    
    /** Configures a Socks5 proxy password when the proxy in proxyHost requires username/password authentication. */
    var proxyPassword: js.UndefOr[String] = js.undefined
    
    /** Configures a Socks5 proxy port used for creating TCP connections. */
    var proxyPort: js.UndefOr[Double] = js.undefined
    
    /** Configures a Socks5 proxy username when the proxy in proxyHost requires username/password authentication. */
    var proxyUsername: js.UndefOr[String] = js.undefined
    
    /**
      * Enabling the raw option will return a [Node.js Buffer](https://nodejs.org/api/buffer.html)
      * which is allocated using [allocUnsafe API](https://nodejs.org/api/buffer.html#static-method-bufferallocunsafesize).
      * See this section from the [Node.js Docs here](https://nodejs.org/api/buffer.html#what-makes-bufferallocunsafe-and-bufferallocunsafeslow-unsafe)
      * for more detail about what "unsafe" refers to in this context.
      * If you need to maintain your own editable clone of the bytes returned for an extended life time of the process, it is recommended you allocate
      * your own buffer and clone the contents:
      *
      * @example
      * ```ts
      * const raw = await collection.findOne({}, { raw: true });
      * const myBuffer = Buffer.alloc(raw.byteLength);
      * myBuffer.set(raw, 0);
      * // Only save and use `myBuffer` beyond this point
      * ```
      *
      * @remarks
      * Please note there is a known limitation where this option cannot be used at the MongoClient level (see [NODE-3946](https://jira.mongodb.org/browse/NODE-3946)).
      * It does correctly work at `Db`, `Collection`, and per operation the same as other BSON options work.
      */
    var raw: js.UndefOr[Boolean] = js.undefined
    
    /** Specify a read concern for the collection (only MongoDB 3.2 or higher supported) */
    var readConcern: js.UndefOr[ReadConcernLike] = js.undefined
    
    /** The level of isolation */
    var readConcernLevel: js.UndefOr[ReadConcernLevel] = js.undefined
    
    /** Specifies the read preferences for this connection */
    var readPreference: js.UndefOr[ReadPreferenceMode | ReadPreference] = js.undefined
    
    /** Specifies the tags document as a comma-separated list of colon-separated key-value pairs.  */
    var readPreferenceTags: js.UndefOr[js.Array[TagSet]] = js.undefined
    
    /** Specifies the name of the replica set, if the mongod is a member of a replica set. */
    var replicaSet: js.UndefOr[String] = js.undefined
    
    /** Enables retryable reads. */
    var retryReads: js.UndefOr[Boolean] = js.undefined
    
    /** Enable retryable writes. */
    var retryWrites: js.UndefOr[Boolean] = js.undefined
    
    var serializeFunctions: js.UndefOr[Boolean] = js.undefined
    
    /** Server API version */
    var serverApi: js.UndefOr[ServerApi | ServerApiVersion] = js.undefined
    
    /** Specifies how long (in milliseconds) to block for server selection before throwing an exception.  */
    var serverSelectionTimeoutMS: js.UndefOr[Double] = js.undefined
    
    /** The time in milliseconds to attempt a send or receive on a socket before the attempt times out. */
    var socketTimeoutMS: js.UndefOr[Double] = js.undefined
    
    /** The maximum number of hosts to connect to when using an srv connection string, a setting of `0` means unlimited hosts */
    var srvMaxHosts: js.UndefOr[Double] = js.undefined
    
    /**
      * Modifies the srv URI to look like:
      *
      * `_{srvServiceName}._tcp.{hostname}.{domainname}`
      *
      * Querying this DNS URI is expected to respond with SRV records
      */
    var srvServiceName: js.UndefOr[String] = js.undefined
    
    /** A boolean to enable or disables TLS/SSL for the connection. (The ssl option is equivalent to the tls option.) */
    var ssl: js.UndefOr[Boolean] = js.undefined
    
    /** SSL Certificate file path. */
    var sslCA: js.UndefOr[String] = js.undefined
    
    /** SSL Certificate revocation list file path. */
    var sslCRL: js.UndefOr[String] = js.undefined
    
    /** SSL Certificate file path. */
    var sslCert: js.UndefOr[String] = js.undefined
    
    /** SSL Key file file path. */
    var sslKey: js.UndefOr[String] = js.undefined
    
    /** SSL Certificate pass phrase. */
    var sslPass: js.UndefOr[String] = js.undefined
    
    /** Validate mongod server certificate against Certificate Authority */
    var sslValidate: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables TLS/SSL for the connection. */
    var tls: js.UndefOr[Boolean] = js.undefined
    
    /** Bypasses validation of the certificates presented by the mongod/mongos instance */
    var tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.undefined
    
    /** Disables hostname validation of the certificate presented by the mongod/mongos instance. */
    var tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the location of a local .pem file that contains the root certificate chain from the Certificate Authority. This file is used to validate the certificate presented by the mongod/mongos instance. */
    var tlsCAFile: js.UndefOr[String] = js.undefined
    
    /** Specifies the location of a local TLS Certificate */
    var tlsCertificateFile: js.UndefOr[String] = js.undefined
    
    /** Specifies the location of a local .pem file that contains either the client's TLS/SSL certificate and key or only the client's TLS/SSL key when tlsCertificateFile is used to provide the certificate. */
    var tlsCertificateKeyFile: js.UndefOr[String] = js.undefined
    
    /** Specifies the password to de-crypt the tlsCertificateKeyFile. */
    var tlsCertificateKeyFilePassword: js.UndefOr[String] = js.undefined
    
    /** Disables various certificate validations. */
    var tlsInsecure: js.UndefOr[Boolean] = js.undefined
    
    var useBigInt64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The write concern w value
      * @deprecated Please use the `writeConcern` option instead
      */
    var w: js.UndefOr[W] = js.undefined
    
    /** The maximum time in milliseconds that a thread can wait for a connection to become available. */
    var waitQueueTimeoutMS: js.UndefOr[Double] = js.undefined
    
    /**
      * A MongoDB WriteConcern, which describes the level of acknowledgement
      * requested from MongoDB for write operations.
      *
      * @see https://www.mongodb.com/docs/manual/reference/write-concern/
      */
    var writeConcern: js.UndefOr[WriteConcern | WriteConcernSettings] = js.undefined
    
    /**
      * The write concern timeout
      * @deprecated Please use the `writeConcern` option instead
      */
    var wtimeoutMS: js.UndefOr[Double] = js.undefined
    
    /** An integer that specifies the compression level if using zlib for network compression. */
    var zlibCompressionLevel: js.UndefOr[typings.monk.monkInts.`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  }
  object MongoClientOptionscollect {
    
    inline def apply(): MongoClientOptionscollect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoClientOptionscollect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MongoClientOptionscollect] (val x: Self) extends AnyVal {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthMechanism(value: AuthMechanism): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
      
      inline def setAuthMechanismProperties(value: AuthMechanismProperties): Self = StObject.set(x, "authMechanismProperties", value.asInstanceOf[js.Any])
      
      inline def setAuthMechanismPropertiesUndefined: Self = StObject.set(x, "authMechanismProperties", js.undefined)
      
      inline def setAuthMechanismUndefined: Self = StObject.set(x, "authMechanism", js.undefined)
      
      inline def setAuthSource(value: String): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
      
      inline def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setAutoEncryption(value: AutoEncryptionOptions): Self = StObject.set(x, "autoEncryption", value.asInstanceOf[js.Any])
      
      inline def setAutoEncryptionUndefined: Self = StObject.set(x, "autoEncryption", js.undefined)
      
      inline def setBsonRegExp(value: Boolean): Self = StObject.set(x, "bsonRegExp", value.asInstanceOf[js.Any])
      
      inline def setBsonRegExpUndefined: Self = StObject.set(x, "bsonRegExp", js.undefined)
      
      inline def setCheckKeys(value: Boolean): Self = StObject.set(x, "checkKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckKeysUndefined: Self = StObject.set(x, "checkKeys", js.undefined)
      
      inline def setCollectionOptions(value: CollectionOptions): Self = StObject.set(x, "collectionOptions", value.asInstanceOf[js.Any])
      
      inline def setCollectionOptionsUndefined: Self = StObject.set(x, "collectionOptions", js.undefined)
      
      inline def setCompressors(value: js.Array[CompressorName] | String): Self = StObject.set(x, "compressors", value.asInstanceOf[js.Any])
      
      inline def setCompressorsUndefined: Self = StObject.set(x, "compressors", js.undefined)
      
      inline def setCompressorsVarargs(value: CompressorName*): Self = StObject.set(x, "compressors", js.Array(value*))
      
      inline def setConnectTimeoutMS(value: Double): Self = StObject.set(x, "connectTimeoutMS", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutMSUndefined: Self = StObject.set(x, "connectTimeoutMS", js.undefined)
      
      inline def setDirectConnection(value: Boolean): Self = StObject.set(x, "directConnection", value.asInstanceOf[js.Any])
      
      inline def setDirectConnectionUndefined: Self = StObject.set(x, "directConnection", js.undefined)
      
      inline def setDriverInfo(value: DriverInfo): Self = StObject.set(x, "driverInfo", value.asInstanceOf[js.Any])
      
      inline def setDriverInfoUndefined: Self = StObject.set(x, "driverInfo", js.undefined)
      
      inline def setEnableUtf8Validation(value: Boolean): Self = StObject.set(x, "enableUtf8Validation", value.asInstanceOf[js.Any])
      
      inline def setEnableUtf8ValidationUndefined: Self = StObject.set(x, "enableUtf8Validation", js.undefined)
      
      inline def setFieldsAsRaw(value: Document): Self = StObject.set(x, "fieldsAsRaw", value.asInstanceOf[js.Any])
      
      inline def setFieldsAsRawUndefined: Self = StObject.set(x, "fieldsAsRaw", js.undefined)
      
      inline def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
      
      inline def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
      
      inline def setHeartbeatFrequencyMS(value: Double): Self = StObject.set(x, "heartbeatFrequencyMS", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatFrequencyMSUndefined: Self = StObject.set(x, "heartbeatFrequencyMS", js.undefined)
      
      inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
      
      inline def setJournal(value: Boolean): Self = StObject.set(x, "journal", value.asInstanceOf[js.Any])
      
      inline def setJournalUndefined: Self = StObject.set(x, "journal", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setLoadBalanced(value: Boolean): Self = StObject.set(x, "loadBalanced", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancedUndefined: Self = StObject.set(x, "loadBalanced", js.undefined)
      
      inline def setLocalThresholdMS(value: Double): Self = StObject.set(x, "localThresholdMS", value.asInstanceOf[js.Any])
      
      inline def setLocalThresholdMSUndefined: Self = StObject.set(x, "localThresholdMS", js.undefined)
      
      inline def setMaxConnecting(value: Double): Self = StObject.set(x, "maxConnecting", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectingUndefined: Self = StObject.set(x, "maxConnecting", js.undefined)
      
      inline def setMaxIdleTimeMS(value: Double): Self = StObject.set(x, "maxIdleTimeMS", value.asInstanceOf[js.Any])
      
      inline def setMaxIdleTimeMSUndefined: Self = StObject.set(x, "maxIdleTimeMS", js.undefined)
      
      inline def setMaxPoolSize(value: Double): Self = StObject.set(x, "maxPoolSize", value.asInstanceOf[js.Any])
      
      inline def setMaxPoolSizeUndefined: Self = StObject.set(x, "maxPoolSize", js.undefined)
      
      inline def setMaxStalenessSeconds(value: Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
      
      inline def setMinHeartbeatFrequencyMS(value: Double): Self = StObject.set(x, "minHeartbeatFrequencyMS", value.asInstanceOf[js.Any])
      
      inline def setMinHeartbeatFrequencyMSUndefined: Self = StObject.set(x, "minHeartbeatFrequencyMS", js.undefined)
      
      inline def setMinPoolSize(value: Double): Self = StObject.set(x, "minPoolSize", value.asInstanceOf[js.Any])
      
      inline def setMinPoolSizeUndefined: Self = StObject.set(x, "minPoolSize", js.undefined)
      
      inline def setMonitorCommands(value: Boolean): Self = StObject.set(x, "monitorCommands", value.asInstanceOf[js.Any])
      
      inline def setMonitorCommandsUndefined: Self = StObject.set(x, "monitorCommands", js.undefined)
      
      inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      inline def setPkFactory(value: PkFactory): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
      
      inline def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
      
      inline def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
      
      inline def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
      
      inline def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
      
      inline def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
      
      inline def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
      
      inline def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
      
      inline def setProxyHost(value: String): Self = StObject.set(x, "proxyHost", value.asInstanceOf[js.Any])
      
      inline def setProxyHostUndefined: Self = StObject.set(x, "proxyHost", js.undefined)
      
      inline def setProxyPassword(value: String): Self = StObject.set(x, "proxyPassword", value.asInstanceOf[js.Any])
      
      inline def setProxyPasswordUndefined: Self = StObject.set(x, "proxyPassword", js.undefined)
      
      inline def setProxyPort(value: Double): Self = StObject.set(x, "proxyPort", value.asInstanceOf[js.Any])
      
      inline def setProxyPortUndefined: Self = StObject.set(x, "proxyPort", js.undefined)
      
      inline def setProxyUsername(value: String): Self = StObject.set(x, "proxyUsername", value.asInstanceOf[js.Any])
      
      inline def setProxyUsernameUndefined: Self = StObject.set(x, "proxyUsername", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setReadConcern(value: ReadConcernLike): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
      
      inline def setReadConcernLevel(value: ReadConcernLevel): Self = StObject.set(x, "readConcernLevel", value.asInstanceOf[js.Any])
      
      inline def setReadConcernLevelUndefined: Self = StObject.set(x, "readConcernLevel", js.undefined)
      
      inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
      
      inline def setReadPreference(value: ReadPreferenceMode | ReadPreference): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
      
      inline def setReadPreferenceTags(value: js.Array[TagSet]): Self = StObject.set(x, "readPreferenceTags", value.asInstanceOf[js.Any])
      
      inline def setReadPreferenceTagsUndefined: Self = StObject.set(x, "readPreferenceTags", js.undefined)
      
      inline def setReadPreferenceTagsVarargs(value: TagSet*): Self = StObject.set(x, "readPreferenceTags", js.Array(value*))
      
      inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
      
      inline def setReplicaSet(value: String): Self = StObject.set(x, "replicaSet", value.asInstanceOf[js.Any])
      
      inline def setReplicaSetUndefined: Self = StObject.set(x, "replicaSet", js.undefined)
      
      inline def setRetryReads(value: Boolean): Self = StObject.set(x, "retryReads", value.asInstanceOf[js.Any])
      
      inline def setRetryReadsUndefined: Self = StObject.set(x, "retryReads", js.undefined)
      
      inline def setRetryWrites(value: Boolean): Self = StObject.set(x, "retryWrites", value.asInstanceOf[js.Any])
      
      inline def setRetryWritesUndefined: Self = StObject.set(x, "retryWrites", js.undefined)
      
      inline def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
      
      inline def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
      
      inline def setServerApi(value: ServerApi | ServerApiVersion): Self = StObject.set(x, "serverApi", value.asInstanceOf[js.Any])
      
      inline def setServerApiUndefined: Self = StObject.set(x, "serverApi", js.undefined)
      
      inline def setServerSelectionTimeoutMS(value: Double): Self = StObject.set(x, "serverSelectionTimeoutMS", value.asInstanceOf[js.Any])
      
      inline def setServerSelectionTimeoutMSUndefined: Self = StObject.set(x, "serverSelectionTimeoutMS", js.undefined)
      
      inline def setSocketTimeoutMS(value: Double): Self = StObject.set(x, "socketTimeoutMS", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutMSUndefined: Self = StObject.set(x, "socketTimeoutMS", js.undefined)
      
      inline def setSrvMaxHosts(value: Double): Self = StObject.set(x, "srvMaxHosts", value.asInstanceOf[js.Any])
      
      inline def setSrvMaxHostsUndefined: Self = StObject.set(x, "srvMaxHosts", js.undefined)
      
      inline def setSrvServiceName(value: String): Self = StObject.set(x, "srvServiceName", value.asInstanceOf[js.Any])
      
      inline def setSrvServiceNameUndefined: Self = StObject.set(x, "srvServiceName", js.undefined)
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslCA(value: String): Self = StObject.set(x, "sslCA", value.asInstanceOf[js.Any])
      
      inline def setSslCAUndefined: Self = StObject.set(x, "sslCA", js.undefined)
      
      inline def setSslCRL(value: String): Self = StObject.set(x, "sslCRL", value.asInstanceOf[js.Any])
      
      inline def setSslCRLUndefined: Self = StObject.set(x, "sslCRL", js.undefined)
      
      inline def setSslCert(value: String): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
      
      inline def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
      
      inline def setSslKey(value: String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
      
      inline def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
      
      inline def setSslPass(value: String): Self = StObject.set(x, "sslPass", value.asInstanceOf[js.Any])
      
      inline def setSslPassUndefined: Self = StObject.set(x, "sslPass", js.undefined)
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setSslValidate(value: Boolean): Self = StObject.set(x, "sslValidate", value.asInstanceOf[js.Any])
      
      inline def setSslValidateUndefined: Self = StObject.set(x, "sslValidate", js.undefined)
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsAllowInvalidCertificates(value: Boolean): Self = StObject.set(x, "tlsAllowInvalidCertificates", value.asInstanceOf[js.Any])
      
      inline def setTlsAllowInvalidCertificatesUndefined: Self = StObject.set(x, "tlsAllowInvalidCertificates", js.undefined)
      
      inline def setTlsAllowInvalidHostnames(value: Boolean): Self = StObject.set(x, "tlsAllowInvalidHostnames", value.asInstanceOf[js.Any])
      
      inline def setTlsAllowInvalidHostnamesUndefined: Self = StObject.set(x, "tlsAllowInvalidHostnames", js.undefined)
      
      inline def setTlsCAFile(value: String): Self = StObject.set(x, "tlsCAFile", value.asInstanceOf[js.Any])
      
      inline def setTlsCAFileUndefined: Self = StObject.set(x, "tlsCAFile", js.undefined)
      
      inline def setTlsCertificateFile(value: String): Self = StObject.set(x, "tlsCertificateFile", value.asInstanceOf[js.Any])
      
      inline def setTlsCertificateFileUndefined: Self = StObject.set(x, "tlsCertificateFile", js.undefined)
      
      inline def setTlsCertificateKeyFile(value: String): Self = StObject.set(x, "tlsCertificateKeyFile", value.asInstanceOf[js.Any])
      
      inline def setTlsCertificateKeyFilePassword(value: String): Self = StObject.set(x, "tlsCertificateKeyFilePassword", value.asInstanceOf[js.Any])
      
      inline def setTlsCertificateKeyFilePasswordUndefined: Self = StObject.set(x, "tlsCertificateKeyFilePassword", js.undefined)
      
      inline def setTlsCertificateKeyFileUndefined: Self = StObject.set(x, "tlsCertificateKeyFile", js.undefined)
      
      inline def setTlsInsecure(value: Boolean): Self = StObject.set(x, "tlsInsecure", value.asInstanceOf[js.Any])
      
      inline def setTlsInsecureUndefined: Self = StObject.set(x, "tlsInsecure", js.undefined)
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUseBigInt64(value: Boolean): Self = StObject.set(x, "useBigInt64", value.asInstanceOf[js.Any])
      
      inline def setUseBigInt64Undefined: Self = StObject.set(x, "useBigInt64", js.undefined)
      
      inline def setW(value: W): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setWaitQueueTimeoutMS(value: Double): Self = StObject.set(x, "waitQueueTimeoutMS", value.asInstanceOf[js.Any])
      
      inline def setWaitQueueTimeoutMSUndefined: Self = StObject.set(x, "waitQueueTimeoutMS", js.undefined)
      
      inline def setWriteConcern(value: WriteConcern | WriteConcernSettings): Self = StObject.set(x, "writeConcern", value.asInstanceOf[js.Any])
      
      inline def setWriteConcernUndefined: Self = StObject.set(x, "writeConcern", js.undefined)
      
      inline def setWtimeoutMS(value: Double): Self = StObject.set(x, "wtimeoutMS", value.asInstanceOf[js.Any])
      
      inline def setWtimeoutMSUndefined: Self = StObject.set(x, "wtimeoutMS", js.undefined)
      
      inline def setZlibCompressionLevel(value: typings.monk.monkInts.`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "zlibCompressionLevel", value.asInstanceOf[js.Any])
      
      inline def setZlibCompressionLevelUndefined: Self = StObject.set(x, "zlibCompressionLevel", js.undefined)
    }
  }
  
  trait Multi extends StObject {
    
    var multi: js.UndefOr[`false`] = js.undefined
    
    var replace: js.UndefOr[`false`] = js.undefined
    
    var single: js.UndefOr[`true`] = js.undefined
  }
  object Multi {
    
    inline def apply(): Multi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Multi] (val x: Self) extends AnyVal {
      
      inline def setMulti(value: `false`): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setReplace(value: `false`): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setSingle(value: `true`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    }
  }
  
  trait MultiReplace extends StObject {
    
    var multi: js.UndefOr[`true`] = js.undefined
    
    var replace: js.UndefOr[`false`] = js.undefined
    
    var single: `false`
  }
  object MultiReplace {
    
    inline def apply(): MultiReplace = {
      val __obj = js.Dynamic.literal(single = false)
      __obj.asInstanceOf[MultiReplace]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiReplace] (val x: Self) extends AnyVal {
      
      inline def setMulti(value: `true`): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setReplace(value: `false`): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setSingle(value: `false`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawCursor extends StObject {
    
    var rawCursor: `true`
  }
  object RawCursor {
    
    inline def apply(): RawCursor = {
      val __obj = js.Dynamic.literal(rawCursor = true)
      __obj.asInstanceOf[RawCursor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawCursor] (val x: Self) extends AnyVal {
      
      inline def setRawCursor(value: `true`): Self = StObject.set(x, "rawCursor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Replace extends StObject {
    
    var replace: js.UndefOr[`false`] = js.undefined
  }
  object Replace {
    
    inline def apply(): Replace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Replace]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Replace] (val x: Self) extends AnyVal {
      
      inline def setReplace(value: `false`): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
  
  trait ReplaceSingle extends StObject {
    
    var multi: js.UndefOr[`false`] = js.undefined
    
    var replace: `true`
    
    var single: js.UndefOr[`true`] = js.undefined
  }
  object ReplaceSingle {
    
    inline def apply(): ReplaceSingle = {
      val __obj = js.Dynamic.literal(replace = true)
      __obj.asInstanceOf[ReplaceSingle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplaceSingle] (val x: Self) extends AnyVal {
      
      inline def setMulti(value: `false`): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setReplace(value: `true`): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setSingle(value: `true`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    }
  }
  
  trait Single extends StObject {
    
    var multi: `true`
    
    var replace: js.UndefOr[`false`] = js.undefined
    
    var single: js.UndefOr[`false`] = js.undefined
  }
  object Single {
    
    inline def apply(): Single = {
      val __obj = js.Dynamic.literal(multi = true)
      __obj.asInstanceOf[Single]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Single] (val x: Self) extends AnyVal {
      
      inline def setMulti(value: `true`): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setReplace(value: `false`): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setSingle(value: `false`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    }
  }
}
