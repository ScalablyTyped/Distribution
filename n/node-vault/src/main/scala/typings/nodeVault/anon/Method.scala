package typings.nodeVault.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var method: String
  var path: String
  var scheme: js.Any
}

object Method {
  @scala.inline
  def apply(method: String, path: String, scheme: js.Any): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
}

