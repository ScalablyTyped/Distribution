package typings
package packageDashJsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  val email: js.UndefOr[java.lang.String] = js.undefined
  val url: java.lang.String
}

object Anon_Email {
  @scala.inline
  def apply(url: java.lang.String, email: java.lang.String = null): Anon_Email = {
    val __obj = js.Dynamic.literal(url = url)
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[Anon_Email]
  }
}

