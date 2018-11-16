package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFObjectAccess extends js.Object

@JSGlobal("MFiles.MFObjectAccess")
@js.native
object MFObjectAccess extends js.Object {
  @js.native
  sealed trait AttachObjects
    extends mfilesLib.MFilesNs.MFObjectAccess
  
  @js.native
  sealed trait ChangePermissions
    extends mfilesLib.MFilesNs.MFObjectAccess
  
  @js.native
  sealed trait Delete
    extends mfilesLib.MFilesNs.MFObjectAccess
  
  @js.native
  sealed trait Edit
    extends mfilesLib.MFilesNs.MFObjectAccess
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFObjectAccess
  
  @js.native
  sealed trait Read
    extends mfilesLib.MFilesNs.MFObjectAccess
  
  /* 16 */ val AttachObjects: AttachObjects with scala.Double = js.native
  /* 4 */ val ChangePermissions: ChangePermissions with scala.Double = js.native
  /* 8 */ val Delete: Delete with scala.Double = js.native
  /* 2 */ val Edit: Edit with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Read: Read with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFObjectAccess with scala.Double] = js.native
}

