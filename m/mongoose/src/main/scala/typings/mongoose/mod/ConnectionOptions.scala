package typings.mongoose.mod

import typings.mongodb.anon.Compressors
import typings.mongodb.anon.Password
import typings.mongodb.mod.MongoClientOptions
import typings.mongodb.mod.ReadConcern
import typings.mongodb.mod.ReadPreferenceOrMode
import typings.mongodb.mod.SocketOptions
import typings.mongodb.mod.log
import typings.mongodb.mongodbNumbers.`4`
import typings.mongodb.mongodbNumbers.`6`
import typings.mongodb.mongodbStrings.DEFAULT
import typings.mongodb.mongodbStrings.GSSAPI
import typings.mongodb.mongodbStrings.PLAIN
import typings.mongodb.mongodbStrings.`MONGODB-CR`
import typings.mongodb.mongodbStrings.`MONGODB-X509`
import typings.mongodb.mongodbStrings.`SCRAM-SHA-1`
import typings.mongodb.mongodbStrings.`SCRAM-SHA-256`
import typings.mongodb.mongodbStrings.majority
import typings.mongoose.anon.AutoIndex
import typings.mongoose.anon.ExtraOptions
import typings.node.Buffer
import typings.node.tlsMod.PeerCertificate
import typings.std.PromiseConstructor
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
trait ConnectionOptions extends MongoClientOptions {
  /** Before Mongoose builds indexes, it calls Model.createCollection()
    * to create the underlying collection in MongoDB if autoCreate
    * is set to true.(default: false) */
  var autoCreate: js.UndefOr[Boolean] = js.undefined
  /** Configure csfle as especified in MongoDB official guide */
  var autoEncryption: js.UndefOr[ExtraOptions] = js.undefined
  var autoIndex: js.UndefOr[Boolean] = js.undefined
  /** mongoose-specific options */
  /** See https://mongoosejs.com/docs/guide.html#bufferCommands */
  var bufferCommands: js.UndefOr[Boolean] = js.undefined
  var config: js.UndefOr[AutoIndex] = js.undefined
  /** passed to the connection db instance */
  var db: js.UndefOr[js.Any] = js.undefined
  /** database Name for Mongodb Atlas Connection */
  var dbName: js.UndefOr[String] = js.undefined
  /** Specify a journal write concern (default: false). */
  var journal: js.UndefOr[Boolean] = js.undefined
  // Legacy properties - passed to the connection server instance(s)
  var mongos: js.UndefOr[js.Any] = js.undefined
  /** The current value of the parameter native_parser */
  var nativeParser: js.UndefOr[Boolean] = js.undefined
  /** password for authentication */
  var pass: js.UndefOr[String] = js.undefined
  var replset: js.UndefOr[js.Any] = js.undefined
  var safe: js.UndefOr[js.Any] = js.undefined
  var server: js.UndefOr[js.Any] = js.undefined
  var slaveOk: js.UndefOr[Boolean] = js.undefined
  /** If true, this connection will use createIndex() instead of ensureIndex() for automatic index builds via Model.init(). */
  var useCreateIndex: js.UndefOr[Boolean] = js.undefined
  /** Set to false to make findOneAndUpdate() and findOneAndRemove() use native findOneAndUpdate() rather than findAndModify(). */
  var useFindAndModify: js.UndefOr[Boolean] = js.undefined
  /** See https://mongoosejs.com/docs/connections.html#use-mongo-client **/
  var useMongoClient: js.UndefOr[Boolean] = js.undefined
  /** username for authentication */
  var user: js.UndefOr[String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    acceptableLatencyMS: js.UndefOr[Double] = js.undefined,
    appname: String = null,
    auth: Password = null,
    authMechanism: DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String = null,
    authSource: String = null,
    autoCreate: js.UndefOr[Boolean] = js.undefined,
    autoEncryption: ExtraOptions = null,
    autoIndex: js.UndefOr[Boolean] = js.undefined,
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    bufferCommands: js.UndefOr[Boolean] = js.undefined,
    bufferMaxEntries: js.UndefOr[Double] = js.undefined,
    checkServerIdentity: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[typings.std.Error]]) = null,
    ciphers: String = null,
    compression: Compressors = null,
    config: AutoIndex = null,
    connectTimeoutMS: js.UndefOr[Double] = js.undefined,
    connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined,
    db: js.Any = null,
    dbName: String = null,
    domainsEnabled: js.UndefOr[Boolean] = js.undefined,
    ecdhCurve: String = null,
    family: js.UndefOr[Null | `4` | `6`] = js.undefined,
    forceServerObjectId: js.UndefOr[Boolean] = js.undefined,
    fsync: js.UndefOr[Boolean] = js.undefined,
    ha: js.UndefOr[Boolean] = js.undefined,
    haInterval: js.UndefOr[Double] = js.undefined,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    j: js.UndefOr[Boolean] = js.undefined,
    journal: js.UndefOr[Boolean] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelay: js.UndefOr[Double] = js.undefined,
    logger: js.Object | log = null,
    loggerLevel: String = null,
    maxStalenessSeconds: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined,
    mongos: js.Any = null,
    monitorCommands: js.UndefOr[Boolean] = js.undefined,
    monitoring: js.UndefOr[Boolean] = js.undefined,
    nativeParser: js.UndefOr[Boolean] = js.undefined,
    native_parser: js.UndefOr[Boolean] = js.undefined,
    noDelay: js.UndefOr[Boolean] = js.undefined,
    numberOfRetries: js.UndefOr[Double] = js.undefined,
    pass: String = null,
    pkFactory: js.Object = null,
    poolSize: js.UndefOr[Double] = js.undefined,
    promiseLibrary: PromiseConstructor = null,
    promoteBuffers: js.UndefOr[Boolean] = js.undefined,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    promoteValues: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    readConcern: ReadConcern | String = null,
    readPreference: ReadPreferenceOrMode = null,
    readPreferenceTags: js.Array[String] = null,
    reconnectInterval: js.UndefOr[Double] = js.undefined,
    reconnectTries: js.UndefOr[Double] = js.undefined,
    replicaSet: String = null,
    replset: js.Any = null,
    safe: js.Any = null,
    secondaryAcceptableLatencyMS: js.UndefOr[Double] = js.undefined,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined,
    server: js.Any = null,
    serverSelectionTimeoutMS: js.UndefOr[Double] = js.undefined,
    servername: String = null,
    session: typings.mongodb.mod.ClientSession = null,
    slaveOk: js.UndefOr[Boolean] = js.undefined,
    socketOptions: SocketOptions = null,
    socketTimeoutMS: js.UndefOr[Double] = js.undefined,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslCA: js.Array[Buffer | String] = null,
    sslCRL: js.Array[Buffer | String] = null,
    sslCert: Buffer | String = null,
    sslKey: Buffer | String = null,
    sslPass: Buffer | String = null,
    sslValidate: js.UndefOr[Boolean] = js.undefined,
    tls: js.UndefOr[Boolean] = js.undefined,
    tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.undefined,
    tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.undefined,
    tlsCAFile: String = null,
    tlsCertificateKeyFile: String = null,
    tlsCertificateKeyFilePassword: String = null,
    tlsInsecure: js.UndefOr[Boolean] = js.undefined,
    useCreateIndex: js.UndefOr[Boolean] = js.undefined,
    useFindAndModify: js.UndefOr[Boolean] = js.undefined,
    useMongoClient: js.UndefOr[Boolean] = js.undefined,
    useNewUrlParser: js.UndefOr[Boolean] = js.undefined,
    useUnifiedTopology: js.UndefOr[Boolean] = js.undefined,
    user: String = null,
    validateOptions: js.Object | Boolean = null,
    w: Double | majority | String = null,
    wtimeout: js.UndefOr[Double] = js.undefined
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptableLatencyMS)) __obj.updateDynamic("acceptableLatencyMS")(acceptableLatencyMS.get.asInstanceOf[js.Any])
    if (appname != null) __obj.updateDynamic("appname")(appname.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate.get.asInstanceOf[js.Any])
    if (autoEncryption != null) __obj.updateDynamic("autoEncryption")(autoEncryption.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIndex)) __obj.updateDynamic("autoIndex")(autoIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferCommands)) __obj.updateDynamic("bufferCommands")(bufferCommands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferMaxEntries)) __obj.updateDynamic("bufferMaxEntries")(bufferMaxEntries.get.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeoutMS)) __obj.updateDynamic("connectTimeoutMS")(connectTimeoutMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectWithNoPrimary)) __obj.updateDynamic("connectWithNoPrimary")(connectWithNoPrimary.get.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (dbName != null) __obj.updateDynamic("dbName")(dbName.asInstanceOf[js.Any])
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled.get.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(forceServerObjectId)) __obj.updateDynamic("forceServerObjectId")(forceServerObjectId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(haInterval)) __obj.updateDynamic("haInterval")(haInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined.get.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (!js.isUndefined(journal)) __obj.updateDynamic("journal")(journal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveInitialDelay)) __obj.updateDynamic("keepAliveInitialDelay")(keepAliveInitialDelay.get.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (loggerLevel != null) __obj.updateDynamic("loggerLevel")(loggerLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(maxStalenessSeconds)) __obj.updateDynamic("maxStalenessSeconds")(maxStalenessSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (mongos != null) __obj.updateDynamic("mongos")(mongos.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorCommands)) __obj.updateDynamic("monitorCommands")(monitorCommands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeParser)) __obj.updateDynamic("nativeParser")(nativeParser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(native_parser)) __obj.updateDynamic("native_parser")(native_parser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfRetries)) __obj.updateDynamic("numberOfRetries")(numberOfRetries.get.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(pass.asInstanceOf[js.Any])
    if (pkFactory != null) __obj.updateDynamic("pkFactory")(pkFactory.asInstanceOf[js.Any])
    if (!js.isUndefined(poolSize)) __obj.updateDynamic("poolSize")(poolSize.get.asInstanceOf[js.Any])
    if (promiseLibrary != null) __obj.updateDynamic("promiseLibrary")(promiseLibrary.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (readConcern != null) __obj.updateDynamic("readConcern")(readConcern.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (readPreferenceTags != null) __obj.updateDynamic("readPreferenceTags")(readPreferenceTags.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectInterval)) __obj.updateDynamic("reconnectInterval")(reconnectInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectTries)) __obj.updateDynamic("reconnectTries")(reconnectTries.get.asInstanceOf[js.Any])
    if (replicaSet != null) __obj.updateDynamic("replicaSet")(replicaSet.asInstanceOf[js.Any])
    if (replset != null) __obj.updateDynamic("replset")(replset.asInstanceOf[js.Any])
    if (safe != null) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (!js.isUndefined(secondaryAcceptableLatencyMS)) __obj.updateDynamic("secondaryAcceptableLatencyMS")(secondaryAcceptableLatencyMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions.get.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSelectionTimeoutMS)) __obj.updateDynamic("serverSelectionTimeoutMS")(serverSelectionTimeoutMS.get.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(slaveOk)) __obj.updateDynamic("slaveOk")(slaveOk.get.asInstanceOf[js.Any])
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(socketTimeoutMS)) __obj.updateDynamic("socketTimeoutMS")(socketTimeoutMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (sslCA != null) __obj.updateDynamic("sslCA")(sslCA.asInstanceOf[js.Any])
    if (sslCRL != null) __obj.updateDynamic("sslCRL")(sslCRL.asInstanceOf[js.Any])
    if (sslCert != null) __obj.updateDynamic("sslCert")(sslCert.asInstanceOf[js.Any])
    if (sslKey != null) __obj.updateDynamic("sslKey")(sslKey.asInstanceOf[js.Any])
    if (sslPass != null) __obj.updateDynamic("sslPass")(sslPass.asInstanceOf[js.Any])
    if (!js.isUndefined(sslValidate)) __obj.updateDynamic("sslValidate")(sslValidate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsAllowInvalidCertificates)) __obj.updateDynamic("tlsAllowInvalidCertificates")(tlsAllowInvalidCertificates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsAllowInvalidHostnames)) __obj.updateDynamic("tlsAllowInvalidHostnames")(tlsAllowInvalidHostnames.get.asInstanceOf[js.Any])
    if (tlsCAFile != null) __obj.updateDynamic("tlsCAFile")(tlsCAFile.asInstanceOf[js.Any])
    if (tlsCertificateKeyFile != null) __obj.updateDynamic("tlsCertificateKeyFile")(tlsCertificateKeyFile.asInstanceOf[js.Any])
    if (tlsCertificateKeyFilePassword != null) __obj.updateDynamic("tlsCertificateKeyFilePassword")(tlsCertificateKeyFilePassword.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsInsecure)) __obj.updateDynamic("tlsInsecure")(tlsInsecure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCreateIndex)) __obj.updateDynamic("useCreateIndex")(useCreateIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useFindAndModify)) __obj.updateDynamic("useFindAndModify")(useFindAndModify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMongoClient)) __obj.updateDynamic("useMongoClient")(useMongoClient.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useNewUrlParser)) __obj.updateDynamic("useNewUrlParser")(useNewUrlParser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useUnifiedTopology)) __obj.updateDynamic("useUnifiedTopology")(useUnifiedTopology.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (validateOptions != null) __obj.updateDynamic("validateOptions")(validateOptions.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

