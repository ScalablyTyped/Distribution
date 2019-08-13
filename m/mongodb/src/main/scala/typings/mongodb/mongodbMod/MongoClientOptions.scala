package typings.mongodb.mongodbMod

import typings.mongodb.Anon_Password
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
import typings.node.Buffer
import typings.node.Error
import typings.node.tlsMod.PeerCertificate
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mongodb.mongodbMod.ReplSetOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, readPreference, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined maxStalenessSeconds, replicaSet, secondaryAcceptableLatencyMS, connectWithNoPrimary- typings.mongodb.mongodbMod.MongosOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, readPreference, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined acceptableLatencyMS */ trait MongoClientOptions
  extends DbCreateOptions
     with ServerOptions
     with SocketOptions {
  /**
    * Default: 15; Cutoff latency point in MS for MongoS proxy selection
    */
  var acceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the application that created this MongoClient instance.
    */
  var appname: js.UndefOr[String] = js.undefined
  /**
    * Authentifikation credentials
    */
  var auth: js.UndefOr[Anon_Password] = js.undefined
  /**
    * Mechanism for authentication: DEFAULT, GSSAPI, PLAIN, MONGODB-X509, 'MONGODB-CR', SCRAM-SHA-1 or SCRAM-SHA-256
    */
  var authMechanism: js.UndefOr[
    DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
  ] = js.undefined
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom logger object
    */
  var logger: js.UndefOr[js.Object | log] = js.undefined
  /**
    * The logging level (error/warn/info/debug)
    */
  var loggerLevel: js.UndefOr[String] = js.undefined
  /**
    * The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
    * number of retries for a tailable cursor
    * Default: 5
    */
  var numberOfRetries: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the replicaset to connect to.
    */
  var replicaSet: js.UndefOr[String] = js.undefined
  /**
    * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
    */
  var secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * Determines whether or not to use the new url parser. Enables the new, spec-compliant
    * url parser shipped in the core driver. This url parser fixes a number of problems with
    * the original parser, and aims to outright replace that parser in the near future.
    */
  var useNewUrlParser: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables the new unified topology layer
    */
  var useUnifiedTopology: js.UndefOr[Boolean] = js.undefined
  /**
    * Validate MongoClient passed in options for correctness.
    * Default: false
    */
  var validateOptions: js.UndefOr[js.Object | Boolean] = js.undefined
}

object MongoClientOptions {
  @scala.inline
  def apply(
    acceptableLatencyMS: Int | scala.Double = null,
    appname: String = null,
    auth: Anon_Password = null,
    authMechanism: DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String = null,
    authSource: String = null,
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    bufferMaxEntries: Int | scala.Double = null,
    checkServerIdentity: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]) = null,
    ciphers: String = null,
    connectTimeoutMS: Int | scala.Double = null,
    connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined,
    domainsEnabled: js.UndefOr[Boolean] = js.undefined,
    ecdhCurve: String = null,
    family: `4` | `6` = null,
    forceServerObjectId: js.UndefOr[Boolean] = js.undefined,
    fsync: js.UndefOr[Boolean] = js.undefined,
    ha: js.UndefOr[Boolean] = js.undefined,
    haInterval: Int | scala.Double = null,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    j: js.UndefOr[Boolean] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelay: Int | scala.Double = null,
    logger: js.Object | log = null,
    loggerLevel: String = null,
    maxStalenessSeconds: Int | scala.Double = null,
    minSize: Int | scala.Double = null,
    monitorCommands: js.UndefOr[Boolean] = js.undefined,
    monitoring: js.UndefOr[Boolean] = js.undefined,
    native_parser: js.UndefOr[Boolean] = js.undefined,
    noDelay: js.UndefOr[Boolean] = js.undefined,
    numberOfRetries: Int | scala.Double = null,
    pkFactory: js.Object = null,
    poolSize: Int | scala.Double = null,
    promiseLibrary: PromiseConstructor = null,
    promoteBuffers: js.UndefOr[Boolean] = js.undefined,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    promoteValues: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    readConcern: ReadConcern | String = null,
    readPreference: ReadPreference | String = null,
    readPreferenceTags: js.Array[String] = null,
    reconnectInterval: Int | scala.Double = null,
    reconnectTries: Int | scala.Double = null,
    replicaSet: String = null,
    secondaryAcceptableLatencyMS: Int | scala.Double = null,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined,
    servername: String = null,
    session: ClientSession = null,
    socketOptions: SocketOptions = null,
    socketTimeoutMS: Int | scala.Double = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslCA: js.Array[Buffer | String] = null,
    sslCRL: js.Array[Buffer | String] = null,
    sslCert: Buffer | String = null,
    sslKey: Buffer | String = null,
    sslPass: Buffer | String = null,
    sslValidate: js.UndefOr[Boolean] = js.undefined,
    useNewUrlParser: js.UndefOr[Boolean] = js.undefined,
    useUnifiedTopology: js.UndefOr[Boolean] = js.undefined,
    validateOptions: js.Object | Boolean = null,
    w: scala.Double | majority | String = null,
    wtimeout: Int | scala.Double = null
  ): MongoClientOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptableLatencyMS != null) __obj.updateDynamic("acceptableLatencyMS")(acceptableLatencyMS.asInstanceOf[js.Any])
    if (appname != null) __obj.updateDynamic("appname")(appname)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource)
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect)
    if (bufferMaxEntries != null) __obj.updateDynamic("bufferMaxEntries")(bufferMaxEntries.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (connectTimeoutMS != null) __obj.updateDynamic("connectTimeoutMS")(connectTimeoutMS.asInstanceOf[js.Any])
    if (!js.isUndefined(connectWithNoPrimary)) __obj.updateDynamic("connectWithNoPrimary")(connectWithNoPrimary)
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled)
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(forceServerObjectId)) __obj.updateDynamic("forceServerObjectId")(forceServerObjectId)
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync)
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha)
    if (haInterval != null) __obj.updateDynamic("haInterval")(haInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveInitialDelay != null) __obj.updateDynamic("keepAliveInitialDelay")(keepAliveInitialDelay.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (loggerLevel != null) __obj.updateDynamic("loggerLevel")(loggerLevel)
    if (maxStalenessSeconds != null) __obj.updateDynamic("maxStalenessSeconds")(maxStalenessSeconds.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorCommands)) __obj.updateDynamic("monitorCommands")(monitorCommands)
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring)
    if (!js.isUndefined(native_parser)) __obj.updateDynamic("native_parser")(native_parser)
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay)
    if (numberOfRetries != null) __obj.updateDynamic("numberOfRetries")(numberOfRetries.asInstanceOf[js.Any])
    if (pkFactory != null) __obj.updateDynamic("pkFactory")(pkFactory)
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (promiseLibrary != null) __obj.updateDynamic("promiseLibrary")(promiseLibrary)
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers)
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs)
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (readConcern != null) __obj.updateDynamic("readConcern")(readConcern.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (readPreferenceTags != null) __obj.updateDynamic("readPreferenceTags")(readPreferenceTags)
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (reconnectTries != null) __obj.updateDynamic("reconnectTries")(reconnectTries.asInstanceOf[js.Any])
    if (replicaSet != null) __obj.updateDynamic("replicaSet")(replicaSet)
    if (secondaryAcceptableLatencyMS != null) __obj.updateDynamic("secondaryAcceptableLatencyMS")(secondaryAcceptableLatencyMS.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (session != null) __obj.updateDynamic("session")(session)
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions)
    if (socketTimeoutMS != null) __obj.updateDynamic("socketTimeoutMS")(socketTimeoutMS.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (sslCA != null) __obj.updateDynamic("sslCA")(sslCA)
    if (sslCRL != null) __obj.updateDynamic("sslCRL")(sslCRL)
    if (sslCert != null) __obj.updateDynamic("sslCert")(sslCert.asInstanceOf[js.Any])
    if (sslKey != null) __obj.updateDynamic("sslKey")(sslKey.asInstanceOf[js.Any])
    if (sslPass != null) __obj.updateDynamic("sslPass")(sslPass.asInstanceOf[js.Any])
    if (!js.isUndefined(sslValidate)) __obj.updateDynamic("sslValidate")(sslValidate)
    if (!js.isUndefined(useNewUrlParser)) __obj.updateDynamic("useNewUrlParser")(useNewUrlParser)
    if (!js.isUndefined(useUnifiedTopology)) __obj.updateDynamic("useUnifiedTopology")(useUnifiedTopology)
    if (validateOptions != null) __obj.updateDynamic("validateOptions")(validateOptions.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoClientOptions]
  }
}

