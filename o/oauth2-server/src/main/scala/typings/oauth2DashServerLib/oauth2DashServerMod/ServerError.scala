package typings
package oauth2DashServerLib.oauth2DashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2-server", "ServerError")
@js.native
class ServerError ()
  extends oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.ServerError {
  /**
           * The HTTP error code.
           */
  /* CompleteClass */
  override var code: scala.Double = js.native
  /**
           * A human-readable error message.
           */
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /**
           * The OAuth error code.
           */
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

