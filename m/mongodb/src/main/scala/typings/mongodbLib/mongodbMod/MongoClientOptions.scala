package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(mongodbLib.mongodbMod.ReplSetOptions because Would inherit conflicting mutable fields List(checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate), mongodbLib.mongodbMod.MongosOptions because Would inherit conflicting mutable fields List(checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate))*/
trait MongoClientOptions
  extends DbCreateOptions
     with ServerOptions
     with SocketOptions {
  /**
    * The name of the application that created this MongoClient instance.
    */
  var appname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Authentifikation credentials
    */
  var auth: js.UndefOr[mongodbLib.Anon_User] = js.undefined
  /**
    * Mechanism for authentication: DEFAULT, GSSAPI, PLAIN, MONGODB-X509, 'MONGODB-CR', SCRAM-SHA-1 or SCRAM-SHA-256
    */
  var authMechanism: js.UndefOr[
    mongodbLib.mongodbLibStrings.DEFAULT | mongodbLib.mongodbLibStrings.GSSAPI | mongodbLib.mongodbLibStrings.PLAIN | mongodbLib.mongodbLibStrings.`MONGODB-X509` | mongodbLib.mongodbLibStrings.`MONGODB-CR` | mongodbLib.mongodbLibStrings.`SCRAM-SHA-1` | mongodbLib.mongodbLibStrings.`SCRAM-SHA-256` | java.lang.String
  ] = js.undefined
  /**
    * Custom logger object
    */
  var logger: js.UndefOr[js.Object | log] = js.undefined
  /**
    * The logging level (error/warn/info/debug)
    */
  var loggerLevel: js.UndefOr[java.lang.String] = js.undefined
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

