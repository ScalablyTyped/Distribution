package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.rsa
  - typings.node.nodeStrings.dsa
  - typings.node.nodeStrings.ec
*/
trait KeyType extends js.Object

object KeyType {
  @scala.inline
  def dsa: typings.node.nodeStrings.dsa = "dsa".asInstanceOf[typings.node.nodeStrings.dsa]
  @scala.inline
  def ec: typings.node.nodeStrings.ec = "ec".asInstanceOf[typings.node.nodeStrings.ec]
  @scala.inline
  def rsa: typings.node.nodeStrings.rsa = "rsa".asInstanceOf[typings.node.nodeStrings.rsa]
}

