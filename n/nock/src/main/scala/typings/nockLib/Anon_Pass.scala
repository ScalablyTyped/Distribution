package typings
package nockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pass extends js.Object {
  var pass: js.UndefOr[java.lang.String] = js.undefined
  var user: java.lang.String
}

object Anon_Pass {
  @scala.inline
  def apply(user: java.lang.String, pass: java.lang.String = null): Anon_Pass = {
    val __obj = js.Dynamic.literal(user = user)
    if (pass != null) __obj.updateDynamic("pass")(pass)
    __obj.asInstanceOf[Anon_Pass]
  }
}

