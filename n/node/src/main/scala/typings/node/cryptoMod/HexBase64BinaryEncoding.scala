package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.binary
  - typings.node.nodeStrings.base64
  - typings.node.nodeStrings.hex
*/
trait HexBase64BinaryEncoding extends js.Object

object HexBase64BinaryEncoding {
  @scala.inline
  def base64: typings.node.nodeStrings.base64 = this.cast("base64")
  @scala.inline
  def binary: typings.node.nodeStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.node.nodeStrings.hex = this.cast("hex")
}

