package typings.meteor.serviceDashConfigurationMod

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
    val __obj = js.Dynamic.literal(appId = appId, secret = secret)
  
    __obj.asInstanceOf[Configuration]
  }
}

