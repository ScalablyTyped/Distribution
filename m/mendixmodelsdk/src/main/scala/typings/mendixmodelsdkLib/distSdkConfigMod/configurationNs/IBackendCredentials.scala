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

