package typings.osUtils

import typings.osUtils.mod.Platform_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object osUtilsStrings {
  @js.native
  sealed trait aix extends Platform_
  
  @js.native
  sealed trait android extends Platform_
  
  @js.native
  sealed trait cygwin extends Platform_
  
  @js.native
  sealed trait darwin extends Platform_
  
  @js.native
  sealed trait freebsd extends Platform_
  
  @js.native
  sealed trait linux extends Platform_
  
  @js.native
  sealed trait openbsd extends Platform_
  
  @js.native
  sealed trait sunos extends Platform_
  
  @js.native
  sealed trait win32 extends Platform_
  
  @scala.inline
  def aix: aix = "aix".asInstanceOf[aix]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def cygwin: cygwin = "cygwin".asInstanceOf[cygwin]
  @scala.inline
  def darwin: darwin = "darwin".asInstanceOf[darwin]
  @scala.inline
  def freebsd: freebsd = "freebsd".asInstanceOf[freebsd]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  @scala.inline
  def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  @scala.inline
  def sunos: sunos = "sunos".asInstanceOf[sunos]
  @scala.inline
  def win32: win32 = "win32".asInstanceOf[win32]
}

