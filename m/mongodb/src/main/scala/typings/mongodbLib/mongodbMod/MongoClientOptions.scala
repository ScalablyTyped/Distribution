package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(mongodbLib.mongodbMod.ReplSetOptions because Would inherit conflicting mutable fields List(ciphers, servername, ssl, sslCA, poolSize, sslValidate, ecdhCurve, sslCert, sslCRL, sslKey, checkServerIdentity, minSize, sslPass, domainsEnabled, socketOptions, haInterval), mongodbLib.mongodbMod.MongosOptions because Would inherit conflicting mutable fields List(ciphers, servername, ssl, sslCA, poolSize, sslValidate, ecdhCurve, sslCert, sslCRL, sslKey, checkServerIdentity, minSize, sslPass, domainsEnabled, socketOptions, haInterval))*/

trait MongoClientOptions
  extends DbCreateOptions
     with ServerOptions
     with SocketOptions {
  // The name of the application that created this MongoClient instance.
  var appname: js.UndefOr[java.lang.String] = js.undefined
  var auth: js.UndefOr[mongodbLib.Anon_User] = js.undefined
  // Custom logger object
  var logger: js.UndefOr[js.Object] = js.undefined
  // The logging level (error/warn/info/debug)
  var loggerLevel: js.UndefOr[java.lang.String] = js.undefined
  // Determines whether or not to use the new url parser
  var useNewUrlParser: js.UndefOr[scala.Boolean] = js.undefined
  // Default: false;
  var validateOptions: js.UndefOr[js.Object] = js.undefined
}

