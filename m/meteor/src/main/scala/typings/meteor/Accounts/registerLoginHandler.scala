package typings.meteor.Accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts.registerLoginHandler")
@js.native
object registerLoginHandler extends js.Object {
  /**
    *
    * The main entry point for auth packages to hook in to login.
    *
    * A login handler is a login method which can return `undefined` to
    * indicate that the login request is not handled by this handler.
    *
    * @param name {String} Optional.  The service name, used by default
    * if a specific service name isn't returned in the result.
    *
    * @param handler {Function} A function that receives an options object
    * (as passed as an argument to the `login` method) and returns one of:
    * - `undefined`, meaning don't handle;
    * - a login method result object
    **/
  def apply(name: String, handler: js.Function1[/* options */ js.Any, js.UndefOr[js.Object]]): Unit = js.native
}

