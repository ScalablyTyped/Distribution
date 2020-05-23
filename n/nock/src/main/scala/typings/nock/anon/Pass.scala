package typings.nock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pass extends js.Object {
  var pass: js.UndefOr[String] = js.undefined
  var user: String
}

object Pass {
  @scala.inline
  def apply(user: String, pass: String = null): Pass = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
}

