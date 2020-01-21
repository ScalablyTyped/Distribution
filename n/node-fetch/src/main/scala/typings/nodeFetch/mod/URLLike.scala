package typings.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLLike extends _RequestInfo {
  var href: String
}

object URLLike {
  @scala.inline
  def apply(href: String): URLLike = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[URLLike]
  }
}

