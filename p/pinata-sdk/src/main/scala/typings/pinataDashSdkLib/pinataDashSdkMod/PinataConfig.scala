package typings
package pinataDashSdkLib.pinataDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinataConfig extends js.Object {
  var apiKey: java.lang.String
  var apiURL: java.lang.String
  var privateApiKey: java.lang.String
}

object PinataConfig {
  @scala.inline
  def apply(apiKey: java.lang.String, apiURL: java.lang.String, privateApiKey: java.lang.String): PinataConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, apiURL = apiURL, privateApiKey = privateApiKey)
  
    __obj.asInstanceOf[PinataConfig]
  }
}

