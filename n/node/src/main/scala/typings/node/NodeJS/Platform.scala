package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.aix
  - typings.node.nodeStrings.android
  - typings.node.nodeStrings.darwin
  - typings.node.nodeStrings.freebsd
  - typings.node.nodeStrings.linux
  - typings.node.nodeStrings.openbsd
  - typings.node.nodeStrings.sunos
  - typings.node.nodeStrings.win32
  - typings.node.nodeStrings.cygwin
  - typings.node.nodeStrings.netbsd
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def aix: typings.node.nodeStrings.aix = this.cast("aix")
  @scala.inline
  def android: typings.node.nodeStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cygwin: typings.node.nodeStrings.cygwin = this.cast("cygwin")
  @scala.inline
  def darwin: typings.node.nodeStrings.darwin = this.cast("darwin")
  @scala.inline
  def freebsd: typings.node.nodeStrings.freebsd = this.cast("freebsd")
  @scala.inline
  def linux: typings.node.nodeStrings.linux = this.cast("linux")
  @scala.inline
  def netbsd: typings.node.nodeStrings.netbsd = this.cast("netbsd")
  @scala.inline
  def openbsd: typings.node.nodeStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def sunos: typings.node.nodeStrings.sunos = this.cast("sunos")
  @scala.inline
  def win32: typings.node.nodeStrings.win32 = this.cast("win32")
}

