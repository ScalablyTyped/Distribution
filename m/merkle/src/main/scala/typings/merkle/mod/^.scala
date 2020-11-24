package typings.merkle.mod

import typings.merkle.merkleStrings.md5
import typings.merkle.merkleStrings.none
import typings.merkle.merkleStrings.ripemd160
import typings.merkle.merkleStrings.sha1
import typings.merkle.merkleStrings.sha256
import typings.merkle.merkleStrings.sha512
import typings.merkle.merkleStrings.whirlpool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merkle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hashname: md5): MerkleStream = js.native
  def apply(hashname: md5, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: none): MerkleStream = js.native
  def apply(hashname: none, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: ripemd160): MerkleStream = js.native
  def apply(hashname: ripemd160, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: sha1): MerkleStream = js.native
  def apply(hashname: sha1, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: sha256): MerkleStream = js.native
  def apply(hashname: sha256, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: sha512): MerkleStream = js.native
  def apply(hashname: sha512, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: whirlpool): MerkleStream = js.native
  def apply(hashname: whirlpool, useUpperCaseForHash: Boolean): MerkleStream = js.native
}
