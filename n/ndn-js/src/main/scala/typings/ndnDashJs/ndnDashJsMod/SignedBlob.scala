package typings.ndnDashJs.ndnDashJsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "SignedBlob")
@js.native
class SignedBlob ()
  extends typings.ndnDashJs.blobMod.SignedBlob {
  def this(value: js.Array[Double], signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
  def this(
    value: typings.ndnDashJs.blobMod.Blob,
    signedPortionBeginOffset: Double,
    signedPortionEndOffset: Double
  ) = this()
  def this(value: Buffer, signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
}

