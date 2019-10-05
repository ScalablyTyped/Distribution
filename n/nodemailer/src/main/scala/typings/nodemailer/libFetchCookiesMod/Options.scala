package typings.nodemailer.libFetchCookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var sessionTimeout: js.UndefOr[s] = js.undefined
}

object Options {
  @scala.inline
  def apply(sessionTimeout: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

