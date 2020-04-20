package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.compressed
  - typings.node.nodeStrings.uncompressed
  - typings.node.nodeStrings.hybrid
*/
trait ECDHKeyFormat extends js.Object

object ECDHKeyFormat {
  @scala.inline
  def compressed: typings.node.nodeStrings.compressed = "compressed".asInstanceOf[typings.node.nodeStrings.compressed]
  @scala.inline
  def hybrid: typings.node.nodeStrings.hybrid = "hybrid".asInstanceOf[typings.node.nodeStrings.hybrid]
  @scala.inline
  def uncompressed: typings.node.nodeStrings.uncompressed = "uncompressed".asInstanceOf[typings.node.nodeStrings.uncompressed]
}

