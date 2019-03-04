package typings
package mendixmodelsdkLib.distSdkConfigMod.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISdkCredentials extends js.Object {
  var apikey: java.lang.String
  var username: java.lang.String
}

object ISdkCredentials {
  @scala.inline
  def apply(apikey: java.lang.String, username: java.lang.String): ISdkCredentials = {
    val __obj = js.Dynamic.literal(apikey = apikey, username = username)
  
    __obj.asInstanceOf[ISdkCredentials]
  }
}

