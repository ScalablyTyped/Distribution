package typings.nodemailer.libFetchCookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var sessionTimeout: js.UndefOr[s] = js.undefined
}

object Options {
  @scala.inline
  def apply(sessionTimeout: js.UndefOr[s] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sessionTimeout)) __obj.updateDynamic("sessionTimeout")(sessionTimeout)
    __obj.asInstanceOf[Options]
  }
}

