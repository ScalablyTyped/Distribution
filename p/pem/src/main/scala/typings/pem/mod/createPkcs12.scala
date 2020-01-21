package typings.pem.mod

import typings.pem.AnonPkcs12
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "createPkcs12")
@js.native
object createPkcs12 extends js.Object {
  def apply(key: String, certificate: String, password: String, callback: Callback[AnonPkcs12]): Unit = js.native
  def apply(
    key: String,
    certificate: String,
    password: String,
    options: Pkcs12CreationOptions,
    callback: Callback[AnonPkcs12]
  ): Unit = js.native
}

