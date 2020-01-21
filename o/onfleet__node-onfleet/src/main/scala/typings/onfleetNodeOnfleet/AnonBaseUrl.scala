package typings.onfleetNodeOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseUrl extends js.Object {
  var baseUrl: String
  var headers: AnonAuthorization
  var timeout: Double
}

object AnonBaseUrl {
  @scala.inline
  def apply(baseUrl: String, headers: AnonAuthorization, timeout: Double): AnonBaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBaseUrl]
  }
}

