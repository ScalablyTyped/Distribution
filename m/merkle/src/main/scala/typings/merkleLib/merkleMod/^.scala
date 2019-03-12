package typings
package merkleLib.merkleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("merkle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    hashname: merkleLib.merkleLibStrings.sha512 | merkleLib.merkleLibStrings.sha256 | merkleLib.merkleLibStrings.sha1 | merkleLib.merkleLibStrings.md5 | merkleLib.merkleLibStrings.ripemd160 | merkleLib.merkleLibStrings.whirlpool | merkleLib.merkleLibStrings.none
  ): MerkleStream = js.native
  def apply(
    hashname: merkleLib.merkleLibStrings.sha512 | merkleLib.merkleLibStrings.sha256 | merkleLib.merkleLibStrings.sha1 | merkleLib.merkleLibStrings.md5 | merkleLib.merkleLibStrings.ripemd160 | merkleLib.merkleLibStrings.whirlpool | merkleLib.merkleLibStrings.none,
    useUpperCaseForHash: scala.Boolean
  ): MerkleStream = js.native
}

