package typings
package nodemailerDashMailgunDashTransportLib.nodemailerDashMailgunDashTransportMod.mailgunTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var api_key: java.lang.String
  var domain: js.UndefOr[java.lang.String] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(api_key: java.lang.String, domain: java.lang.String = null): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("api_key")(api_key)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    __obj.asInstanceOf[AuthOptions]
  }
}

