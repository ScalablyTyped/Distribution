package typings
package ndnDashJsLib.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "SignedBlob")
@js.native
class SignedBlob ()
  extends ndnDashJsLib.blobMod.SignedBlob {
  def this(value: js.Array[scala.Double], signedPortionBeginOffset: scala.Double, signedPortionEndOffset: scala.Double) = this()
  def this(value: ndnDashJsLib.blobMod.Blob, signedPortionBeginOffset: scala.Double, signedPortionEndOffset: scala.Double) = this()
  def this(value: nodeLib.Buffer, signedPortionBeginOffset: scala.Double, signedPortionEndOffset: scala.Double) = this()
}

