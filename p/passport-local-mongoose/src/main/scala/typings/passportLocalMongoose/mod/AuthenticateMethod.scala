package typings.passportLocalMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateMethod[T] extends js.Object {
  def apply(username: String, password: String): js.Promise[AuthenticationResult] = js.native
  def apply(
    username: String,
    password: String,
    cb: js.Function3[/* err */ js.Any, /* user */ T | Boolean, /* error */ js.Any, Unit]
  ): Unit = js.native
}

