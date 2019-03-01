package typings
package meteorLib.serviceDashConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var appId: java.lang.String
  var secret: java.lang.String
}

object Configuration {
  @scala.inline
  def apply(appId: java.lang.String, secret: java.lang.String): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appId")(appId)
    __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[Configuration]
  }
}

