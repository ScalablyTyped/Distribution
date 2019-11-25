package typings.osDashUtils.osDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.osDashUtils.osDashUtilsStrings.aix
  - typings.osDashUtils.osDashUtilsStrings.android
  - typings.osDashUtils.osDashUtilsStrings.darwin
  - typings.osDashUtils.osDashUtilsStrings.freebsd
  - typings.osDashUtils.osDashUtilsStrings.linux
  - typings.osDashUtils.osDashUtilsStrings.openbsd
  - typings.osDashUtils.osDashUtilsStrings.sunos
  - typings.osDashUtils.osDashUtilsStrings.win32
  - typings.osDashUtils.osDashUtilsStrings.cygwin
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def aix: typings.osDashUtils.osDashUtilsStrings.aix = this.cast("aix")
  @scala.inline
  def android: typings.osDashUtils.osDashUtilsStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cygwin: typings.osDashUtils.osDashUtilsStrings.cygwin = this.cast("cygwin")
  @scala.inline
  def darwin: typings.osDashUtils.osDashUtilsStrings.darwin = this.cast("darwin")
  @scala.inline
  def freebsd: typings.osDashUtils.osDashUtilsStrings.freebsd = this.cast("freebsd")
  @scala.inline
  def linux: typings.osDashUtils.osDashUtilsStrings.linux = this.cast("linux")
  @scala.inline
  def openbsd: typings.osDashUtils.osDashUtilsStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def sunos: typings.osDashUtils.osDashUtilsStrings.sunos = this.cast("sunos")
  @scala.inline
  def win32: typings.osDashUtils.osDashUtilsStrings.win32 = this.cast("win32")
}

@JSImport("os-utils", "platform")
@js.native
object platform extends js.Object {
  def apply(): Platform = js.native
}

