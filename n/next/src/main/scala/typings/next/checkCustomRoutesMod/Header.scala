package typings.next.checkCustomRoutesMod

import typings.next.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var headers: js.Array[AnonKey]
  var source: String
}

object Header {
  @scala.inline
  def apply(headers: js.Array[AnonKey], source: String): Header = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

