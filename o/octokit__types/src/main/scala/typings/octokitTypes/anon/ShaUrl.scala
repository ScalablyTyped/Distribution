package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaUrl extends js.Object {
  var sha: String
  var url: String
}

object ShaUrl {
  @scala.inline
  def apply(sha: String, url: String): ShaUrl = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaUrl]
  }
}

