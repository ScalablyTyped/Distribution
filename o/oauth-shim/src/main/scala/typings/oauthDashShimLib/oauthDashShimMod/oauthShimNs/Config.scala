package typings
package oauthDashShimLib.oauthDashShimMod.oauthShimNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var client_id: java.lang.String
  var client_secret: java.lang.String
  var domain: java.lang.String
  var grant_url: java.lang.String
}

object Config {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    client_secret: java.lang.String,
    domain: java.lang.String,
    grant_url: java.lang.String
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client_id")(client_id)
    __obj.updateDynamic("client_secret")(client_secret)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("grant_url")(grant_url)
    __obj.asInstanceOf[Config]
  }
}

