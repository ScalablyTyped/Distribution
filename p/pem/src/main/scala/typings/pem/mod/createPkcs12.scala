package typings.pem.mod

import typings.pem.anon.Pkcs12
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pem", "createPkcs12")
@js.native
object createPkcs12 extends js.Object {
  
  def apply(key: String, certificate: String, password: String, callback: Callback[Pkcs12]): Unit = js.native
  def apply(
    key: String,
    certificate: String,
    password: String,
    options: Pkcs12CreationOptions,
    callback: Callback[Pkcs12]
  ): Unit = js.native
}
