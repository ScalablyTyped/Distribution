package typings.nodeSsh.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Local extends js.Object {
  var local: String
  var remote: String
}

object Local {
  @scala.inline
  def apply(local: String, remote: String): Local = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Local]
  }
}

