package typings
package merkleLib.merkleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerkleTree extends js.Object {
  def depth(): scala.Double
  def level(level: scala.Double): js.UndefOr[scala.Double]
  def levels(): scala.Double
  def nodes(): scala.Double
  def root(): java.lang.String
}

