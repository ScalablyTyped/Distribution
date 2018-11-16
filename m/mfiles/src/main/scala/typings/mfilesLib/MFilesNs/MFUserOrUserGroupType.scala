package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFUserOrUserGroupType extends js.Object

@JSGlobal("MFiles.MFUserOrUserGroupType")
@js.native
object MFUserOrUserGroupType extends js.Object {
  @js.native
  sealed trait PropertyBasedPseudoUser
    extends mfilesLib.MFilesNs.MFUserOrUserGroupType
  
  @js.native
  sealed trait PseudoUser
    extends mfilesLib.MFilesNs.MFUserOrUserGroupType
  
  @js.native
  sealed trait Unknown
    extends mfilesLib.MFilesNs.MFUserOrUserGroupType
  
  @js.native
  sealed trait UserAccount
    extends mfilesLib.MFilesNs.MFUserOrUserGroupType
  
  @js.native
  sealed trait UserGroup
    extends mfilesLib.MFilesNs.MFUserOrUserGroupType
  
  /* 4 */ val PropertyBasedPseudoUser: PropertyBasedPseudoUser with scala.Double = js.native
  /* 3 */ val PseudoUser: PseudoUser with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 1 */ val UserAccount: UserAccount with scala.Double = js.native
  /* 2 */ val UserGroup: UserGroup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFUserOrUserGroupType with scala.Double] = js.native
}

