package typings.nodeOsUtils.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeOsUtils.nodeOsUtilsStrings.aix
  - typings.nodeOsUtils.nodeOsUtilsStrings.android
  - typings.nodeOsUtils.nodeOsUtilsStrings.darwin
  - typings.nodeOsUtils.nodeOsUtilsStrings.freebsd
  - typings.nodeOsUtils.nodeOsUtilsStrings.linux
  - typings.nodeOsUtils.nodeOsUtilsStrings.openbsd
  - typings.nodeOsUtils.nodeOsUtilsStrings.sunos
  - typings.nodeOsUtils.nodeOsUtilsStrings.win32
  - typings.nodeOsUtils.nodeOsUtilsStrings.cygwin
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def aix: typings.nodeOsUtils.nodeOsUtilsStrings.aix = this.cast("aix")
  @scala.inline
  def android: typings.nodeOsUtils.nodeOsUtilsStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cygwin: typings.nodeOsUtils.nodeOsUtilsStrings.cygwin = this.cast("cygwin")
  @scala.inline
  def darwin: typings.nodeOsUtils.nodeOsUtilsStrings.darwin = this.cast("darwin")
  @scala.inline
  def freebsd: typings.nodeOsUtils.nodeOsUtilsStrings.freebsd = this.cast("freebsd")
  @scala.inline
  def linux: typings.nodeOsUtils.nodeOsUtilsStrings.linux = this.cast("linux")
  @scala.inline
  def openbsd: typings.nodeOsUtils.nodeOsUtilsStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def sunos: typings.nodeOsUtils.nodeOsUtilsStrings.sunos = this.cast("sunos")
  @scala.inline
  def win32: typings.nodeOsUtils.nodeOsUtilsStrings.win32 = this.cast("win32")
}

