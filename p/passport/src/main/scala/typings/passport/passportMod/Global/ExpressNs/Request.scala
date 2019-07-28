package typings.passport.passportMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var authInfo: js.UndefOr[js.Any] = js.native
  var user: js.UndefOr[js.Any] = js.native
  def isAuthenticated(): Boolean = js.native
  def isUnauthenticated(): Boolean = js.native
  def logIn(user: js.Any, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def logIn(user: js.Any, options: js.Any, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def logOut(): Unit = js.native
  // These declarations are merged into express's Request type
  def login(user: js.Any, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def login(user: js.Any, options: js.Any, done: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def logout(): Unit = js.native
}

