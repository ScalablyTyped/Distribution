package typings.mosca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mosca", "Authorizer")
@js.native
class Authorizer () extends js.Object {
  var users: js.Any = js.native
  def addUser(
    username: String,
    password: String,
    authorizePublish: String,
    authorizeSubscribe: String,
    callback: js.Function1[/* func */ js.Any, Unit]
  ): Unit = js.native
}

