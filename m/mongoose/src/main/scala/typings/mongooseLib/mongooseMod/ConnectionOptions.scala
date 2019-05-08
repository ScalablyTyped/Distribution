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
trait ConnectionOptions
  extends mongodbLib.mongodbMod.MongoClientOptions {
  var autoIndex: js.UndefOr[scala.Boolean] = js.undefined
  /** mongoose-specific options */
  /** See https://mongoosejs.com/docs/guide.html#bufferCommands */
  var bufferCommands: js.UndefOr[scala.Boolean] = js.undefined
  var config: js.UndefOr[mongooseLib.Anon_AutoIndex] = js.undefined
  /** passed to the connection db instance */
  var db: js.UndefOr[js.Any] = js.undefined
  /** database Name for Mongodb Atlas Connection */
  var dbName: js.UndefOr[java.lang.String] = js.undefined
  /** Specify a journal write concern (default: false). */
  var journal: js.UndefOr[scala.Boolean] = js.undefined
  // Legacy properties - passed to the connection server instance(s)
  var mongos: js.UndefOr[js.Any] = js.undefined
  /** The current value of the parameter native_parser */
  var nativeParser: js.UndefOr[scala.Boolean] = js.undefined
  /** password for authentication */
  var pass: js.UndefOr[java.lang.String] = js.undefined
  var replset: js.UndefOr[js.Any] = js.undefined
  var safe: js.UndefOr[js.Any] = js.undefined
  var server: js.UndefOr[js.Any] = js.undefined
  var slaveOk: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, this connection will use createIndex() instead of ensureIndex() for automatic index builds via Model.init(). */
  var useCreateIndex: js.UndefOr[scala.Boolean] = js.undefined
  /** Set to false to make findOneAndUpdate() and findOneAndRemove() use native findOneAndUpdate() rather than findAndModify(). */
  var useFindAndModify: js.UndefOr[scala.Boolean] = js.undefined
  /** See https://mongoosejs.com/docs/connections.html#use-mongo-client **/
  var useMongoClient: js.UndefOr[scala.Boolean] = js.undefined
  /** username for authentication */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    acceptableLatencyMS: scala.Int | scala.Double = null,
    appname: java.lang.String = null,
    auth: mongodbLib.Anon_Password = null,
    authMechanism: mongodbLib.mongodbLibStrings.DEFAULT | mongodbLib.mongodbLibStrings.GSSAPI | mongodbLib.mongodbLibStrings.PLAIN | mongodbLib.mongodbLibStrings.`MONGODB-X509` | mongodbLib.mongodbLibStrings.`MONGODB-CR` | mongodbLib.mongodbLibStrings.`SCRAM-SHA-1` | mongodbLib.mongodbLibStrings.`SCRAM-SHA-256` | java.lang.String = null,
    authSource: java.lang.String = null,
    autoIndex: js.UndefOr[scala.Boolean] = js.undefined,
    autoReconnect: js.UndefOr[scala.Boolean] = js.undefined,
    bufferCommands: js.UndefOr[scala.Boolean] = js.undefined,
    bufferMaxEntries: scala.Int | scala.Double = null,
    checkServerIdentity: scala.Boolean | (js.Function2[
      /* host */ java.lang.String, 
      /* cert */ nodeLib.tlsMod.PeerCertificate, 
      js.UndefOr[nodeLib.Error]
    ]) = null,
    ciphers: java.lang.String = null,
    config: mongooseLib.Anon_AutoIndex = null,
    connectTimeoutMS: scala.Int | scala.Double = null,
    connectWithNoPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    db: js.Any = null,
    dbName: java.lang.String = null,
    domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ecdhCurve: java.lang.String = null,
    family: mongodbLib.mongodbLibNumbers.`4` | mongodbLib.mongodbLibNumbers.`6` = null,
    forceServerObjectId: js.UndefOr[scala.Boolean] = js.undefined,
    fsync: js.UndefOr[scala.Boolean] = js.undefined,
    haInterval: scala.Int | scala.Double = null,
    ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined,
    j: js.UndefOr[scala.Boolean] = js.undefined,
    journal: js.UndefOr[scala.Boolean] = js.undefined,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    keepAliveInitialDelay: scala.Int | scala.Double = null,
    logger: js.Object | mongodbLib.mongodbMod.log = null,
    loggerLevel: java.lang.String = null,
    maxStalenessSeconds: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    mongos: js.Any = null,
    monitorCommands: js.UndefOr[scala.Boolean] = js.undefined,
    monitoring: js.UndefOr[scala.Boolean] = js.undefined,
    nativeParser: js.UndefOr[scala.Boolean] = js.undefined,
    native_parser: js.UndefOr[scala.Boolean] = js.undefined,
    noDelay: js.UndefOr[scala.Boolean] = js.undefined,
    numberOfRetries: scala.Int | scala.Double = null,
    pass: java.lang.String = null,
    pkFactory: js.Object = null,
    poolSize: scala.Int | scala.Double = null,
    promiseLibrary: stdLib.PromiseConstructor = null,
    promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined,
    promoteLongs: js.UndefOr[scala.Boolean] = js.undefined,
    promoteValues: js.UndefOr[scala.Boolean] = js.undefined,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    readConcern: mongodbLib.mongodbMod.ReadConcern | java.lang.String = null,
    readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String = null,
    reconnectInterval: scala.Int | scala.Double = null,
    reconnectTries: scala.Int | scala.Double = null,
    replicaSet: java.lang.String = null,
    replset: js.Any = null,
    safe: js.Any = null,
    secondaryAcceptableLatencyMS: scala.Int | scala.Double = null,
    serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    server: js.Any = null,
    servername: java.lang.String = null,
    session: mongodbLib.mongodbMod.ClientSession = null,
    slaveOk: js.UndefOr[scala.Boolean] = js.undefined,
    socketOptions: mongodbLib.mongodbMod.SocketOptions = null,
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
    validateOptions: js.Object | scala.Boolean = null,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptableLatencyMS != null) __obj.updateDynamic("acceptableLatencyMS")(acceptableLatencyMS.asInstanceOf[js.Any])
    if (appname != null) __obj.updateDynamic("appname")(appname)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource)
    if (!js.isUndefined(autoIndex)) __obj.updateDynamic("autoIndex")(autoIndex)
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect)
    if (!js.isUndefined(bufferCommands)) __obj.updateDynamic("bufferCommands")(bufferCommands)
    if (bufferMaxEntries != null) __obj.updateDynamic("bufferMaxEntries")(bufferMaxEntries.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (config != null) __obj.updateDynamic("config")(config)
    if (connectTimeoutMS != null) __obj.updateDynamic("connectTimeoutMS")(connectTimeoutMS.asInstanceOf[js.Any])
    if (!js.isUndefined(connectWithNoPrimary)) __obj.updateDynamic("connectWithNoPrimary")(connectWithNoPrimary)
    if (db != null) __obj.updateDynamic("db")(db)
    if (dbName != null) __obj.updateDynamic("dbName")(dbName)
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled)
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(forceServerObjectId)) __obj.updateDynamic("forceServerObjectId")(forceServerObjectId)
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync)
    if (haInterval != null) __obj.updateDynamic("haInterval")(haInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (!js.isUndefined(journal)) __obj.updateDynamic("journal")(journal)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveInitialDelay != null) __obj.updateDynamic("keepAliveInitialDelay")(keepAliveInitialDelay.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (loggerLevel != null) __obj.updateDynamic("loggerLevel")(loggerLevel)
    if (maxStalenessSeconds != null) __obj.updateDynamic("maxStalenessSeconds")(maxStalenessSeconds.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (mongos != null) __obj.updateDynamic("mongos")(mongos)
    if (!js.isUndefined(monitorCommands)) __obj.updateDynamic("monitorCommands")(monitorCommands)
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring)
    if (!js.isUndefined(nativeParser)) __obj.updateDynamic("nativeParser")(nativeParser)
    if (!js.isUndefined(native_parser)) __obj.updateDynamic("native_parser")(native_parser)
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay)
    if (numberOfRetries != null) __obj.updateDynamic("numberOfRetries")(numberOfRetries.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (pkFactory != null) __obj.updateDynamic("pkFactory")(pkFactory)
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (promiseLibrary != null) __obj.updateDynamic("promiseLibrary")(promiseLibrary)
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers)
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs)
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (readConcern != null) __obj.updateDynamic("readConcern")(readConcern.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (reconnectTries != null) __obj.updateDynamic("reconnectTries")(reconnectTries.asInstanceOf[js.Any])
    if (replicaSet != null) __obj.updateDynamic("replicaSet")(replicaSet)
    if (replset != null) __obj.updateDynamic("replset")(replset)
    if (safe != null) __obj.updateDynamic("safe")(safe)
    if (secondaryAcceptableLatencyMS != null) __obj.updateDynamic("secondaryAcceptableLatencyMS")(secondaryAcceptableLatencyMS.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    if (server != null) __obj.updateDynamic("server")(server)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(slaveOk)) __obj.updateDynamic("slaveOk")(slaveOk)
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions)
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
    if (validateOptions != null) __obj.updateDynamic("validateOptions")(validateOptions.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

