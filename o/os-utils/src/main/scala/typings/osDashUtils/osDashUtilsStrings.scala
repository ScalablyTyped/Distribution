package typings.osDashUtils

import typings.osDashUtils.osDashUtilsMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object osDashUtilsStrings {
  @js.native
  sealed trait aix extends Platform
  
  @js.native
  sealed trait android extends Platform
  
  @js.native
  sealed trait cygwin extends Platform
  
  @js.native
  sealed trait darwin extends Platform
  
  @js.native
  sealed trait freebsd extends Platform
  
  @js.native
  sealed trait linux extends Platform
  
  @js.native
  sealed trait openbsd extends Platform
  
  @js.native
  sealed trait sunos extends Platform
  
  @js.native
  sealed trait win32 extends Platform
  
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

