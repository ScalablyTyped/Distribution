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

