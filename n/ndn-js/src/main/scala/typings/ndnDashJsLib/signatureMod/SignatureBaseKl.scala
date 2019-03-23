package typings
package ndnDashJsLib.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "SignatureBaseKl")
@js.native
class SignatureBaseKl[T /* <: Signature */] () extends SignatureBase[T] {
  def getKeyLocator(): KeyLocator = js.native
  def setKeyLocator(): scala.Unit = js.native
  def setKeyLocator(kl: KeyLocator): scala.Unit = js.native
}

