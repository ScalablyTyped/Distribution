package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contents extends js.Object {
  var contents: String
  var path: String
}

object Contents {
  @scala.inline
  def apply(contents: String, path: String): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
}

