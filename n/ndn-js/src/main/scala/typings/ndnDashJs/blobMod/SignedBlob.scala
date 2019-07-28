package typings.ndnDashJs.blobMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/blob", "SignedBlob")
@js.native
class SignedBlob () extends Blob {
  def this(value: js.Array[Double], signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
  def this(value: Blob, signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
  def this(value: Buffer, signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
  def getSignedPortionBeginOffset(): Double = js.native
  def getSignedPortionEndOffset(): Double = js.native
  def signedBuf(): Buffer = js.native
  def signedSize(): Double = js.native
}

