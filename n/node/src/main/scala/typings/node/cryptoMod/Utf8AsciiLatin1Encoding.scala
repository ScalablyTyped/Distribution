package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.utf8
  - typings.node.nodeStrings.ascii
  - typings.node.nodeStrings.latin1
*/
trait Utf8AsciiLatin1Encoding extends js.Object

object Utf8AsciiLatin1Encoding {
  @scala.inline
  def ascii: typings.node.nodeStrings.ascii = this.cast("ascii")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def latin1: typings.node.nodeStrings.latin1 = this.cast("latin1")
  @scala.inline
  def utf8: typings.node.nodeStrings.utf8 = this.cast("utf8")
}

