package typings
package moscaLib.moscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mosca", "Authorizer")
@js.native
class Authorizer () extends js.Object {
  var users: js.Any = js.native
  def addUser(
    username: java.lang.String,
    password: java.lang.String,
    authorizePublish: java.lang.String,
    authorizeSubscribe: java.lang.String,
    callback: js.Function1[/* func */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

