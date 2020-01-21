package typings.mendixmodelsdk.configurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISdkCredentials extends js.Object {
  var apikey: String
  var username: String
}

object ISdkCredentials {
  @scala.inline
  def apply(apikey: String, username: String): ISdkCredentials = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISdkCredentials]
  }
}

