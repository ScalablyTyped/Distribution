package typings.pem.mod

import typings.pem.AnonFingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "getFingerprint")
@js.native
object getFingerprint extends js.Object {
  def apply(callback: Callback[AnonFingerprint]): Unit = js.native
  def apply(certificate: String, callback: Callback[AnonFingerprint]): Unit = js.native
  def apply(certificate: String, hash: HashFunction, callback: Callback[AnonFingerprint]): Unit = js.native
}

