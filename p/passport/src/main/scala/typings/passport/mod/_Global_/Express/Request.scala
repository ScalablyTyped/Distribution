package typings.passport.mod._Global_.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var authInfo: js.UndefOr[AuthInfo] = js.native
  var user: js.UndefOr[User] = js.native
  def isAuthenticated(): Boolean = js.native
  def isUnauthenticated(): Boolean = js.native
  def logIn(user: User, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def logIn(user: User, options: js.Any, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def logOut(): Unit = js.native
  // These declarations are merged into express's Request type
  def login(user: User, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def login(user: User, options: js.Any, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def logout(): Unit = js.native
}

