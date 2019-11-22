package typings.mendixmodelsdk.distSdkConfigurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

