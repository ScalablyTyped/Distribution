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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mongodb.mod.HighAvailabilityOptions because var conflicts: domainsEnabled, haInterval, readPreference. Inlined ha, readPreferenceTags
- typings.mongodb.mod.SSLOptions because Already inherited
- typings.mongodb.mod.ReplSetOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, readPreference, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined maxStalenessSeconds, replicaSet, secondaryAcceptableLatencyMS, connectWithNoPrimary
- typings.mongodb.mod.MongosOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, readPreference, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined acceptableLatencyMS */ @js.native
trait MongoClientOptions
  extends DbCreateOptions
     with ServerOptions
     with SocketOptions
     with TLSOptions
     with UnifiedTopologyOptions {
  
  /**
    * Default: 15; Cutoff latency point in MS for MongoS proxy selection
    */
  var acceptableLatencyMS: js.UndefOr[scala.Double] = js.native
  
  /**
    * The name of the application that created this MongoClient instance.
    */
  var appname: js.UndefOr[String] = js.native
  
  /**
    * Authentication credentials
    */
  var auth: js.UndefOr[Password] = js.native
  
  /**
    * Mechanism for authentication: DEFAULT, GSSAPI, PLAIN, MONGODB-X509, 'MONGODB-CR', SCRAM-SHA-1 or SCRAM-SHA-256
    */
  var authMechanism: js.UndefOr[
    DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
  ] = js.native
  
  /** Type of compression to use */
  var compression: js.UndefOr[Compressors] = js.native
  
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: true; Turn on high availability monitoring.
    */
  var ha: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom logger object
    */
  var logger: js.UndefOr[js.Object | log] = js.native
  
  /**
    * The logging level (error/warn/info/debug)
    */
  var loggerLevel: js.UndefOr[String] = js.native
  
  /**
    * The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.native
  
  /**
    * number of retries for a tailable cursor
    * @default 5
    */
  var numberOfRetries: js.UndefOr[scala.Double] = js.native
  
  /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/3.1/api/ReadPreference.html */
  var readPreferenceTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the replicaset to connect to.
    */
  var replicaSet: js.UndefOr[String] = js.native
  
  /**
    * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
    */
  var secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.native
  
  /**
    * Determines whether or not to use the new url parser. Enables the new, spec-compliant
    * url parser shipped in the core driver. This url parser fixes a number of problems with
    * the original parser, and aims to outright replace that parser in the near future.
    */
  var useNewUrlParser: js.UndefOr[Boolean] = js.native
  
  /**
    * Validate MongoClient passed in options for correctness.
    * Default: false
    */
  var validateOptions: js.UndefOr[js.Object | Boolean] = js.native
}
object MongoClientOptions {
  
  @scala.inline
  def apply(): MongoClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoClientOptions]
  }
  
  @scala.inline
  implicit class MongoClientOptionsMutableBuilder[Self <: MongoClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptableLatencyMS(value: scala.Double): Self = StObject.set(x, "acceptableLatencyMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptableLatencyMSUndefined: Self = StObject.set(x, "acceptableLatencyMS", js.undefined)
    
    @scala.inline
    def setAppname(value: String): Self = StObject.set(x, "appname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppnameUndefined: Self = StObject.set(x, "appname", js.undefined)
    
    @scala.inline
    def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthMechanism(
      value: DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
    ): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthMechanismUndefined: Self = StObject.set(x, "authMechanism", js.undefined)
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCompression(value: Compressors): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setConnectWithNoPrimary(value: Boolean): Self = StObject.set(x, "connectWithNoPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectWithNoPrimaryUndefined: Self = StObject.set(x, "connectWithNoPrimary", js.undefined)
    
    @scala.inline
    def setHa(value: Boolean): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaUndefined: Self = StObject.set(x, "ha", js.undefined)
    
    @scala.inline
    def setLogger(value: js.Object | log): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerFunction2(value: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoggerLevel(value: String): Self = StObject.set(x, "loggerLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerLevelUndefined: Self = StObject.set(x, "loggerLevel", js.undefined)
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setMaxStalenessSeconds(value: scala.Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
    
    @scala.inline
    def setNumberOfRetries(value: scala.Double): Self = StObject.set(x, "numberOfRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRetriesUndefined: Self = StObject.set(x, "numberOfRetries", js.undefined)
    
    @scala.inline
    def setReadPreferenceTags(value: js.Array[String]): Self = StObject.set(x, "readPreferenceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceTagsUndefined: Self = StObject.set(x, "readPreferenceTags", js.undefined)
    
    @scala.inline
    def setReadPreferenceTagsVarargs(value: String*): Self = StObject.set(x, "readPreferenceTags", js.Array(value :_*))
    
    @scala.inline
    def setReplicaSet(value: String): Self = StObject.set(x, "replicaSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaSetUndefined: Self = StObject.set(x, "replicaSet", js.undefined)
    
    @scala.inline
    def setSecondaryAcceptableLatencyMS(value: scala.Double): Self = StObject.set(x, "secondaryAcceptableLatencyMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryAcceptableLatencyMSUndefined: Self = StObject.set(x, "secondaryAcceptableLatencyMS", js.undefined)
    
    @scala.inline
    def setUseNewUrlParser(value: Boolean): Self = StObject.set(x, "useNewUrlParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNewUrlParserUndefined: Self = StObject.set(x, "useNewUrlParser", js.undefined)
    
    @scala.inline
    def setValidateOptions(value: js.Object | Boolean): Self = StObject.set(x, "validateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOptionsUndefined: Self = StObject.set(x, "validateOptions", js.undefined)
  }
}
