package typings
package nesLib.nesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketAuthObject extends js.Object {
  var artifacts: js.Any
  var credentials: js.Any
  var isAuthenticated: scala.Boolean
}

object SocketAuthObject {
  @scala.inline
  def apply(artifacts: js.Any, credentials: js.Any, isAuthenticated: scala.Boolean): SocketAuthObject = {
    val __obj = js.Dynamic.literal(artifacts = artifacts, credentials = credentials, isAuthenticated = isAuthenticated)
  
    __obj.asInstanceOf[SocketAuthObject]
  }
}

