package typings.mosca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mosca", "Authorizer")
@js.native
class Authorizer () extends js.Object {
  
  def addUser(
    username: String,
    password: String,
    authorizePublish: String,
    authorizeSubscribe: String,
    callback: js.Function1[/* func */ js.Any, Unit]
  ): Unit = js.native
  
  var users: js.Any = js.native
}
