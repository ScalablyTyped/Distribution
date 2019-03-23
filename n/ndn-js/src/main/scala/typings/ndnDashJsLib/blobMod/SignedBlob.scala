package typings
package ndnDashJsLib.blobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/blob", "SignedBlob")
@js.native
class SignedBlob () extends Blob {
  def this(value: js.Array[scala.Double], signedPortionBeginOffset: scala.Double, signedPortionEndOffset: scala.Double) = this()
  def this(value: Blob, signedPortionBeginOffset: scala.Double, signedPortionEndOffset: scala.Double) = this()
  def this(value: nodeLib.Buffer, signedPortionBeginOffset: scala.Double, signedPortionEndOffset: scala.Double) = this()
  def getSignedPortionBeginOffset(): scala.Double = js.native
  def getSignedPortionEndOffset(): scala.Double = js.native
  def signedBuf(): nodeLib.Buffer = js.native
  def signedSize(): scala.Double = js.native
}

