package typings.nes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketAuthObject extends js.Object {
  var artifacts: js.Any
  var credentials: js.Any
  var isAuthenticated: Boolean
}

object SocketAuthObject {
  @scala.inline
  def apply(artifacts: js.Any, credentials: js.Any, isAuthenticated: Boolean): SocketAuthObject = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketAuthObject]
  }
}

