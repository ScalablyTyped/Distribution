package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contenttype extends js.Object {
  var content_type: String
  var url: String
}

object Contenttype {
  @scala.inline
  def apply(content_type: String, url: String): Contenttype = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contenttype]
  }
}

