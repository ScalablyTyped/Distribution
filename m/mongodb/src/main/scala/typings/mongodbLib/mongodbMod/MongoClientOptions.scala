package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- mongodbLib.mongodbMod.ReplSetOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined maxStalenessSeconds, replicaSet, secondaryAcceptableLatencyMS, connectWithNoPrimary- mongodbLib.mongodbMod.MongosOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined acceptableLatencyMS */ trait MongoClientOptions
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
  var appname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Authentifikation credentials
    */
  var auth: js.UndefOr[mongodbLib.Anon_Password] = js.undefined
  /**
    * Mechanism for authentication: DEFAULT, GSSAPI, PLAIN, MONGODB-X509, 'MONGODB-CR', SCRAM-SHA-1 or SCRAM-SHA-256
    */
  var authMechanism: js.UndefOr[
    mongodbLib.mongodbLibStrings.DEFAULT | mongodbLib.mongodbLibStrings.GSSAPI | mongodbLib.mongodbLibStrings.PLAIN | mongodbLib.mongodbLibStrings.`MONGODB-X509` | mongodbLib.mongodbLibStrings.`MONGODB-CR` | mongodbLib.mongodbLibStrings.`SCRAM-SHA-1` | mongodbLib.mongodbLibStrings.`SCRAM-SHA-256` | java.lang.String
  ] = js.undefined
  var connectWithNoPrimary: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom logger object
    */
  var logger: js.UndefOr[js.Object | log] = js.undefined
  /**
    * The logging level (error/warn/info/debug)
    */
  var loggerLevel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the replicaset to connect to.
    */
  var replicaSet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
    */
  var secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * Determines whether or not to use the new url parser
    */
  var useNewUrlParser: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Validate MongoClient passed in options for correctness.
    * Default: false
    */
  var validateOptions: js.UndefOr[js.Object] = js.undefined
}

object MongoClientOptions {
  @scala.inline
  def apply(
    acceptableLatencyMS: scala.Int | scala.Double = null,
    appname: java.lang.String = null,
    auth: mongodbLib.Anon_Password = null,
    authMechanism: mongodbLib.mongodbLibStrings.DEFAULT | mongodbLib.mongodbLibStrings.GSSAPI | mongodbLib.mongodbLibStrings.PLAIN | mongodbLib.mongodbLibStrings.`MONGODB-X509` | mongodbLib.mongodbLibStrings.`MONGODB-CR` | mongodbLib.mongodbLibStrings.`SCRAM-SHA-1` | mongodbLib.mongodbLibStrings.`SCRAM-SHA-256` | java.lang.String = null,
    authSource: java.lang.String = null,
    autoReconnect: js.UndefOr[scala.Boolean] = js.undefined,
    bufferMaxEntries: scala.Int | scala.Double = null,
    checkServerIdentity: scala.Boolean | js.Function = null,
    ciphers: java.lang.String = null,
    connectTimeoutMS: scala.Int | scala.Double = null,
    connectWithNoPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ecdhCurve: java.lang.String = null,
    family: mongodbLib.mongodbLibNumbers.`4` | mongodbLib.mongodbLibNumbers.`6` = null,
    forceServerObjectId: js.UndefOr[scala.Boolean] = js.undefined,
    ha: js.UndefOr[scala.Boolean] = js.undefined,
    haInterval: scala.Int | scala.Double = null,
    ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined,
    j: js.UndefOr[scala.Boolean] = js.undefined,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    keepAliveInitialDelay: scala.Int | scala.Double = null,
    logger: js.Object | log = null,
    loggerLevel: java.lang.String = null,
    maxStalenessSeconds: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    monitoring: js.UndefOr[scala.Boolean] = js.undefined,
    native_parser: js.UndefOr[scala.Boolean] = js.undefined,
    noDelay: js.UndefOr[scala.Boolean] = js.undefined,
    pkFactory: js.Object = null,
    poolSize: scala.Int | scala.Double = null,
    promiseLibrary: js.Object = null,
    promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined,
    promoteLongs: js.UndefOr[scala.Boolean] = js.undefined,
    promoteValues: js.Object = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    readConcern: ReadConcern = null,
    readPreference: ReadPreference | java.lang.String = null,
    reconnectInterval: scala.Int | scala.Double = null,
    reconnectTries: scala.Int | scala.Double = null,
    replicaSet: java.lang.String = null,
    secondaryAcceptableLatencyMS: scala.Int | scala.Double = null,
    serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    servername: java.lang.String = null,
    session: ClientSession = null,
    socketOptions: SocketOptions = null,
    socketTimeoutMS: scala.Int | scala.Double = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    sslCA: js.Array[nodeLib.Buffer | java.lang.String] = null,
    sslCRL: js.Array[nodeLib.Buffer | java.lang.String] = null,
    sslCert: nodeLib.Buffer | java.lang.String = null,
    sslKey: nodeLib.Buffer | java.lang.String = null,
    sslPass: nodeLib.Buffer | java.lang.String = null,
    sslValidate: js.UndefOr[scala.Boolean] = js.undefined,
    useNewUrlParser: js.UndefOr[scala.Boolean] = js.undefined,
    validateOptions: js.Object = null,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
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
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring)
    if (!js.isUndefined(native_parser)) __obj.updateDynamic("native_parser")(native_parser)
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay)
    if (pkFactory != null) __obj.updateDynamic("pkFactory")(pkFactory)
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (promiseLibrary != null) __obj.updateDynamic("promiseLibrary")(promiseLibrary)
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers)
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs)
    if (promoteValues != null) __obj.updateDynamic("promoteValues")(promoteValues)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (readConcern != null) __obj.updateDynamic("readConcern")(readConcern)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
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
    if (validateOptions != null) __obj.updateDynamic("validateOptions")(validateOptions)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoClientOptions]
  }
}

