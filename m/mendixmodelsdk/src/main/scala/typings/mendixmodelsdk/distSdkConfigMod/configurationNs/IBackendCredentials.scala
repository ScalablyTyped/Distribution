package typings.mendixmodelsdk.distSdkConfigMod.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The credentials with which a trusted backend client (such as sprintr) connects to the Model API Server.
  */
trait IBackendCredentials extends js.Object {
  /** The OpenID on behalf which the trusted backend service operates. */
  var openid: js.UndefOr[String] = js.undefined
  var password: String
  var username: String
}

object IBackendCredentials {
  @scala.inline
  def apply(password: String, username: String, openid: String = null): IBackendCredentials = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (openid != null) __obj.updateDynamic("openid")(openid)
    __obj.asInstanceOf[IBackendCredentials]
  }
}

