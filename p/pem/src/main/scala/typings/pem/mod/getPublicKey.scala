package typings.pem.mod

import typings.pem.anon.PublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pem", "getPublicKey")
@js.native
object getPublicKey extends js.Object {
  
  def apply(callback: Callback[PublicKey]): Unit = js.native
  def apply(certificate: String, callback: Callback[PublicKey]): Unit = js.native
}
