package typings.atOctokitRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_On2fa extends js.Object {
  var password: String
  var username: String
  def on2fa(): js.Promise[String]
}

object Anon_On2fa {
  @scala.inline
  def apply(on2fa: () => js.Promise[String], password: String, username: String): Anon_On2fa = {
    val __obj = js.Dynamic.literal(on2fa = js.Any.fromFunction0(on2fa), password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_On2fa]
  }
}

