package typings.node.tlsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default value of the maxVersion option of
  * tls.createSecureContext(). It can be assigned any of the supported TLS
  * protocol versions, 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default:
  * 'TLSv1.3', unless changed using CLI options. Using --tls-max-v1.2 sets
  * the default to 'TLSv1.2'. Using --tls-max-v1.3 sets the default to
  * 'TLSv1.3'. If multiple of the options are provided, the highest maximum
  * is used.
  */
@JSImport("tls", "DEFAULT_MAX_VERSION")
@js.native
object DEFAULT_MAX_VERSION extends TopLevel[SecureVersion]

