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
  implicit class MongoClientOptionsOps[Self <: MongoClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptableLatencyMS(value: scala.Double): Self = this.set("acceptableLatencyMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptableLatencyMS: Self = this.set("acceptableLatencyMS", js.undefined)
    
    @scala.inline
    def setAppname(value: String): Self = this.set("appname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppname: Self = this.set("appname", js.undefined)
    
    @scala.inline
    def setAuth(value: Password): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setAuthMechanism(
      value: DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
    ): Self = this.set("authMechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthMechanism: Self = this.set("authMechanism", js.undefined)
    
    @scala.inline
    def setCompression(value: Compressors): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setConnectWithNoPrimary(value: Boolean): Self = this.set("connectWithNoPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectWithNoPrimary: Self = this.set("connectWithNoPrimary", js.undefined)
    
    @scala.inline
    def setHa(value: Boolean): Self = this.set("ha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHa: Self = this.set("ha", js.undefined)
    
    @scala.inline
    def setLoggerFunction2(value: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Unit): Self = this.set("logger", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLogger(value: js.Object | log): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setLoggerLevel(value: String): Self = this.set("loggerLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggerLevel: Self = this.set("loggerLevel", js.undefined)
    
    @scala.inline
    def setMaxStalenessSeconds(value: scala.Double): Self = this.set("maxStalenessSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStalenessSeconds: Self = this.set("maxStalenessSeconds", js.undefined)
    
    @scala.inline
    def setNumberOfRetries(value: scala.Double): Self = this.set("numberOfRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfRetries: Self = this.set("numberOfRetries", js.undefined)
    
    @scala.inline
    def setReadPreferenceTagsVarargs(value: String*): Self = this.set("readPreferenceTags", js.Array(value :_*))
    
    @scala.inline
    def setReadPreferenceTags(value: js.Array[String]): Self = this.set("readPreferenceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreferenceTags: Self = this.set("readPreferenceTags", js.undefined)
    
    @scala.inline
    def setReplicaSet(value: String): Self = this.set("replicaSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaSet: Self = this.set("replicaSet", js.undefined)
    
    @scala.inline
    def setSecondaryAcceptableLatencyMS(value: scala.Double): Self = this.set("secondaryAcceptableLatencyMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryAcceptableLatencyMS: Self = this.set("secondaryAcceptableLatencyMS", js.undefined)
    
    @scala.inline
    def setUseNewUrlParser(value: Boolean): Self = this.set("useNewUrlParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNewUrlParser: Self = this.set("useNewUrlParser", js.undefined)
    
    @scala.inline
    def setValidateOptions(value: js.Object | Boolean): Self = this.set("validateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOptions: Self = this.set("validateOptions", js.undefined)
  }
}
