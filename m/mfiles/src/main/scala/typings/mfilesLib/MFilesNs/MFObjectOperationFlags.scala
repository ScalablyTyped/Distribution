package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFObjectOperationFlags extends js.Object

@JSGlobal("MFiles.MFObjectOperationFlags")
@js.native
object MFObjectOperationFlags extends js.Object {
  @js.native
  sealed trait ChangeACLInAllVersions
    extends mfilesLib.MFilesNs.MFObjectOperationFlags
  
  @js.native
  sealed trait DisallowNameChange
    extends mfilesLib.MFilesNs.MFObjectOperationFlags
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFObjectOperationFlags
  
  @js.native
  sealed trait RequireChangeSecurityAccess
    extends mfilesLib.MFilesNs.MFObjectOperationFlags
  
  @js.native
  sealed trait RequireEditAccess
    extends mfilesLib.MFilesNs.MFObjectOperationFlags
  
  @js.native
  sealed trait RequireFullAccess
    extends mfilesLib.MFilesNs.MFObjectOperationFlags
  
  @js.native
  sealed trait RequireReadAccess
    extends mfilesLib.MFilesNs.MFObjectOperationFlags
  
  @js.native
  sealed trait RequireSomeAccess
    extends mfilesLib.MFilesNs.MFObjectOperationFlags
  
  /* 32 */ val ChangeACLInAllVersions: ChangeACLInAllVersions with scala.Double = js.native
  /* 4 */ val DisallowNameChange: DisallowNameChange with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 8 */ val RequireChangeSecurityAccess: RequireChangeSecurityAccess with scala.Double = js.native
  /* 2 */ val RequireEditAccess: RequireEditAccess with scala.Double = js.native
  /* 16 */ val RequireFullAccess: RequireFullAccess with scala.Double = js.native
  /* 1 */ val RequireReadAccess: RequireReadAccess with scala.Double = js.native
  /* 64 */ val RequireSomeAccess: RequireSomeAccess with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFObjectOperationFlags with scala.Double] = js.native
}

