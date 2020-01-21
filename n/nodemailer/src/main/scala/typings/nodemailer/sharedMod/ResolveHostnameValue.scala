package typings.nodemailer.sharedMod

import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveHostnameValue extends js.Object {
  var _cached: js.UndefOr[`true`] = js.undefined
  var host: String
  var servername: String | `false`
}

object ResolveHostnameValue {
  @scala.inline
  def apply(host: String, servername: String | `false`, _cached: `true` = null): ResolveHostnameValue = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], servername = servername.asInstanceOf[js.Any])
    if (_cached != null) __obj.updateDynamic("_cached")(_cached.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveHostnameValue]
  }
}

