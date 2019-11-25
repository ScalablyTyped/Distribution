package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.latin1
  - typings.node.nodeStrings.hex
  - typings.node.nodeStrings.base64
*/
trait HexBase64Latin1Encoding extends js.Object

object HexBase64Latin1Encoding {
  @scala.inline
  def base64: typings.node.nodeStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.node.nodeStrings.hex = this.cast("hex")
  @scala.inline
  def latin1: typings.node.nodeStrings.latin1 = this.cast("latin1")
}

