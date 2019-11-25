package typings.node.bufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.ascii
  - typings.node.nodeStrings.utf8
  - typings.node.nodeStrings.utf16le
  - typings.node.nodeStrings.ucs2
  - typings.node.nodeStrings.latin1
  - typings.node.nodeStrings.binary
*/
trait TranscodeEncoding extends js.Object

object TranscodeEncoding {
  @scala.inline
  def ascii: typings.node.nodeStrings.ascii = this.cast("ascii")
  @scala.inline
  def binary: typings.node.nodeStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def latin1: typings.node.nodeStrings.latin1 = this.cast("latin1")
  @scala.inline
  def ucs2: typings.node.nodeStrings.ucs2 = this.cast("ucs2")
  @scala.inline
  def utf16le: typings.node.nodeStrings.utf16le = this.cast("utf16le")
  @scala.inline
  def utf8: typings.node.nodeStrings.utf8 = this.cast("utf8")
}

