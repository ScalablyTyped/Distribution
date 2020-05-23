package typings.pem.mod

import typings.pem.anon.Fingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "getFingerprint")
@js.native
object getFingerprint extends js.Object {
  def apply(callback: Callback[Fingerprint]): Unit = js.native
  def apply(certificate: String, callback: Callback[Fingerprint]): Unit = js.native
  def apply(certificate: String, hash: HashFunction, callback: Callback[Fingerprint]): Unit = js.native
}

