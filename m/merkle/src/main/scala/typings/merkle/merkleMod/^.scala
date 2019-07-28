package typings.merkle.merkleMod

import typings.merkle.merkleStrings.md5
import typings.merkle.merkleStrings.none
import typings.merkle.merkleStrings.ripemd160
import typings.merkle.merkleStrings.sha1
import typings.merkle.merkleStrings.sha256
import typings.merkle.merkleStrings.sha512
import typings.merkle.merkleStrings.whirlpool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("merkle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(hashname: sha512 | sha256 | sha1 | md5 | ripemd160 | whirlpool | none): MerkleStream = js.native
  def apply(
    hashname: sha512 | sha256 | sha1 | md5 | ripemd160 | whirlpool | none,
    useUpperCaseForHash: Boolean
  ): MerkleStream = js.native
}

