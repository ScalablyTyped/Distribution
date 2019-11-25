package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.utf8
  - typings.node.nodeStrings.ascii
  - typings.node.nodeStrings.binary
*/
trait Utf8AsciiBinaryEncoding extends js.Object

object Utf8AsciiBinaryEncoding {
  @scala.inline
  def ascii: typings.node.nodeStrings.ascii = this.cast("ascii")
  @scala.inline
  def binary: typings.node.nodeStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def utf8: typings.node.nodeStrings.utf8 = this.cast("utf8")
}

