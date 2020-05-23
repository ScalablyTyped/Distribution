package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUrl extends js.Object {
  var baseUrl: String
  var headers: Authorization
  var timeout: Double
}

object BaseUrl {
  @scala.inline
  def apply(baseUrl: String, headers: Authorization, timeout: Double): BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
}

