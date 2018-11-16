package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFAuthType extends js.Object

@JSGlobal("MFiles.MFAuthType")
@js.native
object MFAuthType extends js.Object {
  @js.native
  sealed trait LoggedOnWindowsUser
    extends mfilesLib.MFilesNs.MFAuthType
  
  @js.native
  sealed trait SpecificMFilesUser
    extends mfilesLib.MFilesNs.MFAuthType
  
  @js.native
  sealed trait SpecificWindowsUser
    extends mfilesLib.MFilesNs.MFAuthType
  
  @js.native
  sealed trait Unknown
    extends mfilesLib.MFilesNs.MFAuthType
  
  /* 1 */ val LoggedOnWindowsUser: LoggedOnWindowsUser with scala.Double = js.native
  /* 3 */ val SpecificMFilesUser: SpecificMFilesUser with scala.Double = js.native
  /* 2 */ val SpecificWindowsUser: SpecificWindowsUser with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFAuthType with scala.Double] = js.native
}

