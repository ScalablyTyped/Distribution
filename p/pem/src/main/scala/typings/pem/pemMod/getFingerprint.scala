package typings.pem.pemMod

import typings.pem.Anon_Fingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "getFingerprint")
@js.native
object getFingerprint extends js.Object {
  def apply(callback: Callback[Anon_Fingerprint]): Unit = js.native
  def apply(certificate: String, callback: Callback[Anon_Fingerprint]): Unit = js.native
  def apply(certificate: String, hash: HashFunction, callback: Callback[Anon_Fingerprint]): Unit = js.native
}

