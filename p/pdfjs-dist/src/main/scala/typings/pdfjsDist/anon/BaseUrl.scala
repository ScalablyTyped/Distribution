package typings.pdfjsDist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUrl extends js.Object {
  var baseUrl: String
  var isCompressed: Boolean
}

object BaseUrl {
  @scala.inline
  def apply(baseUrl: String, isCompressed: Boolean): BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
}

