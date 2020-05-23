package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var baseURL: String
  var headers: Header
}

object RequestOptions {
  @scala.inline
  def apply(baseURL: String, headers: Header): RequestOptions = {
    val __obj = js.Dynamic.literal(baseURL = baseURL.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

