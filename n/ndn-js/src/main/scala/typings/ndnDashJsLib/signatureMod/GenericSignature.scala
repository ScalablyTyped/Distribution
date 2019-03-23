package typings
package ndnDashJsLib.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "GenericSignature")
@js.native
class GenericSignature () extends SignatureBase[GenericSignature] {
  def getSignatureInfoEncoding(): ndnDashJsLib.blobMod.Blob = js.native
  def getTypeCode(): scala.Double = js.native
  def setSignatureInfoEncoding(encoding: ndnDashJsLib.blobMod.Blob): scala.Unit = js.native
  def setSignatureInfoEncoding(encoding: ndnDashJsLib.blobMod.Blob, typeCode: scala.Double): scala.Unit = js.native
}

