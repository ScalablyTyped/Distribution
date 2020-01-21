package typings.nodeRsa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeRsa.nodeRsaStrings.ascii
  - typings.nodeRsa.nodeRsaStrings.utf8
  - typings.nodeRsa.nodeRsaStrings.utf16le
  - typings.nodeRsa.nodeRsaStrings.ucs2
  - typings.nodeRsa.nodeRsaStrings.latin1
  - typings.nodeRsa.nodeRsaStrings.base64
  - typings.nodeRsa.nodeRsaStrings.hex
  - typings.nodeRsa.nodeRsaStrings.binary
  - typings.nodeRsa.nodeRsaStrings.buffer
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typings.nodeRsa.nodeRsaStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typings.nodeRsa.nodeRsaStrings.base64 = this.cast("base64")
  @scala.inline
  def binary: typings.nodeRsa.nodeRsaStrings.binary = this.cast("binary")
  @scala.inline
  def buffer: typings.nodeRsa.nodeRsaStrings.buffer = this.cast("buffer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.nodeRsa.nodeRsaStrings.hex = this.cast("hex")
  @scala.inline
  def latin1: typings.nodeRsa.nodeRsaStrings.latin1 = this.cast("latin1")
  @scala.inline
  def ucs2: typings.nodeRsa.nodeRsaStrings.ucs2 = this.cast("ucs2")
  @scala.inline
  def utf16le: typings.nodeRsa.nodeRsaStrings.utf16le = this.cast("utf16le")
  @scala.inline
  def utf8: typings.nodeRsa.nodeRsaStrings.utf8 = this.cast("utf8")
}

