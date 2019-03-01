package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection optional settings.
  *
  * see
  *   https://mongoosejs.com/docs/api.html#mongoose_Mongoose-connect
  * and
  *   http://mongodb.github.io/node-mongodb-native/3.0/api/MongoClient.html
  * for all available options.
  *
  */
trait ConnectionOptionsBase extends js.Object {
  /** options for authentication (see http://mongodb.github.com/node-mongodb-native/api-generated/db.html#authenticate) */
  var auth: js.UndefOr[js.Any] = js.undefined
  /** Auth mechanism */
  var authMechanism: js.UndefOr[js.Any] = js.undefined
  /** If the database authentication is dependent on another databaseName. */
  var authSource: js.UndefOr[java.lang.String] = js.undefined
  var authdb: js.UndefOr[js.Any] = js.undefined
  /** Reconnect on error (default: true) */
  var autoReconnect: js.UndefOr[scala.Boolean] = js.undefined
  /** How long driver keeps waiting for servers to come back up (default: Number.MAX_VALUE) */
  var bufferMaxEntries: js.UndefOr[scala.Double] = js.undefined
  /** Default: true; Server identity checking during SSL */
  var checkServerIdentity: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  /** Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info. */
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  /** TCP Connection timeout setting (default: 30000) */
  var connectTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  /** passed to the connection db instance */
  var db: js.UndefOr[js.Any] = js.undefined
  /** database Name for Mongodb Atlas Connection */
  var dbName: js.UndefOr[java.lang.String] = js.undefined
  /** Enable the wrapping of the callback in the current domain, disabled by default to avoid perf hit (default: false). */
  var domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var ecdhCurve: js.UndefOr[java.lang.String] = js.undefined
  var fsync: js.UndefOr[js.Any] = js.undefined
  /** The interval of calling ismaster when monitoring is enabled (default: 10000). */
  var haInterval: js.UndefOr[scala.Double] = js.undefined
  /** Specify a journal write concern (default: false). */
  var journal: js.UndefOr[scala.Boolean] = js.undefined
  /** TCP Connection keep alive enabled (default: true) */
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  /** The number of milliseconds to wait before initiating keepAlive on the TCP socket (default 30000) */
  var keepAliveInitialDelay: js.UndefOr[scala.Double] = js.undefined
  /** Triggers the server instance to call ismaster (default: true). */
  var monitoring: js.UndefOr[scala.Boolean] = js.undefined
  /** The current value of the parameter native_parser */
  var nativeParser: js.UndefOr[scala.Boolean] = js.undefined
  /** password for authentication */
  var pass: js.UndefOr[java.lang.String] = js.undefined
  /** Number of connections in the connection pool for each server instance, set to 5 as default for legacy reasons. */
  var poolSize: js.UndefOr[scala.Double] = js.undefined
  /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/2.1/api/ReadPreference.html */
  var readPreference: js.UndefOr[java.lang.String] = js.undefined
  /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/2.1/api/ReadPreference.html */
  var readPreferencetags: js.UndefOr[js.Object] = js.undefined
  /** Will wait # milliseconds between retries (default: 1000) */
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  /** If you're connected to a single server or mongos proxy (as opposed to a replica set),
    * the MongoDB driver will try to reconnect every reconnectInterval milliseconds for reconnectTries
    * times, and give up afterward. When the driver gives up, the mongoose connection emits a
    * reconnectFailed event. (default: 30) */
  var reconnectTries: js.UndefOr[scala.Double] = js.undefined
  /** The name of the replicaset to connect to. */
  var replicaSet: js.UndefOr[java.lang.String] = js.undefined
  /** passed to the connection ReplSet instance */
  var replset: js.UndefOr[js.Any] = js.undefined
  var rs_name: js.UndefOr[js.Any] = js.undefined
  // TODO
  var safe: js.UndefOr[js.Any] = js.undefined
  /** passed to the connection server instance(s) */
  var server: js.UndefOr[js.Any] = js.undefined
  /** String containing the server name requested via TLS SNI. */
  var servername: js.UndefOr[java.lang.String] = js.undefined
  var slaveOk: js.UndefOr[js.Any] = js.undefined
  /** TCP Socket timeout setting (default: 360000) */
  var socketTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  /** Use ssl connection (needs to have a mongod server with ssl support) (default: true) */
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  /** additional SSL configuration options */
  /** Array of valid certificates either as Buffers or Strings */
  var sslCA: js.UndefOr[js.Array[nodeLib.Buffer | java.lang.String]] = js.undefined
  /** Array of revocation certificates either as Buffers or Strings (needs to have a mongod server with ssl support, 2.4 or higher) */
  var sslCRL: js.UndefOr[js.Array[nodeLib.Buffer | java.lang.String]] = js.undefined
  /** SSL certificate */
  var sslCert: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  /** SSL private key */
  var sslKey: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  /** SSL Certificate pass phrase */
  var sslPass: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  /** Validate mongod server certificate against ca (needs to have a mongod server with ssl support, 2.4 or higher) */
  var sslValidate: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, this connection will use createIndex() instead of ensureIndex() for automatic index builds via Model.init(). */
  var useCreateIndex: js.UndefOr[scala.Boolean] = js.undefined
  /** Set to false to make findOneAndUpdate() and findOneAndRemove() use native findOneAndUpdate() rather than findAndModify(). */
  var useFindAndModify: js.UndefOr[scala.Boolean] = js.undefined
  /** Flag for using new URL string parser instead of current (deprecated) one */
  var useNewUrlParser: js.UndefOr[scala.Boolean] = js.undefined
  /** username for authentication */
  var user: js.UndefOr[java.lang.String] = js.undefined
  /** The write concern */
  var w: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** The write concern timeout. */
  var wTimeoutMS: js.UndefOr[scala.Double] = js.undefined
}

object ConnectionOptionsBase {
  @scala.inline
  def apply(
    auth: js.Any = null,
    authMechanism: js.Any = null,
    authSource: java.lang.String = null,
    authdb: js.Any = null,
    autoReconnect: js.UndefOr[scala.Boolean] = js.undefined,
    bufferMaxEntries: scala.Int | scala.Double = null,
    checkServerIdentity: scala.Boolean | js.Function = null,
    ciphers: java.lang.String = null,
    connectTimeoutMS: scala.Int | scala.Double = null,
    db: js.Any = null,
    dbName: java.lang.String = null,
    domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ecdhCurve: java.lang.String = null,
    fsync: js.Any = null,
    haInterval: scala.Int | scala.Double = null,
    journal: js.UndefOr[scala.Boolean] = js.undefined,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    keepAliveInitialDelay: scala.Int | scala.Double = null,
    monitoring: js.UndefOr[scala.Boolean] = js.undefined,
    nativeParser: js.UndefOr[scala.Boolean] = js.undefined,
    pass: java.lang.String = null,
    poolSize: scala.Int | scala.Double = null,
    readPreference: java.lang.String = null,
    readPreferencetags: js.Object = null,
    reconnectInterval: scala.Int | scala.Double = null,
    reconnectTries: scala.Int | scala.Double = null,
    replicaSet: java.lang.String = null,
    replset: js.Any = null,
    rs_name: js.Any = null,
    safe: js.Any = null,
    server: js.Any = null,
    servername: java.lang.String = null,
    slaveOk: js.Any = null,
    socketTimeoutMS: scala.Int | scala.Double = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    sslCA: js.Array[nodeLib.Buffer | java.lang.String] = null,
    sslCRL: js.Array[nodeLib.Buffer | java.lang.String] = null,
    sslCert: nodeLib.Buffer | java.lang.String = null,
    sslKey: nodeLib.Buffer | java.lang.String = null,
    sslPass: nodeLib.Buffer | java.lang.String = null,
    sslValidate: js.UndefOr[scala.Boolean] = js.undefined,
    useCreateIndex: js.UndefOr[scala.Boolean] = js.undefined,
    useFindAndModify: js.UndefOr[scala.Boolean] = js.undefined,
    useNewUrlParser: js.UndefOr[scala.Boolean] = js.undefined,
    user: java.lang.String = null,
    w: scala.Double | java.lang.String = null,
    wTimeoutMS: scala.Int | scala.Double = null
  ): ConnectionOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism)
    if (authSource != null) __obj.updateDynamic("authSource")(authSource)
    if (authdb != null) __obj.updateDynamic("authdb")(authdb)
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect)
    if (bufferMaxEntries != null) __obj.updateDynamic("bufferMaxEntries")(bufferMaxEntries.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (connectTimeoutMS != null) __obj.updateDynamic("connectTimeoutMS")(connectTimeoutMS.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db)
    if (dbName != null) __obj.updateDynamic("dbName")(dbName)
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled)
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (fsync != null) __obj.updateDynamic("fsync")(fsync)
    if (haInterval != null) __obj.updateDynamic("haInterval")(haInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(journal)) __obj.updateDynamic("journal")(journal)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveInitialDelay != null) __obj.updateDynamic("keepAliveInitialDelay")(keepAliveInitialDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring)
    if (!js.isUndefined(nativeParser)) __obj.updateDynamic("nativeParser")(nativeParser)
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    if (readPreferencetags != null) __obj.updateDynamic("readPreferencetags")(readPreferencetags)
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (reconnectTries != null) __obj.updateDynamic("reconnectTries")(reconnectTries.asInstanceOf[js.Any])
    if (replicaSet != null) __obj.updateDynamic("replicaSet")(replicaSet)
    if (replset != null) __obj.updateDynamic("replset")(replset)
    if (rs_name != null) __obj.updateDynamic("rs_name")(rs_name)
    if (safe != null) __obj.updateDynamic("safe")(safe)
    if (server != null) __obj.updateDynamic("server")(server)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (slaveOk != null) __obj.updateDynamic("slaveOk")(slaveOk)
    if (socketTimeoutMS != null) __obj.updateDynamic("socketTimeoutMS")(socketTimeoutMS.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (sslCA != null) __obj.updateDynamic("sslCA")(sslCA)
    if (sslCRL != null) __obj.updateDynamic("sslCRL")(sslCRL)
    if (sslCert != null) __obj.updateDynamic("sslCert")(sslCert.asInstanceOf[js.Any])
    if (sslKey != null) __obj.updateDynamic("sslKey")(sslKey.asInstanceOf[js.Any])
    if (sslPass != null) __obj.updateDynamic("sslPass")(sslPass.asInstanceOf[js.Any])
    if (!js.isUndefined(sslValidate)) __obj.updateDynamic("sslValidate")(sslValidate)
    if (!js.isUndefined(useCreateIndex)) __obj.updateDynamic("useCreateIndex")(useCreateIndex)
    if (!js.isUndefined(useFindAndModify)) __obj.updateDynamic("useFindAndModify")(useFindAndModify)
    if (!js.isUndefined(useNewUrlParser)) __obj.updateDynamic("useNewUrlParser")(useNewUrlParser)
    if (user != null) __obj.updateDynamic("user")(user)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wTimeoutMS != null) __obj.updateDynamic("wTimeoutMS")(wTimeoutMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptionsBase]
  }
}

