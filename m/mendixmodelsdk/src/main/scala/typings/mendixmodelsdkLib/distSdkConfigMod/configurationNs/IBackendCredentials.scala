package typings
package mendixmodelsdkLib.distSdkConfigMod.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The credentials with which a trusted backend client (such as sprintr) connects to the Model API Server.
  */
trait IBackendCredentials extends js.Object {
  /** The OpenID on behalf which the trusted backend service operates. */
  var openid: js.UndefOr[java.lang.String] = js.undefined
  var password: java.lang.String
  var username: java.lang.String
}

object IBackendCredentials {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String, openid: java.lang.String = null): IBackendCredentials = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (openid != null) __obj.updateDynamic("openid")(openid)
    __obj.asInstanceOf[IBackendCredentials]
  }
}

