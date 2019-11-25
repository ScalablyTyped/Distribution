package typings.atOnfleetNodeDashOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: String
  var headers: Anon_Authorization
  var timeout: Double
}

object Anon_BaseUrl {
  @scala.inline
  def apply(baseUrl: String, headers: Anon_Authorization, timeout: Double): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

