package typings.nodemailer.libSharedMod

import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveHostnameOptions extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var servername: js.UndefOr[String | `false`] = js.undefined
}

object ResolveHostnameOptions {
  @scala.inline
  def apply(host: String = null, servername: String | `false` = null): ResolveHostnameOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveHostnameOptions]
  }
}

