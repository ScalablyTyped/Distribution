package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFLoginServerRole extends js.Object

@JSGlobal("MFiles.MFLoginServerRole")
@js.native
object MFLoginServerRole extends js.Object {
  @js.native
  sealed trait BackupOperator
    extends mfilesLib.MFilesNs.MFLoginServerRole
  
  @js.native
  sealed trait LogIn
    extends mfilesLib.MFilesNs.MFLoginServerRole
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFLoginServerRole
  
  @js.native
  sealed trait SystemAdministrator
    extends mfilesLib.MFilesNs.MFLoginServerRole
  
  @js.native
  sealed trait VaultCreator
    extends mfilesLib.MFilesNs.MFLoginServerRole
  
  /* 4 */ val BackupOperator: BackupOperator with scala.Double = js.native
  /* 8 */ val LogIn: LogIn with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val SystemAdministrator: SystemAdministrator with scala.Double = js.native
  /* 2 */ val VaultCreator: VaultCreator with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFLoginServerRole with scala.Double] = js.native
}

