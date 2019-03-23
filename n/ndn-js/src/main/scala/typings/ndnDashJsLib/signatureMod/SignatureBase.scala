package typings
package ndnDashJsLib.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "SignatureBase")
@js.native
class SignatureBase[T /* <: Signature */] () extends Signature {
  def getSignature(): ndnDashJsLib.blobMod.Blob = js.native
  def setSignature(sigValue: ndnDashJsLib.blobMod.Blob): scala.Unit = js.native
}

