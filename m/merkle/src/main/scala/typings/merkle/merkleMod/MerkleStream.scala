package typings.merkle.merkleMod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerkleStream extends Transform {
  def async(leaves: js.Array[_], callback: js.Function2[/* err */ String, /* tree */ MerkleTree, Unit]): Unit = js.native
  def json(): MerkleStream = js.native
  def sync(leaves: js.Array[_]): MerkleTree = js.native
}

