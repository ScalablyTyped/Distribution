package typings.mongodb.mod

import typings.mongodb.anon.Compressors
import typings.mongodb.anon.Password
import typings.mongodb.mongodbStrings.DEFAULT
import typings.mongodb.mongodbStrings.GSSAPI
import typings.mongodb.mongodbStrings.PLAIN
import typings.mongodb.mongodbStrings.`MONGODB-CR`
import typings.mongodb.mongodbStrings.`MONGODB-X509`
import typings.mongodb.mongodbStrings.`SCRAM-SHA-1`
import typings.mongodb.mongodbStrings.`SCRAM-SHA-256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mongodb.mod.HighAvailabilityOptions because var conflicts: domainsEnabled, haInterval, readPreference. Inlined ha, readPreferenceTags
- typings.mongodb.mod.SSLOptions because Already inherited
- typings.mongodb.mod.ReplSetOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, readPreference, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined maxStalenessSeconds, replicaSet, secondaryAcceptableLatencyMS, connectWithNoPrimary
- typings.mongodb.mod.MongosOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, readPreference, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined acceptableLatencyMS */ trait MongoClientOptions
  extends StObject
     with DbCreateOptions
     with ServerOptions
     with SocketOptions
     with TLSOptions
     with UnifiedTopologyOptions {
  
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
    * Determines whether or not to use the new url parser. Enables the new, spec-compliant
    * url parser shipped in the core driver. This url parser fixes a number of problems with
    * the original parser, and aims to outright replace that parser in the near future.
    */
  var useNewUrlParser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Validate MongoClient passed in options for correctness.
    * Default: false
    */
  var validateOptions: js.UndefOr[js.Object | Boolean] = js.undefined
}
object MongoClientOptions {
  
  inline def apply(): MongoClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoClientOptions]
  }
  
  extension [Self <: MongoClientOptions](x: Self) {
    
    inline def setAcceptableLatencyMS(value: scala.Double): Self = StObject.set(x, "acceptableLatencyMS", value.asInstanceOf[js.Any])
    
    inline def setAcceptableLatencyMSUndefined: Self = StObject.set(x, "acceptableLatencyMS", js.undefined)
    
    inline def setAppname(value: String): Self = StObject.set(x, "appname", value.asInstanceOf[js.Any])
    
    inline def setAppnameUndefined: Self = StObject.set(x, "appname", js.undefined)
    
    inline def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthMechanism(
      value: DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
    ): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
    
    inline def setAuthMechanismUndefined: Self = StObject.set(x, "authMechanism", js.undefined)
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCompression(value: Compressors): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setConnectWithNoPrimary(value: Boolean): Self = StObject.set(x, "connectWithNoPrimary", value.asInstanceOf[js.Any])
    
    inline def setConnectWithNoPrimaryUndefined: Self = StObject.set(x, "connectWithNoPrimary", js.undefined)
    
    inline def setHa(value: Boolean): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
    
    inline def setHaUndefined: Self = StObject.set(x, "ha", js.undefined)
    
    inline def setLogger(value: js.Object | log): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerFunction2(value: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction2(value))
    
    inline def setLoggerLevel(value: String): Self = StObject.set(x, "loggerLevel", value.asInstanceOf[js.Any])
    
    inline def setLoggerLevelUndefined: Self = StObject.set(x, "loggerLevel", js.undefined)
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxStalenessSeconds(value: scala.Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
    
    inline def setNumberOfRetries(value: scala.Double): Self = StObject.set(x, "numberOfRetries", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRetriesUndefined: Self = StObject.set(x, "numberOfRetries", js.undefined)
    
    inline def setReadPreferenceTags(value: js.Array[String]): Self = StObject.set(x, "readPreferenceTags", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceTagsUndefined: Self = StObject.set(x, "readPreferenceTags", js.undefined)
    
    inline def setReadPreferenceTagsVarargs(value: String*): Self = StObject.set(x, "readPreferenceTags", js.Array(value :_*))
    
    inline def setReplicaSet(value: String): Self = StObject.set(x, "replicaSet", value.asInstanceOf[js.Any])
    
    inline def setReplicaSetUndefined: Self = StObject.set(x, "replicaSet", js.undefined)
    
    inline def setSecondaryAcceptableLatencyMS(value: scala.Double): Self = StObject.set(x, "secondaryAcceptableLatencyMS", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAcceptableLatencyMSUndefined: Self = StObject.set(x, "secondaryAcceptableLatencyMS", js.undefined)
    
    inline def setUseNewUrlParser(value: Boolean): Self = StObject.set(x, "useNewUrlParser", value.asInstanceOf[js.Any])
    
    inline def setUseNewUrlParserUndefined: Self = StObject.set(x, "useNewUrlParser", js.undefined)
    
    inline def setValidateOptions(value: js.Object | Boolean): Self = StObject.set(x, "validateOptions", value.asInstanceOf[js.Any])
    
    inline def setValidateOptionsUndefined: Self = StObject.set(x, "validateOptions", js.undefined)
  }
}
