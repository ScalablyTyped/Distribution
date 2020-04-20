package typings.pdfjsDist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseUrl extends js.Object {
  var baseUrl: String
  var isCompressed: Boolean
}

object AnonBaseUrl {
  @scala.inline
  def apply(baseUrl: String, isCompressed: Boolean): AnonBaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseUrl]
  }
}

