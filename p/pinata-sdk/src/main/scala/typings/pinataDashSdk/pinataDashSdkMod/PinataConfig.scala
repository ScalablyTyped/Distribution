package typings.pinataDashSdk.pinataDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinataConfig extends js.Object {
  var apiKey: String
  var apiURL: String
  var privateApiKey: String
}

object PinataConfig {
  @scala.inline
  def apply(apiKey: String, apiURL: String, privateApiKey: String): PinataConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiURL = apiURL.asInstanceOf[js.Any], privateApiKey = privateApiKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PinataConfig]
  }
}

