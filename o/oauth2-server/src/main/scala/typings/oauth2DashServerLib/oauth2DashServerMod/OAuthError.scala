package typings
package oauth2DashServerLib.oauth2DashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2-server", "OAuthError")
@js.native
class OAuthError protected ()
  extends oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.OAuthError {
  def this(messageOrError: java.lang.String) = this()
  def this(messageOrError: nodeLib.Error) = this()
  def this(messageOrError: java.lang.String, properties: js.Object) = this()
  def this(messageOrError: nodeLib.Error, properties: js.Object) = this()
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

