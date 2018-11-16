package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFSoftwarePlatformType extends js.Object

@JSGlobal("MFiles.MFSoftwarePlatformType")
@js.native
object MFSoftwarePlatformType extends js.Object {
  @js.native
  sealed trait Win32
    extends mfilesLib.MFilesNs.MFSoftwarePlatformType
  
  @js.native
  sealed trait X64
    extends mfilesLib.MFilesNs.MFSoftwarePlatformType
  
  /* 0 */ val Win32: Win32 with scala.Double = js.native
  /* 1 */ val X64: X64 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFSoftwarePlatformType with scala.Double] = js.native
}

