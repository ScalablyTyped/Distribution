package typings.nodeDashGeocoder.nodeDashGeocoderMod

import typings.nodeDashGeocoder.nodeDashGeocoderStrings.smartyStreet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartyStreetsOptions extends js.Object {
  var auth_id: String
  var auth_token: String
  var provider: smartyStreet
}

object SmartyStreetsOptions {
  @scala.inline
  def apply(auth_id: String, auth_token: String, provider: smartyStreet): SmartyStreetsOptions = {
    val __obj = js.Dynamic.literal(auth_id = auth_id, auth_token = auth_token, provider = provider)
  
    __obj.asInstanceOf[SmartyStreetsOptions]
  }
}

