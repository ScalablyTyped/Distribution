package typings.ngTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeader extends js.Object {
  var header: String
  var pagination: String
}

object AnonHeader {
  @scala.inline
  def apply(header: String, pagination: String): AnonHeader = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeader]
  }
}

