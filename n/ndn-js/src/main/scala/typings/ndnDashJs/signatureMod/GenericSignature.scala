package typings.ndnDashJs.signatureMod

import typings.ndnDashJs.blobMod.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "GenericSignature")
@js.native
class GenericSignature () extends SignatureBase[GenericSignature] {
  def getSignatureInfoEncoding(): Blob = js.native
  def getTypeCode(): Double = js.native
  def setSignatureInfoEncoding(encoding: Blob): Unit = js.native
  def setSignatureInfoEncoding(encoding: Blob, typeCode: Double): Unit = js.native
}

