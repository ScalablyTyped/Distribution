package typings
package merkleLib.merkleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerkleStream
  extends nodeLib.streamMod.Transform {
  def async(
    leaves: js.Array[_],
    callback: js.Function2[/* err */ java.lang.String, /* tree */ MerkleTree, scala.Unit]
  ): scala.Unit = js.native
  def json(): MerkleStream = js.native
  def sync(leaves: js.Array[_]): MerkleTree = js.native
}

