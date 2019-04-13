package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_On2fa extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
  def on2fa(): js.Promise[java.lang.String]
}

object Anon_On2fa {
  @scala.inline
  def apply(on2fa: () => js.Promise[java.lang.String], password: java.lang.String, username: java.lang.String): Anon_On2fa = {
    val __obj = js.Dynamic.literal(on2fa = js.Any.fromFunction0(on2fa), password = password, username = username)
  
    __obj.asInstanceOf[Anon_On2fa]
  }
}

