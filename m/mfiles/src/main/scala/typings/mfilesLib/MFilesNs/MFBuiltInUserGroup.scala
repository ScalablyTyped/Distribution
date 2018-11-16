package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFBuiltInUserGroup extends js.Object

@JSGlobal("MFiles.MFBuiltInUserGroup")
@js.native
object MFBuiltInUserGroup extends js.Object {
  @js.native
  sealed trait AndExternalUsers
    extends mfilesLib.MFilesNs.MFBuiltInUserGroup
  
  @js.native
  sealed trait Users
    extends mfilesLib.MFilesNs.MFBuiltInUserGroup
  
  /* 2 */ val AndExternalUsers: AndExternalUsers with scala.Double = js.native
  /* 1 */ val Users: Users with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFBuiltInUserGroup with scala.Double] = js.native
}

