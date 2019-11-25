package typings.pem.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pkcs12ReadOptions extends js.Object {
  var clientKeyPassword: js.UndefOr[String] = js.undefined
  var p12Password: js.UndefOr[String] = js.undefined
}

object Pkcs12ReadOptions {
  @scala.inline
  def apply(clientKeyPassword: String = null, p12Password: String = null): Pkcs12ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (clientKeyPassword != null) __obj.updateDynamic("clientKeyPassword")(clientKeyPassword.asInstanceOf[js.Any])
    if (p12Password != null) __obj.updateDynamic("p12Password")(p12Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pkcs12ReadOptions]
  }
}

