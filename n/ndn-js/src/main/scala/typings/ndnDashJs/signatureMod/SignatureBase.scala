package typings.ndnDashJs.signatureMod

import typings.ndnDashJs.blobMod.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "SignatureBase")
@js.native
class SignatureBase[T /* <: Signature */] () extends Signature {
  def getSignature(): Blob = js.native
  def setSignature(sigValue: Blob): Unit = js.native
}

