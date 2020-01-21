package typings.multiaddr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Protocol extends js.Object {
  var code: Code
  var name: String
  var path: Boolean
  var resolvable: Boolean
  var size: Size
}

object Protocol {
  @scala.inline
  def apply(code: Code, name: String, path: Boolean, resolvable: Boolean, size: Size): Protocol = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], resolvable = resolvable.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Protocol]
  }
}

