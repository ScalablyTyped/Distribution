package typings
package pemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientKey extends js.Object {
  var clientKey: java.lang.String
  var csr: java.lang.String
}

object Anon_ClientKey {
  @scala.inline
  def apply(clientKey: java.lang.String, csr: java.lang.String): Anon_ClientKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientKey")(clientKey)
    __obj.updateDynamic("csr")(csr)
    __obj.asInstanceOf[Anon_ClientKey]
  }
}

