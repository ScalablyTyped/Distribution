package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** See the node-mongodb-native driver instance for options that it understands. */
trait ConnectionOpenSetOptions extends ConnectionOptionsBase {
  /** See http://mongoosejs.com/docs/guide.html#bufferCommands */
  var bufferCommands: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, enables High Availability support for mongos
    * If connecting to multiple mongos servers, set the mongos option to true.
    */
  var mongos: js.UndefOr[scala.Boolean] = js.undefined
  /** sets the underlying driver's promise library (see http://mongodb.github.io/node-mongodb-native/2.1/api/MongoClient.html) */
  var promiseLibrary: js.UndefOr[js.Any] = js.undefined
  /** See http://mongoosejs.com/docs/connections.html#use-mongo-client **/
  var useMongoClient: js.UndefOr[scala.Boolean] = js.undefined
}

object ConnectionOpenSetOptions {
  @scala.inline
  def apply(
    auth: js.Any = null,
    authMechanism: js.Any = null,
    authSource: java.lang.String = null,
    authdb: js.Any = null,
    autoReconnect: js.UndefOr[scala.Boolean] = js.undefined,
    bufferCommands: js.UndefOr[scala.Boolean] = js.undefined,
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
    mongos: js.UndefOr[scala.Boolean] = js.undefined,
    monitoring: js.UndefOr[scala.Boolean] = js.undefined,
    nativeParser: js.UndefOr[scala.Boolean] = js.undefined,
    pass: java.lang.String = null,
    poolSize: scala.Int | scala.Double = null,
    promiseLibrary: js.Any = null,
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
    useMongoClient: js.UndefOr[scala.Boolean] = js.undefined,
    useNewUrlParser: js.UndefOr[scala.Boolean] = js.undefined,
    user: java.lang.String = null,
    w: scala.Double | java.lang.String = null,
    wTimeoutMS: scala.Int | scala.Double = null
  ): ConnectionOpenSetOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism)
    if (authSource != null) __obj.updateDynamic("authSource")(authSource)
    if (authdb != null) __obj.updateDynamic("authdb")(authdb)
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect)
    if (!js.isUndefined(bufferCommands)) __obj.updateDynamic("bufferCommands")(bufferCommands)
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
    if (!js.isUndefined(mongos)) __obj.updateDynamic("mongos")(mongos)
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring)
    if (!js.isUndefined(nativeParser)) __obj.updateDynamic("nativeParser")(nativeParser)
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (promiseLibrary != null) __obj.updateDynamic("promiseLibrary")(promiseLibrary)
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
    if (!js.isUndefined(useMongoClient)) __obj.updateDynamic("useMongoClient")(useMongoClient)
    if (!js.isUndefined(useNewUrlParser)) __obj.updateDynamic("useNewUrlParser")(useNewUrlParser)
    if (user != null) __obj.updateDynamic("user")(user)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wTimeoutMS != null) __obj.updateDynamic("wTimeoutMS")(wTimeoutMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOpenSetOptions]
  }
}

