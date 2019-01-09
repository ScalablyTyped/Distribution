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

