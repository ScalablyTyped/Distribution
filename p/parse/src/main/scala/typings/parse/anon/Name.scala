package typings.parse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var __type: String
  var name: String
  var url: String
}

object Name {
  @scala.inline
  def apply(__type: String, name: String, url: String): Name = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

