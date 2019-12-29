package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * The default curve name to use for ECDH key agreement in a tls server.
    * The default value is 'auto'. See tls.createSecureContext() for further
    * information.
    */
  var DEFAULT_ECDH_CURVE: String = js.native
  /**
    * The default value of the maxVersion option of
    * tls.createSecureContext(). It can be assigned any of the supported TLS
    * protocol versions, 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default:
    * 'TLSv1.3', unless changed using CLI options. Using --tls-max-v1.2 sets
    * the default to 'TLSv1.2'. Using --tls-max-v1.3 sets the default to
    * 'TLSv1.3'. If multiple of the options are provided, the highest maximum
    * is used.
    */
  var DEFAULT_MAX_VERSION: SecureVersion = js.native
  /**
    * The default value of the minVersion option of tls.createSecureContext().
    * It can be assigned any of the supported TLS protocol versions,
    * 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default: 'TLSv1.2', unless
    * changed using CLI options. Using --tls-min-v1.0 sets the default to
    * 'TLSv1'. Using --tls-min-v1.1 sets the default to 'TLSv1.1'. Using
    * --tls-min-v1.3 sets the default to 'TLSv1.3'. If multiple of the options
    * are provided, the lowest minimum is used.
    */
  var DEFAULT_MIN_VERSION: SecureVersion = js.native
}

