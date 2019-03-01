package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pkcs12ReadOptions extends js.Object {
  var clientKeyPassword: js.UndefOr[java.lang.String] = js.undefined
  var p12Password: js.UndefOr[java.lang.String] = js.undefined
}

object Pkcs12ReadOptions {
  @scala.inline
  def apply(clientKeyPassword: java.lang.String = null, p12Password: java.lang.String = null): Pkcs12ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (clientKeyPassword != null) __obj.updateDynamic("clientKeyPassword")(clientKeyPassword)
    if (p12Password != null) __obj.updateDynamic("p12Password")(p12Password)
    __obj.asInstanceOf[Pkcs12ReadOptions]
  }
}

