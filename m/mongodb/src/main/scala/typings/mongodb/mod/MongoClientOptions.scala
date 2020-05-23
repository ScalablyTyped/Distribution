package typings.mongodb.mod

import typings.mongodb.anon.Compressors
import typings.mongodb.anon.Password
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
import typings.node.tlsMod.PeerCertificate
import typings.std.Error
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mongodb.mod.HighAvailabilityOptions because var conflicts: domainsEnabled, haInterval, readPreference. Inlined ha, readPreferenceTags
- typings.mongodb.mod.SSLOptions because Already inherited
- typings.mongodb.mod.ReplSetOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, readPreference, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined maxStalenessSeconds, replicaSet, secondaryAcceptableLatencyMS, connectWithNoPrimary
- typings.mongodb.mod.MongosOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, readPreference, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined acceptableLatencyMS */ trait MongoClientOptions
  extends DbCreateOptions
     with ServerOptions
     with SocketOptions
     with TLSOptions {
  /**
    * Default: 15; Cutoff latency point in MS for MongoS proxy selection
    */
  var acceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the application that created this MongoClient instance.
    */
  var appname: js.UndefOr[String] = js.undefined
  /**
    * Authentication credentials
    */
  var auth: js.UndefOr[Password] = js.undefined
  /**
    * Mechanism for authentication: DEFAULT, GSSAPI, PLAIN, MONGODB-X509, 'MONGODB-CR', SCRAM-SHA-1 or SCRAM-SHA-256
    */
  var authMechanism: js.UndefOr[
    DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
  ] = js.undefined
  /** Type of compression to use */
  var compression: js.UndefOr[Compressors] = js.undefined
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: true; Turn on high availability monitoring.
    */
  var ha: js.UndefOr[Boolean] = js.undefined
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
    * @default 5
    */
  var numberOfRetries: js.UndefOr[scala.Double] = js.undefined
  /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/3.1/api/ReadPreference.html */
  var readPreferenceTags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The name of the replicaset to connect to.
    */
  var replicaSet: js.UndefOr[String] = js.undefined
  /**
    * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
    */
  var secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * With `useUnifiedTopology`, the MongoDB driver will try to find a server to send any given operation to
    * and keep retrying for `serverSelectionTimeoutMS` milliseconds.
    * Default: 30000
    */
  var serverSelectionTimeoutMS: js.UndefOr[scala.Double] = js.undefined
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
    acceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined,
    appname: String = null,
    auth: Password = null,
    authMechanism: DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String = null,
    authSource: String = null,
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    bufferMaxEntries: js.UndefOr[scala.Double] = js.undefined,
    checkServerIdentity: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]) = null,
    ciphers: String = null,
    compression: Compressors = null,
    connectTimeoutMS: js.UndefOr[scala.Double] = js.undefined,
    connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined,
    domainsEnabled: js.UndefOr[Boolean] = js.undefined,
    ecdhCurve: String = null,
    family: js.UndefOr[Null | `4` | `6`] = js.undefined,
    forceServerObjectId: js.UndefOr[Boolean] = js.undefined,
    fsync: js.UndefOr[Boolean] = js.undefined,
    ha: js.UndefOr[Boolean] = js.undefined,
    haInterval: js.UndefOr[scala.Double] = js.undefined,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    j: js.UndefOr[Boolean] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelay: js.UndefOr[scala.Double] = js.undefined,
    logger: js.Object | log = null,
    loggerLevel: String = null,
    maxStalenessSeconds: js.UndefOr[scala.Double] = js.undefined,
    minSize: js.UndefOr[scala.Double] = js.undefined,
    monitorCommands: js.UndefOr[Boolean] = js.undefined,
    monitoring: js.UndefOr[Boolean] = js.undefined,
    native_parser: js.UndefOr[Boolean] = js.undefined,
    noDelay: js.UndefOr[Boolean] = js.undefined,
    numberOfRetries: js.UndefOr[scala.Double] = js.undefined,
    pkFactory: js.Object = null,
    poolSize: js.UndefOr[scala.Double] = js.undefined,
    promiseLibrary: PromiseConstructor = null,
    promoteBuffers: js.UndefOr[Boolean] = js.undefined,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    promoteValues: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    readConcern: ReadConcern | String = null,
    readPreference: ReadPreferenceOrMode = null,
    readPreferenceTags: js.Array[String] = null,
    reconnectInterval: js.UndefOr[scala.Double] = js.undefined,
    reconnectTries: js.UndefOr[scala.Double] = js.undefined,
    replicaSet: String = null,
    secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined,
    serverSelectionTimeoutMS: js.UndefOr[scala.Double] = js.undefined,
    servername: String = null,
    session: ClientSession = null,
    socketOptions: SocketOptions = null,
    socketTimeoutMS: js.UndefOr[scala.Double] = js.undefined,
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
    useNewUrlParser: js.UndefOr[Boolean] = js.undefined,
    useUnifiedTopology: js.UndefOr[Boolean] = js.undefined,
    validateOptions: js.Object | Boolean = null,
    w: scala.Double | majority | String = null,
    wtimeout: js.UndefOr[scala.Double] = js.undefined
  ): MongoClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptableLatencyMS)) __obj.updateDynamic("acceptableLatencyMS")(acceptableLatencyMS.get.asInstanceOf[js.Any])
    if (appname != null) __obj.updateDynamic("appname")(appname.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource.asInstanceOf[js.Any])
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferMaxEntries)) __obj.updateDynamic("bufferMaxEntries")(bufferMaxEntries.get.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeoutMS)) __obj.updateDynamic("connectTimeoutMS")(connectTimeoutMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectWithNoPrimary)) __obj.updateDynamic("connectWithNoPrimary")(connectWithNoPrimary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled.get.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(forceServerObjectId)) __obj.updateDynamic("forceServerObjectId")(forceServerObjectId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(haInterval)) __obj.updateDynamic("haInterval")(haInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined.get.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveInitialDelay)) __obj.updateDynamic("keepAliveInitialDelay")(keepAliveInitialDelay.get.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (loggerLevel != null) __obj.updateDynamic("loggerLevel")(loggerLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(maxStalenessSeconds)) __obj.updateDynamic("maxStalenessSeconds")(maxStalenessSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorCommands)) __obj.updateDynamic("monitorCommands")(monitorCommands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring.get.asInstanceOf[js.Any])
    if (!js.isUndefined(native_parser)) __obj.updateDynamic("native_parser")(native_parser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfRetries)) __obj.updateDynamic("numberOfRetries")(numberOfRetries.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(secondaryAcceptableLatencyMS)) __obj.updateDynamic("secondaryAcceptableLatencyMS")(secondaryAcceptableLatencyMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSelectionTimeoutMS)) __obj.updateDynamic("serverSelectionTimeoutMS")(serverSelectionTimeoutMS.get.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
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
    if (!js.isUndefined(useNewUrlParser)) __obj.updateDynamic("useNewUrlParser")(useNewUrlParser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useUnifiedTopology)) __obj.updateDynamic("useUnifiedTopology")(useUnifiedTopology.get.asInstanceOf[js.Any])
    if (validateOptions != null) __obj.updateDynamic("validateOptions")(validateOptions.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoClientOptions]
  }
}

