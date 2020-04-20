package typings.meteor.serviceConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var appId: String
  var secret: String
}

object Configuration {
  @scala.inline
  def apply(appId: String, secret: String): Configuration = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

